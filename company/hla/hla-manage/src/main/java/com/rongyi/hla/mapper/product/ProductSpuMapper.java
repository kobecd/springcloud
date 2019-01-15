package com.rongyi.hla.mapper.product;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rongyi.dto.query.SpuQueryDTO;
import com.rongyi.model.product.ProductSpu;

import java.util.List;

/**
 * 产品信息Mapper
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */

//@Repository
public interface ProductSpuMapper extends BaseMapper<ProductSpu> {
    List<ProductSpu> selectAll();

    int getTotalCount();

    Integer save(ProductSpu spu);

    List<ProductSpu> list();

    int selectPageCount(SpuQueryDTO query);

    List<ProductSpu> selectForPage(SpuQueryDTO query);

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
