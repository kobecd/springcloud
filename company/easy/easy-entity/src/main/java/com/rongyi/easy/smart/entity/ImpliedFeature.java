package com.rongyi.easy.smart.entity;

import java.io.Serializable;

public class ImpliedFeature implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 需要的设备特性名称。
     */
    private String feature;

    /**
     * 表明所需特性的内容。
     */
    private String implied;

    public ImpliedFeature() {
        super();
    }

    public ImpliedFeature(String feature, String implied) {
        super();
        this.feature = feature;
        this.implied = implied;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getImplied() {
        return implied;
    }

    public void setImplied(String implied) {
        this.implied = implied;
    }

    @Override
    public String toString() {
        return "Feature [feature=" + feature + ", implied=" + implied + "]";
    }
}
