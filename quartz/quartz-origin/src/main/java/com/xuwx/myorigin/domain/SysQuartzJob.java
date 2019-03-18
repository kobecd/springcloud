package com.xuwx.myorigin.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by xuwx on 2018/11/29.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SysQuartzJob {
    /**
     * bigint(20);
     * 定时任务ID
     */
    private Long jobId;
    /**
     * varchar(40)
     * 定时任务名称
     */
    private String jobName;
    /**
     * varchar(40)
     * 定时任务分组
     */
    private String jobGroup;
    /**
     * char(1)
     * 定时任务状态
     * 0 表示禁用 1表示启用, 默认为1;
     */
    private Character jobStatus;
    /**
     * char(1)
     * 审核状态
     * 0 已创建 1审核通过 2审核驳回;
     */
    private Character auditStatus;
    /**
     * varchar(40)
     * 定时任务运行时间表达式
     */
    private String cronExpression;
    /**
     * varchar(255)
     * 定时任务处理类(全限定类名)
     */
    private String quartzClass;
    /**
     * varchar(280)
     * 该定时任务的详细描述
     */
    private String description;
}
