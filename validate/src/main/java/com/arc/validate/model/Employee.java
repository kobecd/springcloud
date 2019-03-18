package com.arc.validate.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 人员实体
 *
 * @author 叶超
 * @since 2019/2/27 16:51
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Employee {

    private Long id;

    @NotNull(message = "code，不能为空")
    private String code;

    @NotBlank(message = "不能为空")
    private String name;

    private Integer age;

}
