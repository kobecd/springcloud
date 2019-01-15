package com.rongyi.param;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
/**
 * Description：
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * caijie          2018/8/17 0:20          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */

@Data
public class RoleAuthParam  extends BaseParam implements Serializable{

	private static final long serialVersionUID = 132130534642395779L;
	private Integer id;//角色id
	private List<Integer> authIds;//权限id集合
}
