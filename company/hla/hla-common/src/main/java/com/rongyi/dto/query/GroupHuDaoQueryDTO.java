package com.rongyi.dto.query;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 互道分组
 * 查询条件
 */
@Data
@ToString
public class GroupHuDaoQueryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer parent_code = 0;//当前一个分组0

}
