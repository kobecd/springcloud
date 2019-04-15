package com.arc.mp.controller;


import org.krysalis.barcode4j.impl.code39.Code39Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.krysalis.barcode4j.tools.UnitConv;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @version:V1.0 备注：
 * 1.静态代码块的作用：当类被载入时，静态代码块被执行，且只被执行一次，静态块常用来执行类属性的初始化。
 * 2.常量条形码的高度和字体大小设置很重要，若是设置小了会看不到设置的文件
 */
public class QRController {

    public static byte[] generate(String msg) throws IOException {
        ByteArrayOutputStream ous = new ByteArrayOutputStream();
        generate(msg, ous);
        return ous.toByteArray();
    }

    public static void generate(String msg, OutputStream ous) throws IOException {
        Code39Bean bean = new Code39Bean();
        // 精细度
        final int dpi = 150;
        // module宽度
        final double moduleWidth = UnitConv.in2mm(1.0f / dpi);
        bean.setModuleWidth(moduleWidth);
        bean.setWideFactor(3);
        bean.doQuietZone(false);
        String format = "image/png";
        BitmapCanvasProvider canvas = new BitmapCanvasProvider(ous, format, dpi, BufferedImage.TYPE_BYTE_BINARY, false, 0);
        bean.generateBarcode(canvas, msg);
        canvas.finish();
    }

    public static void main(String[] args) {
        String msg = "123456789";
        String path = "barcode.png";
        generate(msg, path);

    }
}
