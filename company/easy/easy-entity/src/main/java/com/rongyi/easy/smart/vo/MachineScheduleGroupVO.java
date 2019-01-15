package com.rongyi.easy.smart.vo;

import com.rongyi.easy.smart.entity.MachineScheduleGroup;
import com.rongyi.easy.smart.vo.rollScreen.ScheduleDeviceVO;

import java.util.List;

/**
 * Created by yandong on 2017/12/26.
 */
public class MachineScheduleGroupVO extends MachineScheduleGroup {

    private Integer machineNum; //关联设备数

    private List<ScheduleDeviceVO> machineList;

    public List<ScheduleDeviceVO> getMachineList() {
        return machineList;
    }

    public void setMachineList(List<ScheduleDeviceVO> machineList) {
        this.machineList = machineList;
    }

    public Integer getMachineNum() {
        return machineNum;
    }

    public void setMachineNum(Integer machineNum) {
        this.machineNum = machineNum;
    }

    @Override
    public String toString() {
        return "MachineScheduleGroupVO{" +
                "machineNum=" + machineNum +
                ", machineList=" + machineList +
                "} " + super.toString();
    }
}
