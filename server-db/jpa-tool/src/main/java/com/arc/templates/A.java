package com.arc.templates;

import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @description:
 * @author: yechao
 * @date: 2018/10/16 16:41
 */
public class A {

    public static void main(String[] args) throws FileNotFoundException {
        String path = ClassUtils.getDefaultClassLoader().getResource("").getPath();
        System.out.println(path);///C:/Users/X/Desktop/Zan/git/arc/server-db/jpa-tool/target/classes/


//        ApplicationHome home = new ApplicationHome(getClass());
//        File jarFile = home.getSource();

            File file = new File(ResourceUtils.getURL("classpath:").getPath());
            System.out.println(file.getPath());

            System.out.println(ResourceUtils.getURL("/").getPath());

//            if (targetFile.exists()) {
//                boolean mkdir = targetFile.mkdir();
//                log.debug("targetFile 缺失  {}",mkdir);
//            }



        //
        File file2 = ResourceUtils.getFile("classpath:templates/test.ftl");

        System.out.println(file2.getName());
        if(file2.exists()){
            File[] files = file2.listFiles();
            if(files != null){
                for(File childFile:files){
                    System.out.println(childFile.getName());//model.ftl
                }
            }
        }
    }
}
