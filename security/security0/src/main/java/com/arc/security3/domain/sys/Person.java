package com.arc.security3.domain.sys;

import lombok.Data;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/5/5 16:40
 */

@Data
public class Person {
    public String name;
    public int age;
    public List<String> cord;
    public List<Integer> meter;
}
