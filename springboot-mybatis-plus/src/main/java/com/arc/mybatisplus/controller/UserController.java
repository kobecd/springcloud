package com.arc.mybatisplus.controller;

import com.arc.mybatisplus.model.entries.User;
import com.arc.mybatisplus.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户相关的的接口by RESTful
 *
 * @author yehcao
 * @date 2018/12/25
 */
@Slf4j
@Controller
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 获取单个用户
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public User user(@PathVariable Long id) {
        return userService.get(id);
    }

    /**
     * 获取用户列表
     *
     * @return
     */
    @GetMapping(value = "")
    public List<User> list() {
        return userService.list();
    }

    /**
     * 新建用户
     *
     * @param user
     * @return
     */
    @PostMapping(value = "")
    public String create(@RequestBody User user) {
        log.debug("参数 username={},password={}", user.getUsername(), user.getPassword());
        return "success 新建user : " + user.getUsername() + " " + user.getPassword();
    }


    /**
     * 删除用户
     *
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable Long id) {
        log.debug("参数删除用户 id={}" + id);
        int i = userService.delete(id);
        if (i > 0) {
            return "编号  " + id + " 的 用户删除成功！";
        } else {
            return "编号  " + id + " 的 用户删除失败！";
        }
    }


    /**
     * 更新用户
     *
     * @return
     */
    @PutMapping(value = "")
    public String update(@RequestBody User user) {
        log.debug("更新用户参数 id={},username={},password={}", user.getId(), user.getUsername(), user.getPassword());
        Long save = userService.save(user);

        if (save != null) {
            return user.getUsername() + "  用户更新成功！";
        } else {
            return user.getUsername() + "  用户更新失败！";
        }
    }


}

