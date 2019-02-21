package com.arc.blog.service;



import com.arc.model.domain.system.SysLog;
import com.arc.model.query.SysLogQuery;

import java.util.List;

/**
 * @author: yechao
 * @date: 2018/11/10 19:00
 * @description:
 */
public interface TestCacheService {

    Long save(SysLog sysLog);

    SysLog get(Integer id);

    Integer update(SysLog sysLog);

    List<SysLog> list();

    List<SysLog> listBySysLogQuery(SysLogQuery query);

    Integer delete(Integer id);
}
