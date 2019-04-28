package com.arc.mp.controller.test.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: 树节点</p>
 * <p>Description:一棵树由许多包含父子关系的节点组成 </p>
 * @author  liuzhibo
 * @date    2017年1月18日
 */
public class Node {

    //树节点ID
//    @JSONField(ordinal=1)
    private Long nodeId;


    //树节点名称
//    @JSONField(ordinal=2)
    private String nodeName;

    //父节点ID
//    @JSONField(ordinal=3)
    private Long parentNodeId;

    //节点在树中的排序号
//    @JSONField(ordinal=4)
    private int orderNum;

    //节点所在的层级
//    @JSONField(ordinal=5)
    private int level;

    private Node parent;

    //当前节点的二子节点
//    @JSONField(ordinal=6)
    private List<Node> children = new ArrayList<Node>();

    //当前节点的子孙节点
    private List<Node> allChildren = new ArrayList<Node>();


    public Node(ITreeNode obj){
        this.nodeId = obj.getNodeId();
        this.nodeName = obj.getNodeName();
        this.parentNodeId= obj.getNodeParentId();
        this.orderNum = obj.getOrderNum();
    }

    public void addChild(Node node){
        this.children.add(node);
    }
    public void removeChild(Node node){
        this.children.remove(node);
    }
    public Long getNodeId() {
        return nodeId;
    }
    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }
    public String getNodeName() {
        return nodeName;
    }
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
    public Long getParentNodeId() {
        return parentNodeId;
    }
    public void setParentNodeId(Long parentNodeId) {
        this.parentNodeId = parentNodeId;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public Node getParent() {
        return parent;
    }
    public void setParent(Node parent) {
        this.parent = parent;
    }
    public List<Node> getChildren() {
        return children;
    }
    public void setChildren(List<Node> children) {
        this.children = children;
    }
    public int getOrderNum() {
        return orderNum;
    }
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public List<Node> getAllChildren() {
        if(this.allChildren.isEmpty()){
            for(Node node : this.children){
                this.allChildren.add(node);
                this.allChildren.addAll(node.getAllChildren());
            }
        }
        return this.allChildren;
    }

    @Override
    public String toString() {
        return "Node{" +
                "nodeId='" + nodeId + '\'' +
                ", nodeName='" + nodeName + '\'' +
                ", parentNodeId='" + parentNodeId + '\'' +
                ", orderNum=" + orderNum +
                ", level=" + level +
                ", parent=" + parent +
                ", children=" + children +
                ", allChildren=" + allChildren +
                '}';
    }
}
