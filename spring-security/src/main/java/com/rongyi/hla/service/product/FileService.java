package com.rongyi.hla.service.product;

import com.rongyi.model.product.File;

/**
 * FileService 接口
 */
public interface FileService {

    Integer save(File file);


    File get(int id);

    File getByFilePath(String filePath);

    File getByUrl(String url);
}
