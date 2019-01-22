package com.arc.jpa.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/22 14:52
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_sys_user")
public class SysUser extends BaseModel {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Long id;// 自增id

    @Column(name = "nickname")
    private String nickname;// 用户昵称

    @Column(name = "avatar")
    private String avatar;// 头像

    @Column(name = "status")
    private Integer status = 0;// 账号状态(0：正常 1:暂停)

    @Column(name = "create_date")
    private Date createDate;// 创建时间

    @Column(name = "update_date")
    private Date updateDate;// 更新时间

}
