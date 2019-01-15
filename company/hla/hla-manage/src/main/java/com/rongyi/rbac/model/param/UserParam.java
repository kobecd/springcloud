package com.rongyi.rbac.model.param;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * Description：用户
 * Author:  Administrator
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/17 14:03          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */

@Setter
@Getter
public class UserParam extends BaseParam implements Serializable{

    private Integer userId;//账号id

    private String username;//账号名称

    private String password;//账号密码

    private String name;//姓名

    private String nickname;//昵称

    private String phone;//手机号

    private Byte status;   //0未激活，1正常、2被锁定、3凭证过期

    private String createBy;//创建者账号

    private String updateBy;//修改者账号

    private String createName;//创建者姓名

    private String updateName;//修改者姓名

    private List<String> authNameList; //权限id列表

}
