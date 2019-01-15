package com.rongyi.easy.smart.vo;

import com.rongyi.easy.smart.entity.AppDataVersion;

/**
 * Created by yandong on 2018/1/15.
 */
public class AppDataVersionVO extends AppDataVersion {

    private String layoutName;

    private String updateTime;

    public String getLayoutName() {
        return layoutName;
    }

    public void setLayoutName(String layoutName) {
        this.layoutName = layoutName;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "AppDataVersionVO{" +
                "layoutName='" + layoutName + '\'' +
                ", updateTime='" + updateTime + '\'' +
                "} " + super.toString();
    }
}
