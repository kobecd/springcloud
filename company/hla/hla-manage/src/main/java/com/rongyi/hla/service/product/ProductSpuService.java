package com.rongyi.hla.service.product;

import com.rongyi.api.ResponseVO;
import com.rongyi.dto.query.SpuQueryDTO;
import com.rongyi.model.product.ProductSpu;

import java.util.List;

/**
 * 产品SPU Service接口
 */
public interface ProductSpuService {

    /**
     * 保存
     *
     * @param spu
     * @return
     */
    Integer save(ProductSpu spu);

    /**
     * 批量保存
     *
     * @param spus
     * @return
     */
    Integer batchSave(List<ProductSpu> spus);

    /**
     * 产品SPU列表
     *
     * @return
     */

    List<ProductSpu> list();

    int getTotalCount();

    ResponseVO page(SpuQueryDTO query);
}
