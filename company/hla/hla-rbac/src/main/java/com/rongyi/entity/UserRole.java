package com.rongyi.entity;

import lombok.Data;

@Data
public class UserRole {
    private Long id;

    private Long userId;

    private Integer roleId;
    
    private String roleName;

}