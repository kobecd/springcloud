package com.arc.mp.model.domain;

import lombok.Data;

/**
 * 用户相关的服务
 *
 * @author yechao
 * @since 2019/01/23 11:28
 */

@Data
//@KeySequence("SEQ_USER")
//@TableName("user")
public class User extends BaseModel {

    private static final long serialVersionUID = 1L;
    //    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    private String name;
    private Integer age;
    private String email;
}

//@RequiredArgsConstructor
////@NoArgsConstructor
//@AllArgsConstructor
//@Accessors(chain = true)
//@Data
//@Builder
