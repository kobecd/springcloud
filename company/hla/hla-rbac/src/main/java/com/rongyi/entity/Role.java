package com.rongyi.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Role {
    private Integer id;

    private String name;

    private Byte status;           //0正常  1停用

    private String memo;

    private Date createAt;

    private Date updateAt;

    private Integer createBy;

    private Integer updateBy;

    private String reason;
    
    private String createName;
    
    private String updateName;
    
    private Date disableAt;


}