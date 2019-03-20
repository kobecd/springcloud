package com.arc.cache2.service.impl;

import com.arc.cache2.config.RedisCachingConfiguration;
import com.arc.cache2.mapper.SysUserMapper;
import com.arc.cache2.model.domain.SysUser;
import com.arc.cache2.model.request.SysUserRequest;
import com.arc.cache2.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 叶超
 * @since 2019/3/19 15:02
 */
@Slf4j
@Service(value = "sysUserServiceImpl2")
@CacheConfig(keyGenerator = RedisCachingConfiguration.KEY_GENERATOR_NAME)
public class SysUserServiceImpl2 implements SysUserService {

    @Resource
    private SysUserMapper userMapper;

    @Override
    public Long save(SysUser user) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public int update(SysUser user) {
        return 0;
    }

    @Cacheable(cacheNames = RedisCachingConfiguration.CacheNames.CACHE_SYSTEM)   //缓存
    @Override
    public SysUser get(Long id) {
        log.debug("##########################");
        SysUser sysUser = userMapper.get(id);
        log.debug("##########################");
        return sysUser;
    }

    @Override
    public SysUser testCacheKey1(SysUser user, Long id, String name) {
        return null;
    }

    @Override
    public SysUser testCacheKey2(SysUser user, Long id, String name) {
        return null;
    }

    @Override
    public SysUser testCacheKey3(SysUser user, Long id, String name) {
        return null;
    }

    @Override
    public List<Object> listPage(SysUserRequest query) {
        return null;
    }
}
