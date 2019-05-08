package com.arc.security3.controller.test;

import com.arc.security3.domain.sys.SysUser;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.stubbing.StubMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * 向 WirMock 中添加相关测试接口
 *
 * @author 叶超
 * @since: 2019/5/7 21:23
 */
@RequestMapping("/mock")
@RestController
@Slf4j
public class MockClient {

    @PostMapping("")
    public Object update(@RequestBody WireMockMdle mock) {
        Object obj = mock.getObject();
        log.debug("参数 mock={}, ", mock.toString());
        log.debug("参数 mock={}, ", obj.toString());

        StubMapping stubMapping = WireMock.stubFor(WireMock.get(WireMock.urlEqualTo(mock.getUrl())).willReturn(ResponseDefinitionBuilder.like(ResponseDefinitionBuilder.jsonResponse(obj))));
        log.debug("结果={}", stubMapping);
        return stubMapping;
    }

    @GetMapping("/delete")
    public Object removeAll() {
        //连接服务器
        //清空
        WireMock.configureFor(8888);
        WireMock.removeAllMappings();
        return true;
    }


    public static void main(String[] args) {
        //连接服务器
        //清空
        WireMock.configureFor(8888);
        WireMock.removeAllMappings();

        //制作一个接口
        SysUser user = new SysUser();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setCreateDate(new Date());
        user.setId(1L);
        StubMapping stubMapping = WireMock.stubFor(WireMock.get(WireMock.urlEqualTo("/order/1")).willReturn(ResponseDefinitionBuilder.like(ResponseDefinitionBuilder.jsonResponse(user))));
        log.debug("结果={}", stubMapping);
    }

}

//测试工具Wiremock介绍
//WireMock是一个开源的测试工具，支持HTTP响应存根、请求验证、代理/拦截、记录和回放。最直接的用法：
//
//为Web/移动应用构建Mock Service
//快速创建Web API原型
//模拟Web Service中错误返回
//录制HTTP请求和回放
//
//
//1. 下载jar
//2. 运行起来  java -jar wiremock-1.57-standalone.jar –port 9999 --verbose
//更多参数，请至：http://wiremock.org/running-standalone.html。 把命令放在bat文件中比较方便）
