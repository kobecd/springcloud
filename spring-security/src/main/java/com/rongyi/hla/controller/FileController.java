package com.rongyi.hla.controller;

import com.rongyi.api.ResponseVO;
import com.rongyi.hla.service.product.FileService;
import com.rongyi.hla.service.product.GroupService;
import com.rongyi.hla.utils.UpYun;
import com.rongyi.model.product.File;
import com.rongyi.model.product.ProductGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * 文件相关控制器
 *
 * @author: yechao
 * @date: 2018/08/08 15:27
 * @version: V1.0
 *Copyright (C): 上海容易网电子商务股份有限公司
 */
@Slf4j
@RestController
@RequestMapping("/file")
public class FileController {

    public static final String TYPE_GIF = "gif";
    public static final String TYPE_PNG = "png";
    public static final String TYPE_BMP = "bmp";
    public static final String TYPE_JPG = "jpg";
    public static final String TYPE_UNKNOWN = "unknown";
    public static final long MAXSIZE_FOR_UPLOAD_PICTURE = 5242880L;//5*1024*1024  b= 5 MB

    //处理文件，将文件写入指定位置
    @Value("${hla.filePath}")
    String filePath;

    @Value("${hla.upyun.bucketName}")
    public String bucketName; // 云服务器上的空间名

    @Value("${hla.upyun.username}")
    public String username;

    @Value("${hla.upyun.password}")
    public String password;

    @Value("${hla.upyun.url.host}")
    public String upyunUrlHost;

    @Autowired
    private FileService fileService;

    @Autowired
    private GroupService groupService;


    /**
     * 文件上传具体实现方法;
     *
     * @param file
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO handleFileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {

        String suffix = null;
        boolean b = false;//上传云盘结果

        long size = file.getSize();//大小单位b
        String fullFileNameAddHla ="hla/"+ UUID.randomUUID() +file.getOriginalFilename();  //图片名字
        suffix = fullFileNameAddHla.substring(fullFileNameAddHla.indexOf("."));//先得到得到"."在第几位 ，，截断"."之前的，得到后缀

        log.debug("file{}-{}", fullFileNameAddHla, size);

        //1、检查大小  2、检查文件类型  3、检查文件是否重复  4、执行保存--云--数据库记录一下
        if (size > MAXSIZE_FOR_UPLOAD_PICTURE) {
            log.info("上传文件大于5MB，拒绝存储，文件大小为{}Kb", size / 1024);
            return ResponseVO.failure(10002, "图片上传错误,上传文件大于5MB，拒绝存储，文件大小为" + size / 1024 + "Kb");
        }

        //2类型判断（后缀+实际文件类型都判断）
        try {
            String picType = getPicType((FileInputStream) file.getInputStream());
            log.debug("picType {}", picType);

            if (!(".png".equals(suffix) || ".PNG".equals(suffix) || ".jpg".equals(suffix) || ".JPG".equals(suffix)  //根据后缀，判断是否符合图片格式
                    || "png".equals(picType) || "jpg".equals(picType))) {  //根据文件流判断，判断是否符合图片格式
                log.info("不是指定图片格式,重新选择，{}", suffix);
                return ResponseVO.failure(10000, "图片上传错误,不是指定图片格式,重新选择!");
            }
        } catch (Exception e) {
            log.error("图片格式检查错误，{}", e.getMessage());

        }

//        //3、文件是否重复
//        //http://【rongyi】.b0.upaiyun.com/+【文件名称】
//        yunUrl = "http://" + bucketName + upyunUrlHost + fullFileNameAddHla;
//        File dbFileRecord = fileService.getByUrl(yunUrl);
//        if  (dbFileRecord!= null) {
//            return ResponseVO.failure(1003, "文件重复");
//        }
//

        //4、执行保存--云--数据库记录一下
        String yunUrl = "http://" + bucketName + upyunUrlHost + fullFileNameAddHla;
        try {
            int q = 1 / 0;
            b = new UpYun(bucketName, username, password).writeFile(fullFileNameAddHla, file.getBytes(), true);
            if (b) {
                //    public File(String url, String path, String name, String suffix  ) {
                File saveDbFile = new File(yunUrl, filePath + fullFileNameAddHla, fullFileNameAddHla, suffix);
                log.debug("saveFile  ====" + saveDbFile);
                log.debug("记录成功上传云盘的信息saveDbFile is {}", saveDbFile);
                fileService.save(saveDbFile);
            }
        } catch (IOException e) {
            System.out.println("观察日子级别");
            log.debug("文件上传云盘错误，{}",e.getMessage());
            log.error("文件上传云盘错误，{}",e.getMessage());
            return ResponseVO.failure(1004, "文件上传云盘错误");
        }
        // 返回图片的存放路径
        return b? ResponseVO.success(yunUrl):ResponseVO.failure(1004, "文件上传云盘错误");
    }


    @RequestMapping(value = "/addToGroup", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO handleFileUpload(@RequestBody ProductGroup group) {
        log.debug("参数：图片绑定时候分组code{}，图片是{}", group.getCode(), group.getImage());
        if (group.getImage() == null || "" == group.getImage() || group.getCode() == null || "" == group.getCode()) {
            return ResponseVO.failure(10000,"图片地址或者code 为空");
        }
        return ResponseVO.success(groupService.update(group));
    }


    /**
     * 根据文件流判断图片类型
     *
     * @param fis
     * @return jpg/png/gif/bmp
     */
    public static String getPicType(FileInputStream fis) {
        //读取文件的前几个字节来判断图片格式
        byte[] b = new byte[4];
        try {
            fis.read(b, 0, b.length);
            String type = bytesToHexString(b).toUpperCase();
            if (type.contains("FFD8FF")) {
                return TYPE_JPG;
            } else if (type.contains("89504E47")) {
                return TYPE_PNG;
            } else if (type.contains("47494638")) {
                return TYPE_GIF;
            } else if (type.contains("424D")) {
                return TYPE_BMP;
            } else {
                return TYPE_UNKNOWN;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * byte数组转换成16进制字符串
     *
     * @param src
     * @return
     */
    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

}
