package com.rongyi.hla.mapper.product;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rongyi.entity.product.Image;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageMapper extends BaseMapper<Image> {


    //代完成
    int batchSave(List<Image> images);

    int save(Image file);

    int update(Image image);

//    Image get(int id);

    List<Image> listByOwnerCode(@Param("ownerCode") String ownerCode);

}
