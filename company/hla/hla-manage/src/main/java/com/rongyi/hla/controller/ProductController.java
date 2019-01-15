package com.rongyi.hla.controller;

import com.rongyi.hla.agent.ProductAgent;
import com.rongyi.hla.service.product.ProductService;
import com.rongyi.model.product.Product;
import com.rongyi.utils.CacheUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品数据交互控制器
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */

@Api(value = "/product",description = "产品模块",produces = "application/json")
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductAgent productAgent;



    //CRUD--仅仅支持RU
    //根据id查找商品
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "获取指定id的商品", notes = "参数主键id")
    @ApiImplicitParam(name = "id", value = "id", required = true, paramType = "path", dataType = "Long")
    public Product findOneProduct(@PathVariable("id") Long id) {
        return productService.get(id);
    }


    //获取商品列表
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ApiOperation(value = "获取商品列表", notes = "返回所有的商品，注意商品数据量多时，考虑分页")
    public List<Product> findAllProduct() {
        return productService.list();
    }


    //更新商品
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ApiOperation(value = "更新商品", notes = "用application-json传输")
    public void modifyProduct(@RequestBody Product product) {
        productService.update(product);
    }


    //------------------------------------------------------------------------------------
    //@TODO 开发测试中用到的临时接口，待开发完成请移除
    //删除商品
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除指定id的商品", notes = "参数主键id")
    @ApiImplicitParam(name = "id", value = "id", required = true, paramType = "path", dataType = "Long")
    public void modifyProduct(@PathVariable("id") Long id) {
        productService.delete(id);
    }

    //保存商品
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ApiOperation(value = "保存商品", notes = "用application-json传输")
    public Long createProduct(@RequestBody Product product) {
      return   productService.save(product);
    }

    //注意： paramType 有五个可选值 ： path, query, body, header, form
    //------------------------------------------------------------------------------------


    @Autowired
    private CacheUtil cacheUtil;

    @RequestMapping(value = "/getAccessToken", method = RequestMethod.GET)
    public Object getAccessToken( ) {
//        boolean b = productAgent.pullProducts();
//        return b;

        String appId = "ntdf769391213117cc8c96ab767cced8";
        String appSecret = "ac1a3a209cf35dd6ddd7f4b527a22c7d";

        String token = cacheUtil.getAccessToken();
        System.out.println("###########"+token);
        return token;
    }

    @RequestMapping(value = "/key", method = RequestMethod.GET)
    public Object getkey( ) {
        String appId = "ntdf769391213117cc8c96ab767cced8";
        String appSecret = "ac1a3a209cf35dd6ddd7f4b527a22c7d";

        String key = cacheUtil.GetSignature(appId, appSecret);
        return key;
    }


    @RequestMapping(value = "/pull", method = RequestMethod.GET)
    public Object pull( ) {
        return productAgent.pullProducts();
    }

}
