package com.arc.mybatisplus.model.entries;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 文件信息记录之实体
 *
 * @author yechao
 * @date 2018/12/21
 */
public class User extends BaseModel {

    private static final long serialVersionUID = 1L;

    private Long id; //主键
    private String username; //名称
    private String password; //密码


    public User() {
    }

    public User(String  username, String password) {
        this.username = username;
        this.password = password;
    }


    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
