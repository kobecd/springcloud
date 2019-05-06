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
 * @author: yechao
 * @date: 2019/1/10 15:12
 */
@Slf4j
@RestController
@RequestMapping("/users")
public class TestSysUserByJpaController {

    @Autowired
    private SysUserRepository userRepository;

    @Autowired
    private TestService testService;

    @GetMapping("/list")
    public Object list() {
        return userRepository.findAll();
    }

    //测试条件查询IN
    @PostMapping("/test/v1/query/in")
    public Object testQueryIn(@RequestBody List<Long> ids) {
        return userRepository.findAllByIdIn(ids);
    }

    @GetMapping("/test/v1/query/in/state")
    public Object test2(@RequestParam Integer state) {
        ArrayList<Long> ids = new ArrayList<>();
        ArrayList<String> avatars = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        ids.add(3L);
        ids.add(4L);
        ids.add(9L);
        avatars.add("8");
        avatars.add("7");
        List<SysUser> allByIdInAndAndAvatarIn = userRepository.findAllByIdInAndAndAvatarInAndState(ids, avatars, state);
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

    @GetMapping("/query/v1/{str}")
    public Object get(@PathVariable String str) {
        SysUser user = new SysUser();
        user.setNickname(str);
//        user.setAvatar("bb");
        Pageable pageable = PageRequest.of(0, 3);
        Object byQuery = testService.queryPage(user, pageable);
        return byQuery;
    }


    //测试多条件动态查询
    @PostMapping("/test/v1/query")
    public Object testV1(@RequestBody SysUser user) {
        return testService.findByCondition(user);
    }

}
