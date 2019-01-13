package com.arc.excel.model.entries.mall;


import com.arc.excel.model.entries.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 */
@Getter
@Setter
@ToString
public class Mall extends BaseModel {

	private static final long serialVersionUID = 1L;

	private Long id;// 主键ID
	private String taskName;// 任务名称
	private String mallName;// 任务所属商场
	private String mallArea;// 门店地址，具体地址
	private String provinceName;// 省
	private String cityName;// 市
	private String districtName;// 区
	private String townName;// 镇
	private String road;// 街道
	private String note;// 备注
}
