package com.rongyi.rbac.model.entity;

import lombok.Data;

@Data
public class LogReportHelper {

    private Integer actionType;

    private String url;

    private String element;

    private String userId;

}
