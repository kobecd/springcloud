package com.arc.blog.controller.system;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: 叶超
 * @since: 2019/2/15 17:38
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/v1")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {

        log.debug("v1");
        log.debug("v1");
        log.debug("v1");
        log.debug("v1");
        log.debug("v1");
        log.debug("v1");
    }


}
