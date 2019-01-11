package com.arc.mybatis.controller.excel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.apache.commons.lang3.StringUtils;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/11 9:33
 */
@Slf4j
@RestController
@RequestMapping("/excel")
public class ExcelImportController {

    String path = "C:\\Users\\X\\Desktop\\upload\\";

    @PostMapping("/upload")
    public Object uploadFile(MultipartFile file) {
        Object result = false;
        result = writeFileToDisk(file, path);
        //对于文件做持久化操作
        //读取文件
        return result;
    }


    @PostMapping("/upload2")
    public Object uploadFile2(MultipartFile file) {
        //对于文件做持久化操作
        //读取文件并解析

        //上传文件的问题
        //正常情况：变量名称，文件大小，文件格式，文件名称重复时候处理，文件在磁盘上的路径处理，文件路径记录到数据库，生成唯一编号
        //异常情况：文件为空判断，路径为空或者不合法判断，不支持的文件类型判断，文件重复判断，写入磁盘异常判断，写入磁盘成功，但是信息记录数据库出错，造成数据耗着磁盘，但是应用检索数据库时候并无法发现该文件， 需要做补偿来删除脏数据
        try {
            //注意此方法指向的是一个文件，而非文件夹
            file.transferTo(new File("C:\\Users\\X\\Desktop\\upload\\1"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;

    }

    @PostMapping("/upload/v1")
    public Object uploadV1(MultipartFile file) throws IOException {
        Object result = false;

        InputStream in   = file.getInputStream();
        File targetFile = new File(path);
        OutputStream out = Files.newOutputStream(targetFile.toPath());
        Assert.notNull(in, "No InputStream specified");
        Assert.notNull(out, "No OutputStream specified");
        int byteCount = 0;
        byte[] buffer = new byte[4096];

        int bytesRead;
        for (boolean var4 = true; (bytesRead = in.read(buffer)) != -1; byteCount += bytesRead) {
            out.write(buffer, 0, bytesRead);
        }

        out.flush();
        return byteCount;

    }



    //单个文件
    private String writeFileToDisk(MultipartFile file, String path) {
        System.out.println(file == null);
        System.out.println(file.isEmpty());
        System.out.println(StringUtils.isEmpty(path));

        if (file == null || file.isEmpty() || StringUtils.isEmpty(path)) {
            log.info("上传失败，文件或者路径为空！");
            return null;
        }

        log.debug("文件上传入参: 名称={}，大小={} bytes， 类型={}", file.getOriginalFilename(), file.getSize(), file.getContentType());

        System.out.println("getName=" + file.getName());//file
        System.out.println("getResource=" + file.getResource());//MultipartFile resource [file]
        System.out.println("getContentType=" + file.getContentType());//application/vnd.openxmlformats-officedocument.wordprocessingml.document
        System.out.println("getOriginalFilename=" + file.getOriginalFilename());//记录.docx

        ////////////////////////////////
        //文件名称=原名称+时间戳

        //1 时间戳

        // 获取文件扩展名，即文件名称后缀
        String originalFilename = file.getOriginalFilename();
        String substring = "";
        if ((originalFilename != null) && (originalFilename.length() > 0)) {
            int dot = originalFilename.lastIndexOf('.');
            if ((dot > -1) && (dot < (originalFilename.length() - 1))) {
                substring = originalFilename.substring(dot + 1);
            }
        }


        //组合名称

        String savedFilename = originalFilename + System.currentTimeMillis() + substring;

        System.out.println("全名=" + originalFilename);
        System.out.println("后缀=" + substring);  System.out.println("组合名称=" + savedFilename);


        //文件路径问题
        String fullPath = path + savedFilename;
        File saveFile = new File(fullPath);
        if (!saveFile.getParentFile().exists()) {
            log.info("目标路径{}不存在，新建此路径", fullPath);
            if (!saveFile.getParentFile().mkdirs()) {
                log.info("文件路径{}创建失败！", fullPath);
            }
        }

        log.debug("getAbsolutePath保存路径: " + saveFile.getAbsolutePath());
        log.debug("getPath=" + saveFile.getPath());
        log.debug("isFile=" + saveFile.isFile());
        log.debug("getParent=" + saveFile.getParent());
        log.debug("getParent=" + saveFile.getParentFile());
        // 覆盖原文件
//        if (saveFile.exists()) {
//            FileUtil.delete(fullPath);
//        }
        try {
            File targetFile = new File(path);
            log.debug("toPath={}", targetFile.toPath());
            log.debug("结果={}", targetFile.toPath());
            log.debug("结果={}", targetFile.toPath());
            int copy = copy(file.getInputStream(), Files.newOutputStream(targetFile.toPath()));
            log.debug("结果={}", copy);
            return fullPath;
        } catch (Exception e) {
            log.error("文件上传失败！", e);
            return null;
        }
    }

    private String getSimpleCode() {
        String t = getStringDate();
        int x = (int) (Math.random() * 900) + 100;
        return t + x;
    }

    /**
     * 获取现在时间字符串
     */
    private static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        return formatter.format(currentTime);
    }


    public static int copy(InputStream in, OutputStream out) throws IOException {
        Assert.notNull(in, "No InputStream specified");
        Assert.notNull(out, "No OutputStream specified");
        int byteCount = 0;
        byte[] buffer = new byte[4096];

        int bytesRead;
        for (boolean var4 = true; (bytesRead = in.read(buffer)) != -1; byteCount += bytesRead) {
            out.write(buffer, 0, bytesRead);
        }

        out.flush();
        return byteCount;
    }
}
