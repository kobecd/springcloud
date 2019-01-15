package com.rongyi.easy.smart.param.module;

import java.io.Serializable;

/**
 * 商场应用配置类
 * @author user
 *
 */
public class MachineModuleParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 安卓标准版
	 */
	private boolean smartAndroid;
	/**
	 * 电子易拉宝
	 */
	private boolean rollScreen;
	/**
	 * 电子货架
	 */
	private boolean electShelf;
	/**
	 * 商场定制版
	 */
	private boolean mallCustom;

	/**
	 * 游戏盒子
	 */
	private  boolean gameBox;
	
	/**
	 * 广告
	 */
	private boolean ads;
	
	public MachineModuleParam() {
		
	}
	
	public MachineModuleParam(boolean smartAndroid, boolean rollScreen,
			boolean electShelf, boolean mallCustom) {
		this.smartAndroid = smartAndroid;
		this.rollScreen = rollScreen;
		this.electShelf = electShelf;
		this.mallCustom = mallCustom;
	}
	
	public boolean isSmartAndroid() {
		return smartAndroid;
	}
	public void setSmartAndroid(boolean smartAndroid) {
		this.smartAndroid = smartAndroid;
	}
	public boolean isRollScreen() {
		return rollScreen;
	}
	public void setRollScreen(boolean rollScreen) {
		this.rollScreen = rollScreen;
	}
	public boolean isElectShelf() {
		return electShelf;
	}
	public void setElectShelf(boolean electShelf) {
		this.electShelf = electShelf;
	}
	
	public boolean isMallCustom() {
		return mallCustom;
	}

	public void setMallCustom(boolean mallCustom) {
		this.mallCustom = mallCustom;
	}

	public boolean isGameBox() {
		return gameBox;
	}

	public void setGameBox(boolean gameBox) {
		this.gameBox = gameBox;
	}

	public boolean isAds() {
		return ads;
	}

	public void setAds(boolean ads) {
		this.ads = ads;
	}

	@Override
	public String toString() {
		return "MachineModuleParam [smartAndroid=" + smartAndroid
				+ ", rollScreen=" + rollScreen + ", electShelf=" + electShelf
				+ ", mallCustom=" + mallCustom + ", gameBox=" + gameBox
				+ ", ads=" + ads + "]";
	}
	
}
