package com.arc.mp.controller;

import com.arc.mp.service.UserService;
import com.arc.mp.model.entries.SysUser;
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
    public SysUser user(@PathVariable Long id) {
        return userService.get(id);
    }

    /**
     * 获取用户列表
     *
     * @return
     */
    @GetMapping(value = "")
    public List<SysUser> list() {
        return userService.list();
    }

    /**
     * 新建用户
     * 注意
     * 1请求类型为Content-Type:application/json
     * 2方法： POST
     *
     * @param user
     * @return
     */
    @PostMapping(value = "")
    public Long create(@RequestBody SysUser user) {
        log.debug("参数 username={},password={}", user.getUsername(), user.getPassword());
        return userService.save(user);
    }


    /**
     * 删除
     * 表示删除id为1的数据
     * 方法： DELETE
     * http://lip:port/user/1
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
     * 注意 1请求类型为Content-Type:application/json
     * 方法： PUT
     * 对于必要参数没有传则判断了一下会返回错误代码
     * http://ip:port/user/
     *
     * @return
     */
    @PostMapping("/update")
    public Integer update(@RequestBody SysUser user) {
        return userService.update(user);
    }


}

