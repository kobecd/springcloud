package com.rongyi.easy.smart.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GameBoxCaseData {
	
	/**
	 * 游戏盒子模板打包数据
	 */
	private String gameBoxCaseInfo;
	
	/**
	 * 资源集合
	 */
	private List<String> resourceList;
	
	/**
	 * 删除的资源集合
	 */
	private List<String> deleteResourceList;
} 
