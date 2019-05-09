package com.arc.generator;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class TestB {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TestB.class);

    public static void main(String[] args) {
        // step1 创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {

            File file = ResourceUtils.getFile("classpath:templates");


            // step2 获取模版路径
            configuration.setDirectoryForTemplateLoading(file);
            // step3 创建数据模型
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("package", "com.arc.model;");
            dataMap.put("clz", "DatasourceInfo");
            dataMap.put("id", "id");
            dataMap.put("a", "a");
            dataMap.put("b", "b");
            // step4 加载模版文件
            Template template = configuration.getTemplate("test.ftl");
            // step5 生成数据
            File targetFile = new File("C:\\Users\\X\\Desktop\\Zan\\git\\arc\\server-db\\jpa-tool\\src\\main\\java\\com\\arc\\model"+File.separator+"DatasourceInfo.java");

            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(targetFile)));
            // step6 输出文件
            template.process(dataMap, out);
            log.debug("：)  文件创建成功 !");













        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}