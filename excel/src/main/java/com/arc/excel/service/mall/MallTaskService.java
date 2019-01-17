package com.arc.excel.service.mall;

import com.arc.excel.model.entries.mall.MallTask;

import java.util.List;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/17 22:37
 */
public interface MallTaskService {

    Long save(MallTask task);

    Integer delete(Long id);

    Integer update(MallTask task);

    MallTask get(Long id);

    List<MallTask> list();
}
