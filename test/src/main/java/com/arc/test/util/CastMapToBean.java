package com.arc.test.util;

import lombok.extern.slf4j.Slf4j;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: 叶超
 * @since: 2019/2/2 14:45
 */
@Slf4j
public class CastMapToBean {

    //    、、https://www.oschina.net/question/224858_36864
    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
        log.debug("Map={}", map);
        log.debug("Class={}", beanClass);
        if (map == null)
            return null;

        Object obj = beanClass.newInstance();

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field property : fields) {


            int mod = property.getModifiers();
            log.debug("结果={}", mod);
            log.debug("Modifier={} ", Modifier.toString(mod));
            if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
                continue;
            }
            property.setAccessible(true);
            String fieldName = property.getName();
            Object fieldValue = map.get(fieldName);

            String typeName = property.getType().getName();
            log.debug("类型={},属性名称={},属性值={},", typeName, fieldName, fieldValue);

            System.out.println("##############");
            System.out.println(property.getType());
            System.out.println(property.getType().getName());
            String date = "class java.util.Date";
            System.out.println("class java.util.Date");
            System.out.println("class java.util.Date".equals(date));
            System.out.println(".......property.getType().getName()" + property.getType().getName());
            System.out.println(date.equals(property.getType().getName()));
            System.out.println(date.equals(property.getType().toString()));
            //数字类型处理
            Object number = convertType(fieldValue, property.getType());
            System.out.println(number);
            System.out.println("##############");
//            if (type.equals("))
            if (property.getType().getName().contains("Date")) {
                System.out.println("///////////////////////////////");
                System.out.println("class java.util.Date");
                System.out.println(fieldName);
                System.out.println(fieldValue);
                System.out.println("///////////////////////////////");

//                String dateStr = "2015-12-7T16:00:00.000Z";
                String dateStr = (String) fieldValue;
                System.out.println(fieldValue);
//                dateStr = dateStr.substring(0, dateStr.lastIndexOf("+") + 1);//注意是空格+UTC
//                System.out.println(dateStr);
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS 'Z'");//注意格式化的表达式

//                                                                                                  2019-02-02T06:00:32.000+0000
//                java.text.ParseException: Unparseable date: "2019-02-02T06:00:32.000+0000"
                //
                fieldValue = format.parse(dateStr);
            }
            property.set(obj, convertType(fieldValue, property.getType()));//类型转换。}
        }
        return obj;
    }

    public static Object convertType(Object object, Class<?> type) {
        if (object instanceof Number) {
            Number number = (Number) object;
            if (type.equals(byte.class) || type.equals(Byte.class)) {
                return number.byteValue();
            }
            if (type.equals(short.class) || type.equals(Short.class)) {
                return number.shortValue();
            }
            if (type.equals(int.class) || type.equals(Integer.class)) {
                return number.intValue();
            }
            if (type.equals(long.class) || type.equals(Long.class)) {
                return number.longValue();
            }
            if (type.equals(float.class) || type.equals(Float.class)) {
                return number.floatValue();
            }
            if (type.equals(double.class) || type.equals(Double.class)) {
                return number.doubleValue();
            }
        }
        log.debug("结果={}", object);
        return object;
    }

    public static Map<String, Object> objectToMap(Object obj) throws Exception {
        if (obj == null) {
            return null;
        }

        Map<String, Object> map = new HashMap<String, Object>();

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(obj));
        }

        return map;
    }


    public static Object mapToObject2(Map<String, Object> map, Class<?> beanClass) throws Exception {
        if (map == null)
            return null;

        Object obj = beanClass.newInstance();

        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor property : propertyDescriptors) {
            Method setter = property.getWriteMethod();
            if (setter != null) {
                setter.invoke(obj, map.get(property.getName()));
            }
        }

        return obj;
    }

}
