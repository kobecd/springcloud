package com.rongyi.hla.service.product.impl;

import com.rongyi.hla.mapper.product.GroupMapper;
import com.rongyi.hla.service.product.GroupService;
import com.rongyi.entity.product.ProductGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */

@Slf4j
@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupMapper groupMapper;

    @Override
    public Integer save(ProductGroup product) {

        groupMapper.save(product);
        return product.getId();
    }

    @Override
    public Integer update(ProductGroup product) {
        return groupMapper.update(product);
    }

    @Override
    public List<ProductGroup> list() {
        return groupMapper.list();
    }

    @Override
    public int batchSave(List<ProductGroup> groups) {
        int mark = 0;
        int save = 0;
        Integer integer = 0;

        List<ProductGroup> updateGroupList = new ArrayList<>();
        for (ProductGroup group : groups) {
            try {
                save = this.save(group);
            } catch (Exception e) {
                updateGroupList.add(group);
                log.error("batchSave groups{}", e.getMessage());
            }
            if (save > 0) {
                mark = mark++;
            }
        }

        try {
            if (updateGroupList.size() > 0) {
                for (ProductGroup productGroup : updateGroupList) {
                    integer = this.update(productGroup);
                }
            }
        } catch (Exception e) {
            log.error("视图更新group出错，下次同步任务时候会 再次尝试groups{}", e.getMessage());

        }
        log.debug("维护GROUP，增加{}条,更新{}条", mark,integer);
        return mark;
    }
}
