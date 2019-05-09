package com.arc.security6.controller.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 验证码封装
 *
 * @author 叶超
 * @since: 2019/5/9 21:26
 */
@Slf4j
@Setter
@Getter
@ToString
public class ImageCode implements Serializable {

    private BufferedImage image;

    private String code;

    /**
     * 过期时刻
     */
    private LocalDateTime expireTime;

    /**
     * @param image
     * @param code
     * @param expireSeconds
     */
    public ImageCode(BufferedImage image, String code, long expireSeconds) {
        this.image = image;
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireSeconds);
    }

    public static ImageCode createImageCode() {
        Random random = new Random(System.currentTimeMillis());
        String content = random.nextInt(10000)+"";
//        log.debug("结果={}", content);
//        log.debug("结果={}", content);
//        log.debug("结果={}", content);
        log.debug("随机数结果={}", content);
        log.debug("随机数结果={}", content);
        log.debug("随机数结果={}", content);
        log.debug("随机数结果={}", content);


        BufferedImage verifyImage = createVerifyImage(content);
        return new ImageCode(verifyImage, content + "", 600L);
    }


    public static BufferedImage createVerifyImage(String content) {
        log.debug("结果={}", content);
        log.debug("结果={}", content);
        log.debug("结果={}", content);
        log.debug("结果={}", content);
        // 表示一个图像，它具有合成整数像素的 8 位 RGB 颜色分量。
        if (content == null) {
            return null;
        }
        int width = 60;
        int height = 30;
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // 表示一个图像，它具有合成整数像素的 8 位 RGB 颜色分量。
        Graphics imgGraphics = img.getGraphics();
        int x = 5, y = 15;
        imgGraphics.drawString(content, x, y);


        //使用此图形上下文的当前字体和颜色绘制由指定 string 给定的文本。最左侧字符的基线位于此图形上下文坐标系的 (x, y) 位置处。
//        imgGraphics.setColor(Color.BLACK);



/*        for (int i = 0; i < 4; i++) {
            int a = random.nextInt(10);//取10以内的整数[0，9]
            int y = 10 + random.nextInt(20); //10~30范围内的一个整数，作为y坐标
            log.debug("结果={}", random);


//            Color c = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
//            imgGraphics.setColor(c);
        }*/
//        //干扰线
//        int lines = 10;
//        for (int i = 0; i < lines; i++) {
//            Color c = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
//            imgGraphics.setColor(c);
//            imgGraphics.drawLine(random.nextInt(width), random.nextInt(height), random.nextInt(width), random.nextInt(height));
//        }
        imgGraphics.dispose();
        return img;
    }

    public static boolean verifyImage() throws FileNotFoundException, IOException {
        Random random = new Random(System.currentTimeMillis());

        int width = 60;
        int height = 30;

        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);


        // 表示一个图像，它具有合成整数像素的 8 位 RGB 颜色分量。
        Graphics imgGraphics = img.getGraphics();

        //设置背景色
        imgGraphics.setColor(Color.white);
        imgGraphics.fillRect(0, 0, width, height);//画背景
        //填充指定的矩形。使用图形上下文的当前颜色填充该矩形

        //设置字体
        imgGraphics.setFont(new Font("宋体", Font.BOLD, 18));

        //随机数字
        for (int i = 0; i < 4; i++) {
            int a = random.nextInt(10);//取10以内的整数[0，9]
            int y = 10 + random.nextInt(20); //10~30范围内的一个整数，作为y坐标
            Color c = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
            imgGraphics.setColor(c);
            imgGraphics.drawString("" + a, 5 + i * width / 4, y);
        }
