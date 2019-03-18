package com.xuwx.myorigin.dao;

import com.xuwx.myorigin.domain.SysQuartzJob;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by xuwx on 2018/11/29.
 */
@Mapper
public interface SysQuartzJobMapper {

    void save (SysQuartzJob sysQuartzJob);

    void update(SysQuartzJob sysQuartzJob);

    void delete(Long jobId);

    SysQuartzJob get(Long jobId);

    List<SysQuartzJob> findList();

    List<SysQuartzJob> findUsedLegallyJobList();

    List<SysQuartzJob> findDeleteJobList();
}
