package com.rongyi.rbac.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Description：用户信息
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/16 19:27          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 *
 * Auto generated by fms-mybatis-generator
 */
@Data
public class UserInfoVO implements Serializable{
	private static final long serialVersionUID = -1116795683637742868L;

	private Integer userId;//用户账号id

    private String username;//账号

    private String password;//密码

    private String name;//姓名

    private String nickname;//昵称

    private String phone;//手机号

    private String memo; //备注

    private Byte status;   //0未激活，1正常、2被锁定、3凭证过期

    private String createAt; //创建时间

    private String updateAt; //修改时间

    private String createBy; //创建账号

    private String updateBy; //修改账号
    
    private String createName; //创建者姓名
    
    private String updateName; //修改者姓名
    
    private String reason; //停用理由
    
    private Date disableAt; //停用时间

    private List<Integer> roleIds; //权限id集合

}