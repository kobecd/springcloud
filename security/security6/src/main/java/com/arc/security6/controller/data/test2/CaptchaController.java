package com.arc.security6.controller.data.test2;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Instant;
import java.util.Map;

import static java.time.temporal.ChronoField.NANO_OF_SECOND;

/**
 *  该Api能够直接获取到验证码图片
 */
@Controller
@RequestMapping("/v1/verify")
public class CaptchaController {
    /**
     * 用于生成带四位数字验证码的图片
     */
    @RequestMapping(value = "/captcha")
    @ResponseBody
    public String imagecode(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");
        OutputStream os = response.getOutputStream();
        //返回验证码和图片的map
        Map<String,Object> map = Captcha.getImageCode(86, 37, os);
        request.getSession().setAttribute("simpleCaptcha", map.get("strEnsure").toString().toLowerCase());
        request.getSession().setAttribute("codeTime", System.currentTimeMillis());
        try {
            ImageIO.write((BufferedImage) map.get("image"), "jpg", os);
        } catch (IOException e) {
            return "";
        }   finally {
            if (os != null) {
                os.flush();
                os.close();
            }
        }
        return null;
    }

    /**
     * @param checkCode 前端用户输入返回的验证码
     * 参数若需要，自行添加
     */
    @RequestMapping(value = "/verify")
    @ResponseBody
    public String checkcode(HttpServletRequest request,                            HttpSession session,                            String checkCode) throws Exception {

        // 获得验证码对象
        Object cko = session.getAttribute("simpleCaptcha");
        if (cko == null) {
            request.setAttribute("errorMsg", "请输入验证码！");
            return "请输入验证码！";
        }
        String captcha = cko.toString();
        // 判断验证码输入是否正确
        if (StringUtils.isEmpty(checkCode) || captcha == null || !(checkCode.equalsIgnoreCase(captcha))) {
            request.setAttribute("errorMsg", "验证码错误！");
            return "验证码错误，请重新输入！";
            // 验证码有效时长为1分钟   System.currentTimeMillis()-
//            Long codeTime = Long.valueOf(session.getAttribute("codeTime") + "");
        }
//        else if ((System.currentTimeMillis()- codeTime) / 1000 / 60 > 1) {
//            request.setAttribute("errorMsg", "验证码已失效，请重新输入！");
//            return "验证码已失效，请重新输入！";
//        }
        else {
            // 在这里可以处理自己需要的事务，比如验证登陆等
            return "验证通过！";
        }
    }

    public static void main(String[] args) {
        long aLong = Instant.now().getLong(NANO_OF_SECOND);
        System.out.println(aLong);
        System.out.println(aLong);
        System.out.println(aLong);
    }
}
