//package com.arc.security3.security;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
///**
// * 自定义加密解密码
// *
// * @author 叶超
// * @since: 2019/5/8 21:11
// */
//@Slf4j
////@Component
//public class BCryptPasswordEncoderConfig implements PasswordEncoder {
//    @Override
//    public String encode(CharSequence charSequence) {
//        log.debug("############################");
//        log.debug("charSequence 加密后={}", charSequence.toString());
//        log.debug("############################");
//        return charSequence.toString();
//    }
//
//    @Override
//    public boolean matches(CharSequence rawPassword, String encodedPassword) {
//        log.debug("############################");
//        log.debug("参数1 传入的charSequence={}， 2 数据库中的s={}", rawPassword, encodedPassword);
//        log.debug("############################");
//        boolean equals = rawPassword.toString().equals(encodedPassword);
//        log.debug("结果={}",equals);
//
//        return true;
//    }
//}
