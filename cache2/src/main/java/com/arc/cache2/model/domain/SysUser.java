package com.arc.cache2.model.domain;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户相关的服务
 *
 * @author 叶超
 * @since 2018/12/26 11:28
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;// 自增id
    private String avatar;// 头像
    private String nickname;// 用户昵称
    private Integer status;// 账号状态  天然false 不需要null的类型
    private Date createDate;// 创建时间
    private Date updateDate;// 更新时间

    public SysUser(Long id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public SysUser(Long id) {
        this.id = id;
    }
    //    private String username;// 账号
    //    private String password;// 密码
}
