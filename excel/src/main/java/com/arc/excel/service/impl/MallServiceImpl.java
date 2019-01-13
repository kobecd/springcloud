package com.arc.excel.service.impl;

import com.arc.excel.mapper.MallMapper;
import com.arc.excel.model.entries.mall.Mall;
import com.arc.excel.service.MallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: yechao
 * @date: 2018/12/26 11:31
 * @description:
 */
@Service
public class MallServiceImpl implements MallService  {

    @Autowired
    private MallMapper mallMapper;



    @Override

    public Long save(Mall mall) {
        return mallMapper.save(mall) == 1 ? mall.getId() : null;
    }

    @Override
    public int delete(Long id) {
        return mallMapper.delete(id);
    }

    @Override
    @Transactional
    public int update(Mall mall) {
        return mallMapper.update(mall);
    }

    @Override
    public Mall get(Long id) {
        return mallMapper.get(id);
    }

    @Override
    public List<Mall> list() {
        return mallMapper.list();
    }

}
