package com.rongyi.hla.mapper.product;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rongyi.model.product.ProductGroup;

import java.util.List;

/**
 * 产品信息Mapper
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */

//@Repository
public interface ProductGroupMapper extends BaseMapper<ProductGroup> {


    List<ProductGroup> list();

    int save(ProductGroup product);


//
//    int save(Product product);
//
//    Integer delete(@Param("id") Long id);
//
//    int update(Product product);
//
//    Product get(Long id);
//
//    List<Product> list();
//
//    List<Product> listPage(ProductQuery query);
//
//    int getCount(ProductQuery query);
//
//
//    void createTable();
//
//    void dropTable();
//
//    int getTotalCount();
}
