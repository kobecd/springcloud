package com.arc.servlet.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

/**
 * @author: yechao
 * @date: 2018/12/14 1:37
 * @description:
 */
@Slf4j
@Component
public class HttpUtilByRestTemplate {


    //获取接口返回状态码---判断接口返回是否为200
    public Boolean ping() {
        RestTemplate template = new RestTemplate();

        log.debug("参数={}", template);
        log.debug("参数={}", template.toString());

        String url = "http://localhost/food/lists";
        try {
            ResponseEntity<String> responseEntity = template.getForEntity(url, String.class);
            HttpStatus status = responseEntity.getStatusCode();//获取返回状态
            return status.is2xxSuccessful();//判断状态码是否为2开头的
        } catch (Exception e) {
            return false; //502 ,500是不能正常返回结果的，需要catch住，返回一个false
        }
    }


    /**
     * 单纯的在url 后面拼接字符串例如  http://localhost:8007/test?username=root&password=admin
     *
     * @param url
     * @param username
     * @param password
     */
    public String login(String url, String username, String password) {
        RestTemplate template = new RestTemplate();
        //请求地址
        return get(url + "?username=" + username + "&password=" + password);
    }


    /**
     * get 工具类
     * 注意：什么都不带，将参数拼接在请求url后面
     *
     * @param url
     * @return
     */
    public static String get(String url) {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        try {
            //所得结果为调整成String类型
            return new RestTemplate().getForObject(url, String.class);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("登录失败" + e.getMessage(), e);
            return null;
        }
    }

    /**
     * 带cookie实际也是将参数塞入header中:
     * 1、定义header对象： HttpHeaders headers = new HttpHeaders()
     * 2、将要的cookie塞入header：headers.put(HttpHeaders.COOKIE,cookieList)（注意cookie需要是一个list，内容为 name=value 例如：loginticket=sldjfas112sadfsd）
     * 3、也可以在Header中塞入其他值：headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED)
     *
     * @param url
     * @param jsessionId
     * @return
     */
    //带cookie，header，参数
    public String post(String url, String jSesionId) {
        RestTemplate template = new RestTemplate();

        log.debug("参数 url={},jsessionId={},token={},template={}", url, jSesionId, template);
        log.debug("参数={}", template.toString());


//        List<String> cookies = new ArrayList<>();
//        cookies.add("JSESSIONID=" + Strings.nullToEmpty(jsessionId));
//        cookies.add("token=" + Strings.nullToEmpty(token));
//        headers.put(HttpHeaders.COOKIE, cookies);


        HttpHeaders requestHeaders = new HttpHeaders();
        String testKey = "";
        String intent = null;
        String number = null;
        String code = null;
        requestHeaders.add("JSESSIONID", jSesionId);
        requestHeaders.add("key", testKey);
        requestHeaders.add("number", number);
        requestHeaders.add("code", code);
        //@todo 需要加body 在这里操作！！！
        HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
        ResponseEntity<String> response = template.exchange(url, HttpMethod.POST, requestEntity, String.class);
        //@todo 返回值可能不是你需要的请修改
        return response.toString();
    }

    public void test() {
        log.info("call test.");
        final String url = "http://192.168.1.245:8082/ram/ram/v1/certificates";
        RestTemplate template = new RestTemplate();

        HttpHeaders requestHeaders = new HttpHeaders();
        String testKey = "";
        String intent = null;
        String number = null;
        String code = null;
        requestHeaders.add("key", testKey);
        requestHeaders.add("intent", String.valueOf(intent));
        requestHeaders.add("number", number);
        requestHeaders.add("code", code);
        HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);

        ResponseEntity<String> response = template.exchange(url, HttpMethod.GET, requestEntity, String.class);
        String sttr = response.getBody();
        log.info("sttr=" + sttr);
    }


}
