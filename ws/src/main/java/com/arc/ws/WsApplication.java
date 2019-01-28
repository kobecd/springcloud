package com.arc.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsApplication.class, args);
    }

}

//ws://malebazi.com/adaptor/saleclue/call/eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vdWNjYy5jYyIsInRlbmFudElkIjo0NywidWlkIjoxMTYwMSwiZXhwIjozNjc0NjQxMTc3LCJpYXQiOjE1MjcxNTc1MzB9.2f_oRHkh7zzxTwGxo_FQkZfLD4bAy50YfUA-nctdHuM
//
// 为访问路径,websocket 支持路径参数,最后面长串为加密的字符串,服务端接受到后可以拿来解析!
