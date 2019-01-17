package com.rongyi.core.util;

/**
 * Description:
 * Author: yb
 * DATE: 2017/7/26 16:59
 * Package:com.rongyi.core.utils.soap
 * Project:easy-market
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.misc.BASE64Decoder;

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

/**
 * 该加密工具兼容PHP
 */
public class DesEcbUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(DesEcbUtil.class);

    /**
     * 密钥算法
     */
    private static final String ALGORITHM = "DES";
    /**
     * 加解密算法/工作模式/填充方式
     */
    private static final String ALGORITHM_STR = "DES/ECB/NoPadding";

    private static final String CHARSET = "gb2312";

    private static final String CHARUTF8 = "UTF-8";

    /**
     * 填充内容
     */
    private static final String PAD_STR = "\0";

    public static void main(String[] args) throws Exception {
        String clearText = "BFCRM8";

        String key = "12345678";
        System.out.println("明文：" + clearText + "\n密钥：" + key);
        String encryptText = encrypt(clearText, key);//cd00aeaf560b45f846bdba4efe697b5e
        System.out.println(encryptText);
    }

    public static String exChange(String str) {
        StringBuffer sb = new StringBuffer();
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isLowerCase(c)) {
                    sb.append(Character.toUpperCase(c));
                } else
                    sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String encrypt(String souce, String key) {
        try {
            return byteArr2HexStr(encryptByDes(pkcs5Pad(souce), pkcs5Pad(key)));
        } catch (Exception e) {
            LOGGER.error("加密数据: {}异常,原因：{},{}", souce, e.getMessage(), e);
        }

        return "";
    }

    public static String decrypt(final String souce, final String key) {
        try {
            return decryptByDes(souce, pkcs5Pad(key)).trim();
        } catch (Exception e) {
        	e.printStackTrace();
            LOGGER.error("解密数据: {}异常,原因：{},{}", souce, e.getMessage(), e);
        }
        return "";
    }

    private static byte[] encryptByDes(final String souce, final String key) throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        // DES算法要求有一个可信任的随机数源
        SecureRandom sr = new SecureRandom();
        // 从原始密匙数据创建DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(key.getBytes(CHARSET));
        // 创建一个密匙工厂，然后用它把DESKeySpec转换成 一个SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        SecretKey key1 = keyFactory.generateSecret(dks);
        // Cipher对象实际完成加密操作
        Cipher cipher = Cipher.getInstance(ALGORITHM_STR);
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.ENCRYPT_MODE, key1, sr);
        // 现在，获取数据并加密
        byte encryptedData[] = cipher.doFinal(souce.getBytes(CHARSET));
        // 通过BASE64位编码成字符创形式
        return encryptedData;
    }

    private static String decryptByDes(final String souce, final String key) throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, IOException, IllegalBlockSizeException, BadPaddingException {
        LOGGER.info("解密decryptByDes|key:" + key);
    	// DES算法要求有一个可信任的随机数源
        SecureRandom sr = new SecureRandom();
        // 从原始密匙数据创建DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(key.getBytes(CHARSET));
        // 创建一个密匙工厂，然后用它把DESKeySpec转换成 一个SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        SecretKey key1 = keyFactory.generateSecret(dks);
        // Cipher对象实际完成加密操作
        Cipher cipher = Cipher.getInstance(ALGORITHM_STR);
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, key1, sr);
        // 将加密报文用BASE64算法转化为字节数组
        byte[] encryptedData = new BASE64Decoder().decodeBuffer(souce);
        // 用DES算法解密报文
        byte decryptedData[] = cipher.doFinal(encryptedData);
        return new String(decryptedData, CHARSET);
    }

    public static String byteArr2HexStr(byte[] arrB) throws Exception {
        int iLen = arrB.length;
        // 每个byte用两个字符才能表示，所以字符串的长度是数组长度的两倍
        StringBuffer sb = new StringBuffer(iLen * 2);
        for (int i = 0; i < iLen; i++) {
            int intTmp = arrB[i];
            // 把负数转换为正数
            while (intTmp < 0) {
                intTmp = intTmp + 256;
            }
            // 小于0F的数需要在前面补0
            if (intTmp < 16) {
                sb.append("0");
            }
            sb.append(Integer.toString(intTmp, 16));
        }
        return sb.toString();
    }

    private static String pkcs5Pad(final String souce) {
        //密文和密钥的长度必须是8的倍数
        if (0 == souce.length() % 8) {
            return souce;
        }

        StringBuffer tmp = new StringBuffer(souce);

        while (0 != tmp.length() % 8) {
            tmp.append(PAD_STR);
        }
        return tmp.toString();
    }


    private static byte[] hexStr2ByteArr(String str) throws Exception{
    	byte[] arrB = str.getBytes();
    	int len = arrB.length;
    	//两个字符表示一个字节，所以字节数组长度是字符串长度除以2
    	byte[] arrOut = new byte[len/2];
    	for(int i=0;i<len;i=i+2){
    		String strTmp = new String(arrB,i,2);
    		arrOut[i/2] = (byte)Integer.parseInt(strTmp, 16);
    	}

    	return arrOut;
    }

    /**
     * 字节解密
     * @param arrB
     * @param key
     * @return
     * @throws Exception
     */
    public static String decryptByte(byte[] arrB, String key) throws Exception {
    	LOGGER.info("解密decryptByDes|key:" + key);
    	// DES算法要求有一个可信任的随机数源
        SecureRandom sr = new SecureRandom();
        // 从原始密匙数据创建DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(key.getBytes(CHARSET));
        // 创建一个密匙工厂，然后用它把DESKeySpec转换成 一个SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        SecretKey key1 = keyFactory.generateSecret(dks);
        // Cipher对象实际完成加密操作
        Cipher cipher = Cipher.getInstance(ALGORITHM_STR);
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, key1, sr);
        // 将加密报文用BASE64算法转化为字节数组
        // 用DES算法解密报文
        byte decryptedData[] = cipher.doFinal(arrB);
        return new String(decryptedData, CHARSET);
    }

    /**
     * 字符串解密
     * @param source
     * @param key
     * @return
     * @throws Exception
     */
    public static String decryptStr(String source, String key) throws Exception {
    	LOGGER.info("解密decryptByDes|key:" + key);
    	byte[] arrB = hexStr2ByteArr(source);
    	// DES算法要求有一个可信任的随机数源
        SecureRandom sr = new SecureRandom();
        // 从原始密匙数据创建DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(key.getBytes(CHARUTF8));
        // 创建一个密匙工厂，然后用它把DESKeySpec转换成 一个SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        SecretKey key1 = keyFactory.generateSecret(dks);
        // Cipher对象实际完成加密操作
        Cipher cipher = Cipher.getInstance(ALGORITHM_STR);
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, key1, sr);
        // 将加密报文用BASE64算法转化为字节数组
        // 用DES算法解密报文
        byte decryptedData[] = cipher.doFinal(arrB);
        return new String(decryptedData, CHARUTF8).trim();
    }
}
