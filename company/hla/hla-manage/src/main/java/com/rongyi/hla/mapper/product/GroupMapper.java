package com.rongyi.hla.mapper.product;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rongyi.entity.product.ProductGroup;

import java.util.List;

/**
 * 产品信息Mapper
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
public interface GroupMapper extends BaseMapper<ProductGroup> {

    List<ProductGroup> list();

    int save(ProductGroup product);

    int update(ProductGroup product);

}
