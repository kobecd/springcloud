package com.rongyi.hla.service.product;

import com.rongyi.dto.product.ProductDTO;
import com.rongyi.model.product.Product;
import com.rongyi.query.product.ProductQuery;

import java.util.List;

/**
 * 产品信息 Service接口
 */
public interface ProductService {
    /**
     * 分页查询产品
     *
     * @param query
     * @return
     */
    List<Product> page(ProductQuery query);

    /**
     * 保存产品
     *
     * @param product
     * @return
     */
    Long save(Product product);

    /**
     * 删除单个产品
     *
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 更新单产品
     *
     * @param product
     * @return
     */
    int update(Product product);

    /**
     * 获取单个产品
     *
     * @param id
     * @return
     */
    Product get(Long id);

    List<Product> list(ProductDTO productDTO);

    List<Product> list();

}
