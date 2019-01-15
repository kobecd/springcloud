package com.rongyi.easy.smart.param;

import java.io.Serializable;

public class ApkParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String apkUrl;//

	public String getApkUrl() {
		return apkUrl;
	}

	public void setApkUrl(String apkUrl) {
		this.apkUrl = apkUrl;
	}

	@Override
	public String toString() {
		return "ApkParam [apkUrl=" + apkUrl + "]";
	}
	
}
