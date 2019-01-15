package com.rongyi.hla.mapper.product;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
@Slf4j
public class InitDatabaseMapperTest {

    @Autowired
    private InitDatabaseMapper dbMapper;

    @Test
    public void createDatabase() {
//        Integer aaa = dbMapper.createDatabase("bbb");
//        System.out.println(aaa);
    }

//    @Test
//    public void getDatabase() {
//        Map<String, String> database = dbMapper.getDatabase("hla_test");
//        log.debug("数据库为{}",database);
//        Assert.assertNotNull(database);
//    }
}