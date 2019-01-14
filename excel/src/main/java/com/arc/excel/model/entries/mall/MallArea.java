package com.arc.excel.model.entries.mall;


import com.arc.excel.model.entries.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 */
@Getter
@Setter
@ToString
public class MallArea extends BaseModel {

    private static final long serialVersionUID = 1L;

    private Long id;// 主键ID
    private Long areaCode;// 地区代码
    private String shortCode="000000";// 短吗
    private String areaName;// 地区名称
    private String tag;// 地址标签
    private String note;// 备注
}
