package com.rongyi.param;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Description：
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * caijie          2018/8/17 0:25          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */

@Data
public class UserRoleParam extends BaseParam implements Serializable{

	private static final long serialVersionUID = 3955488979856332066L;
	private Integer userId;//账号id
	private List<Integer> roleIds;//分配的角色id集合
}
