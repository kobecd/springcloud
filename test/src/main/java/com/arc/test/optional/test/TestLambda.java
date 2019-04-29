package com.arc.test.optional.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author: yechao
 * @date: 2018/12/9 16:13
 * @description:
 */
public class TestLambda {
    public static void main(String[] args) {

        String[] atp = {
                "1 Rafael Nadal",
                "2 Novak Djokovic",
                "3 Stanislas Wawrinka",
                "4 David Ferrer",
                "5 Roger Federer",
                "6 Andy Murray",
                "7 Tomas Berdych",
                "8 Juan Martin Del Potro"
        };

        List<String> players = Arrays.asList(atp);


        // 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }
        System.out.println(  "\n-----");


        // 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((item) -> System.out.print(item + "; "));
        System.out.println(  "\n-----");


        // 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::print);

    }
}
