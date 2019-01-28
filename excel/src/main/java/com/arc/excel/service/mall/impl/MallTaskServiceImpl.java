package com.arc.excel.service.mall.impl;

import com.arc.excel.mapper.MallTaskMapper;
import com.arc.excel.model.entries.mall.MallTask;
import com.arc.excel.service.mall.MallTaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/17 22:38
 */
@Service
@Slf4j
public class MallTaskServiceImpl implements MallTaskService {

    @Autowired
    private MallTaskMapper mallTaskMapper;

    @Override
    public Long save(MallTask task) {
        try {
            int save = mallTaskMapper.save(task);
            return save == 0 ? null : task.getId();
        } catch (Exception e) {
            log.error("##########################mallTaskMapper.save出错={}", e);
        }
        return null;
    }

    @Override
    public Integer delete(Long id) {
        return mallTaskMapper.delete(id);
    }

    @Override
    public Integer update(MallTask task) {
        return mallTaskMapper.update(task);
    }

    @Override
    public MallTask get(Long id) {
        return mallTaskMapper.get(id);
    }

    @Override
    public List<MallTask> list() {
        return mallTaskMapper.list();
    }

}
