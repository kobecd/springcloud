package com.rongyi.easy.smart.vo;

import com.rongyi.easy.smart.entity.CasePage;
import org.apache.ibatis.annotations.Case;

/**
 * Created by yandong on 2017/11/15.
 */
public class CasePageVO extends CasePage {

    private Integer moduleId;

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }
}
