package com.rongyi.easy.smart.vo;

import java.io.Serializable;

/**
 * Created by yandong on 2017/10/16.
 */
public class AppVO implements Serializable{

    private Integer id;
    private String name;
    private String layoutNumber;
    private Integer machineNum;
    private Integer caseNum;
    private String url; // 图片url
    private String introduce;

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getLayoutNumber() {
        return layoutNumber;
    }

    public void setLayoutNumber(String layoutNumber) {
        this.layoutNumber = layoutNumber;
    }

    public Integer getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(Integer caseNum) {
        this.caseNum = caseNum;
    }

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

    public Integer getMachineNum() {
        return machineNum;
    }

    public void setMachineNum(Integer machineNum) {
        this.machineNum = machineNum;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
