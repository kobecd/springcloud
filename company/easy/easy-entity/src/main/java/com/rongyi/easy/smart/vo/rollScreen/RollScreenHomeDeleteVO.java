package com.rongyi.easy.smart.vo.rollScreen;

import java.io.Serializable;
import java.util.List;

public class RollScreenHomeDeleteVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<HomeDeleteVO> home;

	public List<HomeDeleteVO> getHome() {
		return home;
	}

	public void setHome(List<HomeDeleteVO> home) {
		this.home = home;
	}

	@Override
	public String toString() {
		return "RollScreenHomeDeleteVO [home=" + home + "]";
	}
	
}
