package com.rongyi.hla.service.product.impl;

import com.rongyi.hla.mapper.product.ProductGroupMapper;
import com.rongyi.hla.service.product.ProductGroupService;
import com.rongyi.model.product.ProductGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */

@Slf4j
@Service
public class ProductGroupServiceImpl implements ProductGroupService {

    @Autowired
    private ProductGroupMapper productGroupMapper;

    @Override
    public Long save(ProductGroup product) {
         productGroupMapper.save(product);
        return product.getId();
    }

    @Override
    public Integer update(ProductGroup product) {
        return null;
    }

    @Override
    public List<ProductGroup> list() {
        return productGroupMapper.list();
    }

    @Override
    public int batchSave(List<ProductGroup> groups) {
        int mark = 0;
        Long save = 0L;
        for (ProductGroup group : groups) {
            try {
                save = this.save(group);
            } catch (Exception e) {
                log.error("batchSave groups{}", e.getMessage());
            }
            if (save > 0) {
                mark = mark++;
            }
        }
        return mark;
    }
}
