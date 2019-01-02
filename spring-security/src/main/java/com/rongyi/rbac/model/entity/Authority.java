package com.rongyi.rbac.model.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Authority implements Serializable{

	private static final long serialVersionUID = 6753524083613075626L;

	private Integer id;

    private Integer parentId;

    private String name;

    private String value;
    
    private Boolean hasRelation;//是否关联
    
    private List<Authority> list;

}