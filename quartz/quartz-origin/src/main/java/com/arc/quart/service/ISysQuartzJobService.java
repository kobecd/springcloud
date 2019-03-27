package com.arc.quart.service;

import com.arc.quart.domain.SysQuartzJob;

import java.util.List;

/**
 * Created by xuwx on 2018/11/29.
 */
public interface ISysQuartzJobService {

    void save (SysQuartzJob sysQuartzJob);

    void update(SysQuartzJob sysQuartzJob);

    void delete(Long jobId);

    SysQuartzJob get(Long jobId);

    List<SysQuartzJob> findList();

    List<SysQuartzJob> findUsedLegallyJobList();

    List<SysQuartzJob> findDeleteJobList();


}
