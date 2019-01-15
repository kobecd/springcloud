package com.rongyi.hla.mapper.product;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rongyi.dto.product.ProductDTO;
import com.rongyi.entity.product.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 产品信息Mapper
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
public interface SkuMapper extends BaseMapper<Product> {

    int save(Product product);

    int update(Product product);

    Product get(Integer id);

    List<Product> findAll();

    List<Product> selectProductsByRFIDCodes(List<String> list);

    List<Product> selectProductsBySPUCode(@Param("spuCode") String spuCode);

    //Integer batchUpdate(List<Product> products);

    List<Product> selectForPage(ProductDTO query);

    int selectPageCount(ProductDTO query);

    Integer selectTotal();

    /**
     * 工具spucode 查询兄弟元素skus
     *
     * @param spuCode
     * @return
     */
    List<Product> listBySpuCode(@Param("spuCode") String spuCode);
}
