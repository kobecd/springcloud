//package com.rongyi.hla.mapper.product;
//
//import com.rongyi.model.product.Product;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Date;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Slf4j
//public class ProductMapperTest {
//
//    @Autowired
//    private SkuMapper productMapper;
//
//    @Test
//    public void insert() {
//        Product product = new Product();
//        product.setName("测试");
//        product.setRfidCode("5457");
//        product.setCreateDate(new Date());
//        product.setNotes("外哦回复哎未婚夫啊");
//        product.setSkuCode("145274");
//        product.setSpuCode("32333145274");
//
//        int save = productMapper.insert(product);
//        log.debug("保存成功的数量{}" + save);
//        Assert.assertTrue(1 == save);
//    }
//
//    @Test
//    public void update() {
//        Product product = new Product();
//        product.setName("冬季大衣");
//        product.setId(6);
//        product.setUpdateDate(new Date());
//        int update = productMapper.update(product);
//        log.debug("保存成功的数量{}" + update);
//        Assert.assertTrue(1 == update);
//    }
//
//
//    @Test
//    public void get() {
//        Product product = productMapper.get(1);
//        Assert.assertNotNull(product);
//
//    }
//
//    @Test
//    public void list() {
//    }
//
//    @Test
//    public void listPage() {
//    }
//
//    @Test
//    public void getCount() {
//    }
//
////
////    @Before
////    public void setUp() throws Exception {
////        Product product = new Product();
////        product.setId(1000);
////        product.setName("测试");
////        int save = productMapper.save(product);
////        log.debug("保存成功的数量{}" + save);
////        Assert.assertTrue(1 == save);
////    }
////
//////    @After
//////    public void tearDown() throws Exception {
//////    }
////
////    @Test
////    public void delete() {
////        Integer delete = productMapper.delete(1000);
////        log.debug("删除成功的数量{}" + delete);
////        Assert.assertTrue(delete == 1);
////    }
//}