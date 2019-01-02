package com.rongyi.hla.controller;

import com.rongyi.api.ResponseVO;
import com.rongyi.dto.query.SpuQueryDTO;
import com.rongyi.hla.service.product.SpuService;
import com.rongyi.model.product.ProductSpu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * spu控制器
 *
 * @author: yechao
 * @date: 2018/07/17 15:27
 * @version: V1.0
 */

@Slf4j
@RestController
@RequestMapping("/product/spu")
public class SpuController {

    @Autowired
    private SpuService spuService;


    //------------------------------------------后台管理支撑------------------------------------------
//一个分页展示spu 的接口  page with query(分组 groupCode， spuName)

//一个用spucode 查询详情的接口   get            spu+List<skus>

//上传图片接口
//还有个类目 接口

//开启、关闭、编辑---update

    /**
     * 分页条件查询spu
     * 注意：查询条件是spu的名称 模糊查询
     * 用指定(group_code)分组下的SPUs信息
     *
     * @return 结果集包装     List<ProductSpu>
     */

    @RequestMapping(value = "/page", method = RequestMethod.POST)
//    @ApiOperation(value = "产品spus", notes = "分页数据")
    public ResponseVO page(@RequestBody SpuQueryDTO query) {
        log.debug("查询参数{}", query);
        return spuService.page(query);
    }


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseVO get(@RequestParam String spuCode) {
        log.debug("查询参数spuCode{}", spuCode);
        return ResponseVO.success(spuService.getSpuWithSkus(spuCode));
    }


    //批量编辑(更新)商品
    //必填属性 spu_code state
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseVO batchUpdateProduct(@RequestBody List<ProductSpu> spus) {
        if (spus.size() == 0) {
            return ResponseVO.failure(20000, "spu更新错误状态");
        }
        log.debug("更新SPU状态是获取的spu的列表 {}，{}", spus.size(), spus);
        return ResponseVO.success(spuService.batchUpdate(spus));
    }

    //------------------------------------------------------------------------------------

}
