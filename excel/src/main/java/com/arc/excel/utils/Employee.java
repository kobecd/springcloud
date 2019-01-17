package com.arc.excel.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/17 22:13
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Employee {
    private String name;
    private Integer age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
