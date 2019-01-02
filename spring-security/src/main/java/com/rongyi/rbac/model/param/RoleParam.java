package com.rongyi.rbac.model.param;

import lombok.Data;

import java.io.Serializable;

/**
 * Description：
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * caijie          2018/8/17 0:22          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */

@Data
public class RoleParam extends BaseParam implements Serializable{

	private static final long serialVersionUID = 1312922967054366873L;

	private Integer id;//角色id
	
	private String name;//角色名称
	
	private String memo;//备注
	
	private Byte status;//0启用  1停用
	
	private String reason;//停用理由

}
