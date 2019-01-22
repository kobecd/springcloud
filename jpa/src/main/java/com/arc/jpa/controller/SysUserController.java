package com.arc.jpa.controller;

import com.arc.jpa.model.domain.SysUser;
import com.arc.jpa.repository.ProjectRequirementRepository;
import com.arc.jpa.repository.SysUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
public class SysUserController {

    @Autowired
    private SysUserRepository userRepository;

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
        log.debug("结果={}",allByIdInAndAndAvatarIn.size());
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
        List<SysUser> allByIdInAndAndAvatarIn = userRepository.findAllByIdInAndAndAvatarInAndStatus(ids, avatars,0);
        log.debug("结果={}",allByIdInAndAndAvatarIn.size());
        return allByIdInAndAndAvatarIn;
    }

    @GetMapping("/get")
    public Object get(@RequestParam Long id) {
        log.debug("########### id={}", id);
        return userRepository.existsById(id);
    }
}
