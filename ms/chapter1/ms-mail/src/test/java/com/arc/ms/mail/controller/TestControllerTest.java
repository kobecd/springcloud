package com.arc.ms.mail.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author: yechao
 * @since: 2019/1/29 14:30
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {


    private MockMvc mockMvc;


    @Before
    public void before() {
        log.info("###结果={}",System.currentTimeMillis());
        this.mockMvc = MockMvcBuilders.standaloneSetup(new TestControllerTest()).build();
    }
    @Test
    public void t1() throws Exception {
        log.info("###结果={}",System.currentTimeMillis());
        RequestBuilder req = MockMvcRequestBuilders.get("/test/v2");
        mockMvc.perform(req).andExpect(status().isOk()).andExpect(content().string("v2"));
    }

    @After
    public void after() {
        log.info("###结果={}",System.currentTimeMillis());
    }



}
