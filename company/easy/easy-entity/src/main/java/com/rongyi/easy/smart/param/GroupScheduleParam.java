package com.rongyi.easy.smart.param;

import java.util.List;

/**
 * Created by yandong on 2017/12/21.
 * update
 */
public class GroupScheduleParam extends BaseParam {

    private Integer groupId;
    private List<Integer> machineIdList;
    private String name;
    private Integer state;
    private String machineNameOrCode;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public List<Integer> getMachineIdList() {
        return machineIdList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMachineIdList(List<Integer> machineIdList) {
        this.machineIdList = machineIdList;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMachineNameOrCode() {
        return machineNameOrCode;
    }

    public void setMachineNameOrCode(String machineNameOrCode) {
        this.machineNameOrCode = machineNameOrCode;
    }

    @Override
    public String toString() {
        return "GroupScheduleParam{" +
                "groupId=" + groupId +
                ", machineIdList=" + machineIdList +
                ", name='" + name + '\'' +
                ", state=" + state +
                ", machineNameOrCode='" + machineNameOrCode + '\'' +
                "} " + super.toString();
    }
}
