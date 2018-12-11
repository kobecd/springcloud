package com.arc.optional.test;

import java.util.function.DoubleSupplier;
import java.util.function.IntBinaryOperator;

/**
 * @author: yechao
 * @date: 2018/12/9 16:13
 * @description:
 */
public class TestL {
    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = () -> 5;
        System.out.println(doubleSupplier);
        System.out.println(doubleSupplier.getAsDouble());
        System.out.println((int)doubleSupplier.getAsDouble());
        IntBinaryOperator intBinaryOperator = (int x, int y) -> x + y;
        System.out.println(intBinaryOperator);
    }
}
