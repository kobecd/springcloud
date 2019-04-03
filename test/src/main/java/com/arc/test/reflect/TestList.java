package com.arc.test.reflect;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author: 叶超
 * @since: 2019/3/1 14:35
 */
public class TestList {

    /**
     * 异构数据向list中添加 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(5);

        HashMap<Object, Object> map = new HashMap<>(2);
        map.put("String", String.class);
        map.put("Integer", Integer.class);

        list.add(new TestModel());
        list.add(new TestReflect());
        list.add(map);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
