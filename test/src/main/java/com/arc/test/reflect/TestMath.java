package com.arc.test.reflect;

import java.util.ArrayList;

/**
 * @author: 叶超
 * @since: 2019/2/21 17:56
 */
public class TestMath {

    public static void main(String[] args) {

        System.out.println(1001 % 1000);
        System.out.println(1001 / 1000);


        int divisor= 3;//低版本的excel总行数是65536行
        int xlsx = 1048576;//高版本的office，在往上就是2007、2010、2013,、2016总行数都达到了1048576行


        int tem = 12 ;
        System.out.println(13/7);//1余6
        System.out.println(14/7);//2
        System.out.println("----------------------------------");

        System.out.println(13%7);//取到余数6
        System.out.println(14%7);//取到余数0
        System.out.println("5%7="+5%7);//取到余数0
        System.out.println("----------------------------------");

        int rows=65537;
        int xls=65536;
        int temp = rows / xls;
        int sheetNumber= rows %xls== 0 ? temp : temp + 1;
        System.out.println("temp="+temp+"----sheetNumber="+sheetNumber);

        int a = 7;
        int b = 3;
        System.out.println(  (a%b==0)?a/b:(a/b+1));

        int quotient = tem / divisor;
        System.out.println(quotient);
        int ret = tem % divisor;
        System.out.println(ret);
        if (ret > 0) {
            System.out.println(ret);

            ArrayList<Object> objects = new ArrayList<>(ret);
            for (int i = 0; i < ret; ret++) {
                objects.add(i);
            }

            if (objects.iterator().hasNext()) {
                System.out.println(objects.iterator().next());
            }
        }

    }
}
