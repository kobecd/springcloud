package com.arc.mybatis.service;

import com.arc.mybatis.model.entries.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: yechao
 * @date: 2018/12/28 0:45
 * @description:
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void update() {
        int update = userService.update(new SysUser());
        log.debug("结果={}",update);
        log.debug("结果={}",update);
        log.debug("结果={}",update);
        log.debug("结果={}",update);

    }
}
