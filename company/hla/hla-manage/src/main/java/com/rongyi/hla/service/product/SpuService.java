package com.rongyi.hla.service.product;

import com.rongyi.vo.ResponseVO;
import com.rongyi.dto.product.ProductSpuDTO;
import com.rongyi.query.product.SpuQueryDTO;
import com.rongyi.entity.product.GroupSpu;
import com.rongyi.entity.product.ProductSpu;

import java.util.List;

/**
 * 产品SPU Service接口
 */
public interface SpuService {

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

    //批量更新spu
    Integer batchUpdate(List<ProductSpu> spus);

    //中间表信息更新
    Integer batchUpdateGroupSpu(List<GroupSpu> spus);


    /**
     * 产品SPU列表
     *
     * @return
     */

    List<ProductSpu> list();

    int getTotalCount();

    ResponseVO page(SpuQueryDTO query);


    ProductSpuDTO getSpuWithSkus(String spuCode);

    /**
     * 工具spucode查找spu
     * 并且返回此spu下的所有sku
     *
     * @param spuCode
     * @return
     */
    ProductSpu get(String spuCode);
//    ProductSpu getBySpuCode(String spuCode);
}
