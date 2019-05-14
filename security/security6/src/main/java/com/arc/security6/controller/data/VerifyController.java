package com.arc.security6.controller.data;

import com.arc.security6.config.StaticFied;
import com.arc.security6.controller.data.test.Code;
import com.arc.security6.controller.data.test.VerifyCodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.arc.security6.config.StaticFied.KEY_FOR_COOKIE;

/**
 * @author 叶超
 * @since 2019/5/9 12:54
 */
@Slf4j
@Controller
@RequestMapping("/verify")
public class VerifyController {


    @Resource
    private RedisTemplate<Object, Object> redisTemplate;

    private static final String VERIFY_IMAGE_PREFIX = "VERIFY_IMAGE";

//    private SessionStrategy sessionStrategy=new HttpSessionStrategy()

    /**
     * 验证码的图片生成
     */
    @RequestMapping(value = "/code", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public void getVerifyImageV0(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 60);
        response.setContentType("image/jpeg");

        // 生成  生成 key=/value=随机字串
//        String key = StaticFied.KEY_PRIFIX_FOR_VERIFY_CODE + UUID.randomUUID().toString().replace("-", "");
        Random random = new Random(System.currentTimeMillis());
        String verifyCode = random.nextInt(10000) + "";
        String keyForRedisInCookie = null;
        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                if (StaticFied.KEY_FOR_COOKIE.equalsIgnoreCase(cookie.getName())) {
                    keyForRedisInCookie = cookie.getValue();
                    break;
                }
            }
        }
        String key = keyForRedisInCookie;
        redisTemplate.opsForValue().set(key + 1, verifyCode, 600L, TimeUnit.SECONDS);

        Cookie cookie = new Cookie(KEY_FOR_COOKIE, key);
        cookie.setMaxAge(43200);// 单位是秒  12h
        cookie.setPath("/");
        response.addCookie(cookie);
        boolean write = ImageIO.write(VerifyCodeUtils.createVerifyImage(verifyCode), "jpg", response.getOutputStream());
        log.debug("返回图片结果={}", write);

    }

    @RequestMapping(value = "/code/v1", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public void getVerifyImageV1(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // 生成验证码信息并放入session，【根据系统架构session共享】
        //返回图片给client
        //下次来访问后端时候去验证用户身份的时候获取图片
//        VerifyImageCode image =);
        //
        String verifyCode = VerifyCodeUtils.getRandomVerifyCode(4);
        BufferedImage verifyImage = VerifyCodeUtils.createVerifyImage(verifyCode);


        //操作字符串
        String key = VERIFY_IMAGE_PREFIX + request.getAttribute("username");
        String code = "1234";
        Code testRedis = new Code(code);
        //        this.expireTime = LocalDateTime.now().plusSeconds(expireSeconds);
        log.debug("redisTemplate={}, key={}，value={}", redisTemplate, key, testRedis);
        //保存
        redisTemplate.opsForValue().set(key, testRedis);
        redisTemplate.opsForValue().set(key + 1, testRedis, 600L, TimeUnit.SECONDS);//        redisTemplate.opsForValue().set(Object k, Object v, long l, TimeUnit timeUnit)
        // 取值
        Code code1 = (Code) redisTemplate.opsForValue().get(key);
        log.debug("结果={}", code1);
        log.debug("结果={}", (Code) redisTemplate.opsForValue().get(key + 1));
//        Assert.notNull(fromRedis, "redisTemplate.opsForValue().get(key)");
        boolean write = ImageIO.write(verifyImage, "jpg", response.getOutputStream());
        log.debug("返回图片结果={}", write);
    }


}
