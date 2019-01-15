package com.rongyi.hla.service.product.impl;

import com.rongyi.vo.ResponseVO;
import com.rongyi.dto.product.ProductDTO;
import com.rongyi.hla.mapper.product.SkuMapper;
import com.rongyi.hla.service.product.SkuService;
import com.rongyi.hla.service.product.SpuService;
import com.rongyi.entity.product.Product;
import com.rongyi.entity.product.ProductSpu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLWarning;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */

@Service
public class SkuServiceImpl implements SkuService {
    Logger log = LoggerFactory.getLogger(SkuServiceImpl.class);

    @Autowired
    private SkuMapper skuMapper;

    @Autowired
    private SpuService spuService;

    @Override
    public Integer save(Product product) {
        if (skuMapper.save(product) == 1) {
            return product.getId();
        } else {
            log.error("保存数据错误");
            throw new RuntimeException("", new SQLWarning("保存数据错误"));
        }
    }


    @Override
    public Integer update(Product product) {
        //更新的时候价格怎么处理
        return skuMapper.update(product);
    }


    @Override
    public ResponseVO page(ProductDTO query) {
        log.debug("query{}", query.toString());
        int rows = skuMapper.selectPageCount(query);
        if (rows == 0) {
            return ResponseVO.success(Collections.emptyList(), query.getCurrentPage(), query.getPageSize(), 0);
        }
        List<Product> products = skuMapper.selectForPage(query);
        return ResponseVO.success(products, query.getCurrentPage(), query.getPageSize(), rows);
    }

    /**
     * 通过RFIDs查对应的SKU
     *
     * @param rfidCodes
     * @return
     */
    @Override
    public List<ProductDTO> selectProductsByRFIDCodes(List<String> rfidCodes) {

        //1、查出rfid 对应的是sku数据集合 2、是否可以展示  3、查找以及组装兄弟元素
        List<Product> products = skuMapper.selectProductsByRFIDCodes(rfidCodes);
        System.out.println(products);
        if (products == null || products.size() == 0) {
            return Collections.EMPTY_LIST;
        }

        List<ProductDTO> list = new ArrayList(products.size());
        for (Product product : products) {
            ProductDTO dto = new ProductDTO();
            //是否可以展示 状态在父级spu上，判断完成后 可以显示的则去查兄弟元素
            ProductSpu spu = spuService.get(product.getSpuCode());
            BeanUtils.copyProperties(product, dto);
            dto.setState(spu.getState());

            if (dto.isState()) {
                //  兄弟元素处理
                List<Product> brotherProducts = skuMapper.listBySpuCode(product.getSpuCode());
                dto.setProducts(brotherProducts);
                list.add(dto);
            }
        }
        return list;
    }


    @Override
    public Integer batchUpdate(List<Product> products) {
        int mark = 0;
        int update = 0;
        if (products == null || products.size() == 0) {
            return mark;
        }

        for (Product product : products) {
            update = skuMapper.update(product);
            mark = mark + update;
        }
        return mark;
        //批量更新
        //  return skuMapper.batchUpdate(products);

    }


    @Override
    public int getCount(ProductDTO query) {
        return skuMapper.selectPageCount(query);
    }


    @Override
    public int getTotalCount() {
        return skuMapper.selectTotal();
    }

    @Override
    public Integer batchSave(List<Product> products) {
        //比较数据
        // 直接插入 主键冲突的则标识数据存在需要更新
        List<Product> updateProductList = new ArrayList<>();
        int mark = 0;
        int save = 0;
        for (Product product : products) {
            try {
                save = skuMapper.save(product);

            } catch (Exception e) {
                updateProductList.add(product);
                log.error("batchSave products{}", e.getMessage());
            }
            if (save > 0) {
                mark = mark + save;
            }
        }
        //主键冲突的数据需要收集起来去update
        Integer update = 0;
        try {

            if (updateProductList.size() > 0) {
                update = this.batchUpdate(updateProductList);
            }
        } catch (Exception e) {
            log.error("维护SKU  更新时候出错{}", e.getMessage());

        }
        log.info("维护SKU，插入的数据  {}，更新的数据{}, 时间 {}", mark, update, new Date());
        return mark;
    }

    @Override
    public List<Product> listBySpuCode(String spuCode) {
        return skuMapper.listBySpuCode(spuCode);
    }


}


