package com.multi.datasource.model.domain;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User extends BaseModel {


    private Long id;
    private String nickname;
    private String avatar;
    private String sign;
    private Integer level;
    private Integer gender;
    private Integer userType;
    private Date birthday;

}
