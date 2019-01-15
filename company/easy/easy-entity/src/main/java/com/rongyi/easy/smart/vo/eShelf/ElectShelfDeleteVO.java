package com.rongyi.easy.smart.vo.eShelf;

import java.io.Serializable;
import java.util.List;
/**
 * 电子货架
 * @author user
 *
 */
public class ElectShelfDeleteVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 电子货架广告删除的信息
	 */
	private List<String> banner;

	public List<String> getBanner() {
		return banner;
	}

	public void setBanner(List<String> banner) {
		this.banner = banner;
	}

	@Override
	public String toString() {
		return "ElectShelfDeleteVO [banner=" + banner + "]";
	}
	
}
