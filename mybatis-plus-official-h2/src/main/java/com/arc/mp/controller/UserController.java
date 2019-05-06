package com.arc.mp.controller;

import com.arc.mp.model.domain.User;
import com.arc.mp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 用户相关的的接口by RESTful
 *
 * @author yehcao
 * @date 2018/12/25
 */
@Slf4j
@Controller
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //增删改查


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
    public Object save(@RequestBody User user) {
        log.debug("新建用户，参数 user={}, ", user.toString());
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
    public Object delete(@PathVariable Long id) {
        log.debug("参数删除用户，参数id={}", id);
        return userService.delete(id);
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
//    @PutMapping("/")
    @PostMapping("/update")
    public Object update(@RequestBody User user) {
        log.debug("更新用户,参数user={}, ", user.toString());
        return userService.update(user);
    }

    /**
     * 获取单个用户
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public Object get(@PathVariable Long id) {
        log.debug("获取单个用户,参数 id={}", id);
        return userService.get(id);
    }

    /**
     * 获取用户列表
     *
     * @return
     */
    //@todo page 分页插件
    @GetMapping(value = "/page")
    public Object list() {
        log.debug("获取用户列表，无参数！");
        return userService.list();
    }

    /**
     * 测试登陆 @todo 待删除
     *
     * @param username
     * @param password
     * @return
     */
    @GetMapping(value = "/login")
    public Object get(@RequestParam String username, @RequestParam String password) {
        log.debug("login,获取单个用户,参数 username={},password={}", username, password);
        return userService.login(username, password);
    }

}

