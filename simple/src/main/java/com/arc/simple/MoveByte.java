package com.arc.simple;

public class MoveByte {

    public static void main(String[] args) {
        int a = 204800;
        System.out.println(a << 0);//源数据
        System.out.println(a << 1);//*2=2^1
        System.out.println(a << 2);//*4=2^2
        System.out.println(a << 3);//*8=2^3
        System.out.println(a << 4);//*16=2^4
        System.out.println(a * 16);
        System.out.println("右移动");
        System.out.println(a >> 0);//
        System.out.println(a >> 1);///2=2^1
        System.out.println(a >> 2);///(2*2)=2^2
        System.out.println(a >> 3);///(2*2*2)=2^3
        System.out.println(a >> 4);///(2*2*2*2)=2^4
        System.out.println(a >> 10);
        System.out.println(a >> 20);
    }
}
//总结：右移动是除法，左移动是扩大
