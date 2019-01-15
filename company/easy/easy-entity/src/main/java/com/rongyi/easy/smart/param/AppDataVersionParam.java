package com.rongyi.easy.smart.param;

/**
 * Created by yandong on 2018/1/15.
 */
public class AppDataVersionParam extends BaseParam{

    private Integer machineId;

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    @Override
    public String toString() {
        return "AppDataVersionParam{" +
                "machineId=" + machineId +
                "} " + super.toString();
    }
}
