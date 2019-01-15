package com.rongyi.core.common.third.rsa;

import com.rongyi.core.common.third.md5.Md5Util;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * User: WUH
 * Date:  2017/7/4
 */
public class HttpClientUtil {

    private static final int CONNECTION_TIME_OUT = 5000;
    private static final int DEFAULT_SO_TIME = 30000;

    /**
     *
     * @param url url
     * @param encoding 编码
     * @return 返回值
     */
    public static String sendPost(String url, String jsonParam, String encoding) {
        String result = "";
        //创建httpclient对象
        try(CloseableHttpClient client = getTimeOutHttpClient()){
            //获取httpPost对象
            HttpPost httpPost = getModifiedPost(url, encoding, jsonParam);
            //执行请求操作，并拿到结果（同步阻塞）
            try(CloseableHttpResponse response = client.execute(httpPost)){
                //获取结果实体
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    //按指定编码转换结果实体为String类型
                    result = EntityUtils.toString(entity, encoding);
                }
                EntityUtils.consume(entity);
                return result;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    private static CloseableHttpClient getTimeOutHttpClient(){
        RequestConfig defaultRequestConfig = getDefaultRequestConfig();
        return HttpClients.custom()
            .setDefaultRequestConfig(defaultRequestConfig)
            .build();
    }

    private static RequestConfig getDefaultRequestConfig(){
        return RequestConfig.custom()
            .setSocketTimeout(CONNECTION_TIME_OUT)
            .setConnectTimeout(CONNECTION_TIME_OUT)
            .setConnectionRequestTimeout(DEFAULT_SO_TIME)
            .setStaleConnectionCheckEnabled(true)
            .build();
    }

    private static HttpPost getModifiedPost(String url, String encoding, String jsonParam) throws Exception{
        //创建post方式请求对象
        HttpPost httpPost = new HttpPost(url);
        StringEntity stringEntity = new StringEntity(jsonParam, encoding);
        //装填参数
        List<NameValuePair> pairs = new ArrayList<>();

//        if (params != null) {
//            for (Map.Entry<String, String> entry : params.entrySet()) {
//                pairs.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
//            }
//        }
        httpPost.setEntity(stringEntity);
        return httpPost;
    }

}
