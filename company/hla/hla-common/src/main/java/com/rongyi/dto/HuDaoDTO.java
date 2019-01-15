package com.rongyi.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/4/27
 */
@Setter
@Getter
@ToString
public class HuDaoDTO implements Serializable {

    private boolean is_use_page;//是否使用分页，否：则返回全部分组信息

    private Integer parent_code;//商品分组ID

    private Integer page = 1;//查询页数，默认：1

    private Integer page_size = 10;//每页记录数，默认：10

    private Date start_time;//查询开始时间

    private Date end_time;//查询结束时间


}
