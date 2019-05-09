package com.arc.security6.controller.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

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
    public void getVerifyImage(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // 生成验证码信息并放入session，【根据系统架构session共享】
        //返回图片给client
        //下次来访问后端时候去验证用户身份的时候获取图片
        ImageCode imageCode = ImageCode.createImageCode();
        //操作字符串
        String key = VERIFY_IMAGE_PREFIX + request.getAttribute("username");

        TestRedis testRedis = new TestRedis(imageCode.getCode());


        log.debug("redisTemplate={}, key={}，value={}", redisTemplate,key, testRedis);


        //保存
        redisTemplate.opsForValue().set(key, testRedis);
        redisTemplate.opsForValue().set(key + 1, testRedis, 600L, TimeUnit.SECONDS);//        redisTemplate.opsForValue().set(Object k, Object v, long l, TimeUnit timeUnit)
        // 取值
        TestRedis testRedis1 = (TestRedis) redisTemplate.opsForValue().get(key);
        log.debug("结果={}", testRedis1);
        log.debug("结果={}", (TestRedis) redisTemplate.opsForValue().get(key + 1));
//        Assert.notNull(fromRedis, "redisTemplate.opsForValue().get(key)");

        boolean write = ImageIO.write(imageCode.getImage(), "jpg", response.getOutputStream());
        log.debug("返回图片结果={}", write);
    }


    /**
     * 验证图片是否输入正确
     *
     * @return
     */
    public boolean verifyImage() {


        return true;
    }


}
