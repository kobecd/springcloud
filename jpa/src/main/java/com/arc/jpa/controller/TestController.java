package com.arc.jpa.controller;

import com.arc.jpa.service.TestService;
import com.arc.model.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 叶超
 * @description:
 * @since 2019/2/25 15:12
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;
//    userRepository;


    @GetMapping("/{id}")
    public ResponseVo test1(@PathVariable Long id) {
        try {
            return ResponseVo.success(testService.get(id));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        return ResponseVo.failure();

    }



}
