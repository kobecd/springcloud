package com.rongyi.easy.smart.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@ToString
public class MachineCaseEntityExample implements Serializable {

    private Set<Integer> caseIdList; //模板id列表

    private Integer osType;//系统类型
}
