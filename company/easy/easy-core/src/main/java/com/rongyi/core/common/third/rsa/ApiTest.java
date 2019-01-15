package com.rongyi.core.common.third.rsa;


import com.google.inject.internal.Lists;
import com.rongyi.core.common.third.md5.Md5Util;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created With IntelliJ IDEA.
 * User: WUH
 * Date:  2017/7/12
 */
public class ApiTest {
    public static String sendPost(String url,String parameters) throws Exception{
        System.out.println("参数："+parameters);
        HttpClient httpclient = new DefaultHttpClient();
        //新建Http  post请求
        HttpPost httppost = new HttpPost(url);    //登录链接
        httppost.setEntity(new StringEntity(parameters, Charset.forName("UTF-8")));
        httppost.addHeader("Content-type","application/json; charset=utf-8");
        httppost.setHeader("Accept", "application/json");
        //处理请求，得到响应
        HttpResponse response = httpclient.execute(httppost);

        //打印返回的结果
        HttpEntity entity = response.getEntity();
        // Header[] map =  response.getAllHeaders();

        StringBuilder result = new StringBuilder();
        if (entity != null) {
            InputStream instream = entity.getContent();
            BufferedReader br = new BufferedReader(new InputStreamReader(instream));
            String temp = "";
            while ((temp = br.readLine()) != null) {
                String str = new String(temp.getBytes(), "utf-8");
                result.append(str).append("\r\n");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) throws Exception{
        List<String> phoneList = Arrays.asList( "15000852470"/*, "13761014910", "18321164435", "15821659415"*/);
        for(String phone: phoneList){
            new Thread(new SendThread(phone)).start();
            Thread.sleep(100);
        }
    }

    public static class SendThread implements Runnable{
        private String phone;
        private String url = "http://api.rongyiguang.com/easy-roa/sms/sendSms";

        public SendThread(String phone){
            this.phone = phone;
        }

        @Override
        public void run() {
            try{
                String params = getParams(phone);
                System.out.println(params);
                sendPost(url, params);
            }catch (Exception e){
                e.printStackTrace();
            }

        }

        public String getParams(String phone) throws Exception {
            String str="{'phone':'" + phone + "','msgStr':'你的验证码为88888','sendType':'1'}";
            String pubKey="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDuiWTR1eyDftV+FLGVCwFzKzIJdTTq/0ZrYiNQ ii+5StQx6B5fkvS4JtnSeibPU0QKmawOGZa3WgiTUPLQ8/R/aWw3vrFG7U2I5LJ3l53qqbqYO8E8 TF+GhV6Q+Rtl4w3VQ+3QNxmjLBEnNKjEwz9v6tC3h2SmNPJ75fLKIwc0SQIDAQAB";
            String channel="SHAZHICHUAN";
            String token="1AFC02D062E220A6AFAF6F4428313410";
            String  data=  MalllifeRsaUtil.encryptionStr(str,pubKey);
            long times=System.currentTimeMillis() + 65 * 1000;
            String strSign="data="+data+"&timeStamp="+times+"&channel="+channel+"&token="+token;
            String md5Sign= Md5Util.GetMD5Code(strSign);
            Map<String, String> params = new HashMap<>();
            params.put("data", data);
            params.put("sign", strSign);
            params.put("timeStamp", times + "");
            params.put("channel", channel);

            StringBuilder sb = new StringBuilder();
            sb.append("{\"data\":\"" + data+"\",").append("\"sign\":\""+md5Sign+"\",").
                append("\"timeStamp\":\"" + times+"\",").append("\"channel\":\"" + channel+"\"}");
            System.out.println(sb);
            return sb.toString();

        }
    }
}
