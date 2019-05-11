package com.arc.security8.controller.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    //增删改查

    /**
     * 获取单个用户
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public Object get(@PathVariable Long id) {
        log.debug("获取单个用户,参数 id={}", id);
        return "1111111111111111" + id;
    }

    /**
     * 获取用户列表
     *
     * @return
     */
    //@todo page 分页插件
    @GetMapping(value = "")
    public Object list() {
        log.debug("获取用户列表，无参数！");
        return "list 获取用户列表";
    }


}

