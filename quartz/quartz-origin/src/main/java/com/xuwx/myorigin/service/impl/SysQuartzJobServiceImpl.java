package com.xuwx.myorigin.service.impl;

import com.xuwx.myorigin.dao.SysQuartzJobMapper;
import com.xuwx.myorigin.domain.SysQuartzJob;
import com.xuwx.myorigin.service.ISysQuartzJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuwx on 2018/11/29.
 */
@Service
public class SysQuartzJobServiceImpl implements ISysQuartzJobService{

    @Autowired
    private SysQuartzJobMapper sysQuartzJobMapper;

    @Override
    public void save(SysQuartzJob sysQuartzJob) {
        sysQuartzJobMapper.save(sysQuartzJob);
    }

    @Override
    public void update(SysQuartzJob sysQuartzJob) {
        sysQuartzJobMapper.update(sysQuartzJob);
    }

    @Override
    public void delete(Long jobId) {
        sysQuartzJobMapper.delete(jobId);
    }

    @Override
    public SysQuartzJob get(Long jobId) {
        SysQuartzJob sysQuartzJob = sysQuartzJobMapper.get(jobId);
        if (sysQuartzJob==null){
            return null;
        }else {
            return sysQuartzJob;
        }
    }

    @Override
    public List<SysQuartzJob> findList() {
        List<SysQuartzJob> list = sysQuartzJobMapper.findList();
        return list;
    }

    /**
     * 查询 job 状态为通过审核 已启用的定时任务
     * @return
     */
    @Override
    public List<SysQuartzJob> findUsedLegallyJobList() {
        List<SysQuartzJob> list = sysQuartzJobMapper.findUsedLegallyJobList();
        return list;
    }

    /**
     * 查询 job 状态 已禁用的
     * @return
     */
    @Override
    public List<SysQuartzJob> findDeleteJobList() {
        List<SysQuartzJob> list = sysQuartzJobMapper.findDeleteJobList();
        return list;
    }
}
