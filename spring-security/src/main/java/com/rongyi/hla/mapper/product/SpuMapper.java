package com.rongyi.hla.mapper.product;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rongyi.dto.query.SpuQueryDTO;
import com.rongyi.model.product.GroupSpu;
import com.rongyi.model.product.ProductSpu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 产品信息Mapper
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
public interface SpuMapper extends BaseMapper<ProductSpu> {
    List<ProductSpu> selectAll();

    int getTotalCount();

    Integer save(ProductSpu spu);

    List<ProductSpu> list();

    int selectPageCount(SpuQueryDTO query);

    List<ProductSpu> selectForPage(SpuQueryDTO query);

    //带上分组编码
    int getPageCountByGroupCode(SpuQueryDTO query);

    //带上分组编码
    List<ProductSpu> listByGroupCode(SpuQueryDTO query);

    int update(ProductSpu spu);

    ProductSpu get(@Param("spuCode") String spuCode);

    Integer saveGroupSpu(GroupSpu  productGroup);

    int updateGroupSpu(GroupSpu groupSpu);
}
