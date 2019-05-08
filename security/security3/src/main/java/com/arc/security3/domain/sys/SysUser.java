package com.arc.security3.domain.sys;

import com.arc.security3.domain.BaseModel;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 用户相关的服务
 *
 * @author yechao
 * @since 2019/01/23 11:28
 */

@Data
@TableName("t_sys_user")
public class SysUser extends BaseModel {

    private static final long serialVersionUID = 1L;

    private Long id;// 主键ID
    private String username;// 账号密码
    private String password;// 密码
    private Integer state;// 账号状态状态，status, condition, mode, position, state of affairs, fettle
    private Date createDate;// 创建时间
    private Date updateDate;// 更新时间

}



