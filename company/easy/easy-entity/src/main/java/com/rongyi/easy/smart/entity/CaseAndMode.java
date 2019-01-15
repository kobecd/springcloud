package com.rongyi.easy.smart.entity;

import java.io.Serializable;
import java.util.List;

public class CaseAndMode implements Serializable {

    private Integer caseId; //模板id

    private Integer sourceId; //资源id

    private String templateName; //模板名称

    private String moduleName; //模块名称

    private List<Object> dataList;

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public List<Object> getDataList() {
        return dataList;
    }

    public void setDataList(List<Object> dataList) {
        this.dataList = dataList;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    @Override
    public String toString() {
        return "CaseAndModuleVo{" +
                "caseId=" + caseId +
                ", sourceId=" + sourceId +
                ", templateName='" + templateName + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", dataList=" + dataList +
                '}';
    }
}
