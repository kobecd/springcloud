package com.arc.test.reflect.t;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 叶超
 * @since: 2019/2/20 10:48
 */
@Slf4j
public class TestTClz {


    public static void main(String[] args) throws NoSuchMethodException {
        fun1();

    }

    private static void fun1() throws NoSuchMethodException {
        Role role1 = new Role();
        Role role2= new Role();
        Role role3 = new Role();
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(role1);
        roles.add(role2);
        roles.add(role3);


        List<Object> vo = createVo(roles);

    }

    public  static<T> List<Object> createVo(List<T>list) throws NoSuchMethodException {
        ArrayList<Object> voList = new ArrayList<>();
        System.out.println(list instanceof  Role);//怎么判断？
        System.out.println("--------------");
        System.out.println(list instanceof  List);



//        List<t> list = new ArrayList<t>(0);
        Method method = list.getClass().getMethod("get",null);
        Class returnTypeClass = method.getReturnType();
        System.out.println("--------------");
        System.out.println(returnTypeClass);



        Type type = Role.class.getGenericSuperclass();//field是list type是泛型

        System.out.println(type);
//        Class c = (Class) ((ParameterizedType) type).getActualTypeArguments();//格式转换

//        Type type = Role.class.getGenericSuperclass();
//        String typeName = type.getTypeName();
//        System.out.println(type);
//        System.out.println(typeName);


//        type = (Role.javaClass .genericSuperclass as ParameterizedType).getActualTypeArguments()[0]


//        ParameterizedType pt = (ParameterizedType) type;


//        Type[] ts = pt.getActualTypeArguments();//这样就获取了ArrayList<ItemVo>中的泛型
//        for(int i = 0; i < ts.length; ++ i){
//            System.out.println(i + " 父类中的泛型为：" + ts[i]);
//            Class<?> c = (Class<?>) ts[i];//如果需要使用这个类型 进行强转即可
//
////            System.out.println(c instanceof  Role);
//
//            System.out.println(i + " 强转后类型为：" + c);
//        }


        return voList;

    }


}
