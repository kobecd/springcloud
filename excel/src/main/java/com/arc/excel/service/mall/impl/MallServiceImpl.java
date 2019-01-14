package com.arc.excel.service.mall.impl;

import com.arc.excel.mapper.*;
import com.arc.excel.model.entries.BaseModel;
import com.arc.excel.model.entries.mall.Mall;
import com.arc.excel.model.entries.mall.MallArea;
import com.arc.excel.model.entries.mall.MallQuestion;
import com.arc.excel.model.entries.mall.MallTask;
import com.arc.excel.model.entries.sys.SysFile;
import com.arc.excel.service.mall.MallService;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.List;

/**
 * @author: yechao
 * @date: 2018/12/26 11:31
 * @description:
 */
@Slf4j
@Service
public class MallServiceImpl implements MallService {


    @Resource
    private MallMapper mallMapper;

    @Resource
    private MallAreaMapper areaMapper;

    @Resource
    private MallQuestionMapper questionMapper;

    @Resource
    private MallTaskMapper taskMapper;

    @Resource
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
        log.debug("path--->{}" + file.getUrl());
        return importExcelToDb(file.getUrl());
    }

    /**
     * 解析excel
     *
     * @param path
     * @return
     */
    private Boolean importExcelToDb(String path) {
        //1整sheet页解析好还是   2 解析后直接返回list对象？
        Map<Integer, List<String>> rowsMap = getRowsMap(path);
//        String cell = getCellValue(rowsMap, 0, 1);
        int yIndex = rowsMap.size();

        //@todo 可能会溢出？
        int xIndex = rowsMap.get(0).size();

        System.out.println("xIndex--yIndex="+xIndex+"  "+ yIndex);
        System.out.println("xIndex--yIndex="+xIndex+"  "+ yIndex);
        System.out.println("xIndex--yIndex="+xIndex+"  "+ yIndex);
        System.out.println("xIndex--yIndex="+xIndex+"  "+ yIndex);
        //y 坐标比较准确， x坐标及其不准确
        xIndex = 190;


        //按行取值， 则按行 迭代，--列编号递增，即固定y，增大x
        for (int y = 0; y < yIndex; y++) {

            for (int x = 0; x < xIndex; x++) {
                System.out.println("坐标（x，y）：" + x + "," + y + "   " + getCellValue(rowsMap, x, y));

            }

//            System.out.println(getCellValue(rowsMap,69,i));
        }

        //注意 行列都是从0开始的  小心越界
        System.out.println("---------------------------------");
        System.out.println("按行取值, 则按行 迭代，--列编号递增，即固定y，增大x");

        System.out.print(getCellValue(rowsMap, 0, 0));
        System.out.print(getCellValue(rowsMap, 1, 0));
        System.out.print(getCellValue(rowsMap, 2, 0));
        System.out.print(getCellValue(rowsMap, 3, 0));
        System.out.print(getCellValue(rowsMap, 4, 0));
        System.out.print(getCellValue(rowsMap, 5, 0));
        System.out.print(getCellValue(rowsMap, 6, 0));
        System.out.print(getCellValue(rowsMap, 7, 0));
        System.out.println("\n---------------------------------");
        System.out.print(getCellValue(rowsMap, 0, 1));
        System.out.print(getCellValue(rowsMap, 1, 1));
        System.out.print(getCellValue(rowsMap, 2, 1));
        System.out.print(getCellValue(rowsMap, 3, 1));
        System.out.print(getCellValue(rowsMap, 4, 1));
        System.out.print(getCellValue(rowsMap, 5, 1));
        System.out.print(getCellValue(rowsMap, 6, 1));
        System.out.print(getCellValue(rowsMap, 7, 1));
        System.out.println("---------------------------------");
        System.out.println("  按列取值");
        System.out.println(getCellValue(rowsMap, 0, 0));
        System.out.println(getCellValue(rowsMap, 0, 1));
        System.out.println(getCellValue(rowsMap, 0, 2));
        System.out.println(getCellValue(rowsMap, 0, 3));
        System.out.println(getCellValue(rowsMap, 0, 4));

//        System.out.println(getCellValue(rowsMap,5,1));


        return true;
    }


