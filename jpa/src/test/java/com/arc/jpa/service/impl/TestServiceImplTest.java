package com.arc.jpa.service.impl;

import com.arc.jpa.model.domain.SysUser;
import com.arc.jpa.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 叶超
 * @since 2019/3/25 17:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestServiceImplTest {

    @Autowired
    private TestService testService;

    @Before
    public void beforeGet() throws Exception {
        log.debug("-----------------------------");
        log.debug("TestService={}", testService);
        System.out.println(testService);
        log.debug("-----------------------------");
    }


    @Test
    public void get() {
        log.debug("TestService={}", testService);
        try {

            SysUser user = testService.get(1L);
            log.debug("User={}", user);

            SysUser user2 = testService.get(100L);
            Assert.fail();
            log.debug("User={}", user2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @After
    public void afterGet() throws Exception {
        log.debug("######################");
        log.debug("TestService={}", testService);
        System.out.println(testService);
        log.debug("######################");
    }

    @Test
    public void get1() {
    }

    @Test
    public void queryByQuery() {
    }

    @Test
    public void queryPage() {
    }

    @Test
    public void queryPage2() {
    }

    @Test
    public void findByCondition() {
        log.debug("######################");
        log.debug("TestService={}", testService);
        System.out.println(testService);
        log.debug("######################");
    }
}
