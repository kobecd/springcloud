package com.arc.blog.two.service.system;

import com.arc.blog.two.model.domain.system.SysLog;

import java.util.List;


/**
 * @author 叶超
 * @since 2019/1/30 17:33
 */
public interface SysLogService {

    Long save(SysLog sysLog);

    Integer delete(Long id);

    Integer update(SysLog sysLog);

    SysLog get(Long id);

    List<SysLog> page();


}
