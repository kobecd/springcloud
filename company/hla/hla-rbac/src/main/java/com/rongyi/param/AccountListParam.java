package com.rongyi.param;

import lombok.Data;

import java.io.Serializable;

/**
 * Description：内部员工帐号列表参数
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/16 17:38          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
 @Data
public class AccountListParam extends BaseParam implements Serializable {

    private static final long serialVersionUID = 6866889396425638386L;

    private String account;//用户帐号
    private String name;
    private Byte status;//空:全部  1:启用  2:停用
    private Integer currentPage;//当前页  从1开始
    private Integer pageSize;//每页显示的数量
}
