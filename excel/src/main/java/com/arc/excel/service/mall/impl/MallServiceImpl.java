package com.arc.excel.service.mall.impl;

import com.arc.excel.mapper.*;
import com.arc.excel.model.entries.mall.Mall;
import com.arc.excel.model.entries.sys.SysFile;
import com.arc.excel.service.mall.MallService;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: yechao
 * @date: 2018/12/26 11:31
 * @description:
 */
@Service
public class MallServiceImpl implements MallService {


    @Autowired
    private MallMapper mallMapper;

    @Autowired
    private MallAreaMapper areaMapper;

    @Autowired
    private MallQuestionMapper questionMapper;

    @Autowired
    private MallTaskMapper taskMapper;

    @Autowired
    private SysFileMapper fileMapper;

    @Override

    public Long save(Mall mall) {
        return mallMapper.save(mall) == 1 ? mall.getId() : null;
    }

    @Override
    public int delete(Long id) {
        return mallMapper.delete(id);
    }

    @Override
    @Transactional
    public int update(Mall mall) {
        return mallMapper.update(mall);
    }

    @Override
    public Mall get(Long id) {
        return mallMapper.get(id);
    }

    @Override
    public List<Mall> list() {
        return mallMapper.list();
    }

    @Override
    public Boolean importExcel(Long fileId) {
        SysFile file = fileMapper.get(fileId);
        String url = file.getUrl();
        System.out.println("path--->" + url);
        System.out.println("path--->" + url);
        System.out.println("path--->" + url);
        System.out.println("path--->" + url);
        System.out.println("path--->" + url);
        return importExcelToDb(file.getUrl());
    }

    /**
     * 解析excel
     *
     * @param path
     * @return
     */
    private Boolean importExcelToDb(String path) {


        // 打开指定位置的Excel文件
        FileInputStream file = null;
        try {
            file = new FileInputStream(new File(path));

            Workbook workbook = new XSSFWorkbook(file);

            // 打开Excel中的第一个Sheet
            Sheet sheet = workbook.getSheetAt(0);


            // 读取Sheet中的数据
            Map<Integer, List<String>> data = new HashMap<>();
            int i = 0;
            for (Row row : sheet) { // 行
                data.put(i, new ArrayList<String>());
                for (Cell cell : row) { // 单元格
                    switch (cell.getCellType()) { // 不同的数据类型
                        case STRING:
                            break; // 字符串类型
//                        case NUMERIC: ...break; // 数值类型
//                        case BOOLEAN: ...break; // 布尔类型
//                        case FORMULA: ...break; // 公式类型
//                        case BLANK: ...break; // 空白类型
                    }
                }
                //https://www.cnblogs.com/jyyjava/p/8074322.html
                //https://blog.csdn.net/holmofy/article/details/82532311
                //https://www.baidu.com/baidu?wd=poi+excel+解析&tn=54002054_dg&ie=utf-8
                i++;
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
