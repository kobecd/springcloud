package com.arc.swagger2.model.entries;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: yechao
 * @date: 2018/12/26 11:28
 * @description: 用户相关的服务
 */
@Getter
@Setter
@AllArgsConstructor
public class SysUser extends BaseModel {

    private static final long serialVersionUID = 1L;


    private Long id;//主键id

    private String username;//名称

    private String password;//密码

}
