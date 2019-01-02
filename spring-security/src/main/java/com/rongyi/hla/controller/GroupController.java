package com.rongyi.hla.controller;

import com.rongyi.api.ResponseVO;
import com.rongyi.hla.service.product.GroupService;
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
@RestController
@RequestMapping("/product/group")
public class GroupController {

    @Autowired
    private GroupService groupService;


    /**
     * 全部产品分类(组)表
     *
     * @return 结果集包装     List<ProductGroup>
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseVO findAllProductGroup() {
        return ResponseVO.success(groupService.list());
    }

}
