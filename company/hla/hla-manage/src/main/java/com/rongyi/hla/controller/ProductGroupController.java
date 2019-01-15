package com.rongyi.hla.controller;

import com.rongyi.api.ResponseVO;
import com.rongyi.hla.service.product.ProductGroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 产品分类(组)控制器
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */

@Slf4j
//@Api(value = "/product/group", description = "产品分类模块", produces = "application/json")
@RestController
@RequestMapping("/product/group")
public class ProductGroupController {

    @Autowired
    private ProductGroupService productGroupService;


    /**
     * 全部产品分类(组)表
     *
     * @return 结果集包装     List<ProductGroup>
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
//    @ApiOperation(value = "产品全部分类（组）", notes = "全部产品分类（组）")
    public ResponseVO findAllProductGroup() {
        return ResponseVO.success(productGroupService.list());
    }

}
