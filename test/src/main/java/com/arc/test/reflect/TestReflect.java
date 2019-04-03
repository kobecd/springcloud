package com.arc.test.reflect;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author: 叶超
 * @since: 2019/2/20 10:48
 */
@Slf4j
public class TestReflect {

    public static void main(String[] args) {
//        fun1();
//        fun2();

        List fieldNames = getFieldNames(Man.class);
        System.out.println(fieldNames);


        Man man = new Man();
        man.setName("ABC");
        man.setAge(11);
        man.setPassword("pwd");
        man.setSalary(20F);
        man.setUpdateDate(new Date());

        String name = getFieldValueByFieldName(man, "name");
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
    }


    private static List getFieldNames(Class clz) {
        try {
            //得到属性数组;
            Field[] fields = clz.getDeclaredFields();

            if (fields == null || fields.length == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList<String> fieldNames = new ArrayList<>(fields.length);
            for (Field field : fields) {
                String fieldName = field.getName();
                fieldNames.add(fieldName);
//                System.out.println("getType=" + field.getType());//class java.lang.String
            }
            return fieldNames;
        } catch (  Exception e) {
            e.printStackTrace();
        }
//        finally {
//            return Collections.EMPTY_LIST;
//        }
            return Collections.EMPTY_LIST;
    }

    private static void fun1() {
        try {
            //反射--创建类的实例
            String classPath = "com.arc.poi.controller.excel.Man";
            Class<?> ownClass = Class.forName(classPath);
            Object obj = ownClass.newInstance();

            System.out.println((obj instanceof Man));//true
            System.out.println(("" instanceof String));//true


            //得到属性数组;
            Field[] fields = obj.getClass().getDeclaredFields();

            for (Field field : fields) {
                System.out.println("field=" + field);//java.lang.String com.arc.poi.controller.excel.Man.name
                System.out.println("getType=" + field.getType());//class java.lang.String
//                System.out.println("getModifiers "+field.getModifiers());//2=private

//                第三步：遍历数组，设置属性
//                field.setAccessible(true);//设置私有属性可
//                field.set(obj, "属性值");//转成对应的属性


            }

//            第一步：有一个实例 example
//            private String name;
//            private int sex;
//            private String idCard;
//            private float salary;

//            Field exampleField = obj.getClass().getDeclaredField("name");
//            System.out.println("field "+exampleField);
//            System.out.println("getType "+exampleField.getType());
//            System.out.println("getModifiers "+exampleField.getModifiers());
//            exampleField.setAccessible(true);
//
//            exampleField.get(example);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
        }
    }


    private static void fun2() {
        try {
//            第一步：有一个实例 example
            Man man = new Man();
            man.setName("ABC");
            man.setAge(11);
            man.setPassword("pwd");
            man.setSalary(20F);
            man.setUpdateDate(new Date());


            Field exampleField = man.getClass().getDeclaredField("name");
            System.out.println("field " + exampleField);
            System.out.println("getType " + exampleField.getType());
            System.out.println("getModifiers " + exampleField.getModifiers());
            //设置对象的访问权限，保证对private的属性的访问
            exampleField.setAccessible(true);
            Object fieldValue = exampleField.get(man);
            System.out.println(fieldValue);//ABC


            System.out.println("----------------------------------------------");
            //再来获取此类中的所有字段
            Field[] fields = man.getClass().getDeclaredFields();
            System.out.println(fields.length);

            for (Field field : fields) {
                //获取字段属性名称  如：name
                String fieldName = field.getName();
                System.out.println(fieldName);
            }


        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    /**
     * 根据属性名获取属性值
     *
     * @param object
     * @param fieldName
     * @return
     */
    private static String getFieldValueByFieldName(Object object, String fieldName) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            //设置对象的访问权限，保证对private的属性的访问
            field.setAccessible(true);
            return (String) field.get(object);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }


    /**
     * 根据属性名设置属性值
     *
     * @param fieldName
     * @param object
     * @return
     */
    private void setFieldValueByFieldName(String fieldName, Object object, String value) {
        try {
            // 获取obj类的字节文件对象
            Class c = object.getClass();
            // 获取该类的成员变量
            Field f = c.getDeclaredField(fieldName);
            // 取消语言访问检查
            f.setAccessible(true);
            // 给变量赋值
            f.set(object, value);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }

}
