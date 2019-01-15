package com.rongyi.hla.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 文件相关控制器
 *
 * @author:
 * @date: 2018/08/08 15:27
 * @version: V1.0
 */
@Slf4j
@RestController
@RequestMapping("/uploadImage")
public class FileController1 {

    public static final String TYPE_GIF = "gif";
    public static final String TYPE_PNG = "png";
    public static final String TYPE_BMP = "bmp";
    public static final String TYPE_JPG = "jpg";
    public static final String TYPE_UNKNOWN = "unknown";
    public static final long MAXSIZE_FOR_UPLOAD_PICTURE = 5242880L;//5*1024*1024  b= 5 MB


    /**
     * 文件上传具体实现方法;
     *
     * @param file
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public JSONResult handleFileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        JSONResult result = new JSONResult(false, "ERROR");

        long size = file.getSize();//大小单位b

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = formatter.format(new Date());

        //处理文件名称
        String fullFileName = format + UUID.randomUUID() + file.getOriginalFilename();  //图片名字
        String suffix = fullFileName.substring(fullFileName.indexOf("."));//先得到得到"."在第几位 ，，截断"."之前的，得到后缀

        //处理文件夹
        String localFilePath = "/upload/image/" + format;
        System.out.println(localFilePath);
        File localFile = new File(localFilePath);
        if (!localFile.exists()) {
            localFile.exists();
        }


        log.debug("file名称{}- 大小{}，后缀{}", fullFileName, size, suffix);


        //2类型判断（后缀+实际文件类型都判断）
        try {
            String picType = getPicType((FileInputStream) file.getInputStream());
            log.debug("picType {}", picType);

            if (!(".png".equals(suffix) || ".PNG".equals(suffix) || ".jpg".equals(suffix) || ".JPG".equals(suffix)  //根据后缀，判断是否符合图片格式
                    || "png".equals(picType) || "jpg".equals(picType))) {  //根据文件流判断，判断是否符合图片格式
                log.info("不是指定图片格式,重新选择，{}", suffix);
                return result;

                //return ResponseVO.failure(10000, "图片上传错误,不是指定图片格式,重新选择!");
            }
        } catch (Exception e) {
            log.error("图片格式检查错误，{}", e.getMessage());

        }
//        //3、文件是否重复 重复的删除
        File temFile = new File(localFilePath + fullFileName);
        if (temFile.exists()) {
            temFile.delete();
        }


        //4、save to localFile Dir
        try {
            InputStream input = file.getInputStream();
            FileOutputStream out = new FileOutputStream(temFile);
            byte[] bytes = file.getBytes();
            out.write(bytes,0,bytes.length);
            out.close();
            input.close();
        } catch (Exception e) {
            log.error("{}", e.getMessage());
        }


        // 返回图片的存放路径
        result.setSuccess(true);
        result.setMsg("保存成功");
        return result;
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
