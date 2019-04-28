package com.arc.security.db.model.domain.sys;

import com.arc.security.db.model.domain.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * 用户相关的服务
 *
 * @author yechao
 * @since 2019/01/23 11:28
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseModel {

    private static final long serialVersionUID = 1L;

    private Long id;// 自增id

    private String username;// 用户名

    private String password;//密码

    private Integer status = 0;// 账号状态(0：正常 1:暂停)

    private Date createDate;// 创建时间

    private Date updateDate;// 更新时间

}
