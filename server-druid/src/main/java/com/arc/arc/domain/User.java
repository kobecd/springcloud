package com.arc.arc.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User extends BaseModel {
    private String username;
    private String password;
//    private Integer age;

}
