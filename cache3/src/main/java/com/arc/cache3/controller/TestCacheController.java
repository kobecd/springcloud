package com.arc.cache3.controller;

import com.arc.cache3.model.domain.SysUser;
import com.arc.cache3.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 测试
 * @author 叶超
 * @since 2019/3/15 15:54
 */
@Slf4j
@RestController
@RequestMapping("/cache3")
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

    @RequestMapping("/get/v1/{id}")
    public Object getV1(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        log.info("------------------------------------");
        SysUser user = userService.get(id);
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
