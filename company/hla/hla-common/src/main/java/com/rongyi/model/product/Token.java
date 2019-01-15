package com.rongyi.model.product;

import com.rongyi.model.BaseDO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


/**
 * token
 *
 * @author: yechao
 * @date: 2018/08/08 15:27
 * @version: V1.0
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class  Token extends BaseDO {

    private static final long serialVersionUID = 1L;

    private String token; // token
    private Date createDate; // 创建时间
    private Long expiresTime; // 过期时间 单位：ms（毫秒）

    private String accessTokenUrl; // 获取token的地址
    private String appId; // appid
    private String appSecret; // appSecret
    private Integer state; // 状态
}