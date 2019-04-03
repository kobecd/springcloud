package com.arc.jpa.service;

import com.arc.jpa.model.domain.SysUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/3/25 17:29
 */
public interface TestService {

    SysUser get(Long id);

    Object queryByQuery(SysUser user);

      Page<SysUser> queryPage(SysUser model, Pageable pageable) ;

    List<SysUser> findByCondition(SysUser user);
}
