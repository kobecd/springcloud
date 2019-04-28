package com.arc.mp.model.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 叶超
 * @since 2019/4/16 15:31
 */
@Getter
@Setter
public class Node {

    private static final long serialVersionUID = 1L;

    private Long id;// 问题表ID


    private Long parentId;// 父节点ID

    private Node parent;

    //节点所在的层级
    private Integer level;

    //当前节点的二子节点
    private List<Node> children = new ArrayList<>();

    //当前节点的子孙节点
    private List<Node> allChildren = new ArrayList<>();

    public void addChild(Node node) {
        this.children.add(node);
    }
}