//        //干扰线
//        int lines = 10;
//        for (int i = 0; i < lines; i++) {
//            Color c = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
//            imgGraphics.setColor(c);
//            imgGraphics.drawLine(random.nextInt(width), random.nextInt(height), random.nextInt(width), random.nextInt(height));
//        }


        // 类似于流中的close()带动flush()---把数据刷到img对象当中
        //释放此图形的上下文以及它使用的所有系统资源。调用 dispose 之后，就不能再使用 Graphics 对象。
        imgGraphics.dispose();
        boolean write = ImageIO.write(img, "jpg", new FileOutputStream("/img.jpg"));
        //使用支持给定格式的任意 ImageWriter 将一个图像写入 File。
        return write;
    }


    public static boolean imgDemo1(String content) throws FileNotFoundException, IOException {
        if (content == null) {
            return false;
        }
        BufferedImage img = new BufferedImage(60, 30, BufferedImage.TYPE_INT_RGB);
        // 表示一个图像，它具有合成整数像素的 8 位 RGB 颜色分量。
        Graphics imgGraphics = img.getGraphics();
        //使用此图形上下文的当前字体和颜色绘制由指定 string 给定的文本。最左侧字符的基线位于此图形上下文坐标系的 (x, y) 位置处。
        imgGraphics.drawString(content, 8, 15);
        // 类似于流中的close()带动flush()---把数据刷到img对象当中
        //释放此图形的上下文以及它使用的所有系统资源。调用 dispose 之后，就不能再使用 Graphics 对象。
        imgGraphics.dispose();
        boolean write = ImageIO.write(img, "jpg", new FileOutputStream("/img.jpg"));
        //使用支持给定格式的任意 ImageWriter 将一个图像写入 File。
        return write;
    }

    public void ImgDemo2() throws FileNotFoundException, IOException {
        int width = 80;
        int height = 40;
        int lines = 10;
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Graphics g = img.getGraphics();

        //设置背景色
        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);//画背景
        //填充指定的矩形。使用图形上下文的当前颜色填充该矩形

        //设置字体
        g.setFont(new Font("宋体", Font.BOLD, 18));

        //随机数字
        Date d = new Date();
        //System.out.println(d.getTime());
        Random r = new Random(d.getTime());
        for (int i = 0; i < 4; i++) {
            int a = r.nextInt(10);//取10以内的整数[0，9]
            int y = 10 + r.nextInt(20); //10~30范围内的一个整数，作为y坐标
            Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
            g.setColor(c);
            g.drawString("" + a, 5 + i * width / 4, y);
        }
//        //干扰线
//        for (int i = 0; i < lines; i++) {
//            Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
//            g.setColor(c);
//            g.drawLine(r.nextInt(width), r.nextInt(height), r.nextInt(width), r.nextInt(height));
//        }

        g.dispose();//类似于流中的close()带动flush()---把数据刷到img对象当中
        ImageIO.write(img, "JPG", new FileOutputStream("img/b.jpg"));

    }


    private static char mapTable[] = {
            '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', '0', '1',
            '2', '3', '4', '5', '6', '7',
            '8', '9'};

    public static Map<String, Object> getImageCode(int width, int height, OutputStream os) {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        if (width <= 0) width = 60;
        if (height <= 0) height = 20;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // 获取图形上下文
        Graphics g = image.getGraphics();
        //生成随机类
        Random random = new Random();
        // 设定背景色
        g.setColor(getRandColor(200, 250));
        g.fillRect(0, 0, width, height);
        //设定字体
        g.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        // 随机产生168条干扰线，使图象中的认证码不易被其它程序探测到
        g.setColor(getRandColor(160, 200));
        for (int i = 0; i < 168; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            g.drawLine(x, y, x + xl, y + yl);
        }
        //取随机产生的码
        String strEnsure = "";
        //4代表4位验证码,如果要生成更多位的认证码,则加大数值
        for (int i = 0; i < 4; ++i) {
            strEnsure += mapTable[(int) (mapTable.length * Math.random())];
            // 将认证码显示到图象中
            g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
            // 直接生成
            String str = strEnsure.substring(i, i + 1);
            // 设置随便码在背景图图片上的位置
            g.drawString(str, 13 * i + 20, 25);
        }
        // 释放图形上下文
        g.dispose();
        returnMap.put("image", image);
        returnMap.put("strEnsure", strEnsure);
        return returnMap;
    }

    //给定范围获得随机颜色
    static Color getRandColor(int fc, int bc) {
        Random random = new Random();
        if (fc > 255) fc = 255;
        if (bc > 255) bc = 255;
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }

    public static void main(String[] args) throws IOException {
//        imgDemo1("16854");
//        verifyImage();

        BufferedImage verifyImage = createVerifyImage("a1234");
        boolean write = ImageIO.write(verifyImage, "jpg", new FileOutputStream("/img.jpg"));
        log.info("结果={}", write);
        log.info("结果={}", write);
        log.info("结果={}", write);
        log.info("结果={}", write);
    }
}
