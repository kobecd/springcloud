package com.rongyi.param;

import lombok.Data;
import java.io.Serializable;

/**
 * Description：
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/17 0:15          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */

@Data
public class AccountParam extends BaseParam implements Serializable {
    private static final long serialVersionUID = 5666643262059118296L;
    private Integer id;//用户账号id
    private String account;//账号
    private String name;//姓名
    private String nickName;//昵称
    private String phone;//手机号
    private String remark;//备注
    private String createBy;//创建人id
    private String password;//密码
    private Byte status;//1：启用   2：停用
    private String reason;//停用理由
    private String newPassword;//新密码
}
