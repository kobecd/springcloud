package com.arc.excel.model.entries.mall;

import com.arc.excel.model.entries.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 *
 *
 */
@Getter
@Setter
public class MallQuestion extends BaseModel {

	private static final long serialVersionUID = 1L;

	private Long id;// 主键ID
	private String question;// 名称
	private String answer;// 答案
	private String reason;// 依据
	private String note;// 备注
	private Date createDate;// 创建时间
	private Date updateDate;// 更新时间
}
