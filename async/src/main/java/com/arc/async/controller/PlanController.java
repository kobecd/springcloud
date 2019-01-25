package com.arc.async.controller;

import com.arc.async.service.PlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/25 14:23
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class PlanController {

    @Resource
    private PlanService planService;

    @GetMapping("/v1")
    public Object v1() {
        log.debug("测试");
        return planService.sandMail(1L);
    }

    @GetMapping("/v2")
    public Object v2() {
        long start = System.currentTimeMillis();

        log.debug("测试2");
        planService.sandMailV2(22L);
        return System.currentTimeMillis() - start;
    }


}
