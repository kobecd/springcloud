package com.rongyi.easy.smart.vo;

public class ModuleCaseVO {

    private Integer caseId;//模板ID

    private String caseName;//模板名称

    private String moduleName;//应用名称

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @Override
    public String toString() {
        return "ModuleCaseVO{" +
                "caseName='" + caseName + '\'' +
                ", moduleName='" + moduleName + '\'' +
                '}';
    }
}
