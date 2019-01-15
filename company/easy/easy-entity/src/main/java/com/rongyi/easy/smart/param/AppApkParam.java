package com.rongyi.easy.smart.param;

import java.io.Serializable;

import com.rongyi.easy.smart.param.module.MachineModuleParam;
/**
 * APK打包参数
 * @author user
 *
 */
public class AppApkParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 商场ID
	 */
	private String mallId;
	/**
	 * 文件路径
	 */
	private String path;
	/**
	 * 商场应用模块
	 */
	private MachineModuleParam mallModuleParam = new MachineModuleParam();
	
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public MachineModuleParam getMallModuleParam() {
		return mallModuleParam;
	}
	public void setMallModuleParam(MachineModuleParam mallModuleParam) {
		this.mallModuleParam = mallModuleParam;
	}
	@Override
	public String toString() {
		return "AppApkParam [mallId=" + mallId + ", path=" + path
				+ ", mallModuleParam=" + mallModuleParam + "]";
	}
}
