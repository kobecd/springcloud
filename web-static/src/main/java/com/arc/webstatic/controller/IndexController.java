package com.arc.webstatic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 页面资源跳转控制器
 *
 * @author: yechao
 * @date: 2019/1/4 9:16
 */
@Controller
public class IndexController {
    /**
     ·@author：作者。
     ·@version：版本。
     ·@docroot：表示产生文档的根路径。
     ·@deprecated：不推荐使用的方法。
     ·@param：方法的参数类型。
     ·@return：方法的返回类型。
     ·@see：用于指定参考的内容。
     ·@exception：抛出的异常。
     ·@throws：抛出的异常，和exception同义
     * @param args
     */
    @RequestMapping("/")
    public String main(String[] args) {
        return "index.html";
    }
}
