package com.antsoft.service;

import com.antsoft.Application;
import com.antsoft.model.TransactionalTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2017/3/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = Application.class)
public class TransactionalTestServiceTest {
    @Autowired
    TransactionalTestService transactionalTestService;

    @Test
    public void testInsertAll(){
        List<TransactionalTest> transactionalTests = new ArrayList<>();
        transactionalTests.add(new TransactionalTest("a"));
        transactionalTests.add(new TransactionalTest("aa"));
        transactionalTests.add(new TransactionalTest("aaa"));
        transactionalTests.add(new TransactionalTest("aaaa"));
        int result = transactionalTestService.insertAll(transactionalTests);
        Assert.assertEquals(4,result);
    }


}
