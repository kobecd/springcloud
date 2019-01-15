package com.rongyi.hla.controller;

import com.rongyi.api.ResponseVO;
import com.rongyi.dto.query.SpuQueryDTO;
import com.rongyi.hla.service.product.ProductSpuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * spu控制器
 *
 * @author: yechao
 * @date: 2018/07/17 15:27
 * @version: V1.0
 */

@Slf4j
//@Api(value = "/product/spu", description = "SPU", produces = "application/json")
@RestController
@RequestMapping("/product/spu")
public class ProductSpuController {

    @Autowired
    private ProductSpuService spuService;



    /**
     * 分页条件查询spu
     * 注意：查询条件是spu的名称 模糊查询
     * @return 结果集包装     List<ProductSpu>
     */
    @RequestMapping(value = "/page", method = RequestMethod.POST)
//    @ApiOperation(value = "产品spus", notes = "分页数据")
    public ResponseVO page(@RequestBody SpuQueryDTO query) {
        log.debug("查询参数{}",query);
        return ResponseVO.success(spuService.page(query));
    }

}
