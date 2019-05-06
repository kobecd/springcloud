package com.arc.cache2.controller;

import com.arc.cache2.model.domain.SysUser;
import com.arc.cache2.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * 测试
 *
 * @author 叶超
 * @since 2019/3/15 15:54
 */
@Slf4j
@RestController
@RequestMapping("/users/")
public class TestCacheController2 {

    @Autowired
    @Qualifier("sysUserServiceImpl2")
    private SysUserService userService;


    @RequestMapping("/save")
    public Object save(@RequestBody SysUser user) {
        return userService.save(user);
    }

    @RequestMapping("/update")
    public Object update(@RequestBody SysUser user) {
        long start = System.currentTimeMillis();
        log.info("------------------------------------");
        int update = userService.update(user);
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return update;
    }

    @GetMapping("/delete/{id}")
    public Integer delete(@PathVariable Long id) {
        return userService.delete(id);
    }

    //--------------------------------------------------------------------------------------------------------------------------------------

    @RequestMapping("/get/v1/{id}")
    public Object getV1(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        log.info("------------------------------------");
        SysUser user = userService.get(id);
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return user;
    }

    @RequestMapping("/get/v2/{id}")
    public Object testGetV2(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        log.info("------------------------------------");
        SysUser user = userService.testCacheKey1(new SysUser(id), id, null);
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return user;
    }


    @RequestMapping("/get/v3/{id}")
    public Object testGetV3(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        log.info("------------------------------------");
        SysUser user = userService.testCacheKey2(new SysUser(id), id, null);
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return user;
    }


    @RequestMapping("/get/v4/{id}")
    public Object testGetV4(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        log.info("------------------------------------");
        SysUser user = userService.testCacheKey3(new SysUser(id), null, null);
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return user;
    }

//    @RequestMapping("/page")
//    public Object query(@RequestBody SysUserRequest query) {
//        log.debug("结果={}", query);
//        return userService.listPage(query);
//    }
}
