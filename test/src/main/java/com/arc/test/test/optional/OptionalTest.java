package com.arc.test.test.optional;

import java.util.Optional;

/**
 * @author: 叶超
 * @since: 2019/2/18 9:17
 */
public class OptionalTest {

    public void setName(String name) throws IllegalArgumentException {
        name = Optional.ofNullable(name).filter(User::isNameValid).orElseThrow(() -> new IllegalArgumentException("Invalid username."));
    }

}


class User {

    public static boolean isNameValid(String s) {
        return false;
    }

}
