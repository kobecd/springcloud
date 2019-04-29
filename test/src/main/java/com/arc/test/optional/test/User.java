package com.arc.test.optional.test;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: yechao
 * @date: 2018/12/9 12:26
 * @description:
 */
@Setter
@Getter
public class User {

    private String username;

    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
