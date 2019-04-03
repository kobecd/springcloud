package com.arc.jpa.controller;

import com.arc.jpa.model.domain.SysUser;
import com.arc.jpa.repository.SysUserRepository;
import com.arc.jpa.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/10 15:12
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class TestSysUserByJpaController {

    @Autowired
    private SysUserRepository userRepository;

    @Autowired
    private TestService testService;

    @GetMapping("/list")
    public Object list() {
        return userRepository.findAll();
    }

    @GetMapping("/test/1")
    public Object test1() {
        ArrayList<Long> ids = new ArrayList<>();
        ArrayList<String> avatars = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        ids.add(3L);
        ids.add(4L);
        ids.add(9L);
        avatars.add("8");
        avatars.add("7");
        List<SysUser> allByIdInAndAndAvatarIn = userRepository.findAllByIdInAndAndAvatarIn(ids, avatars);
        log.debug("结果={}", allByIdInAndAndAvatarIn.size());
        return allByIdInAndAndAvatarIn;
    }

    @GetMapping("/test/2")
    public Object test2() {
        ArrayList<Long> ids = new ArrayList<>();
        ArrayList<String> avatars = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        ids.add(3L);
        ids.add(4L);
        ids.add(9L);
        avatars.add("8");
        avatars.add("7");
        List<SysUser> allByIdInAndAndAvatarIn = userRepository.findAllByIdInAndAndAvatarInAndStatus(ids, avatars, 0);
        log.debug("结果={}", allByIdInAndAndAvatarIn.size());
        return allByIdInAndAndAvatarIn;
    }

    @GetMapping("/get")
    public Object get(@RequestParam Long id) {
        log.debug("########### id={}", id);
        return userRepository.existsById(id);
    }

    @PostMapping("/query")
    public Object get(@RequestBody SysUser user) {
        log.debug("########### user={}", user);
        return testService.queryByQuery(user);
    }

    @GetMapping("/query/2/{str}")
    public Object get(@PathVariable String str) {
        SysUser user = new SysUser();
        user.setNickname(str);
//        user.setAvatar("bb");
        Pageable pageable = PageRequest.of(0, 3);
        Object byQuery = testService.queryPage(user, pageable);
        return byQuery;
    }

    @GetMapping("/test/v1")
    public Object query(@RequestParam String name, @RequestParam String avatar) {
        SysUser user = new SysUser();
        if (name != null && !"".equals(name)) {
            user.setNickname(name);
        }
        if (avatar != null && !"".equals(avatar)) {
            user.setAvatar(avatar);
        }
        return  testService.findByCondition(user);
    }
//    @GetMapping("/test")
//    public Object query(@RequestParam String name, @RequestParam String avatar) {
//        SysUser user = new SysUser();
//        if (name != null && !"".equals(name)) {
//            user.setNickname(name);
//        }
//        if (avatar != null && !"".equals(avatar)) {
//            user.setAvatar(avatar);
//        }
//        Object byQuery = testService.query(user);
//        return byQuery;
//    }
}
