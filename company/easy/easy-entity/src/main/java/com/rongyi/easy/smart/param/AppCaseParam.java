package com.rongyi.easy.smart.param;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yandong on 2017/10/31.
 */
public class AppCaseParam extends BaseParam implements Serializable {


    private String appId;

    private Integer layoutId;

    private Integer os;

    private List<Integer> machineIdList;

    public List<Integer> getMachineIdList() {
        return machineIdList;
    }

    public void setMachineIdList(List<Integer> machineIdList) {
        this.machineIdList = machineIdList;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public Integer getOs() {
        return os;
    }

    public void setOs(Integer os) {
        this.os = os;
    }
}
