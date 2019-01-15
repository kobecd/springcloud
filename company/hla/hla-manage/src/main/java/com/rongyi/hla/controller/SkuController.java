package com.rongyi.hla.controller;

import com.rongyi.vo.ResponseVO;
import com.rongyi.dto.product.ProductDTO;
import com.rongyi.hla.service.product.SkuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品数据交互控制器
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */

@Slf4j
@RestController
@RequestMapping("/product")
public class SkuController {

    @Autowired
    private SkuService skuService;

    //-------------------------------------屏幕端支撑-----------------------------------------------

    //通过RFID查对应的SKU
    //返回:
    // 1、sku商品的详情 一个主图 2、返回兄弟元素图片
    @RequestMapping(value = "/rfid", method = RequestMethod.POST)
    public ResponseVO selectProductsByRFIDCode(@RequestBody List<String> rfidCodes) {
        log.debug("参数 rfidCodes {}", rfidCodes);
        return ResponseVO.success(skuService.selectProductsByRFIDCodes(rfidCodes));
    }

    //通过SpuCode获取商品列表
    //需要分页
    @RequestMapping(value = "/page/spu", method = RequestMethod.POST)
    public ResponseVO findProductsBySPUCode(@RequestBody ProductDTO query) {
        log.debug("通过SpuCode获取商品列表,参数 query{}", query);
        return skuService.page(query);
    }

    //-----------------------------------------END-------------------------------------------

}

