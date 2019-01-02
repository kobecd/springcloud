package com.rongyi.hla.utils;

import java.io.InputStream;

/**
 * unicode编码的字符串转换为普通字符串
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
public class UnicodeUtil {


    //包含unicode编码的字符串转换为普通字符串
    public static String ascii2native(String asciicode) {
        String[] asciis = asciicode.split("\\\\u");
        String nativeValue = asciis[0];
        try {
            for (int i = 1; i < asciis.length; i++) {
                String code = asciis[i];
                nativeValue += (char) Integer.parseInt(code.substring(0, 4), 16);
                if (code.length() > 4) {
                    nativeValue += code.substring(4, code.length());
                }
            }
        } catch (NumberFormatException e) {
            return asciicode;
        }
        return nativeValue;
    }

    // 仅unicode编码的字符串转换为普通字符串
    public static String decodeUnicode(String dataStr) {
        int start = 0;
        int end = 0;
        final StringBuffer buffer = new StringBuffer();
        while (start > -1) {
            end = dataStr.indexOf("\\u", start + 2);
            String charStr = "";
            if (end == -1) {
                charStr = dataStr.substring(start + 2, dataStr.length());
            } else {
                charStr = dataStr.substring(start + 2, end);
            }
            char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。
            buffer.append(new Character(letter).toString());
            start = end;
        }
        return buffer.toString();
    }


    //测试的
    private static void getResponseTextV2(InputStream netIps, StringBuilder builder) throws Exception {
        byte[] buffer = new byte[1024];
        int len;
        while ((len = netIps.read(buffer)) != -1) {
            builder.append(new String(buffer, 0, len, "UTF-8"));
        }
    }

}
