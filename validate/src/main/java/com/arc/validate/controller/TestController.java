package com.arc.validate.controller;

import com.arc.validate.validators.constraints.MyCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 叶超
 * @since: 2019/2/27 16:36
 */
@Validated
@Slf4j
@RestController
@RequestMapping("/man")
public class TestController {

    // @AreaCode标注用于校验方法级别的参数,需要在类上标注@Validated,启动MethodValidationPostProcessor
    @GetMapping("/get")
    public Object get(@MyCode @RequestParam String code) {
        log.debug("------------------parameter={}", code);
        return "测试" + code;
    }


}
