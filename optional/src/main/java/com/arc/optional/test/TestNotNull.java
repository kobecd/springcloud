package com.arc.optional.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Optional;

/**
 * @author: yechao
 * @date: 2018/12/9 12:25
 * @description:
 */
@Slf4j
public class TestNotNull {

    @Test
    public void givenPresentValue_whenCompare_thenOk() {
        User user = new User("john@gmail.com", "1234");
        log.info("Using orElse");
        User result = Optional.ofNullable(user).orElse(createNewUser());
        log.info("Using orElseGet");
        user = null;
        User result2 = Optional.ofNullable(user).orElseGet(() -> createNewUser());
    }

    private User createNewUser() {
        log.debug("Creating New User");
        return new User("extra@gmail.com", "1234");
    }
}
