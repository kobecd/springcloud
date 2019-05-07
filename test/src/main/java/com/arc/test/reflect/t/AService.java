package com.arc.test.reflect.t;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/5/7 17:56
 */
public class AService {

    public  static <T> Object fun1(List<T> list) {
        T t = null;
        System.out.println(t);

        return null;
    }
}
