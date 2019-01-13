package com.arc.excel.model.entries.mall;


import com.arc.excel.model.entries.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 *
 *
 */
@Getter
@Setter
public class MallArea extends BaseModel {

	private static final long serialVersionUID = 1L;

	private Long id;// 主键ID
	private Long areaCode;// 地区代码
	private String shortCode;// 手机区号
	private String areaName;// 省
	private String tag;// 地址标签
	private String note;// 备注
}
