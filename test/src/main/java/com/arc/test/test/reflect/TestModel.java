package com.arc.test.test.reflect;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author: 叶超
 * @since: 2019/3/1 12:05
 */
@Setter
@Getter
@NoArgsConstructor
public class TestModel {
    private String username;
    private String password;
    private Integer age = 0;
    private Date birthday;


}
