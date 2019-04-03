//package com.arc.util;
//
//import jxl.Workbook;
//import jxl.format.Border;
//import jxl.write.*;
//
//import java.io.*;
//import java.util.List;
//
//public class ReportInputOutputAction {
//        private String filePath="C:/Documents and Settings/Administrator/桌面",fileName="导出.xls";
//        private List list;
//        private ICustomer icust;
//        public String exportExcel(){
//            try {
//                OutputStream os;
//// 导出到excel
//                File file = new File(filePath);
//                if (!file.exists()) {
//                    file.mkdir();
//                }
//                os = new FileOutputStream(filePath + fileName);
//                WritableWorkbook wbook;
//                wbook = Workbook.createWorkbook(os);
//                WritableSheet wsheet = wbook.createSheet(fileName, 0); // Sheet1名字
//                WritableCellFormat wformat = new WritableCellFormat();// 表样式
//                wformat.setBorder(Border.ALL, BorderLineStyle.THIN);
//                WritableFont fontTitle = new WritableFont(WritableFont.TIMES,
//                        12, WritableFont.BOLD);
//                WritableCellFormat wformatTitle = new WritableCellFormat(
//                        fontTitle);// 表标题样式
//                wformatTitle.setBorder(Border.ALL, BorderLineStyle.THIN);
//// 添加元素
//                wsheet.addCell(new Label(0, 0, "客户类型", wformatTitle));
//                wsheet.addCell(new Label(1, 0, "行业类型", wformatTitle));
//                wsheet.addCell(new Label(2, 0, "省", wformatTitle));
//                wsheet.addCell(new Label(3, 0, "姓名", wformatTitle));
//                wsheet.addCell(new Label(4, 0, "性别", wformatTitle));
//                wsheet.addCell(new Label(5, 0, "学历", wformatTitle));
//                wsheet.addCell(new Label(6, 0, "民族", wformatTitle));
//                wsheet.addCell(new Label(7, 0, "单位", wformatTitle));
//                wsheet.addCell(new Label(8, 0, "办公电话", wformatTitle));
//                wsheet.addCell(new Label(9, 0, "手机", wformatTitle));
//                wsheet.addCell(new Label(10, 0, "职务", wformatTitle));
//                wsheet.addCell(new Label(11, 0, "网站/邮箱", wformatTitle));
//                wsheet.addCell(new Label(12, 0, "传真", wformatTitle));
//                wsheet.addCell(new Label(13, 0, "QQ/MSN", wformatTitle));
//                wsheet.addCell(new Label(14, 0, "地址", wformatTitle));
//                wsheet.addCell(new Label(15, 0, "邮编", wformatTitle));
//                wsheet.addCell(new Label(16, 0, "出生日期", wformatTitle));
//                wsheet.addCell(new Label(17, 0, "状态", wformatTitle));
//                wsheet.addCell(new Label(18, 0, "备注", wformatTitle));
//// 设置列宽
//                for(int i=0;i<19;i++){//共19列
//                    wsheet.setColumnView(i, 25);
//                }
//                int count = 1;
//                list=icust.findAll("Customer");
//                if(list!=null){
//                    System.out.println(list.size());
//                    for (int i = 0; i < list.size(); i++) {
//                        Customer customer=(Customer) list.get(i);
////	new Label(m,n,v,k)中m表示列，n表示行，v表示值，k表示单元格样式
//                        wsheet.addCell(new Label(0,count,customer.getCatype().getCaName(),wformat));
//                        wsheet.addCell(new Label(1, count,customer.getHytype().getCaName(), wformat));
//                        wsheet.addCell(new Label(2, count,customer.getPro().getProName(),wformat));
//                        wsheet.addCell(new Label(3, count,customer.getCustName(), wformat));
//                        wsheet.addCell(new Label(4,count,customer.getCustSex(),wformat));
//                        wsheet.addCell(new Label(5, count,customer.getCustDegree(), wformat));
//                        wsheet.addCell(new Label(6, count,customer.getCustRace(),wformat));
//                        wsheet.addCell(new Label(7, count,customer.getCustOrg(), wformat));
//                        wsheet.addCell(new Label(8, count,customer.getCustPhone(), wformat));
//                        wsheet.addCell(new Label(9, count,customer.getCustTel(),wformat));
//                        wsheet.addCell(new Label(10, count,customer.getCustPosition(), wformat));
//                        wsheet.addCell(new Label(11, count,customer.getCustEmail(), wformat));
//                        wsheet.addCell(new Label(12, count,customer.getCustFax(),wformat));
//                        wsheet.addCell(new Label(13, count,customer.getCustQqmsn(), wformat));
//                        wsheet.addCell(new Label(14, count,customer.getCustAddr(), wformat));
//                        wsheet.addCell(new Label(15, count,customer.getCustPostcode(),wformat));
//                        wsheet.addCell(new Label(16, count,customer.getCustBirth(), wformat));
//                        wsheet.addCell(new Label(17, count,customer.getCustStatus(), wformat));
//                        wsheet.addCell(new Label(18, count,customer.getCustInfo(),wformat));
//                        count++;
//                    }
//                }
//                wbook.write();
//                wbook.close();
//                os.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            return "success";
//        }
//
//        // 获得下载文件的内容，可以直接读入一个物理文件或从数据库中获取内容
//        public InputStream getInputStream() throws Exception {
//// 获得文件
//            File f1 = new File(filePath + fileName);
//            InputStream fis = new FileInputStream(f1);
//            byte[] content = new byte[fis.available()];
//            fis.read(content);
//// 和 Servlet 中不一样，这里我们不需对输出的中文转码为 ISO8859-1
//            return new ByteArrayInputStream(content);
//        }
//
//        // 对于配置中的 ${fileName}, 获得下载保存时的文件名
//        public String getFileName() {
//            try {
//// 中文文件名也是需要转码为 ISO8859-1，否则乱码
//                return new String(fileName.getBytes(), "ISO8859-1");
//            } catch (Exception e) {
//                return e.getMessage();
//            }
//        }
//        public String getFilePath() {
//            return filePath;
//        }
//        public void setFilePath(String filePath) {
//            this.filePath = filePath;
//        }
//        public void setFileName(String fileName) {
//            this.fileName = fileName;
//        }
//        public List getList() {
//            return list;
//        }
//        public void setList(List list) {
//            this.list = list;
//        }
//        public ICustomer getIcust() {
//            return icust;
//        }
//        public void setIcust(ICustomer icust) {
//            this.icust = icust;
//        }
////////////////struts.xml中的配置
//<action name="reportInputOutputAction"
//        class="actions.ReportInputOutputAction">
//<result name="success">
//        showCustomer.jsp
//                </result>
//</action>
//<action name="reportInputOutputExcel"
//        class="actions.OrderAction"
//        method="exportExcel">
//<result name="success" type="stream">
//<param name="contentType">
//        application/msexcel
//                </param>
//<param name="inputName">inputStream</param>
//<param name="contentDisposition">
//        attachment;filename="${fileName}"
//</param>
//<!--	bufferSize是fileStream 构造函数的参数，是设置文件流缓存区的大小-->
//<param name="bufferSize">4096</param>
//</result>
//</action>
//
//}
