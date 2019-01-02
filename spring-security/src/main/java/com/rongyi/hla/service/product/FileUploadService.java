package com.rongyi.hla.service.product;

import java.io.File;

/**
 *   Service接口
 */
public interface FileUploadService {

    /**
     * zip上传接口
     * @param originalZipFile 需要上传的文件
     * @param baseRemotePath 远程路径
     * @param needUnZip 是否需要解压
     * @return 图片url
     */
    String uploadZipFile(File originalZipFile, String baseRemotePath, boolean needUnZip);

    /**
     * 文件上传
     * @param originalFile 需要上传的文件
     * @param baseRemotePath 远程路径
     */
    String uploadFile(File originalFile, String baseRemotePath);

}
