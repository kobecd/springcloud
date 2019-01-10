package com.arc.servlet.web;

import com.arc.servlet.util.HttpUtilByRestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * 测试调用对方服务接口的 一个入口
 *
 * @author yechao
 * @date 2018/12/17
 */
@Slf4j
@RequestMapping("/test")
@Controller
public class TestController {

    @Autowired
    private HttpUtilByRestTemplate httpUtilByRestTemplate;

    @RequestMapping("/login")
    @ResponseBody
    public Object main() {

        String login = httpUtilByRestTemplate.login("http://10.10.10.107:80", "admin", "admin ");
        System.out.println(login);
        return login;
    }

    @RequestMapping("/auth1")
    @ResponseBody
    public Object auth1(@RequestParam String username, @RequestParam String password) {

        String url = "http://10.10.10.107:80";
        RestTemplate template = new RestTemplate();

        String authorization = "Basic " + Base64Utils.encodeToString((username + ":" + password).getBytes());
        log.info("#########################");
        log.info(authorization);
        log.info("#########################");

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Authorization", authorization);
        HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
        ResponseEntity<String> response = template.exchange(url, HttpMethod.GET, requestEntity, String.class);
        log.info("###########################");
        log.info(response.getStatusCode().toString());
        log.info(response.getStatusCode().toString());
        log.info(response.getStatusCode().toString());
        log.info(response.getStatusCode().toString());
        log.info("###########################");
        //@todo 返回值可能不是你需要的请修改
        log.info(response.toString());
        return response.toString();
    }


}
