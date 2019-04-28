package com.arc.mp.model.domain;


import lombok.Getter;
import lombok.Setter;

/**
 * 问题表
 */
@Getter
@Setter
public class Card {

    private static final long serialVersionUID = 1L;
    private Long id;// 问题表ID
    private Long parentId;// 父节点ID

    //节点所在的层级
    private Integer level;

    private String cardType;// 类型
    private String description;// 摘要[text]
    private String name;// 名称
    private String parentName;// 子节点ID
    private String priority;// 优先级
    private Long projectId;// 所属项目ID
    private String resolution;// 解决方案
    private Integer state;// 状态


}
