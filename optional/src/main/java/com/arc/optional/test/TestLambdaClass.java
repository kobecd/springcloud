package com.arc.optional.test;

/**
 * @author: yechao
 * @date: 2018/12/9 16:13
 * @description:
 */
public class TestLambdaClass {
    public static void main(String[] args) {


        // 使用匿名内部类

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(11);
            }
        }).start();


        // 1.2使用 lambda expression
        new Thread(() -> System.out.println("Hello world !")).start();

        ///////////////////////////////////////////////////////////////
        // 2.1使用匿名内部类
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };

// 2.2使用 lambda expression
        Runnable race2 = () -> System.out.println("Hello world !");

// 直接调用 run 方法(没开新线程哦!)
        race1.run();
        race2.run();


        Runnable run1 = () -> System.out.println("测试");
        System.out.println(run1.hashCode());
        run1.run();
        System.out.println("-----------------");
        run1.run();
// 使用匿名内部类
//        ButtonBase btn = new ButtonBase() {
//            @Override
//            public void fire() {
//                System.out.println("Hello World!");
//
//            }
//        };

// 或者使用 lambda expression
//        btn.setOnAction(event -> System.out.println("Hello World!"));
    }
    //http://www.cnblogs.com/franson-2016/p/5593080.html
}