//    /**
//     * 直接解析，返回数据集合，直接入库
//     *
//     * @param path
//     * @return
//     */
//    private  Map<BaseModel, List<Object>> getSheetToDomain(String path) {
//
//        // 打开指定位置的Excel文件
//        FileInputStream file = null;
//        try {
//            file = new FileInputStream(new File(path));
//            Workbook workbook = new XSSFWorkbook(file);
//
//            // 打开Excel中的第一个Sheet
//            Sheet sheet = workbook.getSheetAt(0);
//
//            // 读取Sheet中的数据  <key,value> <行数,<列数，值>>
//            Map<BaseModel, List<Object>> map = new HashMap<>();
//            Map<Integer, List<String>> data = new HashMap<>();
//
//            //i 表示行数 左上角为0行0列，坐标A1
//            int i = 0;
//            int x = 0;
//            for (Row row : sheet) { // 行
//                data.put(i, new ArrayList<String>());
//                for (Cell cell : row) { // 单元格
//                    switch (cell.getCellType()) { // 不同的数据类型
//                        //// 字符串类型
//                        case STRING:
//                            data.get(i).add(cell.getRichStringCellValue().getString());
//                            break;
//                        //数值类型
//                        case NUMERIC:
//                            if (DateUtil.isCellDateFormatted(cell)) {
//                                data.get(i).add(cell.getDateCellValue().toString());
//                                System.out.println("getDateCellValue------->" + cell.getDateCellValue());
//                            } else {
//                                System.out.println("数值类型 getNumericCellValue------->" + cell.getNumericCellValue());
//                                System.out.println("数值类型 ------->" + new Double(cell.getNumericCellValue()).toString());
//                                data.get(i).add(new Double(cell.getNumericCellValue()).toString());
//                            }
//                            break;
//                        //布尔类型
//                        case BOOLEAN:
//                            System.out.println("布尔类型 getBooleanCellValue------->" + cell.getBooleanCellValue());
//                            System.out.println("布尔类型  ------->" + new Boolean(cell.getBooleanCellValue()).toString());
//                            data.get(i).add(new Boolean(cell.getBooleanCellValue()).toString());
//                            break;
//                        //公式类型
//                        case FORMULA:
//                            data.get(i).add(cell.getCellFormula());
//                            break;
//                        //空白类型
//                        case BLANK:
//                            data.get(i).add("");
//                            break;
//                        default:
//                            //...;
//                            log.debug("进入了 default，行号={}", i);
//                            break;
//                    }
//                }
//                //https://www.cnblogs.com/jyyjava/p/8074322.html
//                //https://blog.csdn.net/holmofy/article/details/82532311
//                //https://www.baidu.com/baidu?wd=poi+excel+解析&tn=54002054_dg&ie=utf-8
//                i++;
//             x++;
//            }
//            log.debug("读取数据的行数={}，map大小=", i, data.size());
//
//
//            return data;
//        } catch (
//                FileNotFoundException e) {
//            e.printStackTrace();
//            return Collections.emptyMap();
//        } catch (IOException e) {
//            e.printStackTrace();
//            return Collections.emptyMap();
//        }
//    }

    /**
     * 获取页面中给定坐标的值
     *
     * @param rowsMap
     * @param x
     * @param y
     * @return
     */
    private String getCellValue(Map<Integer, List<String>> rowsMap, int x, int y) {
        try {
            return rowsMap.get(y).get(x);
        } catch (Exception e) {
            log.error("map中取({},{})值时候出错={}", x, y, e.getCause());
            return null;
        }
    }


    public static Map<Integer, List<String>> getRowsMap(String path) {

        // 打开指定位置的Excel文件
        FileInputStream file = null;
        try {
            file = new FileInputStream(new File(path));
            Workbook workbook = new XSSFWorkbook(file);

            // 打开Excel中的第一个Sheet
            Sheet sheet = workbook.getSheetAt(0);

            // 读取Sheet中的数据  <key,value> <行数,<列数，值>>
            Map<Integer, List<String>> data = new HashMap<>();

            //i 表示行数 左上角为0行0列，坐标A1
            int i = 0;
            for (Row row : sheet) { // 行
                data.put(i, new ArrayList<String>());
                for (Cell cell : row) { // 单元格
                    System.out.println("##############" + i + "#################");
                    System.out.println("getColumnIndex =" + cell.getColumnIndex());
                    System.out.println("getRowIndex =" + cell.getRowIndex());
                    System.out.println("getAddress =" + cell.getAddress());//A1=(0,0)
//                    System.out.println("getHyperlink =" + cell.getHyperlink());
//                    System.out.println("getCellType =" + cell.getCellType());//STRING
////                    System.out.println("getBooleanCellValue =" + cell.getBooleanCellValue());//Cannot get a BOOLEAN value from a STRING cell
////                    System.out.println("getDateCellValue =" + cell.getDateCellValue());// Cannot get a NUMERIC value from a STRING cell
////                    System.out.println("getCellFormula =" + cell.getCellFormula());// 	 Cannot get a FORMULA value from a STRING cell
//                    System.out.println("getCellComment =" + cell.getCellComment());
//                    System.out.println("字符串类型 CellType STRING=" + CellType.STRING);
//                    System.out.println("表达式类型 CellType FORMULA= " + CellType.FORMULA);
//                    System.out.println("数值类型 CellType NUMERIC= " + CellType.NUMERIC);
//                    System.out.println("布尔类型 CellType BLANK= " + CellType.BOOLEAN);
//                    System.out.println("空，不知道何时算空 CellType BLANK= " + CellType.BLANK);
//                    System.out.println("异常类型，不知道何时算异常  CellType ERROR= " + CellType.ERROR);
                    switch (cell.getCellType()) { // 不同的数据类型
                        //// 字符串类型
                        case STRING:
                            data.get(i).add(cell.getRichStringCellValue().getString());
                            break;
                        //数值类型
                        case NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                data.get(i).add(cell.getDateCellValue().toString());
                                System.out.println("getDateCellValue------->" + cell.getDateCellValue());

                            } else {
                                System.out.println("数值类型 getNumericCellValue------->" + cell.getNumericCellValue());
                                System.out.println("数值类型 ------->" + new Double(cell.getNumericCellValue()).toString());
                                data.get(i).add(new Double(cell.getNumericCellValue()).toString());
                            }
                            break;
                        //布尔类型
                        case BOOLEAN:
                            System.out.println("布尔类型 getBooleanCellValue------->" + cell.getBooleanCellValue());
                            System.out.println("布尔类型  ------->" + new Boolean(cell.getBooleanCellValue()).toString());
                            data.get(i).add(new Boolean(cell.getBooleanCellValue()).toString());
                            break;
                        //公式类型
                        case FORMULA:
                            data.get(i).add(cell.getCellFormula());
                            break;
                        //空白类型
                        case BLANK:
                            data.get(i).add("");
                            break;
                        default:
                            //...;
                            log.debug("进入了 default，行号={}", i);
                            break;
                    }
                }
                //https://www.cnblogs.com/jyyjava/p/8074322.html
                //https://blog.csdn.net/holmofy/article/details/82532311
                //https://www.baidu.com/baidu?wd=poi+excel+解析&tn=54002054_dg&ie=utf-8
                i++;
            }
            log.debug("读取数据的行数={}，map大小=", i, data.size());
            return data;
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
            return Collections.emptyMap();
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyMap();
        }
    }


    public static void main(String[] args) {
        Map<String, List<Object>> domainMap = new HashMap<String, List<Object>>();
        List<Mall> malls1 = new ArrayList<>();
        List<MallArea> areas1 = new ArrayList<>();
//        List<MallQuestion> questions1 = new ArrayList<>();
//        List<MallTask> tasks1 = new ArrayList<>();

        malls1.add(new Mall());
        malls1.add(new Mall());
        malls1.add(new Mall());

        areas1.add(new MallArea());
        areas1.add(new MallArea());
        areas1.add(new MallArea());
        areas1.add(new MallArea());

        System.out.println(malls1.size());
        System.out.println(areas1.size());

        domainMap.put(Mall.class.toString(), Collections.singletonList(malls1));
        domainMap.put(MallArea.class.toString(), Collections.singletonList(areas1));


        List<Object> malls = domainMap.get(Mall.class.toString());
        List<Object> areas = domainMap.get(MallArea.class.toString());
//        List<Object> questions = domainMap.get(MallQuestion.class.toString());
//        List<Object> tasks = domainMap.get(MallTask.class.toString());
//        List<Object> tasks = domainMap.get(MallTask.class.toString());

        System.out.println(malls);
        System.out.println(areas);
    }
}
