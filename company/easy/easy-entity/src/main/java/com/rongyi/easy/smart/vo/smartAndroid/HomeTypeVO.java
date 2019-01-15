package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
/**
 * 模板首页类型
 * @author user
 *
 */
public class HomeTypeVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 模板ID
	 */
	private String templateId;
	/**
	 * 需要启动的业务APP的功能模块类型  -->  1:标准首页 2:商场导购 3:优惠券 4:会员中心 5:精彩活动
	 */
	private int startFeatureType;
	/**
     * 商场LOGO
     */
    private String mallLogo;
    /**
     * 商场本地LOGO
     */
    private String localMallLogo;
	
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public int getStartFeatureType() {
		return startFeatureType;
	}
	public void setStartFeatureType(int startFeatureType) {
		this.startFeatureType = startFeatureType;
	}
	public String getMallLogo() {
		return mallLogo;
	}
	public void setMallLogo(String mallLogo) {
		this.mallLogo = mallLogo;
	}
	public String getLocalMallLogo() {
		return localMallLogo;
	}
	public void setLocalMallLogo(String localMallLogo) {
		this.localMallLogo = localMallLogo;
	}
	@Override
	public String toString() {
		return "HomeTypeVO [templateId=" + templateId + ", startFeatureType="
				+ startFeatureType + ", mallLogo=" + mallLogo
				+ ", localMallLogo=" + localMallLogo + "]";
	}
	
}
