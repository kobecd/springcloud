package com.arc.mp.controller.test.model;

/**
 * @author 叶超
 * @since 2019/4/16 13:47
 */
public interface ITreeNode {

    Long getNodeId();

    String getNodeName();

    Long getNodeParentId();

    Integer getOrderNum();
}
