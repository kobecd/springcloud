package com.arc.cache.controller;

import com.arc.cache.model.domain.PullLog;
import com.arc.cache.model.query.PullLogQuery;
import com.arc.cache.service.PullLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yechao
 * @date: 2018/11/10 18:27
 * @description:
 */
@Slf4j
@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private PullLogService pullLogService;

    @RequestMapping("/get")
    public Object get(@RequestParam Integer id) {
        long start = System.currentTimeMillis();
        PullLog pullLog = pullLogService.get(id);
        log.info("------------------------------------");
        log.info("Get data  use {} ms ", System.currentTimeMillis() - start);
        log.info("------------------------------------");
        return pullLog;
    }

    @RequestMapping("/save")
    public Object save(@RequestBody PullLog pullLog) {
        return pullLogService.save(pullLog);
    }

    @RequestMapping("/update")
    public Object update(@RequestBody PullLog pullLog) {
        return pullLogService.update(pullLog);
    }

    @RequestMapping("/delete")
    public Integer delete(Integer id) {
        return pullLogService.delete(id);
    }

    @RequestMapping("/list")
    public Object list() {
        return pullLogService.list();
    }


    @RequestMapping("/query")
    public Object query(@RequestBody PullLogQuery query) {
        log.debug("结果={}",query);
        return pullLogService.listByPullLogQuery(query);
    }


}
