package com.arc.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
@RestController
@SpringBootApplication
public class RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

    @Autowired
    private RedisTemplate redisTemplate;


//    、、https://blog.csdn.net/ruby_one/article/details/79141940

    /**
     * 向redis中写入String
     * http://localhost:9001/string/set?key=a&value=aaaa
      * @param key
     * @param value
     * @return
     */
    @GetMapping("/string/set")
    public Object setString(@RequestParam String key,@RequestParam String value) {
        log.debug("----------------------------------");
        System.out.println(redisTemplate);
        //操作字符串
        redisTemplate.opsForValue().set(key, value);

        log.debug("----------------------------------");
        return LocalDate.now();
    }

    /**
     * http://localhost:9001/string/get?key=a
     * @param key
     * @return
     */
    @GetMapping("/string/get")
    public Object getString(@RequestParam String key) {
        log.debug("-------->get");
        System.out.println(redisTemplate);
        //操作字符串
        Object obj = redisTemplate.opsForValue().get(key);
        return obj;
    }

}
