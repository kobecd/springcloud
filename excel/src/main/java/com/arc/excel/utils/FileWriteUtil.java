package com.arc.excel.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.util.Assert;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author Rubin
 * 2018/10/22 18:09
 */
@Slf4j
public class FileWriteUtil {

    public void output(String filename, String str) {
        FileWriter fw;
        try {
            fw = new FileWriter(filename);
            fw.write(str, 0, str.length());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //=====================================================
    //                                          工具方法
    //=====================================================

    public static String getSimpleCode() {
        String time = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        int x = (int) (Math.random() * 900) + 1000;
        return time + x;
    }


    /**
     * 获取现在时间字符串
     */
    public static String getDateString() {
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
    }

    public static String getTargetFileName(String sourceFileName) {
        //时间戳+uuid+sourceFileName
        return System.currentTimeMillis() + getUUID() + EXTENSION_UNDERLINE + sourceFileName;
    }

    /**
     * 获取uuid变体，去除了“-”
     *
     * @return
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
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


    public static void main(String[] args) {

        System.out.println("24534612203910144".length());
        System.out.println(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()));//20190113 180709850

        System.out.println();
        String uuid = UUID.randomUUID().toString();
        String uuidReplace = uuid.replace("-", "");
        System.out.println(uuid);                      //c4bf200f-85bf-431c-b91a-1c4c8247f1d7
        System.out.println(uuidReplace);        //c4bf200f85bf431cb91a1c4c8247f1d7


        Object x = Math.random();
        System.out.println("random--> " + x);
        System.out.println("测试 --> " + getSimpleCode());

        String file2 = "a/b/c/application.txt";
        System.out.println(indexOfLastSeparator("application.txt"));

        System.out.println(indexOfLastSeparator(file2));

        System.out.println();
        System.out.println(getExtension(file2));
    }


    //

    /***
     * 处理文件上传
     *
     * @param file
     * @param basePath
     *            存放文件的目录的绝对路径 servletContext.getRealPath("/upload")
     * @return
     */

    public static String upload(MultipartFile file, String basePath) {
        String orgFileName = file.getOriginalFilename();
        String fileName = UUID.randomUUID().toString() + "." + FilenameUtils.getExtension(orgFileName);
        try {
            File targetFile = new File(basePath, fileName);
            FileUtils.writeByteArrayToFile(targetFile, file.getBytes());

            //把文件同步到公共文件夹
            File publicFile = new File("/", fileName);
            FileUtils.writeByteArrayToFile(publicFile, file.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }


    public static String getExtension(final String filename) {
        if (filename == null) {
            return null;
        }
        final int index = indexOfExtension(filename);
        if (index == NOT_FOUND) {
            return "";
        } else {
            return filename.substring(index + 1);
        }
    }

    /**
     * The extension separator character.
     *
     * @since 1.4
     */
    public static final char EXTENSION_SEPARATOR = '.';

    /**
     * 下划线;
     */
    public static final char EXTENSION_UNDERLINE = '_';

    private static final int NOT_FOUND = -1;

    /**
     * The Unix separator character.
     */
    private static final char UNIX_SEPARATOR = '/';

    /**
     * The Windows separator character.
     */
    private static final char WINDOWS_SEPARATOR = '\\';

    /**
     * 获取扩展名的index
     *
     * @param filename
     * @return
     */
    public static int indexOfExtension(final String filename) {
        if (filename == null) {
            return NOT_FOUND;
        }
        final int extensionPos = filename.lastIndexOf(EXTENSION_SEPARATOR);
        final int lastSeparator = indexOfLastSeparator(filename);
        return lastSeparator > extensionPos ? NOT_FOUND : extensionPos;
    }

    /**
     * 获取分隔符的index
     *
     * @param filename
     * @return
     */
    public static int indexOfLastSeparator(final String filename) {
        if (filename == null) {
            return NOT_FOUND;
        }
        final int lastUnixPos = filename.lastIndexOf(UNIX_SEPARATOR);
        final int lastWindowsPos = filename.lastIndexOf(WINDOWS_SEPARATOR);
        return Math.max(lastUnixPos, lastWindowsPos);
    }


}
