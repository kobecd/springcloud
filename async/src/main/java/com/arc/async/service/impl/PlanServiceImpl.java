package com.arc.async.service.impl;

import com.arc.async.service.PlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/25 14:24
 */
@Slf4j
@Service
public class PlanServiceImpl implements PlanService {


    @Override
    public boolean sandMail(long id) {
        boolean sand = sand(id);
        return sand;
    }


    @Override
    @Async
    public void sandMailV2(long id) {
        String url = "http://127.0.0.1:9001/test/v1?id=12";
        String back = get(url);
        log.debug("#######################");
        log.debug("{}", back);
        log.debug("#######################");
    }

    @Async
    public boolean sand(long id) {
        String url = "http://127.0.0.1:9001/test/v1?id=12";
        String back = get(url);
        log.debug("#######################");
        log.debug("{}", back);
        log.debug("#######################");
        return true;
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
            log.error("GET失败" + e.getMessage(), e);
            return null;
        }
    }
}
