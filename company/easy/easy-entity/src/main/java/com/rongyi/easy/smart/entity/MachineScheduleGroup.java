package com.rongyi.easy.smart.entity;

/**
 * Created by yandong on 2017/12/21.
 */
public class MachineScheduleGroup extends BaseEntity {

    private Integer id;
    private String name;
    private String mallId;
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "MachineScheduleGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mallId='" + mallId + '\'' +
                ", state=" + state +
                "} " + super.toString();
    }
}
