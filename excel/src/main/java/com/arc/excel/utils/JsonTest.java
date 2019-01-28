package com.arc.excel.utils;


import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/17 22:07
 */
public class JsonTest {

    public static void main(String[] args) {
        String str = "[{\"name\":\"李四\",\"age\":48},{\"name\":\"张三\",\"age\":84}]'";

        Employee tom = new Employee("TOM", 12);
        Employee mary = new Employee("MARY", 12);
        Employee ray = new Employee("RAY", 12);
        ArrayList<Object> list = new ArrayList<>();
        list.add(tom);
        list.add(mary);
        list.add(ray);
        String jsonString = JSON.toJSONString(list);
        System.out.println(jsonString);
        List<Employee> employees = JSON.parseArray(jsonString, Employee.class);
        System.out.println(employees);
        System.out.println(employees.get(1).toString());
    }


}

