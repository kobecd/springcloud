package com.arc.excel.controller.excel;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


/**
 * 上传工具
 */
public class UploadUtil {

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
     * @since 1.4
     */
    public static final char EXTENSION_SEPARATOR = '.';

    private static final int NOT_FOUND = -1;

    /**
     * The Unix separator character.
     */
    private static final char UNIX_SEPARATOR = '/';

    /**
     * The Windows separator character.
     */
    private static final char WINDOWS_SEPARATOR = '\\';

    public static int indexOfExtension(final String filename) {
        if (filename == null) {
            return NOT_FOUND;
        }
        final int extensionPos = filename.lastIndexOf(EXTENSION_SEPARATOR);
        final int lastSeparator = indexOfLastSeparator(filename);
        return lastSeparator > extensionPos ? NOT_FOUND : extensionPos;
    }

    public static int indexOfLastSeparator(final String filename) {
        if (filename == null) {
            return NOT_FOUND;
        }
        final int lastUnixPos = filename.lastIndexOf(UNIX_SEPARATOR);
        final int lastWindowsPos = filename.lastIndexOf(WINDOWS_SEPARATOR);
        return Math.max(lastUnixPos, lastWindowsPos);
    }
}
























