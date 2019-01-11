package com.arc.mybatis.controller.excel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Rubin
 * 2018/10/22 18:09
 */
public class FileWriteUtil {

    public void output(String filename,String str) {
        FileWriter fw;
        try {
            fw = new FileWriter(filename);
            fw.write(str, 0, str.length());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
