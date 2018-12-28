package com.arc.simple;

public class Recursion {

    public static long fac(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else return n * fac(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fac(6));
        System.out.println(fac(6));
    }


    //递归
    public int fun(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        }
        return a * fun(a - 1);
    }
}

//项目 经验 自我介绍  洪亮 清晰 自信 30s ~60s

