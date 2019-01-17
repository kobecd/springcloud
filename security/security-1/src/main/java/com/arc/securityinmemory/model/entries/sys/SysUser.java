package com.arc.securityinmemory.model.entries.sys;

import com.arc.securityinmemory.model.entries.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author: yechao
 * @date: 2018/12/26 11:28
 * @description: 用户相关的服务
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SysUser extends BaseModel {

    private static final long serialVersionUID = 1L;

    private Long id;// 自增id
    private String username;// 用户名
    private String password;// 密码
    private String displayName;// 账号姓名
    private String tel;// 电话号码
    private String email;// 电子邮箱
    private Integer status = 0;// 账号状态(0：正常 1:暂停)


    private Date createTime;// 创建时间
    private Date updateTime;// 更新时间

}
