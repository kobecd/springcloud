package com.why.codegenerate.manager;

import com.why.codegenerate.model.DatasourceInfo;
import com.why.codegenerate.model.PagePathInfo;

/**
 * @author why
 */
public class CodeGenFactory {
    private DatasourceInfo datasourceInfo;
    private PagePathInfo pagePathInfo;

    /**
     * 输入数据库信息
     *
     * @param datasourceInfo 数据库信息
     * @return 当前对象
     */
    public CodeGenFactory buildData(DatasourceInfo datasourceInfo) {
        this.datasourceInfo = datasourceInfo;
        return this;
    }

    public void genCodes(PagePathInfo... pagePathInfos) {
        try {
            if (datasourceInfo != null) {
                for (int index = 0, max = pagePathInfos.length; index < max; index++) {
                    CodeGenManager codeGenManager = new CodeGenManager();
                    codeGenManager.buildGene(pagePathInfos[index], datasourceInfo);
                    //创建dao 参数 包路径 表名称
                    codeGenManager.generateDao(codeGenManager.getBusinessBasePath(), codeGenManager.getChangeTableName());
                    //生成业务逻辑代码
                    codeGenManager.generate(codeGenManager.getDiskPath(), codeGenManager.getChangeTableName());
                }
            } else {
                for (int index = 0, max = pagePathInfos.length; index < max; index++) {
                    CodeGenManager codeGenManager = new CodeGenManager();
                    codeGenManager.buildCodeGenerateUtils(pagePathInfos[index]);
                    codeGenManager.generateDao(codeGenManager.getBusinessBasePath(), codeGenManager.getChangeTableName());
                    codeGenManager.generate(codeGenManager.getDiskPath(), codeGenManager.getChangeTableName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("生成代码失败");
        }
    }
}
