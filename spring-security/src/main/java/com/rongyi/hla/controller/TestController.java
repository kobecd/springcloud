package com.rongyi.hla.controller;

import com.rongyi.api.ResponseVO;
import com.rongyi.hla.agent.GroupAgent;
import com.rongyi.hla.agent.SkuAgent;
import com.rongyi.hla.agent.SpuAgent;
import com.rongyi.hla.service.product.FileService;
import com.rongyi.hla.utils.TokenCacheUtil;
import com.rongyi.hla.utils.UpYun;
import com.rongyi.model.product.File;
import com.rongyi.rbac.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


//@TODO 测试完成后请移除

/**
 * 商品数据交互控制器
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {
    //测试用于模拟远程数据
    @Autowired
    private SkuAgent skuAgent;

    @Autowired
    private SpuAgent spuAgent;

    @Autowired
    private GroupAgent groupAgent;

    @Autowired
    private TokenCacheUtil tokenCacheUtil;

    @Autowired
    private UserService userService;

    @Value("${hla.filePath}")
    String filePath;

    @Value("${hla.upyun.bucketName}")
    public String bucketName ; // 云服务器上的空间名

    @Value("${hla.upyun.username}")
    public String username;

    @Value("${hla.upyun.password}")
    public String password;

    @Value("${hla.upyun.url.host}")
    public String upyunUrlHost;

    @Autowired
    private FileService fileService;

//    @Autowired
//    private UpFileToYun upFileToYun;

//    @Autowired
//    private FileUploadToUpYunUtil upYun;


    @RequestMapping(value = "/getAccessToken", method = RequestMethod.GET)
    public Object getAccessToken() {
        return tokenCacheUtil.getAccessToken();
    }


    @RequestMapping(value = "/skus", method = RequestMethod.GET)
    public Object pull() {
        log.debug("skus");
        return skuAgent.syncProducts();
    }

    @RequestMapping(value = "/spus", method = RequestMethod.GET)
    public Object spus() {
        log.debug("spus");
        return spuAgent.syncSpus();
    }

    @RequestMapping(value = "/groups", method = RequestMethod.GET)
    public Object groups() {
        log.debug("groups");
        return groupAgent.syncGroups();
    }

@RequestMapping("/u")
    public Object get(String username) {
        return userService.getUserByNameCount(username);
    }




    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO handleFileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        System.out.println(filePath);
        String yunUrl=null;
        if (!"/usr/local/servers/hla/file/local/".equals(filePath)) {
            System.out.println("+++路径从配置文件注入失败");
            filePath = "/usr/local/servers/hla/file/local";
        }
        java.io.File sysFile = new java.io.File(filePath);
        if (!sysFile.exists()) {
            boolean mkdirs = sysFile.mkdirs();
            System.out.println("文件价"+filePath+"创建完成 "+mkdirs);

        }

        long size = file.getSize();//大小单位b
        String contentType = file.getContentType();   //图片文件类型
        contentType = "." + contentType.replace(contentType, "image/");
        String fileName = file.getOriginalFilename();  //图片名字

        System.out.println(size / 1024);
        System.out.println("contentType "+contentType);
        System.out.println("fileName "+fileName);

        filePath = filePath + fileName;
        System.out.println(filePath);

        File dbFile = fileService.getByFilePath(filePath);
        if (dbFile != null) {
            return ResponseVO.failure(1003,"文件重复");
        }



        try {
            String originalFilename = file.getOriginalFilename();
            System.out.println("originalFilename "+originalFilename);
            boolean b = new UpYun(bucketName, username, password).writeFile(originalFilename, file.getBytes(), true);
            if (b) {
                //http://rongyi.b0.upaiyun.com/
                 yunUrl="http://" + bucketName + upyunUrlHost+originalFilename;
                File saveDbFile= new File( yunUrl,filePath,fileName,contentType);
                System.out.println("saveFile  ===="+saveDbFile);
                fileService.save(saveDbFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ResponseVO.success(yunUrl);

    }


}
