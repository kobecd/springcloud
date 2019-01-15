package com.rongyi.dto.hudao;

import lombok.*;

import java.io.Serializable;
/**
 * 是否是spu？
 */
@Setter
@Getter
@NoArgsConstructor
public class ExtGroupDTO  implements Serializable {

    private String code; // spu对应分组的code

    private String name; // spu对应分组的名称

}
