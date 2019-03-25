package com.arc.jpa.controller;

import com.arc.jpa.model.domain.SysUser;
import com.arc.jpa.repository.SysUserRepository;
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
    private SysUserRepository userRepository;


    @GetMapping("/{id}")
    public ResponseVo test1(@PathVariable Long id) {
        try {
            return ResponseVo.success(get(id));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        return ResponseVo.failure();

    }


    public SysUser get(Long id) {
//        Optional<SysUser> byId = userRepository.findById(id);

//        ResponseEntity<S> error = userRepository.findOne(id).map(g -> ResponseEntity.ok(g)).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("ERROR"));


        return userRepository.findById(id).get();//orElseThrow(EntityNotFoundException::new);
//        return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

}
