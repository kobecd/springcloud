package com.arc.validate.controller;

import com.arc.validate.model.Employee;
import com.arc.validate.validators.constraints.CodeVerify;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 叶超
 * @since: 2019/2/27 16:36
 */
@Validated
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {


    /**
     * 保存数据 并对于对象形式的参数做校验校验，校验的逻辑需要注意在对象属性上，如果框架提供的默认实现不能满足需求可以自定义注解加以扩充
     *
     * @param employee 人员实体
     * @return Object
     */
    @PostMapping("/save")
    public Object save(@Validated @RequestBody Employee employee) {
        log.debug("------------------parameter={}", employee);
        System.out.println(employee);
        System.out.println("employee.getCode()=" + employee.getCode());
        return "测试" + employee;
    }


    /**
     * @param employee 人员实体
     * @return Object
     */
    @PostMapping("/update")
    public Object update(@RequestBody Employee employee) {
        log.debug("------------------parameter={}", employee);
        return "测试" + employee;
    }


    /**
     * @param id Long
     * @return Object
     */
    @GetMapping("/get/id")
    public Object getById(@RequestParam(name = "id", required = true) Long id) {
        log.debug("------------------parameter={}", id);
        return "测试" + id;
    }


    /**
     * 注意：@CodeVerify 标注用于校验方法级别的参数, 需要在类上标注@Validated,启动MethodValidationPostProcessor
     *
     * @param code String
     * @return Object
     */
    @GetMapping("/get/code")
    public Object getByCode(@CodeVerify @RequestParam String code) {
        log.debug("------------------parameter={}", code);
        return "测试" + code;
    }

}
