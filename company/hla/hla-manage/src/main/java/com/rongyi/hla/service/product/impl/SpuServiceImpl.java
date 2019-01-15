package com.rongyi.hla.service.product.impl;

import com.rongyi.vo.ResponseVO;
import com.rongyi.dto.product.ProductSpuDTO;
import com.rongyi.query.product.SpuQueryDTO;
import com.rongyi.hla.mapper.product.SpuMapper;
import com.rongyi.hla.service.product.SpuService;
import com.rongyi.hla.service.product.SkuService;
import com.rongyi.entity.product.GroupSpu;
import com.rongyi.entity.product.Product;
import com.rongyi.entity.product.ProductSpu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */

@Slf4j
@Service
public class SpuServiceImpl implements SpuService {
    @Autowired
    private SpuMapper spuMapper;

    @Autowired
    private SkuService skuService;


    @Override
    public Integer save(ProductSpu spu) {
        return spuMapper.save(spu);
    }

    @Override
    public Integer batchSave(List<ProductSpu> spus) {
        List<ProductSpu> updateProductSpuList = new ArrayList<>();
        List<GroupSpu> updateGroupSpuList = new ArrayList<>();

        int mark = 0;
        Integer insertSpu = 0;
        int insertGroupSpu = 0;
        for (ProductSpu spu : spus) {
            try {
                insertSpu = spuMapper.save(spu);
                updateGroupSpuList.addAll(spu.getProductGroup());//spu 插入数据

                try {
                    for (GroupSpu groupSpu : spu.getProductGroup()) {
                        insertGroupSpu = spuMapper.saveGroupSpu(groupSpu);//关系表维护 insert
                    }
                } catch (Exception e) {
                    updateGroupSpuList.addAll(spu.getProductGroup());//关系表插入失败的 收集起来 后面去update
                    log.error("saveGroupSpu {}", e.getMessage());
                }
            } catch (Exception e) {
                updateProductSpuList.add(spu);////spu 插入失败的 收集起来 后面去update
                log.error("batchSave {}", e.getMessage());
            }

            if (insertSpu > 0) {
                mark = mark+insertSpu ;//spu插入成功的数量
            }
        }

        //主键冲突的数据需要收集起来去update
        Integer integer = 0;
        if (updateProductSpuList.size() > 0) {
            integer = this.batchUpdate(updateProductSpuList);
        }
        if (updateGroupSpuList.size() > 0) {
            Integer integerGroupSpu = this.batchUpdateGroupSpu(updateGroupSpuList);
        }
        log.error("批量保存SPU数据的数量 batchUpdateProduct products{}", integer);
        return mark;


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
        //若传分组code 时需要限制
        int rows = 0;
        List<ProductSpu> spus = new ArrayList<>();
        //有分组编码的话走这个接口
        if (query.getGroupCode() != null && query.getGroupCode() != "") {
            rows = spuMapper.getPageCountByGroupCode(query);
            if (rows == 0) {
                return ResponseVO.success(Collections.emptyList(), query.getCurrentPage(), query.getPageSize(), 0);
            }
            spus = spuMapper.listByGroupCode(query);
        } else {
            //不传分组code的情况下表示仅仅查询spu单表数据
            rows = spuMapper.selectPageCount(query);
            if (rows == 0) {
                return ResponseVO.success(Collections.emptyList(), query.getCurrentPage(), query.getPageSize(), 0);
            }
            try {
                spus = spuMapper.selectForPage(query);
            } catch (Exception e) {
                log.error("{}", e.getCause());
                System.out.println(e);
            }
        }
        return ResponseVO.success(spus, query.getCurrentPage(), query.getPageSize(), rows);
    }


    //spu 批量更新
    //如果显示状态修改了那么同时触发维护 sku的显示属性！！！
    @Override
    public Integer batchUpdate(List<ProductSpu> spus) {
        int update = 0;
        int save = 0;
        for (ProductSpu spu : spus) {
            try {
                save = spuMapper.update(spu);
            } catch (Exception e) {
                log.error(e.getMessage());
            }
            update = save + update;
        }
        return update;
    }


    @Override
    public Integer batchUpdateGroupSpu(List<GroupSpu> groupSpus) {
        int update = 0;
        for (GroupSpu groupSpu : groupSpus) {
            try {
                update = spuMapper.updateGroupSpu(groupSpu);

            } catch (Exception e) {
                log.error(e.getMessage());
            }
            update = update + 1;
        }
        return update;
    }


    @Override
    public ProductSpuDTO getSpuWithSkus(String spuCode) {
//        return spuMapper.getSpuWithSkus(spuCode);

        ProductSpuDTO spuDTO = new ProductSpuDTO();
        ProductSpu spu = spuMapper.get(spuCode);

        BeanUtils.copyProperties(spu, spuDTO);
        List<Product> skus = skuService.listBySpuCode(spuCode);
        spuDTO.setProducts(skus);
        log.debug("spuDTO  spu with skus{}", spuDTO);
        return spuDTO;
    }

    @Override
    public ProductSpu get(String spuCode) {
        return spuMapper.get(spuCode);

    }
}
