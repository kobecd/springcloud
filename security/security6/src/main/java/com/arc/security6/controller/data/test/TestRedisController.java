package com.arc.security6.controller.data.test;

import com.arc.security6.config.StaticFied;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.arc.security6.config.StaticFied.KEY_FOR_COOKIE;

/**
 * @author 叶超
 * @since: 2019/5/14 21:49
 */
@Slf4j
@RestController
@RequestMapping("/redis")
public class TestRedisController {

    @Resource
    private RedisTemplate<Object, Object> redisTemplate;


    @RequestMapping(value = "/set", method = {RequestMethod.GET, RequestMethod.POST})
    public void getVerifyImageV0(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // 生成  生成 key=/value=随机字串
//        String key = StaticFied.KEY_PRIFIX_FOR_VERIFY_CODE + UUID.randomUUID().toString().replace("-", "");
        Random random = new Random(System.currentTimeMillis());
        String verifyCode = random.nextInt(10000) + "";
        log.debug("---------------------------------------------");
        log.debug("{}位验证码={}", verifyCode.length(), verifyCode);
        log.debug("{}位验证码={}", verifyCode.length(), verifyCode);
        log.debug("{}位验证码={}", verifyCode.length(), verifyCode);
        log.debug("---------------------------------------------");

        String keyForRedisInCookie = null;

        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                if (StaticFied.KEY_FOR_COOKIE.equalsIgnoreCase(cookie.getName())) {
                    keyForRedisInCookie = cookie.getValue();
                    log.debug("####################################");
                    log.debug("keyForRedisInCookie结果={}", keyForRedisInCookie);
                    log.debug("####################################");
                    break;
                }
            }
        }
        String key = "abc";
        log.debug("###  redisTemplate.opsForValue().set --key={},value={}", key, verifyCode);
        System.out.println(redisTemplate);
        System.out.println(redisTemplate);
        redisTemplate.opsForValue().set(key, verifyCode, 600L, TimeUnit.SECONDS);

        Cookie cookie = new Cookie(KEY_FOR_COOKIE, key);
        cookie.setMaxAge(43200);// 单位是秒  12h
        cookie.setPath("/");
        response.addCookie(cookie);
        boolean write = ImageIO.write(VerifyCodeUtils.createVerifyImage(verifyCode), "jpg", response.getOutputStream());
        log.debug("返回图片结果={}", write);
    }


    @GetMapping(value = "/get/{key}")

    public Object getVerifyImageV0(@PathVariable String key) throws Exception {
        log.debug("---------------------------------------------");
        String verifyCode = (String) redisTemplate.opsForValue().get(key);
        log.info("redis get key={},value={}", key, verifyCode);
        log.debug("---------------------------------------------");
        return verifyCode;
    }
}
//sc create redis binpath= "\"C:\Software\server\Redis\redis-server.exe\" --service-run \"rdis.windows-service.conf\"" start= auto
//sc create redis binpath= "C:\Software\server\Redis\redis-server.exe"  start= auto