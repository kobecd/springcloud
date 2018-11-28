package com.arc.cache.service;

import com.arc.cache.model.domain.PullLog;
import com.arc.cache.model.query.PullLogQuery;

import java.util.List;

/**
 * @author: yechao
 * @date: 2018/11/10 19:00
 * @description:
 */
public interface PullLogService {

    Long save(PullLog pullLog);

    PullLog get(Integer id);

    Integer update(PullLog pullLog);

    List<PullLog> list();

    List<PullLog> listByPullLogQuery(PullLogQuery query);

    Integer delete(Integer id);
}
