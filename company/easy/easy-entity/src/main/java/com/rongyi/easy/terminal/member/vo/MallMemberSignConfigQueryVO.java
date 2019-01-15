package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MallMemberSignConfigQueryVO implements Serializable{
	private Integer id;

	private Integer caseId;

	private Byte style;

	private Byte signWay;

	private String buttonName;

	private String ruleInfo;

	private Integer pointConstant;

	private Integer pointMin;

	private Integer pointMax;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public Byte getStyle() {
		return style;
	}

	public void setStyle(Byte style) {
		this.style = style;
	}

	public Byte getSignWay() {
		return signWay;
	}

	public void setSignWay(Byte signWay) {
		this.signWay = signWay;
	}

	public String getButtonName() {
		return buttonName;
	}

	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}

	public String getRuleInfo() {
		return ruleInfo;
	}

	public void setRuleInfo(String ruleInfo) {
		this.ruleInfo = ruleInfo;
	}

	public Integer getPointConstant() {
		return pointConstant;
	}

	public void setPointConstant(Integer pointConstant) {
		this.pointConstant = pointConstant;
	}

	public Integer getPointMin() {
		return pointMin;
	}

	public void setPointMin(Integer pointMin) {
		this.pointMin = pointMin;
	}

	public Integer getPointMax() {
		return pointMax;
	}

	public void setPointMax(Integer pointMax) {
		this.pointMax = pointMax;
	}

	@Override
	public String toString() {
		return "MallMemberSignConfigQueryVO [id=" + id + ", caseId=" + caseId + ", style="
				+ style + ", signWay=" + signWay + ", buttonName=" + buttonName + ", ruleInfo=" + ruleInfo
				+ ", pointConstant=" + pointConstant + ", pointMin=" + pointMin + ", pointMax=" + pointMax + "]";
	}
	
	
}
