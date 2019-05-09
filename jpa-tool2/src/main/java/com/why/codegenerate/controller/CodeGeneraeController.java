package com.why.codegenerate.controller;

import com.why.codegenerate.manager.CodeGenerateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author why
 */
@RestController("/generate")
public class CodeGeneraeController {

    @Autowired
    private CodeGenerateUtils codeGenerateUtils;

    /**
     *
     * @param tableName
     * @param basePath
     * @param basePackage
     */
    @GetMapping("/table")
    public Object generateCode(String tableName,String basePath,String basePackage){
        try {
            codeGenerateUtils.buildCodeGenerateUtils(tableName,basePath,basePackage).generate();
        } catch (Exception e) {
            e.printStackTrace();
            return e;
        }
        return 1;
    }
}
