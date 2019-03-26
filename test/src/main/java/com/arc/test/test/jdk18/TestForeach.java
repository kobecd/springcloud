package com.arc.test.test.jdk18;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 叶超
 * @since 2019/3/19 11:37
 */
public class TestForeach {


    List<Integer> numbers = new ArrayList<>();


    //---------------------------常规情况下我们基本都是这么写的

    //1 常规做法--for
    public static Object fun1(List numbers) {
        for (int index = 0, len = numbers.size(); index < len; index++) {
            System.out.println(numbers.get(index));
        }
        return null;
    }

    //2
    public static Object fun2(List numbers) {
        for (Object number : numbers) {
            System.out.println(number);
        }
        return null;
    }


    //3
    public static Object fun3(List numbers) {
        if (numbers != null) {
            Iterator var1 = numbers.iterator();
            while (var1.hasNext()) {
                System.out.println(var1.next());
            }
        }
        return null;
    }

    //--------------------------- 使用jdk1.8后，可这么写






    //测试可变参数的forEach
    public static Object test(Object o, Method method, Object... objects) {
        System.out.println(o);
        System.out.println(method);
        Stream<Object> stream = Arrays.stream(objects);
        stream.forEach(System.out::println);
        return null;
    }

    public static void main(String[] args) {
//        test(null, null, 123, "BBB", 'a');
        //
        try {
            fun3(null);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
    }

}
