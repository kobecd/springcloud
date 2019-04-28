package com.arc.mp.controller.test.model;

/**
 * @author 叶超
 * @since 2019/4/16 13:48
 */
public class Org implements ITreeNode {


    private Long uuid;
    private Long parentId;
    private String name;
    private Integer orderNum;
    private String code;
    private Integer type;

    public Org() {
    }


    @Override
    public Long getNodeId() {
        return uuid;
    }

    @Override
    public String getNodeName() {
        return name;
    }

    @Override
    public Long getNodeParentId() {
        return parentId;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Org(Long uuid, Long parentId, String name, Integer orderNum, String code, Integer type) {
        this.uuid = uuid;
        this.parentId = parentId;
        this.name = name;
        this.orderNum = orderNum;
        this.code = code;
        this.type = type;
    }
}
