package com.arc.mp.mysql.domain.sys;

import com.arc.mp.mysql.domain.BaseModel;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * 用户相关的服务
 *
 * @author yechao
 * @since 2019/01/23 11:28
 */

@Setter
@Getter
@TableName("t_sys_user")
public class User extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;// 主键ID
    private String username;// 账号密码
    private String password;// 密码
    private Integer state;// 账号状态状态，status, condition, mode, position, state of affairs, fettle
    private Date createDate;// 创建时间
    private Date updateDate;// 更新时间
}

