package com.arc.cache.service.impl;

import com.arc.cache.mapper.PullLogMapper;
import com.arc.cache.model.domain.PullLog;
import com.arc.cache.model.query.PullLogQuery;
import com.arc.cache.service.PullLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: yechao
 * @date: 2018/11/10 19:01
 * @description:
 */
@Slf4j
@Service
public class PullLogServiceImpl implements PullLogService {

    @Autowired
    private PullLogMapper pullLogMapper;

//    @EnableCaching    启用缓存配置 在配置类上有效
//    @Cacheable 指定某个方法的返回值是可以缓存的。在注解属性中指定缓存规则。
//    @Cacheput 将方法的返回值缓存到指定的key中
//    @CacheEvict 删除指定的缓存数据
//    注意
//    @Cacheable和@Cacheput都会将方法的执行结果按指定的key放到缓存中，@Cacheable在执行时，会先检测缓存中是否有数据存在，如果有，直接从缓存中读取。如果没有，执行方法，将返回值放入缓存，而@Cacheput会先执行方法，然后再将执行结果写入缓存。使用@Cacheput的方法一定会执行


    @Override
    public Long save(PullLog pullLog) {
        return pullLogMapper.save(pullLog);
    }


    @Override
    public Integer update(PullLog pullLog) {
        return pullLogMapper.update(pullLog);
    }

    @Override
    @CacheEvict(cacheNames = "get#{id}")
    public Integer delete(Integer id) {
        return pullLogMapper.delete(id);
    }

    @Override
    @Cacheable(cacheNames = "get#{id}")
    public PullLog get(Integer id) {
        long start = System.currentTimeMillis();
        log.info("get {}" , start);
        PullLog pullLog = pullLogMapper.get(id);
        log.info("/////////////////////////////");
        log.info("get  from db use {} ms " , System.currentTimeMillis()-start);

        return pullLog;
    }

    @Override
    @Cacheable(cacheNames = "list")
    public List<PullLog> list() {
        return pullLogMapper.list();
    }

    @Override
    @Cacheable(cacheNames = "listByPullLogQuery#{query.id}")
    public List<PullLog> listByPullLogQuery(PullLogQuery query) {
        return pullLogMapper.listByPullLogQuery(query);
    }
}
