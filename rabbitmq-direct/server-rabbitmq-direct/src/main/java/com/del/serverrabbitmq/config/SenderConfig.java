package com.del.serverrabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConfig {

    @Bean
    public Queue queue() {
//        return new Queue("queue_string");
//        Long a=12345678912345678900L;
        return new Queue("queue_obj");
    }

    public static void main(String[] args) {

        System.out.println(Long.MAX_VALUE);//        9223372036854775807
        System.out.println(Float.MAX_VALUE);//        3.4028235E38
        System.out.println("9223372036854775807".length());//19

    }

}
