package com.rongyi.easy.smart.param;

import java.util.Date;

public class templateScheduleReminderParam {

    private String mallId;

    private Integer caseId;

    private String caseStartDate;

    private String caseEndDate;


    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getCaseStartDate() {
        return caseStartDate;
    }

    public void setCaseStartDate(String caseStartDate) {
        this.caseStartDate = caseStartDate;
    }

    public String getCaseEndDate() {
        return caseEndDate;
    }

    public void setCaseEndDate(String caseEndDate) {
        this.caseEndDate = caseEndDate;
    }

    @Override
    public String toString() {
        return "templateScheduleReminderParam{" +
                "mallId='" + mallId + '\'' +
                ", caseId=" + caseId +
                ", caseStartDate='" + caseStartDate + '\'' +
                ", caseEndDate='" + caseEndDate + '\'' +
                '}';
    }
}
