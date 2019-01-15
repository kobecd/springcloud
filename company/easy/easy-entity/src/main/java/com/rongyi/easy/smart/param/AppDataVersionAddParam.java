package com.rongyi.easy.smart.param;

import com.rongyi.easy.smart.entity.AppDataVersion;

/**
 * Created by yandong on 2018/1/15.
 */
public class AppDataVersionAddParam extends AppDataVersion {

    private Long updateTime;

    private String machineCode;

    private String appIdStr;

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getAppIdStr() {
        return appIdStr;
    }

    public void setAppIdStr(String appIdStr) {
        this.appIdStr = appIdStr;
    }

    @Override
    public String toString() {
        return "AppDataVersionAddParam{" +
                "updateTime=" + updateTime +
                ", machineCode='" + machineCode + '\'' +
                ", appIdStr='" + appIdStr + '\'' +
                "} " + super.toString();
    }
}
