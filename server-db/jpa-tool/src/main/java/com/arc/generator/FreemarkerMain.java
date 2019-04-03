package com.arc.generator;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class FreemarkerMain {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(FreemarkerMain.class);
//    private static final String TEMPLATE_PATH = "src/main/java/com/freemark/hello/templates";
//    private static final String TEMPLATE_PATH = "src/main/java/com/arc/templates";


//    private static final String TEMPLATE_PATH = "C:\\Users\\X\\Desktop\\Zan\\git\\arc\\server-db\\jpa-tool\\src\\main\\java\\com\\arc\\templates";
    private static final String CLASS_PATH = "C:\\Users\\X\\Desktop\\Zan\\git\\arc\\server-db\\jpa-tool\\src\\main\\java\\com\\arc\\model";

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
            dataMap.put("classPath", "package com.arc.model;");
            dataMap.put("className", "DatasourceInfo");
            dataMap.put("Id", "Id");
            dataMap.put("userName", "userName");
            dataMap.put("password","password");//在此表达式中检测到“密码”，请查看此可能是硬编码的凭据。 更多..
            // step4 加载模版文件
            Template template = configuration.getTemplate("test.ftl");
            // step5 生成数据
            File docFile = new File(CLASS_PATH + "\\" + "DatasourceInfo.java");
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
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