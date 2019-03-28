package com.arc.blog.two.mapper.system;

import com.arc.blog.two.model.domain.system.SysLog;

import java.util.List;

/**
 * @author: 叶超
 * @since: 2019/2/2 11:25
 */
public interface SysLogMapper {

    int save(SysLog sysLog);

    int delete(Long id);

    int update(SysLog sysLog);

    SysLog get(Long id);

    List<SysLog> list();
}
