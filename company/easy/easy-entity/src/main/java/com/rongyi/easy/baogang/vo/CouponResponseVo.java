package com.rongyi.easy.baogang.vo;

import java.io.Serializable;

/**
 * Created by zengzhimin on 2017/11/24.
 */
public class CouponResponseVo implements Serializable {

    private String code;

    private String info;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
