package com.arc.excel.controller.excel;

/**
 * @description: swagger3 导入
 * @author: yechao
 * @date: 2019/1/9 11:41
 */

import com.arc.excel.model.vo.ResponseVo;
import com.arc.excel.service.mall.MallService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by 程二狗 on 2018/10/12 0012
 * 测试为合并的多个单元格赋值，并为合并的单元格设置样式
 */
@Slf4j
@RestController
@RequestMapping("/excel/import")
public class ExcelImportController {

    @Autowired
    private MallService mallService;


    /**
     * 注意：同一行上的只能创建同一个行对象row  否则赋值的内容会被覆盖。
     */
    @GetMapping("/v1")
    public ResponseVo v1(@RequestParam Long id) {
        return ResponseVo.success(mallService.importExcel(id));
    }
}
