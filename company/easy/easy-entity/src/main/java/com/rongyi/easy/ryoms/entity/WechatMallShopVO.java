package com.rongyi.easy.ryoms.entity;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * Created With IntelliJ IDEA.
 * User: WUH
 * Date:  2017/8/29
 */
public class WechatMallShopVO implements Serializable {
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
