/*
package com.arc.generator;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Component
public class FreemarkerGenerator implements InitializingBean {

    private static final Logger logger = LoggerFactory.getLogger(FreemarkerGenerator.class);

    private static final String JAVA_FILE_SUFFIX = ".java";

    private static final String MAPPER_FILE_SUFFIX = ".xml";

    public String outputPath;

    public Map<String, Object> dataModel;


    String javaPackage="package com.arc.model";


    @Autowired
    private Configuration configuration;

    @Override
    public void afterPropertiesSet() throws Exception {
        dataModel = new HashMap<>(40);

        File curDir = new File(this.getClass().getClassLoader().getResource(".").getPath());
        File outDir = new File(curDir.getParent() + "/output");
        if (!outDir.exists()) {
            outDir.mkdirs();
        }

        outputPath = outDir.getPath();

    }


    // generate java model class
    private void generateModel(TableMeta meta) throws Exception {
        Template template = configuration.getTemplate("model.ftl");
        logger.info("Use template file: {}. ", template.getName());

        String className = meta.getClassName();

        dataModel.put("meta", meta);
        dataModel.put("javaPackage", javaPackage);

        File javaFile = createFileDir(className + JAVA_FILE_SUFFIX);
        template.process(dataModel, new FileWriter(javaFile));
    }



    // generate mybatis mapper xml
    private void generateMapper(TableMeta meta) throws Exception {
        Template template = configuration.getTemplate("mapper.ftl");

        dataModel.put("meta", meta);
        dataModel.put("javaPackage", javaPackage);

        File mapperFile = createFileDir(meta.getMapperName() + MAPPER_FILE_SUFFIX);
        template.process(dataModel, new FileWriter(mapperFile));
    }

    private File createFileDir(String fileName) throws IOException {
        File newFile = new File(outputPath + "//" + fileName);
        if (!newFile.exists()) {
            newFile.createNewFile();
        }
        return newFile;
    }

    public void main(String[] args) throws Exception {
        // step1 创建freeMarker配置实例
        Writer out = null;

        File file = ResourceUtils.getFile("classpath:templates");


        // step2 获取模版路径
        configuration.setDirectoryForTemplateLoading(file);
        // step3 创建数据模型
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("classPath", "package com.arc.model;");
        // step4 加载模版文件
        Template template = configuration.getTemplate("test.ftl");
        // step5 生成数据
        File docFile = new File(outputPath + "\\" + "DatasourceInfo.java");
        out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
        // step6 输出文件

    }

}
*/
