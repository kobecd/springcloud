package com.rongyi.hla.service.product;

import com.rongyi.model.product.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class skuServiceTest {
    @Autowired
    private SkuService skuService;

    @Test
    public void page() {
    }

    @Test
    public void save() {
        Product product = new Product();
        product.setName("测试产品2");
        product.setNotes("ceshi");
        product.setRfidCode("RFID02");
        product.setCreateDate(new Date());
        product.setUpdateDate(new Date());
        product.setPrice(99*100);
        Integer save = skuService.save(product);
        log.debug("save 产品的id{}", save);
        Assert.assertNotNull(save);

    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void get() {
    }

    @Test
    public void list() {
    }

    @Test
    public void selectProductsByRFIDCodes() {
    }

    @Test
    public void selectProductsBySPUCode() {
    }

    @Test
    public void batchUpdateProduct() {
    }

    @Test
    public void getCount() {
    }

    @Test
    public void batchSave() {
    }

    @Test
    public void getTotalCount() {
    }
}