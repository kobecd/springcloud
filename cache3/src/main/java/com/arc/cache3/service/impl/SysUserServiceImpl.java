package com.arc.cache3.service.impl;

import com.arc.cache3.config.CacheManagerConfig;
import com.arc.cache3.mapper.SysUserMapper;
import com.arc.cache3.model.domain.SysUser;
import com.arc.cache3.model.request.SysUserRequest;
import com.arc.cache3.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 叶超
 * @since 2019/3/15 15:54
 */
@Slf4j
@Transactional
@Service
@CacheConfig(keyGenerator = CacheManagerConfig.KEY_GENERATOR_NAME)
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

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


    @Cacheable(cacheNames = CacheManagerConfig.CacheNames.CACHE_SYSTEM)   //缓存
    @Override
    public SysUser get(Long id) {
        return sysUserMapper.get(id);
    }

    @Override
    public List<Object> listPage(SysUserRequest query) {
        return null;
    }
}
