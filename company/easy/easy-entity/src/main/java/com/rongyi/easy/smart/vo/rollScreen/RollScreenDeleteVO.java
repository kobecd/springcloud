package com.rongyi.easy.smart.vo.rollScreen;

import java.io.Serializable;
import java.util.List;

public class RollScreenDeleteVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 电子易拉宝删除的信息
	 */
	private List<String> home;
	
	public List<String> getHome() {
		return home;
	}
	public void setHome(List<String> home) {
		this.home = home;
	}
	@Override
	public String toString() {
		return "RollScreenDeleteVO [home=" + home + "]";
	}
	
	
}
