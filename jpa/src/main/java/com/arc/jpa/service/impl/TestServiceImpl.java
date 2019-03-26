package com.arc.jpa.service.impl;

import com.arc.jpa.model.domain.SysUser;
import com.arc.jpa.repository.SysUserRepository;
import com.arc.jpa.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

/**
 * @author 叶超
 * @since 2019/3/25 17:30
 */
@Slf4j
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private SysUserRepository userRepository;

    @Override
    public SysUser get(Long id) {
//        Optional<SysUser> byId = userRepository.findById(id);
//        ResponseEntity<S> error = userRepository.findOne(id).map(g -> ResponseEntity.ok(g)).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("ERROR"));
//        return userRepository.findById(id).get();//orElseThrow(EntityNotFoundException::new);
        return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
