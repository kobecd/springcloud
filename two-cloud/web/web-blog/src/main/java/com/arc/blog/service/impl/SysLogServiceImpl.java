package com.arc.blog.service.impl;

import com.arc.blog.agent.SysLogAgent;
import com.arc.blog.service.TestCacheService;
import com.arc.model.domain.system.SysLog;
import com.arc.model.query.SysLogQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: yechao
 * @date: 2018/11/10 19:01
 * @description:
 */
@Slf4j
@Service
public class SysLogServiceImpl implements TestCacheService {

    @Resource
    private SysLogAgent sysLogAgent;

//    @EnableCaching    启用缓存配置 在配置类上有效
//    @Cacheable 指定某个方法的返回值是可以缓存的。在注解属性中指定缓存规则。
//    @Cacheput 将方法的返回值缓存到指定的key中
//    @CacheEvict 删除指定的缓存数据
//    注意
//    @Cacheable和@Cacheput都会将方法的执行结果按指定的key放到缓存中，@Cacheable在执行时，会先检测缓存中是否有数据存在，如果有，直接从缓存中读取。如果没有，执行方法，将返回值放入缓存，而@Cacheput会先执行方法，然后再将执行结果写入缓存。使用@Cacheput的方法一定会执行


    @Override
    public Long save(SysLog sysLog) {
        return sysLogAgent.save(sysLog);
    }


    @Override
    public Integer update(SysLog sysLog) {
        return sysLogAgent.update(sysLog);
    }

    @Override
    @CacheEvict(cacheNames = "get#{id}")
    public Integer delete(Integer id) {
        return sysLogAgent.delete(id);
    }

    @Override
    @Cacheable(cacheNames = "get#{id}")
    public SysLog get(Integer id) {
        long start = System.currentTimeMillis();
        log.info("get {}" , start);
        SysLog sysLog = sysLogAgent.get(id);
        log.info("/////////////////////////////");
        log.info("get  from db use {} ms " , System.currentTimeMillis()-start);

        return sysLog;
    }

    @Override
    @Cacheable(cacheNames = "list")
    public List<SysLog> list() {
        return sysLogAgent.list();
    }

    @Override
    @Cacheable(cacheNames = "listBySysLogQuery#{query.id}")
    public List<SysLog> listBySysLogQuery(SysLogQuery query) {
        return sysLogAgent.listBySysLogQuery(query);
    }
}
