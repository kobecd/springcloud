package com.rongyi.hla.service.product.impl;

import com.rongyi.hla.mapper.product.PullLogMapper;
import com.rongyi.hla.service.product.PullLogService;
import com.rongyi.entity.product.PullLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PullLogServiceImpl implements PullLogService {

    @Autowired
    private PullLogMapper pullLogMapper;

    @Override
    public int save(PullLog pullLog) {
      pullLogMapper.save(pullLog);
        return pullLog.getId();
    }

    @Override
    public List<PullLog> list() {
        return pullLogMapper.selectAll();
    }

    @Override
    public PullLog getLatestRequest(String name) {
        return pullLogMapper.getLatestRequest(name);
    }
}
