package com.rongyi.hla.service.product.impl;

import com.rongyi.api.ResponseVO;
import com.rongyi.dto.query.SpuQueryDTO;
import com.rongyi.hla.mapper.product.ProductSpuMapper;
import com.rongyi.hla.service.product.ProductSpuService;
import com.rongyi.model.product.ProductSpu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */

@Slf4j
@Service
public class ProductSpuServiceImpl implements ProductSpuService {
    @Autowired
    private ProductSpuMapper spuMapper;


    @Override
    public Integer save(ProductSpu spu) {
        return spuMapper.save(spu);
    }

    @Override
    public Integer batchSave(List<ProductSpu> spus) {
        int save = 0;
        for (ProductSpu spu : spus) {
//            spu.setPrice(spu.getPrice()==null? 0: ((spu.getPrice())*100));
//            System.out.println(spu);
            Integer insert = spuMapper.save(spu);
            save = insert + save;
        }
        return save;

    }

    @Override
    public List<ProductSpu> list() {
        return spuMapper.list();
    }

    @Override
    public int getTotalCount() {
        return spuMapper.getTotalCount();
    }





    @Override
    public ResponseVO page(SpuQueryDTO query) {
        int rows = spuMapper.selectPageCount(query);
        if (rows == 0) {
            return ResponseVO.success(Collections.emptyList(), query.getCurrentPage(), query.getPageSize(), 0);
        }
        List<ProductSpu> products = spuMapper.selectForPage(query);
        return ResponseVO.success(products, query.getCurrentPage(), query.getPageSize(), rows);
    }
}
