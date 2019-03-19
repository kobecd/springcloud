package com.arc.cache2.controller;

import com.arc.cache2.model.domain.SysUser;
import com.arc.cache2.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 测试
 * 1、缓存框架是否正常工作
 * 2、缓存扩展后是否正常工作
 * 3、大并发情况下的优势-- 测试工具
 * <p>
 * 方法有
 * a 缓存作废：1、插入 2、更新 3、删除
 * b 命中缓存 4、查询
 *
 * @author 叶超
 * @since 2019/3/15 15:54
 */
@Slf4j
@RestController
@RequestMapping("/cache")
public class TestCacheController {

    @Autowired
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

    @RequestMapping("/get/{id}")
    public Object get(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        log.info("------------------------------------");
        SysUser user = userService.get(id);
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return user;
    }

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

    /*root的测试*/

    @RequestMapping("/get/v5/{id}")
    public Object testV5(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        log.info("-----------------1-------------------");
        SysUser user = userService.testCacheKeyMethodName(new SysUser(id), null, null);
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return user;
    }

    @RequestMapping("/get/v6/{id}")
    public Object testV6(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        log.info("----------------2--------------------");
        SysUser user = userService.testCacheKeyMethodName2(new SysUser(id), null, null);
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return user;
    }

    @RequestMapping("/get/v7/{id}")
    public Object testV7(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        log.info("-----------------3-------------------");
        SysUser user = userService.testCacheKeyTarget(new SysUser(id), null, null);
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return user;
    }

    @RequestMapping("/get/v8/{id}")
    public Object testV8(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        log.info("----------------4--------------------");
        SysUser user = userService.testCacheKeyTargetClass(new SysUser(id), null, null);
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return user;
    }

    @RequestMapping("/get/v9/{id}")
    public Object testV9(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        log.info("-------------------5-----------------");
        SysUser user = userService.testCacheKeyArgs(new SysUser(id), null, null);
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return user;
    }

    @RequestMapping("/get/v10/{id}")
    public Object testV10(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        log.info("-------------------6-----------------");
        SysUser user = userService.testCacheKeyArgsName(new SysUser(id), null, null);
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return user;
    }

    @RequestMapping("/get/v11/{id}")
    public Object testV11(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        log.info("-------------------testCondition-----------------");
        SysUser user = userService.testCondition(new SysUser(id));
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return user;
    }

    //--------------------------------------------------------------------------------------------------------------------------------------

    @RequestMapping("/list")
    public Object list() {

        long start = System.currentTimeMillis();
        log.info("------------------------------------");
        List<SysUser> users = userService.list();
        log.info("list data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return users;
    }


//    @RequestMapping("/page")
//    public Object query(@RequestBody SysUserRequest query) {
//        log.debug("结果={}", query);
//        return userService.listPage(query);
//    }
}
