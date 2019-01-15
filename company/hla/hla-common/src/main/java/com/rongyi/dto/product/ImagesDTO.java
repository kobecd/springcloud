package com.rongyi.dto.product;


import com.rongyi.dto.BaseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * 产品dto
 * 格式化价格
 */
@Setter
@Getter
@NoArgsConstructor
public class ImagesDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private String default_url; //
    private String thumb_url; //
    private List<SpecialImagesDTO> image_urls;


}