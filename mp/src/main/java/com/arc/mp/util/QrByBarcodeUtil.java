package com.arc.mp.util;


import org.krysalis.barcode4j.impl.code39.Code39Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

import java.awt.image.BufferedImage;
import java.io.*;

/**
 * @version:V1.0 备注：
 * 1.静态代码块的作用：当类被载入时，静态代码块被执行，且只被执行一次，静态块常用来执行类属性的初始化。
 * 2.常量条形码的高度和字体大小设置很重要，若是设置小了会看不到设置的文件
 */
public class QrByBarcodeUtil {


    public static void generate(String msg, OutputStream outputStream) throws IOException {
        Code39Bean bean = new Code39Bean();
        // 精细度
        final int dpi =500 ;
        // module宽度
//        final double moduleWidth = UnitConv.in2mm(1.0f / dpi);
        bean.setWideFactor(3);
        bean.doQuietZone(true);
        BitmapCanvasProvider canvas = new BitmapCanvasProvider(outputStream, "image/png", dpi,  BufferedImage.TYPE_BYTE_BINARY, false, 0);
        bean.generateBarcode(canvas, msg);
        canvas.finish();
    }

    public static void main(String[] args) throws IOException {
        String msg = "z.cn";
        String path = "T:\\P\\123.PNG";
        generate(msg, new FileOutputStream(path));
//        InputStream is = CodeService.getInstance().getCodeImage("Tiantian,I love you!", CodeService.BARCODE_TYPE );
//        saveFile(is, "D:/barcode4j.png");
    }

//
//    public static void saveFile(InputStream is, String fileName) throws Exception {
//        FileOutputStream fos = new FileOutputStream(new File(fileName));
//        byte[] b = new byte[1024];
//        while((is.read(b)) != -1){
//            fos.write(b);
//        }
//        is.close();
//        fos.close();
//    }
//
//
//

//
//    public static void qr() throws Exception{
//        CodabarBean codabarBean = new CodabarBean();
//        String msg = "http://www.baidu.com";
//
//        CanvasProvider can = new Java2DCanvasProvider(Graphics2D)
//        codabarBean.generateBarcode(can,msg);
////        qrcode.setQrcodeErrorCorrect('M');//纠错等级（分为L、M、H三个等级）
////        qrcode.setQrcodeEncodeMode('B');//N代表数字，A代表a-Z，B代表其它字符
////        qrcode.setQrcodeVersion(7);//版本
//        //生成二维码中要存储的信息
//        //设置一下二维码的像素
//        int width = 300;
//        int height = 300;
//        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//        //绘图
//        Graphics2D gs = bufferedImage.createGraphics();
//        gs.setBackground(Color.WHITE);
//        gs.setColor(Color.BLACK);
//        gs.clearRect(0, 0, width, height);//清除下画板内容
//
//        //设置下偏移量,如果不加偏移量，有时会导致出错。
//        int pixoff = 2;
//
//        gs.dispose();
//        bufferedImage.flush();
//        ImageIO.write(bufferedImage, "png", new File("E:/code/qrcode.png"));
//    }

}
