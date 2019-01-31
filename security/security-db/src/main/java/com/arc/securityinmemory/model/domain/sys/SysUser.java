package com.arc.securityinmemory.model.domain.sys;

import com.arc.securityinmemory.model.domain.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author: yechao
 * @date: 2019/01/23 11:28
 * @description: 用户相关的服务
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SysUser extends BaseModel {

    private static final long serialVersionUID = 1L;

    private Long id;// 自增id

    private String nickname;// 用户昵称

    private String avatar;// 头像

    private Integer status = 0;// 账号状态(0：正常 1:暂停)

    private Date createDate;// 创建时间

    private Date updateDate;// 更新时间

}
