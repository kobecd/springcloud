package com.rongyi.hla.mapper.product;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rongyi.model.product.File;
import org.apache.ibatis.annotations.Param;

public interface FileMapper extends BaseMapper<File> {

    File get(int id);

    int save(File file);

    File getByFilePath(@Param("filePath") String filePath);

    File getByUrl(@Param("url")String url);
}
