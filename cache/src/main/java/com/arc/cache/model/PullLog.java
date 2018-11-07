package com.arc.cache.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品表
 *
 */
@Getter
@Setter
public class PullLog  implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;// 日志主键
	private Boolean success;// 状态码成功与否
	private String name;// 操作名称
	private String sourceAddress;// 操作的资源地址
	private String operator;// 操作者名称
	private String remark;// 操作备注
	private Integer successQuantity;// 成功数量  successQuantity=updateQuantity+saveQuantity
	private Integer updateQuantity;// 更新数量
	private Integer insertQuantity;//
	private Date requestDate;// 任务请求时刻
	private Date createDate;// 创建时间
	private String url;// 操作者的HOST
}
