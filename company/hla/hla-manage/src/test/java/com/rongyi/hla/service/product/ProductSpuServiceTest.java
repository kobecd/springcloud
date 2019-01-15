package com.rongyi.hla.service.product;

import com.rongyi.model.product.ProductSpu;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductSpuServiceTest {
    @Autowired
    private ProductSpuService spuService;
//
//    @Test
//    public void save() {
//        ProductSpu spu = new ProductSpu();
//        spu.setName("uuuuuuu");
//        spu.setNotes("uuuuuu");
//        spu.setPrice(100);
//        spu.setSpuCode("spuuu");
//        Integer save = spuService.save(spu);
//        Assert.assertNotNull(save);
//    }

    @Test
    public void batchSave() {
    }

    @Test
    public void list() {
        List<ProductSpu> list = spuService.list();
        Assert.assertNotNull(list);
    }

    @Test
    public void getTotalCount() {
    }
}