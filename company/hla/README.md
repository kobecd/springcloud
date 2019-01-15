#本项目为maven管理依赖的多模块项目
其中
模块“hla-common”定义公共依赖
模块“hla-manage”与mysql的”hla“数据库交互，提供接口

注意：
1、商品的价格假定是人民币1.00元，数据入库保存为100，单位：元，出库的时候在sql中缩小了100倍，
      private Integer price=0; // sku显示价格（100X转换在sql中做了）
2、private boolean state=false;  对应数据库是tinyint，数据库默认值给的是0，注意：spu商品状态  0=false、1=true
3、
4、

