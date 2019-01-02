package com.rongyi.hla.service.product;

import com.rongyi.model.product.ProductGroup;

import java.util.List;

/**
 * 产品分组信息 Service接口
 */
public interface GroupService {

    /**
     * 保存产品分组
     *
     * @param product
     * @return
     */
    Integer save(ProductGroup product);


    /**
     * 更新单产品分组
     *
     * @param product
     * @return
     */
    Integer update(ProductGroup product);


    /**
     * 产品分组列表
     *
     * @return
     */
    List<ProductGroup> list();

    int batchSave(List<ProductGroup> rows);
}
