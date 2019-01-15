package com.rongyi.param;

import lombok.Data;

import java.io.Serializable;
/**
 * Description：
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * caijie          2018/8/17 0:21          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */

@Data
public class RoleListParam extends BaseParam implements Serializable{

	private static final long serialVersionUID = -8901328770556663385L;

	private String name;//角色名称
	
	private Byte status;//状态   0 正常，1停用， 空值为全部
}
