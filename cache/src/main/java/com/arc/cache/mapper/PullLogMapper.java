package com.arc.cache.mapper;

import com.arc.cache.model.PullLog;

/**
 * @author: yechao
 * @date: 2018/11/7 15:43
 * @description:
 */
public interface PullLogMapper {

    Long save(PullLog pullLog);

    PullLog get(Integer id);
}
