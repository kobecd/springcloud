package com.rongyi.api.hudao;

import com.rongyi.dto.product.hudao.HuDaoPageDTO;
import lombok.*;

/**
 * 互道api的返回结果
 *
 * @description 提供互道api的返回结果封装
 * @author: yechao lamymay@outlook.com
 * @date: 2018/08/09 15:27
 * @version: V1.0
 */
@Data
@ToString
public class ProductHuDaoApiResponse {

    private String message;

    private Integer code;

    private HuDaoPageDTO data;

    @Getter
    @Setter
    @NoArgsConstructor
    public class Data{
        private String access_token;
        private String grant_type;
        private Long expires_in;
    }
}
