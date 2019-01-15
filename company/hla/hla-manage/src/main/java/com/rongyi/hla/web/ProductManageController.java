package com.rongyi.hla.web;

import com.rongyi.hla.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品管理控制器
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
@Controller
@RequestMapping("/product")
public class ProductManageController {
    @Autowired
    private ProductService productService;

//    @RequestMapping(value = "",method = RequestMethod.GET)
//    public String main() {
//        return "product/product.html";
//    }
}
