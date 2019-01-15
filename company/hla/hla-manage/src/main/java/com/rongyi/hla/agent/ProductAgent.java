package com.rongyi.hla.agent;

import com.rongyi.utils.CacheUtil;
import com.rongyi.utils.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 执行远程调用客户接口，获取数据的服务
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
@Component
public class ProductAgent {

    @Autowired
    private CacheUtil cacheUtil;



    public boolean pullProducts() {
        //1、到指定服务器获取数据
        //2、本地保存这些数据
        //3、问题点怎么增量，如何区分数据是变化过的、
        //4、需要一个操作日志记录表来记录同步情况

        System.out.println("###########################");
        System.out.println("同步" + new Date());
        String accessToken = cacheUtil.getAccessToken();

        System.out.println(accessToken);


        String jsonString="{\"sku_code\": \"S000001\"}\n";
        String post = HttpUtil.post(cacheUtil.getProductUrl(), jsonString);
        System.out.println(post);

        System.out.println("###########################");
        return true;
    }


//
//    public static void main(String[] args) {
//        String appId = "ntdf769391213117cc8c96ab767cced8";
//        String appSecret = "ac1a3a209cf35dd6ddd7f4b527a22c7d";
//        Hla hla = new Hla();
//
//        System.out.println(GetSignature(appId,appSecret));
//        String key                = GetSignature(hla.getAppId(), hla.getAppSecret());
//        System.out.println(key);
//    }

//    public static String GetSignature(String access_token, String app_secret) {
//        String A = crypt2(access_token, app_secret);
//        String B = new Date().getTime() / 1000 + A;
//        String C = MD5Utils.encrypt(B);
//        String signature = C + new Date().getTime() / 1000;
//        return signature;
//
//    }




}

