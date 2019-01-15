package com.rongyi.easy.integral.param;

import java.io.Serializable;

/*
 * Description:  
 * Author: zhuming 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * zhuming     2017/12/29    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class IntegralParam  implements Serializable {

    private static final long serialVersionUID = -584515780739290167L;

    /**
     *  原因
     */
    public String reason;

    /**
     *  积分
     */
    public Integer useScore;


    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getUseScore() {
        return useScore;
    }

    public void setUseScore(Integer useScore) {
        this.useScore = useScore;
    }

    @Override
    public String toString() {
        return "IntegralParam{" +
                "reason='" + reason + '\'' +
                ", useScore=" + useScore +
                '}';
    }
}
