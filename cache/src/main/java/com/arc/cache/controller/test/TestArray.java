package com.arc.cache2.controller.test;

/**
 * @author 叶超
 * @since 2019/3/17 16:41
 */
public class TestArray {

    /**
     * @param data1
     * @param data2
     * @return data1 与 data2拼接的结果
     */
    public static byte[] addBytes(byte[] data1, byte[] data2) {
        byte[] data3 = new byte[data1.length + data2.length];
        System.arraycopy(data1, 0, data3, 0, data1.length);
        System.arraycopy(data2, 0, data3, data1.length, data2.length);
        return data3;
    }


    public static void main(String[] args) {
        int[] fun = {0, 1, 2, 3, 4, 5, 6};
//        注意：src and dest都必须是同类型或者可以进行转换类型的数组．
//   * @param src源数组。
//     * @param srcPos在源数组中的起始位置。
//     * @param dest目标数组。
//     * @param destPos在目标数据中的起始位置。
//     * @param length要复制的数组元素的长度。
//     * @exception IndexOutOfBoundsException 如果复制会导致访问数组边界外的数据。注意：数组是定长的，非自动扩容
//     * @exception ArrayStoreException 如果src中的元素与目标数组的类型不匹配，则不能插入目标数组，抛出该异常
//     * @exception NullPointerException if either src or dest is null，抛出该异常
//        public static native void arraycopy (Object src,int srcPos, Object dest,int destPos, int length);


// 测试：       有趣的是这个函数可以实现自己到自己复制，比如：
        System.arraycopy(fun, 0, fun, 3, 3);//  则结果为：{0,1,2,0,1,2,6};
    }

    private static int[] getArray1() {
        int[] bak = {
                1, 2, 3,
        };
        printArray(bak);
        int[] b = {};
        printArray(b);

        return bak;


    }

    /**
     * 数组打印
     *
     * @param array
     */
    private static String printArray(int[] array) {
        if (array == null) {
            return "null";
        }
        int iMax = array.length - 1;

        if (iMax == -1) {
            return "[]";
        }
        //StringBuilder  StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                stringBuffer.append("[");
            }
            stringBuffer.append(array[i]);
            if (i < length - 1) {
                stringBuffer.append(",");
            }
            if (i == length - 1) {
                System.out.println(i == length);
                stringBuffer.append("]");
            }
        }
        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }

    private static String printArray2(int[] array) {
        if (array == null) {
            return "null";
        }
        int iMax = array.length - 1;
        if (iMax == -1) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
//        走到这一行，代码总是要输出的，那么不必每次去判断是否是第一个元素
        stringBuffer.append("[");
        for (int i = 0; ; i++) {
            stringBuffer.append(array[i]);
            if (i == iMax) {
           return      stringBuffer.append("]").toString();
            }
            stringBuffer.append(",");
        }
    }

    //编译后
    private static String printArray3(int[] array) {
        if (array == null) {
            return "null";
        } else {
            int iMax = array.length - 1;
            if (iMax == -1) {
                return "[]";
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                int length = array.length;
                stringBuffer.append("[");
                int i = 0;

                while(true) {
                    stringBuffer.append(array[i]);
                    if (i == iMax) {
                        return stringBuffer.append("]").toString();
                    }

                    stringBuffer.append(",");
                    ++i;
                }
            }
        }
    }

}
