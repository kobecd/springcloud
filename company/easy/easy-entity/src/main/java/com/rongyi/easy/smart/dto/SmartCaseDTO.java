package com.rongyi.easy.smart.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 标准模板信息传输对象
 * @author user
 *
 */
@Getter
@Setter
@ToString
public class SmartCaseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 商场ID
	 */
	private String mallId;
	/**
	 * 商场名称
	 */
	private String name;
	/**
	 * 模板样式:横版  p，竖版  v
	 */
	private String direction;
	/**
	 * 应用名称
	 */
	private String layoutName;
	/**
	 * 应用模块ID
	 */
	private Integer layoutId;
	/**
	 * 状态 0: 未使用 1：部署中 2：已使用  3：删除
	 */
	private Integer status;
	/**
	 * 模板类型:模板类型: 1 标准版， 2 简易模板（易拉宝）， 3 自定义模板（电子易拉宝）, 4 贴纸模板, 5 广告模板, 6 游戏盒子模板
	 */
	private Integer style;
	/**
	 * 预览图
	 */
	private String preview;
	/**
	 * 商场建站-作品ID
	 */
	private Long mcpCaseId;
	/**
	 * 游戏盒子模板ID
	 */
	private Integer gameBoxCaseId;

}
