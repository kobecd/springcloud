package com.arc.test.reflect.t;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author: 叶超
 * @since: 2019/2/20 10:48
 */
@Slf4j
public class TestT {

    public static void main(String[] args) {
        fun1();

    }


    private static <T> Object fun1(List<T> list) {
        T t = new T();
        System.out.println(t);

    }



}
