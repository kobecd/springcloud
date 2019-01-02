package com.rongyi.hla.service.product;

import com.rongyi.api.ResponseVO;
import com.rongyi.dto.product.ProductDTO;
import com.rongyi.model.product.Product;

import java.util.List;

/**
 * 产品信息 Service接口
 */
public interface SkuService {
    /**
     * 分页查询产品
     * 后端,通过SpuCode获取商品列表
     * 单表sku信息即可，注意与屏幕端的分页不同
     *
     * @param query
     * @return
     */
    ResponseVO page(ProductDTO query);

    /**
     * 保存产品
     *
     * @param product
     * @return
     */
    Integer save(Product product);


    /**
     * 更新单产品
     *
     * @param product
     * @return
     */
    Integer update(Product product);



    /**
     * 通过RFID查对应的SKU
     *
     * @param rfidCodes
     * @return
     */
    List<ProductDTO> selectProductsByRFIDCodes(List<String> rfidCodes);


    /**
     * 批量更新产品
     *
     * @param products
     * @return
     */
    Integer batchUpdate(List<Product> products);


    int getCount(ProductDTO query);

    /**
     * 批量保存
     *
     * @param products
     * @return
     */
    Integer batchSave(List<Product> products);

    int getTotalCount();

    List<Product> listBySpuCode(String spuCode);

}
