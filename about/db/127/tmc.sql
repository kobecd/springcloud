/*
Navicat MySQL Data Transfer

Source Server         : 测试
Source Server Version : 50505
Source Host           : dev.yodoo.net.cn:16100
Source Database       : tmc

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-01-05 23:52:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `didi_employee`
-- ----------------------------
DROP TABLE IF EXISTS `didi_employee`;
CREATE TABLE `didi_employee` (
  `Id` char(36) NOT NULL COMMENT '主键',
  `MemberId` varchar(20) DEFAULT NULL COMMENT '对应滴滴的主键',
  `Phone` longtext COMMENT '员工手机号',
  `Realname` longtext COMMENT '员工姓名',
  `Employee_Number` longtext COMMENT '员工ID（员工在公司的员工号）',
  `Email` longtext COMMENT '邮箱',
  `Department` longtext COMMENT '部门名称',
  `Branch_Name` longtext COMMENT '所在分公司名称',
  `System_Role` int(11) DEFAULT NULL COMMENT '系统角色(0-车辆预定人员，1-普通管理员，2-超级管理员；默认为0)',
  `ResidentsName` longtext COMMENT '常驻地中文',
  `Use_Company_Money` int(11) DEFAULT NULL COMMENT '是否企业支付余额（0-否，1-是，默认为0）',
  `Total_Quota` longtext COMMENT '每月配额',
  `Is_Remark` int(11) DEFAULT NULL COMMENT '叫车时备注信息是否必填(0-选填，1-必填；默认为0)',
  `Budget_center_Id` bigint(20) DEFAULT NULL COMMENT '成本中心ID（从已审核通过的成本中心选取）',
  `Regulation_Id` longtext COMMENT '用车制度ID（从 9.1用车制度查询 中选取，可以填多个，以_分隔，如 123_456_789）注:如不传用车制度ID,无法使用企业支付',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '1：删除 0 正常',
  `Project_Ids` longtext,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of didi_employee
-- ----------------------------

-- ----------------------------
-- Table structure for `didi_enterprise`
-- ----------------------------
DROP TABLE IF EXISTS `didi_enterprise`;
CREATE TABLE `didi_enterprise` (
  `Id` char(36) NOT NULL,
  `Client_Id` longtext COMMENT '申请应用时分配的AppKey',
  `Client_secret` longtext,
  `Sign_key` longtext,
  `Phone` longtext,
  `Company_id` longtext,
  `CreateBy` varchar(50) DEFAULT NULL,
  `ModifyBy` varchar(50) DEFAULT NULL,
  `ModifyAt` datetime(6) DEFAULT NULL,
  `CreateAt` datetime(6) NOT NULL,
  `Grant_type` longtext,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of didi_enterprise
-- ----------------------------
INSERT INTO `didi_enterprise` VALUES ('56fde2c6-e240-44aa-a4bf-d30297958849', '74c70063e886c8c1654d555cf9b1a80a_test', 'c155eb34147a308b028e68d0ce1665ea', '81fe7CD2f65c69239d20', '13098000101', '3472095853534251888', null, null, null, '2018-07-19 14:23:31.506903', 'client_credentials');

-- ----------------------------
-- Table structure for `didi_enterprise_config`
-- ----------------------------
DROP TABLE IF EXISTS `didi_enterprise_config`;
CREATE TABLE `didi_enterprise_config` (
  `CreateBy` longtext,
  `CreateAt` datetime(6) NOT NULL,
  `ModifyBy` longtext,
  `ModifyAt` datetime(6) DEFAULT NULL,
  `Id` char(36) NOT NULL,
  `EnterpriseId` char(36) DEFAULT NULL,
  `ConfigName` longtext,
  `InterfaceUrl` longtext,
  `Version` longtext,
  `Status` longtext,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of didi_enterprise_config
-- ----------------------------
INSERT INTO `didi_enterprise_config` VALUES (null, '2018-09-21 17:28:57.452527', null, null, '0ee34e55-2606-444d-8e98-533ea057c10c', '56fde2c6-e240-44aa-a4bf-d30297958849', 'employee_edit', 'http://api.es.xiaojukeji.com/river/Member/edit', null, null);
INSERT INTO `didi_enterprise_config` VALUES ('', '2018-09-21 17:28:57.452527', '', '2018-07-19 14:23:31.506903', '1b159cfe-85e8-479c-ab8c-dbea7a47df93', '56fde2c6-e240-44aa-a4bf-d30297958849', 'invoice_get', 'http://api.es.xiaojukeji.com/river/Invoice/get', '', '');
INSERT INTO `didi_enterprise_config` VALUES (null, '2018-09-21 17:28:57.452527', null, null, '1d49221b-6bb6-4658-9c4f-4044cd001785', '56fde2c6-e240-44aa-a4bf-d30297958849', 'employee_single', 'http://api.es.xiaojukeji.com/river/Member/single', null, null);
INSERT INTO `didi_enterprise_config` VALUES ('', '2018-09-21 17:28:57.452527', '', '2018-07-19 14:23:31.506903', '28cc020c-4bc4-4981-8dbf-ee3dfa6fce56', '56fde2c6-e240-44aa-a4bf-d30297958849', 'title_list', 'http://api.es.xiaojukeji.com/river/Invoice/getTitleList', '', '');
INSERT INTO `didi_enterprise_config` VALUES ('', '2018-09-21 17:28:57.452527', '', '0000-00-00 00:00:00.000000', '2f3fcf9d-67b3-447d-a27d-3eb0a54f7f2f', '56fde2c6-e240-44aa-a4bf-d30297958849', 'invoice_download', 'http://api.es.xiaojukeji.com/river/Invoice/download', '', '');
INSERT INTO `didi_enterprise_config` VALUES ('', '2018-09-21 17:28:57.452527', '', '2018-07-19 14:23:31.506903', '3d5fce11-3951-46f7-98c8-aba1dc5c823d', '56fde2c6-e240-44aa-a4bf-d30297958849', 'company_detail', 'http://api.es.xiaojukeji.com/river/Company/detail', '', '');
INSERT INTO `didi_enterprise_config` VALUES ('', '2018-09-21 17:28:57.452527', '', '0000-00-00 00:00:00.000000', '3d728b26-db33-44ab-aabd-fe0ab75261c3', '56fde2c6-e240-44aa-a4bf-d30297958849', 'invoice_apply', 'http://api.es.xiaojukeji.com/river/Invoice/apply', '', '');
INSERT INTO `didi_enterprise_config` VALUES (null, '2018-09-21 17:28:57.452527', null, null, '59655b23-1d30-4db0-9bc3-a8b1a697a576', '56fde2c6-e240-44aa-a4bf-d30297958849', 'employee_list', 'http://api.es.xiaojukeji.com/river/Member/add', null, null);
INSERT INTO `didi_enterprise_config` VALUES (null, '2018-09-21 17:28:57.452527', null, null, '65857543-8cd1-4c6c-80a3-898cdf263c95', '56fde2c6-e240-44aa-a4bf-d30297958849', 'employee_get', 'http://api.es.xiaojukeji.com/river/Member/get', null, null);
INSERT INTO `didi_enterprise_config` VALUES ('', '2018-09-21 17:28:57.452527', '', '2018-07-19 14:23:31.506903', '8ec3ddd7-475e-4d9c-bc73-f7aec12834df', '56fde2c6-e240-44aa-a4bf-d30297958849', 'company_token', 'http://api.es.xiaojukeji.com/openauth/Service/getToken', '', '');
INSERT INTO `didi_enterprise_config` VALUES ('', '2018-09-21 17:28:57.452527', '', '2018-07-19 14:23:31.506903', '9316dc69-1530-4333-b855-7be9e1a98060', '56fde2c6-e240-44aa-a4bf-d30297958849', 'qualification', 'http://api.es.xiaojukeji.com/river/Invoice/getQualification', '', '');
INSERT INTO `didi_enterprise_config` VALUES (null, '2018-09-21 17:28:57.452527', null, null, 'ab7079eb-bb69-4279-871d-b76fa5b7111b', '56fde2c6-e240-44aa-a4bf-d30297958849', 'employee_del', 'http://api.es.xiaojukeji.com/river/Member/del', null, null);
INSERT INTO `didi_enterprise_config` VALUES (null, '2018-09-21 17:28:57.452527', null, null, 'b611afe1-28e8-41c7-a195-12b163a9df1c', '56fde2c6-e240-44aa-a4bf-d30297958849', 'order_detail', 'http://api.es.xiaojukeji.com/river/Order/detail', null, null);
INSERT INTO `didi_enterprise_config` VALUES (null, '2018-09-21 17:28:57.452527', null, null, 'e81bf055-a737-4dbf-83cf-96b8aaf6a3fd', '56fde2c6-e240-44aa-a4bf-d30297958849', 'order_get', 'http://api.es.xiaojukeji.com/river/Order/get', null, null);
INSERT INTO `didi_enterprise_config` VALUES ('', '2018-09-21 17:28:57.452527', '', '2018-07-19 14:23:31.506903', 'e8e676e8-3207-49c4-818c-133eeef653c5', '56fde2c6-e240-44aa-a4bf-d30297958849', 'company_authstatus', 'http://api.es.xiaojukeji.com/river/Company/getAuthStatus', '', '');
INSERT INTO `didi_enterprise_config` VALUES (null, '2018-09-21 17:28:57.452527', null, null, 'f5e5dfa4-5c70-4cbf-8954-e3d87398237f', '56fde2c6-e240-44aa-a4bf-d30297958849', 'token', 'http://api.es.xiaojukeji.com/river/Auth/authorize', null, '');

-- ----------------------------
-- Table structure for `didi_order`
-- ----------------------------
DROP TABLE IF EXISTS `didi_order`;
CREATE TABLE `didi_order` (
  `Id` char(36) NOT NULL COMMENT '主键',
  `Order_Id` longtext COMMENT '订单ID',
  `Create_Time` longtext COMMENT '叫单时间',
  `Use_Car_Type` longtext COMMENT '用车方式（1:出租车，2:专车，3:快车，4:代驾，5:豪华车）',
  `Require_Level` longtext COMMENT '车型',
  `City` longtext COMMENT '城市ID',
  `City_name` longtext COMMENT '城市名称',
  `Start_Name` longtext COMMENT '出发地地址',
  `End_Name` longtext COMMENT '目的地地址',
  `Departure_Time` int(11) DEFAULT NULL COMMENT '出发时间',
  `Finish_Time` longtext COMMENT '结束计价时间',
  `Status` int(11) NOT NULL,
  `Pay_Type` int(11) DEFAULT NULL COMMENT '支付方式（0企业支付 1个人垫付 2混合支付）',
  `Member_Id` bigint(20) DEFAULT NULL COMMENT '员工在滴滴企业的ID（同员工新增接口中返回的id）',
  `Pay_Time` longtext COMMENT '支付时间',
  `Total_Price` float DEFAULT NULL COMMENT '总金额',
  `Actual_Price` float DEFAULT NULL COMMENT '实付金额（总金额-券抵扣金额）',
  `Refund_Price` float DEFAULT NULL COMMENT '退款金额',
  `Company_Pay` float DEFAULT NULL COMMENT '公司支付金额',
  `Company_Real_Pay` float DEFAULT NULL,
  `Company_Card_Pay` float DEFAULT NULL COMMENT '公司出行卡支付金额',
  `Personal_Real_Pay` float DEFAULT NULL COMMENT '个人实付金额',
  `Personal_Pay` float DEFAULT NULL COMMENT '个人支付金额',
  `Company_Real_Refund` float DEFAULT NULL COMMENT '公司实际退款金额',
  `personal_Real_Refund` float DEFAULT NULL COMMENT '个人实际退款金额',
  `Is_Invoice` int(11) DEFAULT NULL COMMENT '报销开票状态（1：开过 0：未开）',
  `Normal_Distance` int(11) DEFAULT NULL COMMENT '总里程',
  `Call_Phone` longtext COMMENT '叫车人手机号',
  `Passenger_Phone` longtext COMMENT '乘车人手机号',
  `Budget_Center_Id` longtext COMMENT '成本中心ID',
  `Budget_Item_Id` longtext COMMENT '费用科目ID',
  `Use_Car_Config_Id` longtext COMMENT '用车规则ID',
  `Order_Source` longtext COMMENT '订单来源(0-Web 1-滴滴出行App 2-H5 3-OpenAPI 4-企业APP 5-邀约券 6-SDK)',
  `IsCarpool` longtext COMMENT '是否拼车(0-不是 1-是)',
  `Encrypted_Info` longtext COMMENT '价格加密信息',
  `Out_Approval_Id` longtext COMMENT '接入方内部审批单ID',
  `Approval_Id` longtext COMMENT '滴滴内部审批单ID',
  `Is_Carpool` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of didi_order
-- ----------------------------

-- ----------------------------
-- Table structure for `didi_order_detail`
-- ----------------------------
DROP TABLE IF EXISTS `didi_order_detail`;
CREATE TABLE `didi_order_detail` (
  `Id` char(36) NOT NULL,
  `order_id` longtext COMMENT '订单ID',
  `city` longtext,
  `city_name` longtext COMMENT '北京市',
  `type` longtext COMMENT '订单类型(0:实时、1:预约)',
  `call_phone` longtext COMMENT '叫车人手机号',
  `passenger_phone` longtext COMMENT '乘车人手机号',
  `flat` longtext COMMENT '出发地纬度',
  `flng` longtext COMMENT '出发地经度',
  `tlat` longtext COMMENT '目的地纬度',
  `tlng` longtext COMMENT '目的地经度',
  `company_id` longtext COMMENT '公司ID',
  `create_time` longtext COMMENT '叫单时间',
  `use_car_type` longtext COMMENT '用车方式',
  `require_level` longtext COMMENT '车型（100舒适型，400商务型, 200豪华型,500优选型,600快车,900优享型）',
  `start_name` longtext COMMENT '出发地地址',
  `end_name` longtext COMMENT '目的地地址',
  `departure_time` longtext COMMENT '出发时间',
  `begin_charge_time` longtext COMMENT '开始计价时间',
  `finish_time` longtext COMMENT '结束计价时间',
  `status` longtext COMMENT '订单状态（2-已支付 3-已退款 4-已取消 7-部分退款）',
  `pay_time` longtext COMMENT '支付时间',
  `normal_distance` longtext COMMENT '总里程',
  `total_price` longtext COMMENT '总金额',
  `actual_price` longtext COMMENT '实付金额（总金额-券抵扣金额）',
  `voucher_pay` longtext COMMENT '券抵扣金额',
  `refund_price` longtext COMMENT '退款金额',
  `company_pay` longtext COMMENT '公司支付金额',
  `company_card_pay` longtext COMMENT '公司出行卡支付金额',
  `personal_pay` longtext COMMENT '个人支付金额',
  `company_real_pay` longtext COMMENT '公司实付金额',
  `personal_real_pay` longtext COMMENT '个人实付金额',
  `company_real_refund` longtext COMMENT '公司实际退款金额',
  `personal_real_refund` longtext COMMENT '个人实际退款金额',
  `remark` longtext COMMENT '备注说明',
  `is_invoice` int(11) DEFAULT NULL COMMENT '报销开票状态',
  `pay_type` longtext COMMENT '支付方式（0企业支付 1个人垫付 2混合支付）',
  `budget_center_id` longtext COMMENT '成本中心ID',
  `budget_item_id` longtext COMMENT '费用科目ID',
  `use_car_config_id` longtext COMMENT '用车规则ID',
  `order_source` longtext COMMENT '订单来源(0-Web 1-滴滴出行App 2-H5 3-OpenAPI 4-企业APP 5-邀约券 6-SDK)',
  `is_carpool` longtext COMMENT '是否拼车(0-不是 1-是)',
  `pricing_mode` int(11) DEFAULT NULL COMMENT '判断是否一口价计价订单(0-不是 1-是)',
  `encrypted_info` longtext COMMENT '价格加密信息',
  `approval_id` longtext COMMENT '滴滴内部审批单ID',
  `out_approval_id` longtext COMMENT '接入方内部审批单ID',
  `use_car_srv` longtext COMMENT '车型（101-出租车 201-专车用车 202-专车包车 203-专车接机 204-专车送机 205-专车接程 206-专车送程 301-快车用车 305-快车接程 306-快车送程 401-代驾 501-豪华车 601-私车公用（顺风车）602-私车公用（自驾））',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of didi_order_detail
-- ----------------------------
INSERT INTO `didi_order_detail` VALUES ('c0f90766-a398-4919-ae5e-49dfbd7879eb', '1125901685007109', '23', '苏州市', '0', '18662182515', '18662182515', '31.303730000000', '120.599510000000', '31.307636000000', '120.622669000000', '3472095853534251888', '2018-09-29 18:17:39', '3', '900', '精治教育', '海友酒店(新观前店)', '2018-09-29 18:17:38', '2018-09-29 18:21:03', '2018-09-29 18:27:49', '2', '2018-09-29 18:27:53', '3.10', '10.50', '10.50', '0.00', '0.00', '0.00', '0.00', '10.50', '0.00', '10.50', '0.00', '0.00', '', '0', '1', '0', '0', '0', '6', '0', '0', 'X26ZpNYB6lVhySVaPsOp3SJ2IeT57in2x9Pbh%2BZL0U21C%2BlXZiTVOHzT6hDwNz9VaOTS%2BmjWLXcPqalRrdRIjvfD78MAqoQCEZ%2BaL4zXQIA%3D', '', '', '301');

-- ----------------------------
-- Table structure for `didi_order_detail_price`
-- ----------------------------
DROP TABLE IF EXISTS `didi_order_detail_price`;
CREATE TABLE `didi_order_detail_price` (
  `Id` char(36) NOT NULL,
  `DIDIOrderDetailId` char(36) DEFAULT NULL,
  `Name` longtext,
  `Amount` longtext,
  `Type` longtext,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of didi_order_detail_price
-- ----------------------------
INSERT INTO `didi_order_detail_price` VALUES ('92915369-acd6-4820-acf5-e68d70bc13dc', 'c0f90766-a398-4919-ae5e-49dfbd7879eb', '快车时长费', '3.60', 'normal_time_fee');
INSERT INTO `didi_order_detail_price` VALUES ('b9a003ae-ecbd-4546-bed9-7b1d326d1743', 'c0f90766-a398-4919-ae5e-49dfbd7879eb', '快车 补足基础费的值', '1.54', 'limit_pay');
INSERT INTO `didi_order_detail_price` VALUES ('e1289d13-b990-4319-ace1-d9478bf6b67b', 'c0f90766-a398-4919-ae5e-49dfbd7879eb', '正常行驶距离费', '5.36', 'normal_fee');

-- ----------------------------
-- Table structure for `testtable`
-- ----------------------------
DROP TABLE IF EXISTS `testtable`;
CREATE TABLE `testtable` (
  `Id` int(11) NOT NULL COMMENT '主键',
  `Name` longtext,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='测试';

-- ----------------------------
-- Records of testtable
-- ----------------------------

-- ----------------------------
-- Table structure for `tmc_flight`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_flight`;
CREATE TABLE `tmc_flight` (
  `CreateBy` longtext,
  `CreateAt` datetime(6) NOT NULL,
  `ModifyBy` longtext,
  `ModifyAt` datetime(6) DEFAULT NULL,
  `Id` char(36) NOT NULL COMMENT '主键',
  `FlightId` longtext COMMENT 'FlightId',
  `OldFlightId` longtext COMMENT '原FlightId',
  `IfRebookFlight` int(11) DEFAULT NULL COMMENT '/0:否 1：是',
  `OrderNo` longtext COMMENT '订单id',
  `Sequence` int(11) DEFAULT NULL COMMENT '航程序号',
  `Flight` longtext COMMENT '航班号',
  `AirLineCode` longtext COMMENT '航空公司代码(航司二字码)',
  `AirLineName` longtext COMMENT '航空公司名称',
  `StandardPrice` decimal(10,0) DEFAULT NULL COMMENT '标准价 该舱等的全价',
  `Amount` decimal(10,0) DEFAULT NULL COMMENT '机票价格+燃油+机建',
  `Price` decimal(10,0) DEFAULT NULL COMMENT '机票价格',
  `PrintPrice` decimal(10,0) DEFAULT NULL COMMENT '机票票面价格/航空公司卖价',
  `PriceRate` decimal(10,0) DEFAULT NULL COMMENT '机票折扣	机票票价折扣率',
  `OilFee` decimal(10,0) DEFAULT NULL COMMENT '燃油费',
  `Tax` decimal(10,0) DEFAULT NULL COMMENT '税/机建费',
  `ServerFee` decimal(10,0) DEFAULT NULL COMMENT '服务费',
  `AgeType` longtext COMMENT '乘客种类（ADU=成人；CHI=儿童；BAB=婴儿）',
  `ClassName` longtext COMMENT '舱位类型 Y	经济舱 F	头等舱 C	公务舱 S	超级经济舱',
  `SubClass` longtext COMMENT '子舱位',
  `OfficeNo` longtext COMMENT '票台号',
  `NonRer` int(11) DEFAULT NULL COMMENT '是否可改期 是否可改期 false true (T:不可改期 F：可改期 H：有条件改期)',
  `RerNotes` longtext COMMENT '改期规定',
  `NonRef` int(11) DEFAULT NULL COMMENT '是否可退票  是否可退票 false true (T:不可退 F：可退票 H：有条件退票)',
  `RefNotes` longtext COMMENT '退票规定',
  `NonEnd` int(11) DEFAULT NULL COMMENT '是否可签转 是否可签转 false true (T:不可签转 F：可签转 H：有条件签转)',
  `EndNotes` longtext COMMENT '签转规定',
  `Remark` longtext COMMENT '航班描述',
  `TakeoffTime` datetime DEFAULT NULL COMMENT '起飞时间	 	格式：yyyy-MM-dd HH:mm:ss',
  `ArrivalTime` datetime DEFAULT NULL COMMENT '到达时间	 	格式：yyyy-MM-dd HH:mm:ss',
  `DepartCityName` longtext COMMENT '出发城市名称',
  `DepartPortName` longtext,
  `DepartAirportName` longtext COMMENT '出发机场',
  `ArriveCityName` longtext COMMENT '航站楼名称(出发)',
  `ArrivePortName` longtext COMMENT '到达城市名称',
  `ArriveAirportName` longtext COMMENT '到达机场',
  `LowPriceReason` longtext COMMENT '航站楼名称(到达)',
  `LowFlight` longtext COMMENT '低价原因',
  `LowClass` longtext COMMENT '最低价航班号		Y',
  `LowestPrice` decimal(10,0) DEFAULT NULL COMMENT '最低价航班价格		Y',
  `LowRate` decimal(10,0) DEFAULT NULL COMMENT '最低价航班扣率		Y',
  `LowDTime` datetime DEFAULT NULL COMMENT '最低价航班起飞时间		Y	格式：yyyy-MM-dd HH:mm:ss',
  `HasMeal` bit(1) DEFAULT NULL COMMENT '是否有餐食',
  `Tpm` int(11) DEFAULT NULL COMMENT '里程数 千米',
  `FlightTime` int(11) DEFAULT NULL COMMENT '飞行时长	 单位：分钟',
  `StopCity` longtext COMMENT '经停城市',
  `STopPortName` longtext COMMENT '经停机场名',
  `StopTime` int(11) DEFAULT NULL COMMENT '经停时长',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：删除 1，未删除',
  `TmcException` longtext COMMENT 'tmc异常标识,异常 数字以,隔开',
  `FlightOrderInfoId` char(36) DEFAULT NULL COMMENT 'FlightOrderInfo主键',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_flight
-- ----------------------------
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '041c100a-cf2e-47d1-acba-5b06bc26078b', 'f391a7d75688cc678c3ddb4ead93447e', null, '0', 'TB1800013750', '1', 'MU5391', 'MU', '中国东方航空', '0', '0', '0', '0', '0', '0', '0', '0', null, '头等舱', null, null, '0', '变更规定：起飞前2小时以外免费更改，起飞前2小时（含）以内及起飞后需收取票面价5％的更改费。改期费与升舱费同时发生时，需同时收取。', '0', '退票规定：起飞前2小时以外免收退票费，起飞前2小时（含）以内及起飞后需收取票面价10％的退票费。', '0', '签转规定：可以签转。', '', '2018-12-17 09:05:00', '2018-12-17 12:25:00', '北京(首都)', '首都国际机场', 'T2', '深圳', '宝安国际机场', 'T3', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '200', null, null, '0', '0', '600001', 'e20f2747-9787-436a-bbc8-f648e61e71e4');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '14cea6a3-92a9-47a1-8dcc-601e630f1daf', '3880a8375d3b888498d1593a3e371551', null, '0', 'TB1800012438', '1', 'CA1590', 'CA', '中国国航（测试）', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：航班起飞收取公布运价10%变更费，航班起飞后收取公布运价20％变更费。', '0', '退票规定：不得退票，仅退未使用税费。航班起飞前收取公布运价20%退票费，航班起飞后收取公布运价30％退票费。', '0', '签转规定：不得签转。 ', '', '2018-11-12 08:50:00', '2018-11-12 11:15:00', '上海(虹桥)', '虹桥国际机场', 'T2', '北京(首都)', '首都国际机场', 'T3', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '145', null, null, '0', '0', '600001', '29acfa4f-0a6f-473d-8136-958af0dded37');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '17fcd991-bfcd-47f8-bb67-4ba41430aec8', 'bbd703d54ef0b07a9acd59f2f515993a', null, '0', 'TB1800013699', '1', 'MU5183', 'MU', '中国东方航空', '0', '0', '0', '0', '0', '0', '0', '0', null, '头等舱', null, null, '0', '变更规定：起飞前2小时以外同等舱位收取票面价10%的更改费，起飞前2小时（含）以内及起飞后需收取票面价20％的更改费。改期费与升舱费同时发生时，需同时收取。', '0', '退票规定：起飞前2小时以外需收取票面价20％的退票费，起飞前2小时（含）以内及起飞后需收取票面价30％的退票费。', '0', '签转规定：不可以签转。', '', '2018-12-08 07:35:00', '2018-12-08 09:55:00', '北京(首都)', '首都国际机场', 'T2', '上海(浦东)', '浦东国际机场', 'T1', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '140', null, null, '0', '0', '600001', '96b2ec2c-96df-4ad5-b668-a031d754305e');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '20ed290a-0d0c-40ec-a8b2-c06387bca02e', '3f7a74fa774d91e3cefeec91e7b95a46', null, '0', 'TB1800013687', '1', 'CA3202', 'CA', '中国国航（测试）', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：航班起飞收取公布运价30%变更费，航班起飞后收取公布运价50%变更费。', '0', '退票规定：航班起飞前收取公布运价50%退票费，航班起飞后不允许退票。', '0', '签转规定：不得签转。', '', '2018-12-08 06:35:00', '2018-12-08 08:55:00', '北京(首都)', '首都国际机场', 'T3', '上海(虹桥)', '虹桥国际机场', 'T2', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '140', null, null, '0', '0', '600001', '2bad5d04-dee0-49e1-8be3-9257f23b832d');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '26a78a05-163b-45a0-82df-e761ca170edc', '00dec34f7155540f9a14aa7c04289ba7', null, '0', 'TB1800013788', '1', 'MU564', 'MU', '中国东方航空', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：起飞前2小时以外同等舱位收取票面价30%的更改费，起飞前2小时（含）以内及起飞后需收取票面价50％的更改费。改期费与升舱费同时发生时，需同时收取。', '0', '退票规定：起飞前2小时以外需收取票面价50％的退票费，起飞前2小时（含）以内及起飞后不得退票。', '0', '签转规定：不可以签转。', '', '2018-12-21 06:55:00', '2018-12-21 09:25:00', '上海(浦东)', '浦东国际机场', 'T1', '北京(首都)', '首都国际机场', 'T2', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '150', null, null, '0', '0', '600001', '81618920-ad93-4617-a1ac-3a2e19332644');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '43154eec-d90c-4ae1-b26c-d323d2726d65', '8e2bdaa43ac32f30466ac54373594acc', null, '0', 'TB1800012747', '1', 'MU564', 'MU', '中国东方航空', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：起飞前2小时以外同等舱位收取票面价30%的更改费，起飞前2小时（含）以内及起飞后需收取票面价50％的更改费。改期费与升舱费同时发生时，需同时收取。', '0', '退票规定：起飞前2小时以外需收取票面价80％的退票费，起飞前2小时（含）以内及起飞后不得退票。', '0', '签转规定：不可以签转。', '', '2018-12-06 06:55:00', '2018-12-06 09:25:00', '上海(浦东)', '浦东国际机场', 'T1', '北京(首都)', '首都国际机场', 'T2', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '150', null, null, '0', '0', '600001', '8a436834-e28c-4274-8435-20e44c033b77');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '568dfeb5-8d2d-4586-b7e2-c3bef99323eb', '47e65c52efbfdea7a57f7fe96b38b572', null, '0', 'TB1800013790', '1', 'CZ9190', 'CZ', '中国南方航空1', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：起飞前2小时（含）以外同等舱位变更按对应舱位公布运价收取10％变更费；2小时以内及起飞后同等舱位变更按对应舱位公布运价收取30％变更费。改期费与升舱费同时发生时，则需同时收取改期费和升舱差额。', '0', '退票规定：起飞前2小时（含）以外办理退票按对应舱位公布运价收取30％的退票费，2小时以内及起飞后退票按对应舱位公布运价收取50％的退票费。', '0', '签转规定：不可以签转。', '', '2018-12-13 23:00:00', '2018-12-14 00:05:00', '上海(浦东)', '浦东国际机场', 'T1', '南京', '禄口国际机场 ', 'T2', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '65', null, null, '0', '0', '600001', 'bf394540-25c2-4805-ae5e-aefa696e5c24');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '5e1adb37-fe47-4186-bc97-66da0e054002', '7b25e73469da474b4f25f7a164e88d62', null, '0', 'TB1800013792', '1', 'MU2510', 'MU', '中国东方航空', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：起飞前2小时以外同等舱位收取票面价20%的更改费，起飞前2小时（含）以内及起飞后需收取票面价30％的更改费。改期费与升舱费同时发生时，需同时收取。', '0', '退票规定：起飞前2小时以外需收取票面价30％的退票费，起飞前2小时（含）以内及起飞后需收取票面价50％的退票费。', '0', '签转规定：不可以签转。', '', '2018-12-12 07:15:00', '2018-12-12 09:25:00', '上海(虹桥)', '虹桥国际机场', 'T2', '武汉', '天河国际机场', 'T3', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '130', null, null, '0', '0', '600001', 'e888c5ce-dd80-432f-b413-a5fa73d9bf49');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '743f19cc-1383-4792-bd3f-8aefeddd4a47', '470ba5aa70c75c7c22d87eeaf593363e', null, '0', 'TB1800013789', '1', 'ZH1893', 'ZH', '深圳航空', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', null, '0', null, '0', null, '', '2018-12-12 07:10:00', '2018-12-12 10:00:00', '上海(浦东)', '浦东国际机场', 'T2', '深圳', '宝安国际机场', 'T3', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '170', null, null, '0', '0', '600001', 'd143469f-2d9d-4cf4-bef5-804aa94eac75');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '7fc5e349-4371-4153-9e8b-26ac52d36af4', '9491bf932121b2db1249054a3cea0fa7', null, '0', 'TB1800013302', '1', 'CA3202', 'CA', '中国国航（测试）', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：航班起飞收取公布运价30%变更费，航班起飞后收取公布运价50%变更费。', '0', '退票规定：航班起飞前收取公布运价50%退票费，航班起飞后不允许退票。', '0', '签转规定：不得签转。', '', '2018-11-30 06:35:00', '2018-11-30 08:55:00', '北京(首都)', '首都国际机场', 'T3', '上海(虹桥)', '虹桥国际机场', 'T2', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '140', null, null, '0', '0', '600001', '8abdb8a4-ffcd-4aca-8281-5640dc78164a');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '864d8e31-2c4e-47ce-88c4-9bd412703ec4', '108520c0a4a0ba21d74e59e77af752a3', null, '1', 'TB1800012438', '1', null, 'MU', null, '0', '0', '0', '0', '0', '0', '0', '0', null, '公务舱', null, null, '0', '变更规定：起飞前2小时以外同等舱位收取票面价10%的更改费，起飞前2小时（含）以内及起飞后需收取票面价20％的更改费。改期费与升舱费同时发生时，需同时收取。', '0', '退票规定：起飞前2小时以外需收取票面价20％的退票费，起飞前2小时（含）以内及起飞后需收取票面价30％的退票费。', '0', '签转规定：不可以签转。', '', '2018-11-12 13:30:00', '2018-11-12 15:50:00', '上海(虹桥)', '虹桥国际机场', 'T2', '北京(首都)', '首都国际机场', 'T2', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '140', null, null, '0', '0', null, '00000000-0000-0000-0000-000000000000');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '8f4a9769-4245-4f26-9214-99e71406dea6', '499c37167497ed46d8670046ea747d5c', null, '0', 'TB1800013791', '1', 'FM9147', 'FM', '上海航空', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：起飞前2小时（含）以外同等舱位免费更改，起飞前2小时（含）以内及起飞后需收取票面价5％的更改费。改期费与升舱费同时发生时，需同时收取。', '0', '退票规定：起飞前2小时以外需收取票面价5％的退票费，起飞前2小时（含）以内及起飞后需收取票面价10％的退票费。', '0', '签转规定：不可以签转。 ', '', '2018-12-10 08:10:00', '2018-12-10 10:30:00', '上海(虹桥)', '虹桥国际机场', 'T2', '天津', '滨海国际机场', 'T2', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '140', null, null, '0', '0', '600001', '5140734c-5574-49ba-b31a-71eefa489547');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '9adca171-3a71-4e8d-803b-03f9ceb15e43', 'b6455934407f33535d14fc6bc17b84e8', null, '0', 'TB1800013301', '1', 'CZ9418', 'CZ', '中国南方航空1', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：起飞前2小时（含）以外同等舱位变更按对应舱位公布运价收取10％变更费；2小时以内及起飞后同等舱位变更按对应舱位公布运价收取30％变更费。改期费与升舱费同时发生时，则需同时收取改期费和升舱差额。', '0', '退票规定：起飞前2小时（含）以外办理退票按对应舱位公布运价收取30％的退票费，2小时以内及起飞后退票按对应舱位公布运价收取50％的退票费。', '0', '签转规定：不可以签转。', '', '2018-11-30 09:00:00', '2018-11-30 12:10:00', '上海(浦东)', '浦东国际机场', 'T1', '重庆', '江北国际机场', 'T3', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '190', null, null, '0', '0', '600001', 'f47bc4ed-a67b-4f2a-ae54-7daad7acb251');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '9e3e2f24-5350-46a8-ab75-e4c5ca12b0c6', '7eb29ad4b2cdac3db17e9ee5c35feeac', null, '0', 'TB1800013725', '1', 'MU5181', 'MU', '中国东方航空', '0', '0', '0', '0', '0', '0', '0', '0', null, '头等舱', null, null, '0', '变更规定：起飞前2小时以外免费更改，起飞前2小时（含）以内及起飞后需收取票面价5％的更改费。改期费与升舱费同时发生时，需同时收取。', '0', '退票规定：起飞前2小时以外免收退票费，起飞前2小时（含）以内及起飞后需收取票面价10％的退票费。', '0', '签转规定：可以签转。', '', '2018-12-08 07:00:00', '2018-12-08 10:25:00', '北京(首都)', '首都国际机场', 'T2', '广州', '白云国际机场', 'T1', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '205', null, null, '0', '0', '600001', '2caab5bf-f005-4360-a219-8ffcdd3c0c73');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'a8279039-a803-4e4c-bc83-9540150b7fbe', '492604b01c5954acb5a2f582dac22613', null, '0', 'TB1800013429', '1', 'CA8904', 'CA', '中国国航（测试）', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：航班起飞收取公布运价10%变更费，航班起飞后收取公布运价20％变更费。', '0', '退票规定：航班起飞前收取公布运价20%退票费，航班起飞后收取公布运价30％退票费。', '0', '签转规定：不得签转。', '', '2018-12-04 11:55:00', '2018-12-04 13:25:00', '北京(首都)', '首都国际机场', 'T3', '大连', '周水子国际机场 ', '', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '90', null, null, '0', '0', '600001', '68910679-58f7-4854-8f69-288c3ce0b7eb');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'aba4554c-e127-4352-b5f0-f741bc63d667', '00fb7e53566fda72833ace03d518831f', null, '0', 'TB1800012719', '1', 'MU3924', 'MU', '中国东方航空', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：起飞前2小时以外同等舱位收取票面价20%的更改费，起飞前2小时（含）以内及起飞后需收取票面价30％的更改费。改期费与升舱费同时发生时，需同时收取。', '0', '退票规定：起飞前2小时以外需收取票面价30％的退票费，起飞前2小时（含）以内及起飞后需收取票面价50％的退票费。', '0', '签转规定：不可以签转。', '', '2018-11-15 06:35:00', '2018-11-15 08:55:00', '北京(首都)', '首都国际机场', 'T3', '上海(虹桥)', '虹桥国际机场', 'T2', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '140', null, null, '0', '0', '600001', 'd45d2dc6-9493-429a-84f0-5e132035e1ac');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'b679f9e6-2f07-4dd2-b8dc-ad28dad82586', '101cab5cf170f45f9df5d4a80483c333', null, '0', 'TB1800013786', '1', 'MU5137', 'MU', '中国东方航空', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：起飞前2小时以外同等舱位收取票面价20%的更改费，起飞前2小时（含）以内及起飞后需收取票面价30％的更改费。改期费与升舱费同时发生时，需同时收取。', '0', '退票规定：起飞前2小时以外需收取票面价30％的退票费，起飞前2小时（含）以内及起飞后需收取票面价50％的退票费。', '0', '签转规定：不可以签转。', '', '2018-12-11 07:00:00', '2018-12-11 09:20:00', '上海(虹桥)', '虹桥国际机场', 'T2', '北京(首都)', '首都国际机场', 'T2', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '140', null, null, '0', '0', '600001', 'd90f632c-681c-450b-93f8-78540c3898f4');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'c193852d-f847-4d18-a16d-156e96c64a68', 'bbb5faa64c89b3a4612c4519085da347', null, '0', 'TB1800013298', '1', 'MU3995', 'MU', '中国东方航空', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：起飞前2小时以外同等舱位收取票面价20%的更改费，起飞前2小时（含）以内及起飞后需收取票面价30％的更改费。改期费与升舱费同时发生时，需同时收取。', '0', '退票规定：起飞前2小时以外需收取票面价30％的退票费，起飞前2小时（含）以内及起飞后需收取票面价50％的退票费。', '0', '签转规定：不可以签转。', '', '2018-11-30 07:25:00', '2018-11-30 10:25:00', '上海(虹桥)', '虹桥国际机场', 'T2', '重庆', '江北国际机场', 'T3', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '180', null, null, '0', '0', '600001', '2987c927-7215-4c22-8c91-1c6beacd12da');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'cb7b41a3-cd86-4746-8c62-4c901eaab034', '108520c0a4a0ba21d74e59e77af752a3', null, '1', 'TB1800012438', '1', null, 'MU', null, '0', '0', '0', '0', '0', '0', '0', '0', null, '公务舱', null, null, '0', '变更规定：起飞前2小时以外同等舱位收取票面价10%的更改费，起飞前2小时（含）以内及起飞后需收取票面价20％的更改费。改期费与升舱费同时发生时，需同时收取。', '0', '退票规定：起飞前2小时以外需收取票面价20％的退票费，起飞前2小时（含）以内及起飞后需收取票面价30％的退票费。', '0', '签转规定：不可以签转。', '', '2018-11-12 13:30:00', '2018-11-12 15:50:00', '上海(虹桥)', '虹桥国际机场', 'T2', '北京(首都)', '首都国际机场', 'T2', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '140', null, null, '0', '0', null, '00000000-0000-0000-0000-000000000000');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'd62e0c70-6ac3-4da5-bb7f-8dfad6120594', 'c25980b5ed4451b0d910e0938df462bf', null, '0', 'TB1800013787', '1', 'HO1252', 'HO', '上海吉祥航空有限公司', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '更改规定：按具体文件规定。', '0', '退票规定：按具体文件规定。', '0', '签转规定：不得签转。', '', '2018-12-10 06:35:00', '2018-12-10 08:55:00', '北京(首都)', '首都国际机场', 'T3', '上海(虹桥)', '虹桥国际机场', 'T2', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '140', null, null, '0', '0', '600001', '40cf905c-73cd-406a-abba-35cc80861acd');
INSERT INTO `tmc_flight` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'eec91335-ef10-47c6-a977-7ed9882fd1f0', '4607a6e73c6a2aba33eac1c52f2dbe38', null, '0', 'TB1800012389', '1', 'MU5118', 'MU', '中国东方航空', '0', '0', '0', '0', '0', '0', '0', '0', null, '经济舱', null, null, '0', '变更规定：不得变更。起飞前2小时以外同等舱位收取票面价10%的更改费，起飞前2小时（含）以内及起飞后需收取票面价20％的更改费。改期费与升舱费同时发生时，需同时收取。', '0', '退票规定：起飞前2小时以外需收取票面价20％的退票费，起飞前2小时（含）以内及起飞后需收取票面价30％的退票费。', '0', '签转规定：不可以签转。 ', '', '2018-11-30 16:00:00', '2018-11-30 18:15:00', '北京(首都)', '首都国际机场', 'T2', '上海(虹桥)', '虹桥国际机场', 'T2', null, null, null, '0', '0', '0001-01-01 00:00:00', '', '0', '135', null, null, '0', '0', '600001', 'd4da0343-ffd1-4bff-938a-aa3cbdc71bf3');

-- ----------------------------
-- Table structure for `tmc_flight_order`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_flight_order`;
CREATE TABLE `tmc_flight_order` (
  `AppKey` longtext,
  `OrgCode` longtext,
  `TmcSupplierId` longtext,
  `OrderNo` longtext,
  `ApprovalNo` longtext,
  `Amount` decimal(65,30) NOT NULL,
  `ServiceFee` decimal(65,30) NOT NULL,
  `OnBusiness` int(11) NOT NULL,
  `PayType` longtext,
  `OrderDate` datetime(6) DEFAULT NULL,
  `ProductType` longtext,
  `CostCenterCode` longtext,
  `Id` char(36) NOT NULL COMMENT '主键',
  `OrderStatus` int(11) DEFAULT NULL COMMENT '1.已提交 2.已取消 3.已成交 4.全部退票 5.部分退票',
  `ChangeAmount` decimal(10,0) DEFAULT NULL COMMENT '改签产生的费用',
  `RefundAmount` decimal(10,0) DEFAULT NULL COMMENT '退票产生的退费',
  `SendTicketFee` decimal(10,0) DEFAULT NULL COMMENT '配送费',
  `InsuranceFee` decimal(10,0) DEFAULT NULL COMMENT '保险费',
  `FinishDateTime` datetime DEFAULT NULL COMMENT '成交时间 格式：yyyy-MM-dd HH:mm:ss',
  `PrintTicketTime` datetime DEFAULT NULL COMMENT '出票时间格式：yyyy-MM-dd HH:mm:ss',
  `FlightClass` longtext COMMENT '国际/国内标识, I:国际航班、N:国内航班	 	Y',
  `FlightWay` int(11) DEFAULT NULL COMMENT '航程类型    单程、往返、多程、无航程类型',
  `Remarks` longtext COMMENT '订单备注',
  `RebookOrderNo` longtext COMMENT '改签原订单号',
  `ContactEmail` longtext COMMENT '联系邮箱',
  `ContactName` longtext COMMENT '联系人',
  `ContactTel` longtext COMMENT '联系电话',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：未删除 1：删除',
  `TmcException` longtext COMMENT 'tmc异常标识,异常 数字以,隔开',
  `AuditStatus` varchar(20) DEFAULT NULL,
  `ConfirmPerson` varchar(36) DEFAULT NULL COMMENT '多个人逗号隔开',
  `Detail_Item_ID` varchar(100) DEFAULT NULL,
  `EmployeeNo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_flight_order
-- ----------------------------
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013298', 'TA0091811290044', '1190.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-11-29 19:49:11.000000', 'H', '', '2987c927-7215-4c22-8c91-1c6beacd12da', '3', '0', '0', '0', '0', '2018-11-29 19:51:40', '2018-11-29 19:51:40', null, '1', '11', null, null, null, null, '0', null, null, null, null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800012438', 'TAGack1811070001', '2260.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'P', '2018-11-07 11:40:22.000000', 'F', '', '29acfa4f-0a6f-473d-8136-958af0dded37', '6', '2020', '0', '0', '0', '2018-11-07 11:43:17', '2018-11-07 11:43:17', null, '1', '', null, null, null, null, '0', null, null, null, 'e0c13a7398db45ba8f52ee23276eac3f', 'GackG1022002');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013687', '', '980.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-07 11:20:09.000000', 'H', '', '2bad5d04-dee0-49e1-8be3-9257f23b832d', '3', '0', '0', '0', '0', '2018-12-07 11:23:23', '2018-12-07 11:23:23', null, '1', '', null, null, null, null, '0', null, null, null, null, '000121_9_3784c6d793e64eeeb49a8094a879886d');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013725', null, '6380.000000000000000000000000000000', '0.000000000000000000000000000000', '2', 'P', '2018-12-07 15:58:14.000000', 'H', '', '2caab5bf-f005-4360-a219-8ffcdd3c0c73', '1', '0', '0', '0', '0', '0001-01-01 00:00:00', '0001-01-01 00:00:00', null, '1', '', null, null, null, null, '0', null, null, null, null, '000121_9_275f5267cec94dd4aa7efa0c0583b47a');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013787', 'TA0091812090002', '650.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-09 13:20:26.000000', 'H', '', '40cf905c-73cd-406a-abba-35cc80861acd', '3', '0', '0', '0', '0', '2018-12-09 13:23:05', '2018-12-09 13:23:05', null, '1', '', null, null, null, null, '0', null, null, null, null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013791', 'TA0091812090002', '1660.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-09 14:06:32.000000', 'H', '', '5140734c-5574-49ba-b31a-71eefa489547', '3', '0', '0', '0', '0', '2018-12-09 14:09:15', '2018-12-09 14:09:15', null, '1', '', null, null, null, null, '0', null, null, null, null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013429', 'TA0091812040003', '930.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-04 10:06:25.000000', 'H', '', '68910679-58f7-4854-8f69-288c3ce0b7eb', '3', '0', '0', '0', '0', '2018-12-04 10:08:38', '2018-12-04 10:08:38', null, '1', '', null, null, null, null, '0', null, null, null, null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013788', 'TA0091812090002', '600.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-09 13:20:26.000000', 'H', '', '81618920-ad93-4617-a1ac-3a2e19332644', '3', '0', '0', '0', '0', '2018-12-09 13:23:20', '2018-12-09 13:23:20', null, '1', '', null, null, null, null, '0', null, null, null, null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800012747', 'TAGack1811150019', '650.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-11-15 17:03:26.000000', 'H', '', '8a436834-e28c-4274-8435-20e44c033b77', '3', '0', '0', '0', '0', '2018-11-15 17:05:16', '2018-11-15 17:05:16', null, '1', '', null, null, null, null, '0', null, null, null, null, 'GackG1022002');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013302', 'TA0091811290039', '1000.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-11-29 20:05:22.000000', 'H', '', '8abdb8a4-ffcd-4aca-8281-5640dc78164a', '3', '0', '0', '0', '0', '2018-11-29 20:07:51', '2018-11-29 20:07:51', null, '1', '', null, null, null, null, '0', null, null, null, null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013699', '', '1480.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-07 14:13:24.000000', 'H', '', '96b2ec2c-96df-4ad5-b668-a031d754305e', '3', '0', '0', '0', '0', '2018-12-07 14:15:41', '2018-12-07 14:15:41', null, '1', '', null, null, null, null, '0', null, null, null, null, '000121_9_275f5267cec94dd4aa7efa0c0583b47a');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013790', '1', '650.000000000000000000000000000000', '0.000000000000000000000000000000', '2', 'P', '2018-12-09 13:45:21.000000', 'H', '', 'bf394540-25c2-4805-ae5e-aefa696e5c24', '1', '0', '0', '0', '0', '0001-01-01 00:00:00', '0001-01-01 00:00:00', null, '1', '1', null, null, null, null, '0', null, null, null, null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013789', '11', '1130.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-09 13:43:18.000000', 'H', '', 'd143469f-2d9d-4cf4-bef5-804aa94eac75', '3', '0', '0', '0', '0', '2018-12-09 13:45:50', '2018-12-09 13:45:50', null, '1', '111', null, null, null, null, '0', null, null, null, null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800012719', 'TAGack1811140004', '890.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-11-14 17:07:39.000000', 'H', '', 'd45d2dc6-9493-429a-84f0-5e132035e1ac', '3', '0', '0', '0', '0', '2018-11-14 17:10:30', '2018-11-14 17:10:30', null, '1', 'fr', null, null, null, null, '0', null, null, null, null, 'GackG1022002');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800012389', 'TAGack1811050004', '2900.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'P', '2018-11-05 20:41:02.000000', 'F', '', 'd4da0343-ffd1-4bff-938a-aa3cbdc71bf3', '4', '0', '0', '0', '0', '2018-11-05 20:43:08', '2018-11-05 20:43:08', null, '1', '', null, null, null, null, '0', null, null, null, null, 'GackG1022002');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013786', '123', '970.000000000000000000000000000000', '0.000000000000000000000000000000', '2', 'P', '2018-12-09 13:07:06.000000', 'H', '', 'd90f632c-681c-450b-93f8-78540c3898f4', '3', '0', '0', '0', '0', '2018-12-09 13:09:27', '2018-12-09 13:09:27', null, '1', '123', null, null, null, null, '0', null, null, null, null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013750', '', '4640.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-07 17:54:37.000000', 'H', '', 'e20f2747-9787-436a-bbc8-f648e61e71e4', '3', '0', '0', '0', '0', '2018-12-07 17:57:13', '2018-12-07 17:57:13', null, '1', '', null, null, null, null, '0', null, null, null, null, '000121_9_275f5267cec94dd4aa7efa0c0583b47a');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013792', '', '830.000000000000000000000000000000', '0.000000000000000000000000000000', '2', 'P', '2018-12-09 15:06:15.000000', 'H', '', 'e888c5ce-dd80-432f-b413-a5fa73d9bf49', '3', '0', '0', '0', '0', '2018-12-09 15:08:54', '2018-12-09 15:08:54', null, '1', '', null, null, null, null, '0', null, null, null, null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_flight_order` VALUES ('GACK_OA', 'S117614', 'T03', 'TB1800013301', 'TA0091811290044', '1080.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-11-29 20:01:33.000000', 'H', '', 'f47bc4ed-a67b-4f2a-ae54-7daad7acb251', '3', '0', '0', '0', '0', '2018-11-29 20:03:58', '2018-11-29 20:03:58', null, '1', '', null, null, null, null, '0', null, null, null, null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');

-- ----------------------------
-- Table structure for `tmc_flight_refund_ins_dtl`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_flight_refund_ins_dtl`;
CREATE TABLE `tmc_flight_refund_ins_dtl` (
  `CreateBy` longtext,
  `CreateAt` datetime(6) NOT NULL,
  `ModifyBy` longtext,
  `ModifyAt` datetime(6) DEFAULT NULL,
  `Id` char(36) NOT NULL COMMENT '主键',
  `OrderNo` longtext,
  `FlightRefundDtlId` char(36) NOT NULL,
  `InsuranceNumber` int(11) DEFAULT NULL COMMENT '退保份数 Y',
  `InsuranceTypeName` longtext COMMENT '保险种类 Y',
  `InsuranceUnitPrice` decimal(10,0) DEFAULT NULL COMMENT '保险单价 Y',
  `RefundInsuranceFee` decimal(10,0) DEFAULT NULL COMMENT '退保费 Y',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：未删除 1：删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_flight_refund_ins_dtl
-- ----------------------------

-- ----------------------------
-- Table structure for `tmc_flight_refund_ticket`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_flight_refund_ticket`;
CREATE TABLE `tmc_flight_refund_ticket` (
  `CreateBy` longtext,
  `CreateAt` datetime(6) NOT NULL,
  `ModifyBy` longtext,
  `ModifyAt` datetime(6) DEFAULT NULL,
  `Id` char(36) NOT NULL COMMENT '主键',
  `OrderId` longtext,
  `TokenNO` longtext COMMENT '退款交易流水号',
  `Audited` longtext COMMENT '退票审核状态',
  `RefundOrderId` longtext,
  `PayCustomerAmount` decimal(10,0) DEFAULT NULL COMMENT '退客户金额',
  `OtherDeductibleAmount` decimal(10,0) DEFAULT NULL COMMENT '其他扣除金额',
  `RefundAplyTime` datetime DEFAULT NULL COMMENT '退票申请时间 格式：yyyy-MM-dd HH:mm:ss',
  `RefundAuditedTime` datetime DEFAULT NULL COMMENT '退票审核时间 格式：yyyy-MM-dd HH:mm:ss',
  `RefundTime` datetime DEFAULT NULL COMMENT '退票时间 格式：yyyy-MM-dd HH:mm:ss',
  `RefundDesc` longtext COMMENT '备注 C	已取消H	已提交待申请P	退票处理中D	退票单已完成S	已退款',
  `RefundStatus` int(11) DEFAULT NULL COMMENT '退票状态 1:退票申请 2:退票中 3：退票成功 4：退票撤销',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：未删除 1：删除',
  `TmcException` longtext COMMENT 'tmc异常标识,异常 数字以,隔开',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_flight_refund_ticket
-- ----------------------------
INSERT INTO `tmc_flight_refund_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '14daebfb-c9d1-4ebb-a251-2d1958228dd3', 'd4da0343-ffd1-4bff-938a-aa3cbdc71bf3', null, null, 'TR1800001453', '2900', '0', null, null, null, '', '3', '0', '');

-- ----------------------------
-- Table structure for `tmc_flight_refund_ticket_dtl`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_flight_refund_ticket_dtl`;
CREATE TABLE `tmc_flight_refund_ticket_dtl` (
  `CreateBy` longtext,
  `CreateAt` datetime(6) NOT NULL,
  `ModifyBy` longtext,
  `ModifyAt` datetime(6) DEFAULT NULL,
  `Id` char(36) NOT NULL COMMENT '主键',
  `FlightTicketId` longtext COMMENT 'FlightTicketId',
  `OrderId` longtext COMMENT '订单ID',
  `FlightRefundId` char(36) DEFAULT NULL COMMENT '退票信息id',
  `Sequences` longtext COMMENT '航程序号s',
  `FlightIds` longtext,
  `FlightId` longtext,
  `Sequence` int(11) DEFAULT NULL COMMENT '航程序号 N',
  `TicketNo` longtext COMMENT '票号 N	春秋航空与国际TravelFusion渠道机票不返回票号信息。',
  `Flight` longtext COMMENT '航班号 N',
  `PassengerName` longtext COMMENT '乘机人 N',
  `RefundFee` decimal(10,0) DEFAULT NULL COMMENT '退票费 Y	不包含商旅退票服务费',
  `RefundRate` decimal(10,0) DEFAULT NULL COMMENT '退票费率 Y',
  `RefundServiceFee` decimal(10,0) DEFAULT NULL COMMENT '商旅退票服务费 Y',
  `RebookingId` longtext COMMENT '改签id Y',
  `AirLineCode` longtext COMMENT '航司三字编码 Y',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：未删除 1：删除',
  `FlightOrderInfoId` char(36) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_flight_refund_ticket_dtl
-- ----------------------------
INSERT INTO `tmc_flight_refund_ticket_dtl` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '187e552c-d8b7-4825-b664-9a61fadb5b71', 'f107a78497bb5bc14668b94e6e0fe3b6', null, '14daebfb-c9d1-4ebb-a251-2d1958228dd3', '1', '4607a6e73c6a2aba33eac1c52f2dbe38', null, '0', null, null, '测试审批人', '0', '0', '0', null, null, '0', 'd4da0343-ffd1-4bff-938a-aa3cbdc71bf3');
INSERT INTO `tmc_flight_refund_ticket_dtl` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'cc208c7b-d577-475b-b951-feee44142c15', '673038e4eb477a956bf7e1584838482d', null, '14daebfb-c9d1-4ebb-a251-2d1958228dd3', '1', '4607a6e73c6a2aba33eac1c52f2dbe38', null, '0', null, null, '朱小华', '0', '0', '0', null, null, '0', 'd4da0343-ffd1-4bff-938a-aa3cbdc71bf3');

-- ----------------------------
-- Table structure for `tmc_flight_settlement_order`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_flight_settlement_order`;
CREATE TABLE `tmc_flight_settlement_order` (
  `Id` char(36) NOT NULL COMMENT '主键',
  `Sequence` longtext COMMENT '航程序号',
  `CreateTime` datetime DEFAULT NULL COMMENT '结算生成时间',
  `AccCheckBatchNo` longtext COMMENT '结算批次号',
  `AccBalanceBatchNo` longtext COMMENT '付款批次号',
  `Remark` longtext COMMENT '备注信息',
  `UnDeterminedAmount` decimal(10,0) DEFAULT NULL COMMENT '未确定金额',
  `Price` decimal(10,0) DEFAULT NULL COMMENT '成交净价',
  `Tax` decimal(10,0) DEFAULT NULL COMMENT '民航基金/税',
  `OilFee` decimal(10,0) DEFAULT NULL COMMENT '燃油',
  `SendTicketFee` decimal(10,0) DEFAULT NULL COMMENT '送票费',
  `InsuranceFee` decimal(10,0) DEFAULT NULL COMMENT '保险费',
  `ServiceFee` decimal(10,0) DEFAULT NULL COMMENT '服务费',
  `RefundServiceFee` decimal(10,0) DEFAULT NULL COMMENT '退票服务费',
  `Refund` decimal(10,0) DEFAULT NULL COMMENT '退票费',
  `Amount` decimal(10,0) DEFAULT NULL COMMENT '应收金额',
  `RebookQueryFee` decimal(10,0) DEFAULT NULL COMMENT '改签费',
  `ReBookingServiceFee` decimal(10,0) DEFAULT NULL COMMENT '改签服务费',
  `OrderDetailType` longtext COMMENT '退改签类型 1出票 2改签 3退票 4取消 5调整',
  `SubAccCheckBatchNo` longtext COMMENT '结算子批次号',
  `SettlementCurrency` longtext COMMENT '结算币种code',
  `ReserveId` longtext COMMENT '预订人ID',
  `ReserveName` longtext COMMENT '预定人名',
  `JourneyReason` longtext COMMENT '出行原因',
  `OrderStatus` longtext COMMENT '订单状态   W	已提交 P	处理中 C	已取消 S	已成交 R	已退票 T	部分退票',
  `PrintTicketTime` datetime DEFAULT NULL COMMENT '出票日期',
  `OrderDate` datetime DEFAULT NULL COMMENT '订单日期',
  `RebookOrderId` longtext COMMENT '改签原订单号',
  `EmployeeId` longtext COMMENT '乘机人',
  `EmployeeName` longtext COMMENT '乘机人',
  `SegStatus` longtext COMMENT '机票使用情况 1	待使用（OpenForUse）2	已使用（USED/FLOWN）3	已经办理登记（CHECKED-IN）            4	已离港（LIFT/BOARDED）5	已作废（VOID）6	已退票（REFUNDED）7	换开（EXCHANGED）              8	挂起（SUSPENDED）9	机场控制（AIRPORT CNTL）10	机场控制（CPN NOTE）11	未查到（NOT FOUND）',
  `TicketNo` longtext COMMENT '票号',
  `CardTypeName` longtext COMMENT '证件类型',
  `CardTypeNumber` longtext COMMENT '证件号码',
  `RebookSeqence` longtext COMMENT '航程编号',
  `RebookPassengerName` longtext COMMENT '乘机人姓名',
  `RebookingTime` datetime DEFAULT NULL COMMENT '改签时间',
  `RebookedTime` datetime DEFAULT NULL COMMENT '改签完成时间',
  `RebookTakeOffTime` datetime DEFAULT NULL COMMENT '改签后起飞时间',
  `RebookArrivalTime` datetime DEFAULT NULL COMMENT '改签后到达时间',
  `RebookClassName` longtext COMMENT '改签后舱位',
  `RebookSubClass` longtext COMMENT '改签后子舱位',
  `ExchangeFlight` longtext COMMENT '改签后航班',
  `ChTicketNo` longtext COMMENT '改签后票号',
  `RefundPassengerName` longtext COMMENT '乘机人姓名',
  `RefundTime` datetime DEFAULT NULL COMMENT '退票时间',
  `RefundFlight` longtext COMMENT '退票航班号',
  `RefundTicketNo` longtext COMMENT '退票票号',
  `TakeOffTime` datetime DEFAULT NULL COMMENT '起飞时间',
  `ArrivalTime` datetime DEFAULT NULL COMMENT '到达时间',
  `DepartCityName` longtext COMMENT '出发城市名称',
  `ArrivalCityName` longtext COMMENT '到达城市名称',
  `DepartPortName` longtext COMMENT '出发机场名称',
  `ArrivalPortName` longtext COMMENT '到达机场名称',
  `Flight` longtext COMMENT '航班号',
  `Classes` longtext COMMENT '父舱位名称',
  `ClassName` longtext COMMENT '父舱位名称',
  `SubClass` longtext COMMENT '子舱位',
  `BfReturn` longtext COMMENT '是否前返 (T:是，F/空:否)',
  `CustomerId` longtext COMMENT '是否三方协议 (T:是，F:否)',
  `StandardPrice` decimal(10,0) DEFAULT NULL COMMENT '标准价',
  `PriceRate` decimal(10,0) DEFAULT NULL COMMENT '折扣',
  `FlightTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_flight_settlement_order
-- ----------------------------

-- ----------------------------
-- Table structure for `tmc_fligh_rebook`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_fligh_rebook`;
CREATE TABLE `tmc_fligh_rebook` (
  `CreateBy` longtext,
  `CreateAt` datetime(6) NOT NULL,
  `ModifyBy` longtext,
  `ModifyAt` datetime(6) DEFAULT NULL,
  `Id` char(36) NOT NULL COMMENT '主键',
  `FlightTicketId` longtext,
  `OriFlightTicketId` longtext,
  `OrderNo` longtext COMMENT '订单id',
  `PassengerInfoId` char(36) DEFAULT NULL COMMENT '乘客Id',
  `TicketId` longtext COMMENT 'tmc票id',
  `Sequence` int(11) DEFAULT NULL COMMENT '航程序号',
  `RebookId` longtext COMMENT '改签流水号		Y',
  `Sequences` longtext COMMENT '航程序号s',
  `FlightId` int(11) DEFAULT NULL COMMENT 'FlightId',
  `FlightIds` longtext,
  `TmcUserId` longtext,
  `TmcUserName` longtext,
  `PassengerName` longtext COMMENT '乘客姓名 N',
  `ChStatus` longtext COMMENT '改签状态描述 0.改签已提交 1.改签处理中 2.改签已取消 3.改签成功 4.改签失败',
  `ChFee` decimal(10,0) DEFAULT NULL COMMENT '改签费 Y 单次改签费，单次改签可能包含多人，个人改签费为【PriceDifferential + DateTimeChangeFee】（不包含发票配送费，改签服务费）',
  `RebookServiceFee` decimal(10,0) DEFAULT NULL COMMENT '改签服务费 Y',
  `RebookingTime` datetime DEFAULT NULL COMMENT '改签时间 Y	格式：yyyy-MM-dd HH:mm:ss',
  `RebookedTime` datetime DEFAULT NULL COMMENT '改签完成时间 Y	格式：yyyy-MM-dd HH:mm:ss',
  `OriTicketNo` longtext COMMENT '原票号 Y	春秋航空与国际TravelFusion渠道机票不返回票号信息。',
  `ChTicketNo` longtext COMMENT '改签后票号 Y	春秋航空与国际TravelFusion渠道机票不返回票号信息。',
  `ChAirline` longtext COMMENT 'String	航司 Y	航司二字码',
  `ChAirlineName` longtext COMMENT '航司中文 Y',
  `ChAirType` longtext COMMENT '机型 Y',
  `ChFlight` longtext COMMENT '航班编号 Y',
  `SubClass` longtext COMMENT '子舱位 Y',
  `ChTakeOffTime` datetime DEFAULT NULL COMMENT 'TimeTime 起飞时间 Y	格式：yyyy-MM-dd HH:mm:ss',
  `ChArrivalTime` datetime DEFAULT NULL COMMENT 'TimeTime 到达时间 Y	格式：yyyy-MM-dd HH:mm:ss',
  `ChDepartCityName` longtext COMMENT '起飞城市名称 Y',
  `ChDepartPortName` longtext COMMENT '起飞机场名称 Y',
  `ChDepartTerminalName` longtext COMMENT '起飞航站楼 Y',
  `ChArriveCityName` longtext COMMENT '到达城市名称 Y',
  `ChArrivePortName` longtext COMMENT '到达机场名称 Y',
  `ChArriveTerminalName` longtext COMMENT '到达航站楼 Y',
  `RebookStatus` longtext COMMENT '改签状态code Y 0.改签已提交 1.改签处理中 2.改签已取消 3.改签成功 4.改签失败',
  `PriceDifferential` decimal(10,0) DEFAULT NULL COMMENT '差价 0	N	改签费中升舱费用(仅国内机票)',
  `DateChangeFee` decimal(10,0) DEFAULT NULL COMMENT '更改费	 0	N	改签费中的更改航班费用(仅国内机票)',
  `SendTicketFee` decimal(10,0) DEFAULT NULL COMMENT '发票配送费	 0	N	发票配送费(仅国内机票)',
  `ChAirLineCode` longtext COMMENT '改签后航司三字编码	Y',
  `OriAirLineCode` longtext COMMENT '原票号航司三字编码  Y',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：未删除 1：删除',
  `TmcException` longtext COMMENT 'tmc异常标识,异常 数字以,隔开',
  `FlightOrderInfoId` char(36) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_fligh_rebook
-- ----------------------------
INSERT INTO `tmc_fligh_rebook` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'c56db37f-43c6-4465-82ac-cb6fb40cae9d', '06951d69bee9a4c2cb98705bb39ff7e0', '658a880449d531bd7e553124a05e3783', 'TB1800012438', '13ff536f-287d-4fc7-8bae-5b90d93ec637', null, '0', 'TC1800001629', '1,', '0', '108520c0a4a0ba21d74e59e77af752a3,', null, null, '朱小华', '3', '1010', '0', '2018-11-07 14:01:29', '2018-11-07 14:01:29', '222-8312183402', '222-5147232488', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1010', '0', '0', null, null, '0', '', '29acfa4f-0a6f-473d-8136-958af0dded37');
INSERT INTO `tmc_fligh_rebook` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'db616512-227e-491b-919d-139c2aa3d0c6', '50a1738796b53e94571ef5a668237782', '69dc20e6b127bb16268327ce60169693', 'TB1800012438', 'bb5b8dcc-c40c-427e-9ea7-0abab6409d15', null, '0', 'TC1800001629', '1,', '0', '108520c0a4a0ba21d74e59e77af752a3,', null, null, '测试审批人', '3', '1010', '0', '2018-11-07 14:01:29', '2018-11-07 14:01:29', '222-5147248487', '222-5147232487', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1010', '0', '0', null, null, '0', '', '29acfa4f-0a6f-473d-8136-958af0dded37');

-- ----------------------------
-- Table structure for `tmc_fligh_ticket`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_fligh_ticket`;
CREATE TABLE `tmc_fligh_ticket` (
  `Id` char(36) NOT NULL COMMENT '主键',
  `FlightTicketId` longtext COMMENT 'FlightTicketId',
  `TicketId` longtext COMMENT 'tmc',
  `OrderId` longtext COMMENT '订单id',
  `PassengerInfoId` char(36) DEFAULT NULL COMMENT '乘客Id',
  `Sequence` int(11) DEFAULT NULL COMMENT '航程序号',
  `Sequences` longtext COMMENT '航程序号s',
  `FlightId` longtext NOT NULL,
  `FlightIds` longtext,
  `TicketNo` longtext COMMENT '票号 N            -1	未知（UnKnow）1	待使用（OpenForUse）2	已使用（USED/FLOWN）3	已经办理登记（CHECKED-IN）            4	已离港（LIFT/BOARDED）5	已作废（VOID）6	已退票（REFUNDED）7	换开（EXCHANGED）            8	挂起（SUSPENDED）9	机场控制（AIRPORT CNTL） 10	机场控制（CPN NOTE） 11	未查到（NOT FOUND）            （Ticket number is   not exist or passenger data not found）',
  `Status` int(11) NOT NULL,
  `AirLineCode` longtext,
  `TmcUserId` longtext,
  `TmcUserName` longtext,
  `UserId` longtext,
  `StandardPrice` decimal(10,0) DEFAULT NULL COMMENT '标准价 该舱等的全价',
  `Amount` decimal(10,0) DEFAULT NULL COMMENT '机票价格+燃油+机建',
  `Price` decimal(10,0) DEFAULT NULL COMMENT '机票价格',
  `PrintPrice` decimal(10,0) DEFAULT NULL COMMENT '机票票面价格/航空公司卖价',
  `PriceRate` decimal(10,2) DEFAULT NULL COMMENT '机票折扣	机票票价折扣率',
  `OilFee` decimal(10,0) DEFAULT NULL COMMENT '燃油费',
  `Tax` decimal(10,0) DEFAULT NULL COMMENT '税/机建费',
  `ServerFee` decimal(10,0) DEFAULT NULL COMMENT '服务费',
  `RefundFee` decimal(10,0) DEFAULT NULL COMMENT '退票费 Y 不包含商旅退票服务费',
  `RefundRate` decimal(10,0) DEFAULT NULL COMMENT '退票费率 Y',
  `RefundServiceFee` decimal(10,0) DEFAULT NULL COMMENT '商旅退票服务费 Y',
  `ChFee` decimal(10,0) DEFAULT NULL COMMENT '改签费	 	改签费为【PriceDifferential + DateChangeFee】',
  `PriceDifferential` decimal(10,0) DEFAULT NULL COMMENT '差价	 0	N	改签费中升舱费用(仅国内机票)',
  `RebookServiceFee` decimal(10,0) DEFAULT NULL COMMENT '改签服务费 Y',
  `DateChangeFee` decimal(10,0) DEFAULT NULL COMMENT '更改费	 0	N	改签费中的更改航班费用(仅国内机票)',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：未删除 1：删除',
  `TMCException` longtext COMMENT 'tmc异常标识,异常 数字以,隔开',
  `FlightOrderInfoId` char(36) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_fligh_ticket
-- ----------------------------
INSERT INTO `tmc_fligh_ticket` VALUES ('13920d86-6a62-4552-b25c-1e2f998c2343', '03979b5998524fe2b283358fe6c071a2', null, 'TB1800013786', '72df440f-bade-4d92-961b-f4128bf10b02', '0', '1', '101cab5cf170f45f9df5d4a80483c333', '101cab5cf170f45f9df5d4a80483c333', '222-4254072716', '1', 'MU', null, null, null, '0', '970', '1490', '890', '0.60', '30', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, 'd90f632c-681c-450b-93f8-78540c3898f4');
INSERT INTO `tmc_fligh_ticket` VALUES ('168e7f87-9644-4c1f-8605-e4eb9574a1c2', '70f97aa0cff0745e5594a7d8fb768a54', null, 'TB1800013750', '370c0781-812c-4910-86d6-fdc59d0a3092', '0', '1', 'f391a7d75688cc678c3ddb4ead93447e', 'f391a7d75688cc678c3ddb4ead93447e', '222-8121413655', '1', 'MU', null, null, null, '0', '4640', '9120', '4560', '0.50', '30', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, 'e20f2747-9787-436a-bbc8-f648e61e71e4');
INSERT INTO `tmc_fligh_ticket` VALUES ('177707bb-f9dd-495d-ba37-dffef6d90a80', '4e103de9b020411323f0f67f2ed5bbd5', null, 'TB1800013789', 'ef1e8b73-ba89-433a-a68d-1aca2cfd0828', '0', '1', '470ba5aa70c75c7c22d87eeaf593363e', '470ba5aa70c75c7c22d87eeaf593363e', '222-4823570445', '1', 'ZH', null, null, null, '0', '1130', '1540', '1050', '0.68', '30', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, 'd143469f-2d9d-4cf4-bef5-804aa94eac75');
INSERT INTO `tmc_fligh_ticket` VALUES ('4c37e6b3-a146-4663-b99f-09d6b8b91461', '9494ccce5e68c5f4ba203926ae4d14b5', null, 'TB1800013429', '3cb94a80-e2f7-4b9a-b48c-3289cc1c7ee1', '0', '1', '492604b01c5954acb5a2f582dac22613', '492604b01c5954acb5a2f582dac22613', '222-4312376683', '1', 'CA', null, null, null, '0', '930', '1020', '860', '0.84', '20', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, '68910679-58f7-4854-8f69-288c3ce0b7eb');
INSERT INTO `tmc_fligh_ticket` VALUES ('6271d4cb-1c05-4e7c-b051-51123b444901', '444b16fe6a7097c09cea8a084698bb34', null, 'TB1800013792', '98527805-bdb3-4d22-8b0a-1cb143ecd294', '0', '1', '7b25e73469da474b4f25f7a164e88d62', '7b25e73469da474b4f25f7a164e88d62', '222-7613386842', '1', 'MU', null, null, null, '0', '830', '1880', '770', '0.41', '10', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, 'e888c5ce-dd80-432f-b413-a5fa73d9bf49');
INSERT INTO `tmc_fligh_ticket` VALUES ('64215dab-e5b8-411e-a9cd-a1500136bbd8', '658a880449d531bd7e553124a05e3783', null, 'TB1800012438', '13ff536f-287d-4fc7-8bae-5b90d93ec637', '0', '1', '3880a8375d3b888498d1593a3e371551', '3880a8375d3b888498d1593a3e371551', '222-8312183402', '7', 'CA', null, null, null, '0', '1130', '1360', '1030', '0.76', '50', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, '29acfa4f-0a6f-473d-8136-958af0dded37');
INSERT INTO `tmc_fligh_ticket` VALUES ('67bde5ca-8ad2-4342-afa9-a394d6a89f1c', 'b2c72e2255a42ebf73bfb395bc871d35', null, 'TB1800013699', '6fce40db-8d47-4bae-9bc5-be66cc1be93c', '0', '1', 'bbd703d54ef0b07a9acd59f2f515993a', 'bbd703d54ef0b07a9acd59f2f515993a', '222-4120076503', '1', 'MU', null, null, null, '0', '1480', '6260', '1400', '0.22', '30', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, '96b2ec2c-96df-4ad5-b668-a031d754305e');
INSERT INTO `tmc_fligh_ticket` VALUES ('75158280-7515-4487-8058-98a97eb5ba43', '', null, 'TB1800013790', '480cfa39-660c-45cb-b910-08dd639f7ea9', '0', '1', '47e65c52efbfdea7a57f7fe96b38b572', '47e65c52efbfdea7a57f7fe96b38b572', null, '-1', 'CZ', null, null, null, '0', '650', '1070', '590', '0.55', '10', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, 'bf394540-25c2-4805-ae5e-aefa696e5c24');
INSERT INTO `tmc_fligh_ticket` VALUES ('80b7e4f5-9099-423f-b66c-1692bfe16f09', 'efa22c5867af3bf1ba1592cae8ece4dd', null, 'TB1800012719', '1b9c69f3-c427-4f6c-b7d5-a2add099cfef', '0', '1', '00fb7e53566fda72833ace03d518831f', '00fb7e53566fda72833ace03d518831f', '222-2301146131', '1', 'MU', null, null, null, '0', '890', '1360', '790', '0.58', '50', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, 'd45d2dc6-9493-429a-84f0-5e132035e1ac');
INSERT INTO `tmc_fligh_ticket` VALUES ('8223469e-44db-4b80-aa27-1a31d56f9252', 'eade58d981d1e35a5ef0851ef8654c79', null, 'TB1800012747', 'ea01dd4b-e9a1-48be-bdf4-af9912db0884', '0', '1', '8e2bdaa43ac32f30466ac54373594acc', '8e2bdaa43ac32f30466ac54373594acc', '222-5462444713', '1', 'MU', null, null, null, '0', '650', '1360', '550', '0.40', '50', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, '8a436834-e28c-4274-8435-20e44c033b77');
INSERT INTO `tmc_fligh_ticket` VALUES ('8d89716d-0790-4ea9-8aef-1a5e636d16a6', '673038e4eb477a956bf7e1584838482d', null, 'TB1800012389', 'bbd27e2b-491e-4250-b38a-072e6fc1a936', '0', '1', '4607a6e73c6a2aba33eac1c52f2dbe38', '4607a6e73c6a2aba33eac1c52f2dbe38', '222-2385714004', '1', 'MU', null, null, null, '0', '1450', '1360', '1350', '0.99', '50', '-50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, 'd4da0343-ffd1-4bff-938a-aa3cbdc71bf3');
INSERT INTO `tmc_fligh_ticket` VALUES ('8e9dce1d-72c8-4f91-a8b0-6a35aa78a229', '519cd3c0f0e9a3c69b0d7267b8bab600', null, 'TB1800013298', '996f9282-856c-458a-8909-19f4cd7ecce7', '0', '1', 'bbb5faa64c89b3a4612c4519085da347', 'bbb5faa64c89b3a4612c4519085da347', '222-2776520352', '1', 'MU', null, null, null, '0', '1190', '1700', '1090', '0.64', '50', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, '2987c927-7215-4c22-8c91-1c6beacd12da');
INSERT INTO `tmc_fligh_ticket` VALUES ('9aea2630-1029-48b7-b217-bacf57d00720', '', null, 'TB1800013725', '8bf85087-0449-4723-852d-9b02001536fc', '0', '1', '7eb29ad4b2cdac3db17e9ee5c35feeac', '7eb29ad4b2cdac3db17e9ee5c35feeac', null, '-1', 'MU', null, null, null, '0', '6380', '8400', '6300', '0.75', '30', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, '2caab5bf-f005-4360-a219-8ffcdd3c0c73');
INSERT INTO `tmc_fligh_ticket` VALUES ('a183c6f2-b9f5-4e8b-8d03-798dcc303941', 'f0ef6a896a72a3cb96d0be502ad905f6', null, 'TB1800013302', '099123bd-f80a-40ed-a18b-59bff0cd4e55', '0', '1', '9491bf932121b2db1249054a3cea0fa7', '9491bf932121b2db1249054a3cea0fa7', '222-3412857343', '1', 'CA', null, null, null, '0', '1000', '1360', '900', '0.66', '50', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, '8abdb8a4-ffcd-4aca-8281-5640dc78164a');
INSERT INTO `tmc_fligh_ticket` VALUES ('bcb04379-2870-47cc-8ab9-ee4d4e8850a2', '5e40677577a2b18c5bacaae8f909dbcc', null, 'TB1800013788', 'b74165e9-66fd-4958-89e6-3aea30357b75', '0', '1', '00dec34f7155540f9a14aa7c04289ba7', '00dec34f7155540f9a14aa7c04289ba7', '222-3558173235', '1', 'MU', null, null, null, '0', '600', '1490', '520', '0.35', '30', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, '81618920-ad93-4617-a1ac-3a2e19332644');
INSERT INTO `tmc_fligh_ticket` VALUES ('d1be13f7-a69e-4fe5-8938-ca99bbd9b3b2', 'd9e44c0a36f55d6a86688a73cbc67527', null, 'TB1800013791', 'e85b6963-6df9-4a2a-9818-b94671d7505d', '0', '1', '499c37167497ed46d8670046ea747d5c', '499c37167497ed46d8670046ea747d5c', '222-3588745438', '1', 'FM', null, null, null, '0', '1660', '1760', '1580', '0.90', '30', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, '5140734c-5574-49ba-b31a-71eefa489547');
INSERT INTO `tmc_fligh_ticket` VALUES ('d39e0f65-5096-48e7-a902-05004d7d3e4f', '06951d69bee9a4c2cb98705bb39ff7e0', null, 'TB1800012438', '13ff536f-287d-4fc7-8bae-5b90d93ec637', '0', '1', '', '3880a8375d3b888498d1593a3e371551', '222-5147232488', '1', 'MU', null, null, null, '0', '2140', '4900', '2040', '0.42', '0', '0', '0', '0', '0', '0', '1010', '1010', '0', '0', '0', null, '29acfa4f-0a6f-473d-8136-958af0dded37');
INSERT INTO `tmc_fligh_ticket` VALUES ('d7bb5b65-4335-41e7-a6d3-d922fd15e69c', 'b806b8cdb9942b48119dda21e641bed1', null, 'TB1800013301', '0c468154-e435-4946-82c8-887572ef068b', '0', '1', 'b6455934407f33535d14fc6bc17b84e8', 'b6455934407f33535d14fc6bc17b84e8', '222-2374322450', '1', 'CZ', null, null, null, '0', '1080', '1550', '980', '0.63', '50', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, 'f47bc4ed-a67b-4f2a-ae54-7daad7acb251');
INSERT INTO `tmc_fligh_ticket` VALUES ('de3b0796-1c93-4198-9284-b76ab9ad61ad', 'f107a78497bb5bc14668b94e6e0fe3b6', null, 'TB1800012389', 'b2ac4b7d-1818-4d5f-a110-5fa4bc9c19d8', '0', '1', '4607a6e73c6a2aba33eac1c52f2dbe38', '4607a6e73c6a2aba33eac1c52f2dbe38', '222-2611624085', '1', 'MU', null, null, null, '0', '1450', '1360', '1350', '0.99', '50', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, 'd4da0343-ffd1-4bff-938a-aa3cbdc71bf3');
INSERT INTO `tmc_fligh_ticket` VALUES ('e4755c66-91c1-438b-b030-681977dbf551', 'd3106d9bc9e59ab872b2d4003570753a', null, 'TB1800013687', 'dd339f85-61f4-4226-8ba6-689b6ea3a7c9', '0', '1', '3f7a74fa774d91e3cefeec91e7b95a46', '3f7a74fa774d91e3cefeec91e7b95a46', '222-8155574773', '1', 'CA', null, null, null, '0', '980', '1360', '900', '0.66', '30', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, '2bad5d04-dee0-49e1-8be3-9257f23b832d');
INSERT INTO `tmc_fligh_ticket` VALUES ('e7b28b25-295b-414d-bf3d-886bbbfd0db6', 'c9a7de38b890d00bf3d770965d2dff3b', null, 'TB1800013787', '068102b8-5d42-4563-9248-4ccad604ff29', '0', '1', 'c25980b5ed4451b0d910e0938df462bf', 'c25980b5ed4451b0d910e0938df462bf', '222-1154143286', '1', 'HO', null, null, null, '0', '650', '1240', '570', '0.46', '30', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, '40cf905c-73cd-406a-abba-35cc80861acd');
INSERT INTO `tmc_fligh_ticket` VALUES ('f41a5edb-9d7c-48a7-a241-936440fc1d24', '50a1738796b53e94571ef5a668237782', null, 'TB1800012438', 'bb5b8dcc-c40c-427e-9ea7-0abab6409d15', '0', '1', '', '3880a8375d3b888498d1593a3e371551', '222-5147232487', '1', 'MU', null, null, null, '0', '2140', '4900', '2040', '0.42', '0', '0', '0', '0', '0', '0', '1010', '1010', '0', '0', '0', null, '29acfa4f-0a6f-473d-8136-958af0dded37');
INSERT INTO `tmc_fligh_ticket` VALUES ('f608162c-0efd-43f9-8367-6d7c42d6c35e', '69dc20e6b127bb16268327ce60169693', null, 'TB1800012438', 'bb5b8dcc-c40c-427e-9ea7-0abab6409d15', '0', '1', '3880a8375d3b888498d1593a3e371551', '3880a8375d3b888498d1593a3e371551', '222-5147248487', '7', 'CA', null, null, null, '0', '1130', '1360', '1030', '0.76', '50', '50', '0', '0', '0', '0', '0', '0', '0', '0', '0', null, '29acfa4f-0a6f-473d-8136-958af0dded37');

-- ----------------------------
-- Table structure for `tmc_hotel_order`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_hotel_order`;
CREATE TABLE `tmc_hotel_order` (
  `AppKey` longtext,
  `OrgCode` longtext,
  `TmcSupplierId` longtext,
  `OrderNo` longtext,
  `ApprovalNo` longtext,
  `Amount` decimal(65,30) DEFAULT NULL,
  `ServiceFee` decimal(65,30) NOT NULL,
  `OnBusiness` int(11) NOT NULL,
  `PayType` longtext,
  `OrderDate` datetime(6) DEFAULT NULL,
  `ProductType` longtext,
  `CostCenterCode` longtext,
  `Id` char(36) NOT NULL COMMENT '主键',
  `Currency` longtext COMMENT '总价币种',
  `AmountRMB` decimal(65,30) DEFAULT NULL COMMENT '总金额(Amount转换为人民币币种的金额)',
  `Exchange` decimal(10,0) DEFAULT NULL COMMENT '汇率',
  `RefundAmount` decimal(10,0) DEFAULT NULL COMMENT 'decimal N 应退金额',
  `RefundFee` decimal(10,0) DEFAULT NULL COMMENT 'decimal N 退单费',
  `RefundServiceFee` decimal(10,0) DEFAULT NULL COMMENT 'decimal N 退服务费',
  `RefundStatus` int(11) DEFAULT NULL COMMENT '退单状态1:退单申请 2:退单中 3:退单成功 4.退单取消            1:已提交 2:已取消3:已确定 4:已成交            0/确认中	1.已确认 2.已成交	 3.已取消	4.订单未成交 订单未成交前，中止了预订，订单取消。 5. 未提交 用户最终未完成订单提交',
  `OrderStatus` int(11) DEFAULT NULL COMMENT '订单状态',
  `HotelType` longtext COMMENT '酒店类型：Y	协议酒店；会员酒店',
  `HotelName` longtext COMMENT '酒店名称',
  `Star` int(11) DEFAULT NULL COMMENT '酒店星级',
  `HotelPhone` longtext COMMENT '酒店电话',
  `Address` longtext COMMENT '酒店地址',
  `StartTime` datetime DEFAULT NULL COMMENT '入住时间',
  `EndTime` datetime DEFAULT NULL COMMENT '离店时间',
  `LastCancelTime` datetime DEFAULT NULL COMMENT '最晚取消时间',
  `ProvinceName` longtext COMMENT '省、直辖市英文名',
  `CityName` longtext COMMENT '城市名称',
  `ClientName` longtext COMMENT '入住人姓名',
  `ContactEmail` longtext COMMENT '联系邮箱',
  `ContactName` longtext COMMENT '联系人',
  `ContactTel` longtext COMMENT '联系电话',
  `RoomName` longtext COMMENT '房型名称',
  `RoomQuantity` int(11) DEFAULT NULL COMMENT '房间数',
  `IsDomestic` bit(1) DEFAULT NULL COMMENT 'true: 国内 false: 海外',
  `RoomDays` int(11) DEFAULT NULL COMMENT '间夜数',
  `GdLat` longtext COMMENT '高德地图纬度',
  `GdLon` longtext COMMENT '高德地图经度',
  `GgLat` longtext COMMENT 'Google地图纬度',
  `GgLon` longtext COMMENT 'Google地图经度',
  `Lat` longtext COMMENT '酒店纬度',
  `PostAmount` decimal(10,0) DEFAULT NULL,
  `CustomerEval` decimal(10,0) DEFAULT NULL,
  `StarLicence` varchar(50) DEFAULT NULL,
  `Corp_payType` varchar(50) DEFAULT NULL,
  `AuthorizeStatus` varchar(50) DEFAULT NULL,
  `Lon` longtext COMMENT '酒店经度',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：未删除 1：删除',
  `Detail_Item_ID` varchar(100) DEFAULT NULL,
  `EmployeeNo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_hotel_order
-- ----------------------------
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003485', '', '13808.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-07 14:29:03.000000', 'H', '', '007e1a24-b738-4f43-b655-1feab24d8894', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '北京国贸大酒店', '5', '010-65052299', '建国门外大街1号(前台位于64层)', '2018-12-07 00:00:00', '2018-12-09 00:00:00', '2018-12-07 00:00:00', null, '北京', null, '', '苗卓', '15010437080', '', '1', '', '2', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_275f5267cec94dd4aa7efa0c0583b47a');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003467', 'TA0091812040001', '824.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-04 10:58:56.000000', 'H', '', '00c2b357-c568-4b78-aedf-4e1ae5cf9049', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '重庆西正商务酒店', '1', '023-13983018574', '渝北回兴宝圣大道466号万科朗润园11栋', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '2018-12-04 00:00:00', null, '重庆', null, '', '大王', '13691122951', '', '1', '', '8', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_38b88a512970489f9f08156bf01b6f65');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003497', '', '7524.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-10 09:58:27.000000', 'H', '', '16c4d52c-4712-488b-a5a0-707e40e1eafe', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '犀客空间(北京国贸和乔丽致店)', '1', '18610147569', '北京市朝阳区国贸光华路8号', '2018-12-11 00:00:00', '2018-12-20 00:00:00', '2018-12-11 00:00:00', null, '北京', null, '', '啊啊', '15711156639', '', '1', '', '9', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_3784c6d793e64eeeb49a8094a879886d');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003493', 'TA0091812090002', '159.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-09 13:13:34.000000', 'H', '', '2f444293-37e9-439c-8c63-2aa5045a683c', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '天津西海岸豪华酒店公寓', '1', '15332159922', '天津 和平区 荣业大街新汇华庭12号楼', '2018-12-18 00:00:00', '2018-12-19 00:00:00', '2018-12-18 00:00:00', null, '天津', null, '', '李胜勇测试二号', '15216664272', '预付', '1', '', '1', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002283', 'TAGack1811070005', '77.000000000000000000000000000000', '2.000000000000000000000000000000', '1', 'P', null, null, '', '45c2f9db-4e33-4013-8143-00d289863b79', null, null, '0', '0', '0', '0', '0', '3', null, null, '0', null, null, '0001-01-01 00:00:00', '0001-01-01 00:00:00', '0001-01-01 00:00:00', null, null, null, '2332424@qq.com', '朱小华', null, null, '0', '', '0', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', '', 'GackG1022002');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003461', 'TA0091812040001', '864.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-04 09:12:55.000000', 'H', '', '56d703a9-bd6d-4bff-b9f9-1f079a6c799d', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '垫江朝阳宾馆', '1', '023-74602828', '重庆垫江县桂溪街道建新路221号', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '2018-12-04 00:00:00', null, '重庆', null, '', '大王', '13691122951', '', '1', '', '8', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_38b88a512970489f9f08156bf01b6f65');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003457', 'TA0091811300001', '4518.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-11-30 10:49:25.000000', 'H', '', '62466c4c-6365-41e9-a238-313a8e65a839', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '三亚西藏大厦开元名都酒店', '1', '0898-88207777', '凤翔路', '2018-11-30 00:00:00', '2018-12-03 00:00:00', '2018-11-30 00:00:00', null, '三亚', null, '', '李胜勇测试二号', '15216664272', '', '1', '', '3', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003469', 'TA0091812040018', '87210.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'P', '2018-12-04 15:10:31.000000', 'H', '', '79f911e8-257f-48c1-932a-b543c8087178', 'RMB', null, '0', '0', '0', '0', '0', '1', null, '上海鹏利辉盛阁国际公寓', '5', '021-63788888', '银城中路600弄1号', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '2018-12-05 00:00:00', null, '上海', null, '', '家具加工厂', '18311342709', '到店付', '1', '', '17', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_3887cd461d3246479020b9136c81d7ca');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003460', 'TA0091812030003', '8416.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-03 15:27:10.000000', 'H', '', '8c64f378-5b62-4468-9257-d78773d24d29', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '厦门集大宾馆', '1', '0592-6681188', '厦门市集美区银江路183号', '2018-12-03 00:00:00', '2018-12-13 00:00:00', '2018-12-03 00:00:00', null, '厦门', null, '', '来教育他具体在真', '18311342709', '', '1', '', '10', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_3887cd461d3246479020b9136c81d7ca');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003463', 'TA0091812040001', '2181.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-04 09:27:46.000000', 'H', '', '8e8d4711-97f9-4e0c-9f80-7b35ec9b92a7', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '重庆晴天酒店式公寓', '1', '023-63815550', '八一路恒通云鼎国际公寓260号A', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '2018-12-04 00:00:00', null, '重庆', null, '', '大王', '13691122951', '', '1', '', '8', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_38b88a512970489f9f08156bf01b6f65');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003237', 'TAGack1811140004', '218.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-11-14 16:39:46.000000', 'H', '', '8f1dee53-a553-4986-9a29-627e55527b16', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '上海民校联盟之家', '1', '13918112520', '崇明县竖新镇育才村直河609号', '2018-11-16 00:00:00', '2018-11-18 00:00:00', '2018-11-16 00:00:00', null, '上海', null, '2332424@qq.com', '朱小华', '13321312322', '预付', '1', '', '2', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, 'GackG1022002');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003455', 'TA0091811290042', '169.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-11-30 09:52:38.000000', 'H', '', '9c516d1d-1735-4f65-bfc8-ec5492e49fc9', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '速8酒店(北京天坛南门赵公口店)(原盛庭宾馆)', '1', '010-87256419', '光彩路西赵公口15号', '2018-11-30 00:00:00', '2018-12-01 00:00:00', '2018-11-30 00:00:00', null, '北京', null, '', '李胜勇测试二号', '15216664272', '', '1', '', '1', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003490', '', '6889.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-07 16:17:17.000000', 'H', '', '9d4ac861-a5c5-4ffb-b5c6-151e5c038888', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '北京三里屯通盈中心洲际酒店', '5', '010-65308888', '南三里屯路1号楼', '2018-12-07 00:00:00', '2018-12-08 00:00:00', '2018-12-07 00:00:00', null, '北京', null, '', '啊啊', '15711156639', '', '1', '', '1', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_3784c6d793e64eeeb49a8094a879886d');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003453', 'TA0091811290044', '849.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-11-29 19:52:43.000000', 'H', '', '9ef0108b-1120-4002-b10c-4e80c73da771', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '上海华亭宾馆', '5', '', '漕溪北路1200号', '2018-11-30 00:00:00', '2018-12-01 00:00:00', '2018-11-30 00:00:00', null, '上海', null, '', '李胜勇测试二号', '15216664272', '', '1', '', '1', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003462', 'TA0091812040001', '1584.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-04 09:17:48.000000', 'H', '', 'a09771a0-80c1-48c2-a29c-7d23aaf7374a', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '重庆达家主题酒店', '1', '023-86317866', '亚太路玖玺国际一栋9-1(距南坪会展中心200米 凯宾斯基酒店斜对面)', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '2018-12-04 00:00:00', null, '重庆', null, '', '大王', '13691122951', '', '1', '', '8', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_38b88a512970489f9f08156bf01b6f65');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003454', 'TA0091811290042', '142.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-11-29 20:17:18.000000', 'H', '', 'a8b5a717-382a-459f-a247-a50e851a485a', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '北京司马台新村丽红客栈', '1', '13552349405', '北京密云区古北口镇司马台村沙岭村23-1号', '2018-11-30 00:00:00', '2018-12-01 00:00:00', '2018-11-30 00:00:00', null, '北京', null, '', '李胜勇测试二号', '15216664272', '', '1', '', '1', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003249', '', '100.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-11-15 13:35:02.000000', 'H', '', 'bee852db-c2e5-4d78-ab3f-ab4587493b6c', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '上海龙吴旅馆', '1', '021-54364190', '龙吴路1688号李家宅17号', '2018-11-15 00:00:00', '2018-11-16 00:00:00', '2018-11-15 00:00:00', null, '上海', null, '2332424@qq.com', '朱小华', '13321312322', '预付', '1', '', '1', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, 'GackG1022002');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003487', '', '626.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-07 16:02:55.000000', 'H', '', 'c16c5869-f9e6-4458-ae95-7f3ab05b0788', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '如家派柏云酒店(北京四惠东地铁站店)', '1', '010-65447255', '朝阳区建国东路康家沟168号', '2018-12-07 00:00:00', '2018-12-09 00:00:00', '2018-12-07 00:00:00', null, '北京', null, '', '苗卓', '15010437080', '', '1', '', '2', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_275f5267cec94dd4aa7efa0c0583b47a');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003459', 'TA0091811300002', '1260.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-03 10:17:01.000000', 'H', '', 'c85aa5ef-984a-4a56-b2ff-d0fe7f369740', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '马尔康长盛宾馆', '1', '18909048318', '阿坝藏族羌族自治州 马尔康市 粮贸大厦(金珠街16号) 张菊梅', '2018-12-03 00:00:00', '2018-12-10 00:00:00', '2018-12-03 00:00:00', null, '阿坝', null, '', '李胜勇测试二号', '15216664272', '', '1', '', '7', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003248', 'TAGack1811150001', '131.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-11-15 13:28:39.000000', 'H', '', 'd0056361-3cb2-4f75-8d99-8ca260dc7fc6', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '创锋旅馆(上海下南店)', '1', '021-68366597', '下南路1049号', '2018-12-08 00:00:00', '2018-12-09 00:00:00', '2018-12-08 00:00:00', null, '上海', null, '2332424@qq.com', '朱小华', '13321312322', '预付', '1', '', '1', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, 'GackG1022002');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003488', '', '236.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-07 16:03:05.000000', 'H', '', 'd11fbc87-901a-4c3d-be55-eb29e903f0b0', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '速8酒店(北京天坛南门赵公口店)(原盛庭宾馆)', '1', '010-87256419', '光彩路西赵公口15号', '2018-12-07 00:00:00', '2018-12-08 00:00:00', '2018-12-07 00:00:00', null, '北京', null, '', '啊啊', '15711156639', '', '1', '', '1', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_3784c6d793e64eeeb49a8094a879886d');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003456', 'TA0091811300001', '927.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-11-30 10:28:09.000000', 'H', '', 'd6b7d3f3-67d6-4cc1-a5df-5f2ad8d16bde', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '上海超蒙宾馆', '1', '021-54721508', '江川路昆阳路车站向南20米处', '2018-11-30 00:00:00', '2018-12-09 00:00:00', '2018-11-30 00:00:00', null, '上海', null, '', '李胜勇测试二号', '15216664272', '', '1', '', '9', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003468', 'TA0091812040018', '27017.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-04 14:51:58.000000', 'H', '', 'e1921744-b3f8-4a2b-9471-375e9e8b4324', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '上海中航虹桥机场泊悦酒店(中国国际航空公司)', '5', '021-22366666', '虹桥机场2号航站楼出发层2号门(南区)', '2018-12-05 00:00:00', '2018-12-15 00:00:00', '2018-12-05 00:00:00', null, '上海', null, '', '李胜勇测试二号', '15216664272', '', '1', '', '10', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003160', 'TAGack1811070001', '1614.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'P ', '2018-11-07 11:37:20.000000', 'H', '', 'e470540b-63f0-489d-af0a-33333d2867ff', 'RMB', null, '0', '1614', '0', '0', '3', '5', null, '北京天地华典酒店式公寓(望京soho店)', '1', '010-84787064', '朝阳区望京麒麟社1号楼', '2018-11-12 00:00:00', '2018-11-15 00:00:00', '2018-11-12 00:00:00', null, '北京', null, '2332424@qq.com', '朱小华', '13321312322', '预付', '1', '', '3', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, 'GackG1022002');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003476', 'TA0091812060001', '2260.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-06 14:35:58.000000', 'H', '', 'fd2fd883-5c66-4054-afef-62bef57587c6', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '会宁印象精品酒店', '1', '0943-3599222', '白银会宁县会师镇长征北路', '2018-12-06 00:00:00', '2018-12-16 00:00:00', '2018-12-06 00:00:00', null, '白银', null, '', '大王', '13691122951', '', '1', '', '10', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_38b88a512970489f9f08156bf01b6f65');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003466', 'TA0091812040002', '2280.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-04 09:43:25.000000', 'H', '', 'fd6f51c1-08d3-40a3-ab3d-01a40458e2f1', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '长沙悦方90后主题酒店', '1', '0731-85812605', '湖南省长沙市天心区坡子街216号君临国际A座右2605房', '2018-12-04 00:00:00', '2018-12-14 00:00:00', '2018-12-04 00:00:00', null, '长沙', null, '', '李胜勇测试二号', '15216664272', '', '1', '', '10', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_hotel_order` VALUES ('GACK_OA', 'S117614', 'T03', 'HB1800003494', 'TA0091812090002', '705.000000000000000000000000000000', '0.000000000000000000000000000000', '1', 'C', '2018-12-09 14:03:54.000000', 'H', '', 'ff0f1acc-1dd6-41f7-bf51-23c49960a462', 'RMB', null, '0', '0', '0', '0', '0', '4', null, '天津军垦宾馆', '1', '022-24329998', '华兴道21号', '2018-12-10 00:00:00', '2018-12-15 00:00:00', '2018-12-10 00:00:00', null, '天津', null, '', '李胜勇测试二号', '15216664272', '', '1', '', '5', '0', '0', '0', '0', '0', null, null, null, null, null, '0', '0', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');

-- ----------------------------
-- Table structure for `tmc_hotel_room`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_hotel_room`;
CREATE TABLE `tmc_hotel_room` (
  `CreateBy` longtext,
  `CreateAt` datetime(6) NOT NULL,
  `ModifyBy` longtext,
  `ModifyAt` datetime(6) DEFAULT NULL,
  `Id` char(36) NOT NULL COMMENT '主键',
  `Room` int(11) NOT NULL,
  `OrderId` longtext COMMENT '订单ID',
  `RoomName` longtext COMMENT 'String Y	房型名称',
  `BedTypeName` longtext COMMENT 'String Y	床型名称',
  `RoomDate` datetime DEFAULT NULL COMMENT 'DateTime	N	房价日期 格式：yyyy-MM-dd',
  `CheckTime` datetime DEFAULT NULL COMMENT 'DateTime Y	入住时间 格式：yyyy-MM-dd HH:mm:ss',
  `DepartureTime` datetime DEFAULT NULL COMMENT 'DateTime Y	离店时间 格式：yyyy-MM-dd HH:mm:ss',
  `Price` decimal(10,0) DEFAULT NULL COMMENT 'decimal	N	每间夜价格',
  `Breakfast` int(11) DEFAULT NULL COMMENT 'int Y	早餐份数',
  `AddBreakfast` int(11) DEFAULT NULL COMMENT 'int Y	加早餐份数',
  `AddBreakfastPrice` decimal(10,0) DEFAULT NULL COMMENT 'decimal Y	加早餐价格',
  `RoomEnName` longtext,
  `Exchange` decimal(65,30) NOT NULL,
  `Currency` longtext,
  `BasicRoomTypeName` longtext,
  `BasicRoomTypeEnName` longtext,
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：未删除 1：删除',
  `HotelOrderInfoId` char(36) DEFAULT NULL COMMENT 'HotelOrderInfo主键',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_hotel_room
-- ----------------------------
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d64462-a015-2eae-9a25-ba2e81e0d1a9', '0', 'HB1800003160', '北京天地华典酒店式公寓(望京soho店)', '豪华大床房', '2018-11-07 11:38:30', '2018-11-12 00:00:00', '2018-11-15 00:00:00', '538', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'e470540b-63f0-489d-af0a-33333d2867ff');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d64462-a015-3593-3082-9744c1548d14', '0', 'HB1800003160', '北京天地华典酒店式公寓(望京soho店)', '豪华大床房', '2018-11-07 11:38:30', '2018-11-12 00:00:00', '2018-11-15 00:00:00', '538', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'e470540b-63f0-489d-af0a-33333d2867ff');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d64462-a015-3f27-3a91-1cc89e05c8df', '0', 'HB1800003160', '北京天地华典酒店式公寓(望京soho店)', '豪华大床房', '2018-11-07 11:38:30', '2018-11-12 00:00:00', '2018-11-15 00:00:00', '538', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'e470540b-63f0-489d-af0a-33333d2867ff');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d64a0d-1cf3-a705-9108-38ff4fc3713b', '0', 'HB1800003237', '上海民校联盟之家', '单间', '2018-11-14 16:41:05', '2018-11-16 00:00:00', '2018-11-18 00:00:00', '109', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8f1dee53-a553-4986-9a29-627e55527b16');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d64a0d-1cf3-ae06-38de-5ee061a3631b', '0', 'HB1800003237', '上海民校联盟之家', '单间', '2018-11-14 16:41:05', '2018-11-16 00:00:00', '2018-11-18 00:00:00', '109', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8f1dee53-a553-4986-9a29-627e55527b16');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d64abb-98a7-e6a5-977e-785629eca2ef', '0', 'HB1800003248', '创锋旅馆(上海下南店)', '单人房(有窗)', '2018-11-15 13:29:58', '2018-12-08 00:00:00', '2018-12-09 00:00:00', '131', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'd0056361-3cb2-4f75-8d99-8ca260dc7fc6');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d64abc-6eb6-45d2-7d7d-358bf737783e', '0', 'HB1800003249', '上海龙吴旅馆', '标准间', '2018-11-15 13:36:24', '2018-11-15 00:00:00', '2018-11-16 00:00:00', '100', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'bee852db-c2e5-4d78-ab3f-ab4587493b6c');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d655f1-6b92-f304-ccf5-84cb55f83b09', '0', 'HB1800003453', '上海华亭宾馆', '豪华房', '2018-11-29 19:52:40', '2018-11-30 00:00:00', '2018-12-01 00:00:00', '849', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '9ef0108b-1120-4002-b10c-4e80c73da771');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d655f4-e948-5168-249d-e58062de45d8', '0', 'HB1800003454', '北京司马台新村丽红客栈', '大床房(有窗)', '2018-11-29 20:17:13', '2018-11-30 00:00:00', '2018-12-01 00:00:00', '142', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'a8b5a717-382a-459f-a247-a50e851a485a');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65666-c411-f370-6327-bb2a7ee46891', '0', 'HB1800003455', '速8酒店(北京天坛南门赵公口店)(原盛庭宾馆)', '经济单人房(内窗)', '2018-11-30 09:52:36', '2018-11-30 00:00:00', '2018-12-01 00:00:00', '169', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '9c516d1d-1735-4f65-bfc8-ec5492e49fc9');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6566b-cbcf-d5dd-2426-0c0e6bc8079f', '0', 'HB1800003456', '上海超蒙宾馆', '大床间(有窗)', '2018-11-30 10:28:04', '2018-11-30 00:00:00', '2018-12-09 00:00:00', '103', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'd6b7d3f3-67d6-4cc1-a5df-5f2ad8d16bde');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6566b-cbcf-da8f-5348-12c48af8d261', '0', 'HB1800003456', '上海超蒙宾馆', '大床间(有窗)', '2018-11-30 10:28:04', '2018-11-30 00:00:00', '2018-12-09 00:00:00', '103', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'd6b7d3f3-67d6-4cc1-a5df-5f2ad8d16bde');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6566b-cbcf-df79-1f95-feb9271a128e', '0', 'HB1800003456', '上海超蒙宾馆', '大床间(有窗)', '2018-11-30 10:28:04', '2018-11-30 00:00:00', '2018-12-09 00:00:00', '103', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'd6b7d3f3-67d6-4cc1-a5df-5f2ad8d16bde');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6566b-cbcf-e552-e1e5-c157665425ab', '0', 'HB1800003456', '上海超蒙宾馆', '大床间(有窗)', '2018-11-30 10:28:04', '2018-11-30 00:00:00', '2018-12-09 00:00:00', '103', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'd6b7d3f3-67d6-4cc1-a5df-5f2ad8d16bde');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6566b-cbcf-ec31-e4fa-4c6244ee5f8c', '0', 'HB1800003456', '上海超蒙宾馆', '大床间(有窗)', '2018-11-30 10:28:04', '2018-11-30 00:00:00', '2018-12-09 00:00:00', '103', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'd6b7d3f3-67d6-4cc1-a5df-5f2ad8d16bde');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6566b-cbcf-f412-9140-a902630d90bb', '0', 'HB1800003456', '上海超蒙宾馆', '大床间(有窗)', '2018-11-30 10:28:04', '2018-11-30 00:00:00', '2018-12-09 00:00:00', '103', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'd6b7d3f3-67d6-4cc1-a5df-5f2ad8d16bde');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6566b-cbcf-fd91-f28d-7fa845cf572a', '0', 'HB1800003456', '上海超蒙宾馆', '大床间(有窗)', '2018-11-30 10:28:04', '2018-11-30 00:00:00', '2018-12-09 00:00:00', '103', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'd6b7d3f3-67d6-4cc1-a5df-5f2ad8d16bde');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6566b-cbd0-078c-aadf-b985671a8506', '0', 'HB1800003456', '上海超蒙宾馆', '大床间(有窗)', '2018-11-30 10:28:04', '2018-11-30 00:00:00', '2018-12-09 00:00:00', '103', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'd6b7d3f3-67d6-4cc1-a5df-5f2ad8d16bde');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6566b-cbd0-1283-9501-000c9ef183fa', '0', 'HB1800003456', '上海超蒙宾馆', '大床间(有窗)', '2018-11-30 10:28:04', '2018-11-30 00:00:00', '2018-12-09 00:00:00', '103', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'd6b7d3f3-67d6-4cc1-a5df-5f2ad8d16bde');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6566e-bb6d-4ffb-f32d-6ba33030f5e6', '0', 'HB1800003457', '三亚西藏大厦开元名都酒店', '高级套房', '2018-11-30 10:49:24', '2018-11-30 00:00:00', '2018-12-03 00:00:00', '1506', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '62466c4c-6365-41e9-a238-313a8e65a839');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6566e-bb6d-54e0-12cd-3e5b5488700a', '0', 'HB1800003457', '三亚西藏大厦开元名都酒店', '高级套房', '2018-11-30 10:49:24', '2018-11-30 00:00:00', '2018-12-03 00:00:00', '1506', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '62466c4c-6365-41e9-a238-313a8e65a839');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6566e-bb6d-5a59-0918-f8e0372e5f6f', '0', 'HB1800003457', '三亚西藏大厦开元名都酒店', '高级套房', '2018-11-30 10:49:24', '2018-11-30 00:00:00', '2018-12-03 00:00:00', '1506', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '62466c4c-6365-41e9-a238-313a8e65a839');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658c5-9d70-204d-a494-6d82ebc6a9a4', '0', 'HB1800003459', '马尔康长盛宾馆', '标准大床房', '2018-12-03 10:16:59', '2018-12-03 00:00:00', '2018-12-10 00:00:00', '180', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'c85aa5ef-984a-4a56-b2ff-d0fe7f369740');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658c5-9d70-268d-fa38-d5dfb8765f15', '0', 'HB1800003459', '马尔康长盛宾馆', '标准大床房', '2018-12-03 10:16:59', '2018-12-03 00:00:00', '2018-12-10 00:00:00', '180', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'c85aa5ef-984a-4a56-b2ff-d0fe7f369740');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658c5-9d70-2d56-9d20-3d9d9c96884c', '0', 'HB1800003459', '马尔康长盛宾馆', '标准大床房', '2018-12-03 10:16:59', '2018-12-03 00:00:00', '2018-12-10 00:00:00', '180', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'c85aa5ef-984a-4a56-b2ff-d0fe7f369740');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658c5-9d70-3739-706f-1963b6582a0b', '0', 'HB1800003459', '马尔康长盛宾馆', '标准大床房', '2018-12-03 10:16:59', '2018-12-03 00:00:00', '2018-12-10 00:00:00', '180', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'c85aa5ef-984a-4a56-b2ff-d0fe7f369740');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658c5-9d70-403a-2765-b4b65e570b55', '0', 'HB1800003459', '马尔康长盛宾馆', '标准大床房', '2018-12-03 10:16:59', '2018-12-03 00:00:00', '2018-12-10 00:00:00', '180', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'c85aa5ef-984a-4a56-b2ff-d0fe7f369740');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658c5-9d70-4a96-000b-59d28072a4ea', '0', 'HB1800003459', '马尔康长盛宾馆', '标准大床房', '2018-12-03 10:16:59', '2018-12-03 00:00:00', '2018-12-10 00:00:00', '180', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'c85aa5ef-984a-4a56-b2ff-d0fe7f369740');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658c5-9d70-5568-8175-eed1fbab5225', '0', 'HB1800003459', '马尔康长盛宾馆', '标准大床房', '2018-12-03 10:16:59', '2018-12-03 00:00:00', '2018-12-10 00:00:00', '180', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'c85aa5ef-984a-4a56-b2ff-d0fe7f369740');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658f1-3304-5aaf-4acb-eab26c4f7d65', '0', 'HB1800003460', '厦门集大宾馆', '几木景观套房', '2018-12-03 15:27:07', '2018-12-03 00:00:00', '2018-12-13 00:00:00', '826', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8c64f378-5b62-4468-9257-d78773d24d29');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658f1-3304-5f9e-8752-45ea7f9efa12', '0', 'HB1800003460', '厦门集大宾馆', '几木景观套房', '2018-12-03 15:27:07', '2018-12-03 00:00:00', '2018-12-13 00:00:00', '826', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8c64f378-5b62-4468-9257-d78773d24d29');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658f1-3304-6529-2bdc-94462094f100', '0', 'HB1800003460', '厦门集大宾馆', '几木景观套房', '2018-12-03 15:27:07', '2018-12-03 00:00:00', '2018-12-13 00:00:00', '826', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8c64f378-5b62-4468-9257-d78773d24d29');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658f1-3304-6b99-c1f4-e3ca034d49a8', '0', 'HB1800003460', '厦门集大宾馆', '几木景观套房', '2018-12-03 15:27:07', '2018-12-03 00:00:00', '2018-12-13 00:00:00', '826', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8c64f378-5b62-4468-9257-d78773d24d29');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658f1-3304-7370-e7c1-3fb961faebf9', '0', 'HB1800003460', '厦门集大宾馆', '几木景观套房', '2018-12-03 15:27:07', '2018-12-03 00:00:00', '2018-12-13 00:00:00', '826', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8c64f378-5b62-4468-9257-d78773d24d29');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658f1-3304-7ef2-e0d0-cd2fada21d8a', '0', 'HB1800003460', '厦门集大宾馆', '几木景观套房', '2018-12-03 15:27:07', '2018-12-03 00:00:00', '2018-12-13 00:00:00', '826', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8c64f378-5b62-4468-9257-d78773d24d29');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658f1-3304-88b8-352a-8a63576cc32e', '0', 'HB1800003460', '厦门集大宾馆', '几木景观套房', '2018-12-03 15:27:07', '2018-12-03 00:00:00', '2018-12-13 00:00:00', '865', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8c64f378-5b62-4468-9257-d78773d24d29');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658f1-3304-936f-c5d0-9e5fd5ccf64b', '0', 'HB1800003460', '厦门集大宾馆', '几木景观套房', '2018-12-03 15:27:07', '2018-12-03 00:00:00', '2018-12-13 00:00:00', '865', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8c64f378-5b62-4468-9257-d78773d24d29');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658f1-3304-a14b-a46b-119b93d914c4', '0', 'HB1800003460', '厦门集大宾馆', '几木景观套房', '2018-12-03 15:27:07', '2018-12-03 00:00:00', '2018-12-13 00:00:00', '865', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8c64f378-5b62-4468-9257-d78773d24d29');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d658f1-3304-aecf-6885-0eed5db3bd04', '0', 'HB1800003460', '厦门集大宾馆', '几木景观套房', '2018-12-03 15:27:07', '2018-12-03 00:00:00', '2018-12-13 00:00:00', '865', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8c64f378-5b62-4468-9257-d78773d24d29');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65985-d760-0a5c-1c79-3c8623dafc76', '0', 'HB1800003461', '垫江朝阳宾馆', '豪华标准间', '2018-12-04 09:12:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '108', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '56d703a9-bd6d-4bff-b9f9-1f079a6c799d');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65985-d760-140e-0a14-03ccc8156f10', '0', 'HB1800003461', '垫江朝阳宾馆', '豪华标准间', '2018-12-04 09:12:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '108', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '56d703a9-bd6d-4bff-b9f9-1f079a6c799d');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65985-d760-1c33-939c-eaf938414fe7', '0', 'HB1800003461', '垫江朝阳宾馆', '豪华标准间', '2018-12-04 09:12:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '108', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '56d703a9-bd6d-4bff-b9f9-1f079a6c799d');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65985-d760-2499-cd26-38bf5e1bf271', '0', 'HB1800003461', '垫江朝阳宾馆', '豪华标准间', '2018-12-04 09:12:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '108', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '56d703a9-bd6d-4bff-b9f9-1f079a6c799d');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65985-d760-2df5-b047-d241725a16b7', '0', 'HB1800003461', '垫江朝阳宾馆', '豪华标准间', '2018-12-04 09:12:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '108', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '56d703a9-bd6d-4bff-b9f9-1f079a6c799d');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65985-d760-3b26-78f2-83372af1e814', '0', 'HB1800003461', '垫江朝阳宾馆', '豪华标准间', '2018-12-04 09:12:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '108', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '56d703a9-bd6d-4bff-b9f9-1f079a6c799d');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65985-d760-4751-a240-e7eb8bffbb69', '0', 'HB1800003461', '垫江朝阳宾馆', '豪华标准间', '2018-12-04 09:12:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '108', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '56d703a9-bd6d-4bff-b9f9-1f079a6c799d');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65985-d760-53d0-1c78-d719b9e08420', '0', 'HB1800003461', '垫江朝阳宾馆', '豪华标准间', '2018-12-04 09:12:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '108', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '56d703a9-bd6d-4bff-b9f9-1f079a6c799d');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65986-8c29-06cd-2b23-0f42eafc2b02', '0', 'HB1800003462', '重庆达家主题酒店', '特色主题房(新风系统）(无窗)', '2018-12-04 09:17:47', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '198', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'a09771a0-80c1-48c2-a29c-7d23aaf7374a');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65986-8c29-0cfc-32ff-9222fa498fc9', '0', 'HB1800003462', '重庆达家主题酒店', '特色主题房(新风系统）(无窗)', '2018-12-04 09:17:47', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '198', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'a09771a0-80c1-48c2-a29c-7d23aaf7374a');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65986-8c29-13a4-d017-e4536957aeb3', '0', 'HB1800003462', '重庆达家主题酒店', '特色主题房(新风系统）(无窗)', '2018-12-04 09:17:47', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '198', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'a09771a0-80c1-48c2-a29c-7d23aaf7374a');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65986-8c29-1bd6-0547-32a02c6eddcf', '0', 'HB1800003462', '重庆达家主题酒店', '特色主题房(新风系统）(无窗)', '2018-12-04 09:17:47', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '198', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'a09771a0-80c1-48c2-a29c-7d23aaf7374a');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65986-8c29-24a7-0b82-66a530d2c195', '0', 'HB1800003462', '重庆达家主题酒店', '特色主题房(新风系统）(无窗)', '2018-12-04 09:17:47', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '198', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'a09771a0-80c1-48c2-a29c-7d23aaf7374a');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65986-8c29-2e5c-b84a-ddaef68cfec3', '0', 'HB1800003462', '重庆达家主题酒店', '特色主题房(新风系统）(无窗)', '2018-12-04 09:17:47', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '198', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'a09771a0-80c1-48c2-a29c-7d23aaf7374a');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65986-8c29-38fd-2df0-b6c0ae0c215b', '0', 'HB1800003462', '重庆达家主题酒店', '特色主题房(新风系统）(无窗)', '2018-12-04 09:17:47', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '198', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'a09771a0-80c1-48c2-a29c-7d23aaf7374a');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65986-8c29-459c-d88c-9ed4acfd2934', '0', 'HB1800003462', '重庆达家主题酒店', '特色主题房(新风系统）(无窗)', '2018-12-04 09:17:47', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '198', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'a09771a0-80c1-48c2-a29c-7d23aaf7374a');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65988-12fe-a4fa-3e90-651eac360a13', '0', 'HB1800003463', '重庆晴天酒店式公寓', '解放碑好吃街旁/家庭双卧套房/离近洪涯洞', '2018-12-04 09:27:39', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '227', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8e8d4711-97f9-4e0c-9f80-7b35ec9b92a7');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65988-12fe-a98a-8951-3f85519b1621', '0', 'HB1800003463', '重庆晴天酒店式公寓', '解放碑好吃街旁/家庭双卧套房/离近洪涯洞', '2018-12-04 09:27:39', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '326', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8e8d4711-97f9-4e0c-9f80-7b35ec9b92a7');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65988-12fe-b1d1-3680-d04823f96bd8', '0', 'HB1800003463', '重庆晴天酒店式公寓', '解放碑好吃街旁/家庭双卧套房/离近洪涯洞', '2018-12-04 09:27:39', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '326', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8e8d4711-97f9-4e0c-9f80-7b35ec9b92a7');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65988-12fe-b80f-e06f-be9b58a76c17', '0', 'HB1800003463', '重庆晴天酒店式公寓', '解放碑好吃街旁/家庭双卧套房/离近洪涯洞', '2018-12-04 09:27:39', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '297', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8e8d4711-97f9-4e0c-9f80-7b35ec9b92a7');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65988-12fe-beff-c8ee-553db9307f5a', '0', 'HB1800003463', '重庆晴天酒店式公寓', '解放碑好吃街旁/家庭双卧套房/离近洪涯洞', '2018-12-04 09:27:39', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '297', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8e8d4711-97f9-4e0c-9f80-7b35ec9b92a7');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65988-12fe-c749-5fcb-763c86de2515', '0', 'HB1800003463', '重庆晴天酒店式公寓', '解放碑好吃街旁/家庭双卧套房/离近洪涯洞', '2018-12-04 09:27:39', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '236', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8e8d4711-97f9-4e0c-9f80-7b35ec9b92a7');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65988-12fe-d04e-1c85-7a0e1e2d3bc8', '0', 'HB1800003463', '重庆晴天酒店式公寓', '解放碑好吃街旁/家庭双卧套房/离近洪涯洞', '2018-12-04 09:27:39', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '236', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8e8d4711-97f9-4e0c-9f80-7b35ec9b92a7');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65988-12fe-dd47-88f4-22684e5f8c5e', '0', 'HB1800003463', '重庆晴天酒店式公寓', '解放碑好吃街旁/家庭双卧套房/离近洪涯洞', '2018-12-04 09:27:39', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '236', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '8e8d4711-97f9-4e0c-9f80-7b35ec9b92a7');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6598a-2e34-c302-f402-8a93a51e0457', '0', 'HB1800003466', '长沙悦方90后主题酒店', '豪华城景大床房(2米真皮大床落地大窗)', '2018-12-04 09:43:21', '2018-12-04 00:00:00', '2018-12-14 00:00:00', '198', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd6f51c1-08d3-40a3-ab3d-01a40458e2f1');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6598a-2e34-ca27-8f9f-ad0681f6a6fc', '0', 'HB1800003466', '长沙悦方90后主题酒店', '豪华城景大床房(2米真皮大床落地大窗)', '2018-12-04 09:43:21', '2018-12-04 00:00:00', '2018-12-14 00:00:00', '198', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd6f51c1-08d3-40a3-ab3d-01a40458e2f1');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6598a-2e34-d056-1409-a6c9f8dda3c5', '0', 'HB1800003466', '长沙悦方90后主题酒店', '豪华城景大床房(2米真皮大床落地大窗)', '2018-12-04 09:43:21', '2018-12-04 00:00:00', '2018-12-14 00:00:00', '218', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd6f51c1-08d3-40a3-ab3d-01a40458e2f1');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6598a-2e34-d6f3-62a4-ef2548f837a8', '0', 'HB1800003466', '长沙悦方90后主题酒店', '豪华城景大床房(2米真皮大床落地大窗)', '2018-12-04 09:43:21', '2018-12-04 00:00:00', '2018-12-14 00:00:00', '288', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd6f51c1-08d3-40a3-ab3d-01a40458e2f1');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6598a-2e34-de73-24ef-a9cab63d6372', '0', 'HB1800003466', '长沙悦方90后主题酒店', '豪华城景大床房(2米真皮大床落地大窗)', '2018-12-04 09:43:21', '2018-12-04 00:00:00', '2018-12-14 00:00:00', '288', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd6f51c1-08d3-40a3-ab3d-01a40458e2f1');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6598a-2e34-e6e8-7a3c-7586dea8721c', '0', 'HB1800003466', '长沙悦方90后主题酒店', '豪华城景大床房(2米真皮大床落地大窗)', '2018-12-04 09:43:21', '2018-12-04 00:00:00', '2018-12-14 00:00:00', '218', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd6f51c1-08d3-40a3-ab3d-01a40458e2f1');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6598a-2e34-f242-9aae-523d0b8793ee', '0', 'HB1800003466', '长沙悦方90后主题酒店', '豪华城景大床房(2米真皮大床落地大窗)', '2018-12-04 09:43:21', '2018-12-04 00:00:00', '2018-12-14 00:00:00', '218', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd6f51c1-08d3-40a3-ab3d-01a40458e2f1');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6598a-2e34-fda1-e2b3-4062c1f25f35', '0', 'HB1800003466', '长沙悦方90后主题酒店', '豪华城景大床房(2米真皮大床落地大窗)', '2018-12-04 09:43:21', '2018-12-04 00:00:00', '2018-12-14 00:00:00', '218', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd6f51c1-08d3-40a3-ab3d-01a40458e2f1');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6598a-2e35-096a-381d-ba169f9c0a3b', '0', 'HB1800003466', '长沙悦方90后主题酒店', '豪华城景大床房(2米真皮大床落地大窗)', '2018-12-04 09:43:21', '2018-12-04 00:00:00', '2018-12-14 00:00:00', '218', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd6f51c1-08d3-40a3-ab3d-01a40458e2f1');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d6598a-2e35-17e9-b4f0-e31a9ba8ff5f', '0', 'HB1800003466', '长沙悦方90后主题酒店', '豪华城景大床房(2米真皮大床落地大窗)', '2018-12-04 09:43:21', '2018-12-04 00:00:00', '2018-12-14 00:00:00', '218', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd6f51c1-08d3-40a3-ab3d-01a40458e2f1');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65994-a5d2-832f-1a12-90cadfaf96d9', '0', 'HB1800003467', '重庆西正商务酒店', '商务大床房', '2018-12-04 10:58:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '98', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '00c2b357-c568-4b78-aedf-4e1ae5cf9049');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65994-a5d2-89c0-fce3-62df28386ee8', '0', 'HB1800003467', '重庆西正商务酒店', '商务大床房', '2018-12-04 10:58:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '98', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '00c2b357-c568-4b78-aedf-4e1ae5cf9049');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65994-a5d2-910d-3591-a8958bd32de5', '0', 'HB1800003467', '重庆西正商务酒店', '商务大床房', '2018-12-04 10:58:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '98', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '00c2b357-c568-4b78-aedf-4e1ae5cf9049');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65994-a5d2-9c76-bf07-8482fc2e006b', '0', 'HB1800003467', '重庆西正商务酒店', '商务大床房', '2018-12-04 10:58:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '118', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '00c2b357-c568-4b78-aedf-4e1ae5cf9049');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65994-a5d2-a61c-cd26-425b7077ab59', '0', 'HB1800003467', '重庆西正商务酒店', '商务大床房', '2018-12-04 10:58:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '118', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '00c2b357-c568-4b78-aedf-4e1ae5cf9049');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65994-a5d2-b0a2-3258-84ea0cfe9ff1', '0', 'HB1800003467', '重庆西正商务酒店', '商务大床房', '2018-12-04 10:58:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '98', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '00c2b357-c568-4b78-aedf-4e1ae5cf9049');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65994-a5d2-bcbc-9566-4d63899ad08f', '0', 'HB1800003467', '重庆西正商务酒店', '商务大床房', '2018-12-04 10:58:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '98', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '00c2b357-c568-4b78-aedf-4e1ae5cf9049');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65994-a5d2-cafe-0b5e-19b48307528c', '0', 'HB1800003467', '重庆西正商务酒店', '商务大床房', '2018-12-04 10:58:52', '2018-12-04 00:00:00', '2018-12-12 00:00:00', '98', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '00c2b357-c568-4b78-aedf-4e1ae5cf9049');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b5-32ca-810a-89ed-c80f454ef8be', '0', 'HB1800003468', '上海中航虹桥机场泊悦酒店(中国国际航空公司)', '行政套房(有窗)', '2018-12-04 14:51:55', '2018-12-05 00:00:00', '2018-12-15 00:00:00', '3586', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'e1921744-b3f8-4a2b-9471-375e9e8b4324');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b5-32ca-8967-85a8-2a703deac80e', '0', 'HB1800003468', '上海中航虹桥机场泊悦酒店(中国国际航空公司)', '行政套房(有窗)', '2018-12-04 14:51:55', '2018-12-05 00:00:00', '2018-12-15 00:00:00', '3694', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'e1921744-b3f8-4a2b-9471-375e9e8b4324');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b5-32ca-906c-7753-8b03e7786268', '0', 'HB1800003468', '上海中航虹桥机场泊悦酒店(中国国际航空公司)', '行政套房(有窗)', '2018-12-04 14:51:55', '2018-12-05 00:00:00', '2018-12-15 00:00:00', '3027', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'e1921744-b3f8-4a2b-9471-375e9e8b4324');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b5-32ca-98a5-4243-eaaaa448e287', '0', 'HB1800003468', '上海中航虹桥机场泊悦酒店(中国国际航空公司)', '行政套房(有窗)', '2018-12-04 14:51:55', '2018-12-05 00:00:00', '2018-12-15 00:00:00', '2918', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'e1921744-b3f8-4a2b-9471-375e9e8b4324');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b5-32ca-a15d-5624-f66b3076fb70', '0', 'HB1800003468', '上海中航虹桥机场泊悦酒店(中国国际航空公司)', '行政套房(有窗)', '2018-12-04 14:51:55', '2018-12-05 00:00:00', '2018-12-15 00:00:00', '2918', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'e1921744-b3f8-4a2b-9471-375e9e8b4324');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b5-32ca-ad0b-d4ed-f91c0de4cd4f', '0', 'HB1800003468', '上海中航虹桥机场泊悦酒店(中国国际航空公司)', '行政套房(有窗)', '2018-12-04 14:51:55', '2018-12-05 00:00:00', '2018-12-15 00:00:00', '3586', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'e1921744-b3f8-4a2b-9471-375e9e8b4324');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b5-32ca-b808-3415-94672c92a287', '0', 'HB1800003468', '上海中航虹桥机场泊悦酒店(中国国际航空公司)', '行政套房(有窗)', '2018-12-04 14:51:55', '2018-12-05 00:00:00', '2018-12-15 00:00:00', '1881', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'e1921744-b3f8-4a2b-9471-375e9e8b4324');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b5-32ca-c457-b962-bb9014792b3b', '0', 'HB1800003468', '上海中航虹桥机场泊悦酒店(中国国际航空公司)', '行政套房(有窗)', '2018-12-04 14:51:55', '2018-12-05 00:00:00', '2018-12-15 00:00:00', '1881', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'e1921744-b3f8-4a2b-9471-375e9e8b4324');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b5-32ca-d312-048e-707027ac08c8', '0', 'HB1800003468', '上海中航虹桥机场泊悦酒店(中国国际航空公司)', '行政套房(有窗)', '2018-12-04 14:51:55', '2018-12-05 00:00:00', '2018-12-15 00:00:00', '1939', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'e1921744-b3f8-4a2b-9471-375e9e8b4324');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b5-32ca-e115-1319-8d265ec8ce96', '0', 'HB1800003468', '上海中航虹桥机场泊悦酒店(中国国际航空公司)', '行政套房(有窗)', '2018-12-04 14:51:55', '2018-12-05 00:00:00', '2018-12-15 00:00:00', '1587', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'e1921744-b3f8-4a2b-9471-375e9e8b4324');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-3dd0-7d4d-beb946eeafc2', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-459a-e46d-209f49f3d8e1', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-4cf7-e454-d320bb905c07', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-55e1-aa76-10c9fbab15aa', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-62db-620d-f3edc35e01aa', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-6dbd-3b0d-ba4fed7eb07b', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-79bc-69a1-febff77fcc71', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-8e1b-fe4e-906a6986fcf4', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-9c74-32ad-c69d51095715', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-af7f-3346-46e31b7c34f8', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-bfec-4916-62f4ddedce74', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-d46a-b045-5eaa599f09fc', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-e6ac-d734-a965d73f7a94', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8e-fcd3-c47c-9647d8c6caa2', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8f-113f-c9f5-f025d5044b86', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8f-29a6-6087-bfb6258e7266', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d659b7-fd8f-40ae-a5c5-306c3b38e877', '0', 'HB1800003469', '上海鹏利辉盛阁国际公寓', '三居室行政公寓', '2018-12-04 15:12:13', '2018-12-05 00:00:00', '2018-12-22 00:00:00', '5130', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65b45-4b7b-3c87-821c-24acc1f96d90', '0', 'HB1800003476', '会宁印象精品酒店', '标准间(有窗)', '2018-12-06 14:35:55', '2018-12-06 00:00:00', '2018-12-16 00:00:00', '226', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd2fd883-5c66-4054-afef-62bef57587c6');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65b45-4b7b-432b-7ba7-2dc3d87fd84a', '0', 'HB1800003476', '会宁印象精品酒店', '标准间(有窗)', '2018-12-06 14:35:55', '2018-12-06 00:00:00', '2018-12-16 00:00:00', '226', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd2fd883-5c66-4054-afef-62bef57587c6');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65b45-4b7b-4a6c-3c0e-024fc28a885f', '0', 'HB1800003476', '会宁印象精品酒店', '标准间(有窗)', '2018-12-06 14:35:55', '2018-12-06 00:00:00', '2018-12-16 00:00:00', '226', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd2fd883-5c66-4054-afef-62bef57587c6');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65b45-4b7b-5359-044b-816cdbfe30de', '0', 'HB1800003476', '会宁印象精品酒店', '标准间(有窗)', '2018-12-06 14:35:55', '2018-12-06 00:00:00', '2018-12-16 00:00:00', '226', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd2fd883-5c66-4054-afef-62bef57587c6');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65b45-4b7b-5cbd-61b0-3e20263a9dd8', '0', 'HB1800003476', '会宁印象精品酒店', '标准间(有窗)', '2018-12-06 14:35:55', '2018-12-06 00:00:00', '2018-12-16 00:00:00', '226', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd2fd883-5c66-4054-afef-62bef57587c6');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65b45-4b7b-6730-8ae2-63a67229ae28', '0', 'HB1800003476', '会宁印象精品酒店', '标准间(有窗)', '2018-12-06 14:35:55', '2018-12-06 00:00:00', '2018-12-16 00:00:00', '226', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd2fd883-5c66-4054-afef-62bef57587c6');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65b45-4b7b-7297-67e6-cc85d75a74b3', '0', 'HB1800003476', '会宁印象精品酒店', '标准间(有窗)', '2018-12-06 14:35:55', '2018-12-06 00:00:00', '2018-12-16 00:00:00', '226', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd2fd883-5c66-4054-afef-62bef57587c6');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65b45-4b7b-7fa9-3931-165c1ea4b794', '0', 'HB1800003476', '会宁印象精品酒店', '标准间(有窗)', '2018-12-06 14:35:55', '2018-12-06 00:00:00', '2018-12-16 00:00:00', '226', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd2fd883-5c66-4054-afef-62bef57587c6');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65b45-4b7b-8d36-0f97-acebc4d16f0b', '0', 'HB1800003476', '会宁印象精品酒店', '标准间(有窗)', '2018-12-06 14:35:55', '2018-12-06 00:00:00', '2018-12-16 00:00:00', '226', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd2fd883-5c66-4054-afef-62bef57587c6');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65b45-4b7b-9c3e-851e-8b53f190a5a9', '0', 'HB1800003476', '会宁印象精品酒店', '标准间(有窗)', '2018-12-06 14:35:55', '2018-12-06 00:00:00', '2018-12-16 00:00:00', '226', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'fd2fd883-5c66-4054-afef-62bef57587c6');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65c0d-c373-e9fc-f105-a76e69a4f837', '0', 'HB1800003485', '北京国贸大酒店', '超豪华套房(有窗)', '2018-12-07 14:28:58', '2018-12-07 00:00:00', '2018-12-09 00:00:00', '6886', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '007e1a24-b738-4f43-b655-1feab24d8894');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65c0d-c373-eea9-e7d7-0323a3a7239c', '0', 'HB1800003485', '北京国贸大酒店', '超豪华套房(有窗)', '2018-12-07 14:28:58', '2018-12-07 00:00:00', '2018-12-09 00:00:00', '6922', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '007e1a24-b738-4f43-b655-1feab24d8894');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65c1a-a394-0922-b5de-5184a914678e', '0', 'HB1800003488', '速8酒店(北京天坛南门赵公口店)(原盛庭宾馆)', '豪华大床房(部分有窗)', '2018-12-07 16:03:02', '2018-12-07 00:00:00', '2018-12-08 00:00:00', '236', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'd11fbc87-901a-4c3d-be55-eb29e903f0b0');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65c1a-a549-c8bf-ca24-2a4834d9a55f', '0', 'HB1800003487', '如家派柏云酒店(北京四惠东地铁站店)', '标准双床房', '2018-12-07 16:02:51', '2018-12-07 00:00:00', '2018-12-09 00:00:00', '313', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'c16c5869-f9e6-4458-ae95-7f3ab05b0788');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65c1a-a549-cf66-4979-49aa96d2686e', '0', 'HB1800003487', '如家派柏云酒店(北京四惠东地铁站店)', '标准双床房', '2018-12-07 16:02:51', '2018-12-07 00:00:00', '2018-12-09 00:00:00', '313', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'c16c5869-f9e6-4458-ae95-7f3ab05b0788');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65c1c-b7f0-e5f3-8154-27ffd0475d89', '0', 'HB1800003490', '北京三里屯通盈中心洲际酒店', '洲际行政套房', '2018-12-07 16:17:13', '2018-12-07 00:00:00', '2018-12-08 00:00:00', '6889', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '9d4ac861-a5c5-4ffb-b5c6-151e5c038888');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65d95-9fa7-781a-6ff8-6201b3125602', '0', 'HB1800003493', '天津西海岸豪华酒店公寓', '特惠大床房', '2018-12-09 13:15:21', '2018-12-18 00:00:00', '2018-12-19 00:00:00', '159', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '2f444293-37e9-439c-8c63-2aa5045a683c');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65d9c-53f5-7073-500f-6b7b85c4a701', '0', 'HB1800003494', '天津军垦宾馆', '特惠标准间(部分有窗)', '2018-12-09 14:03:28', '2018-12-10 00:00:00', '2018-12-15 00:00:00', '141', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'ff0f1acc-1dd6-41f7-bf51-23c49960a462');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65d9c-53f5-775c-70ca-43ea40ea5283', '0', 'HB1800003494', '天津军垦宾馆', '特惠标准间(部分有窗)', '2018-12-09 14:03:28', '2018-12-10 00:00:00', '2018-12-15 00:00:00', '141', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'ff0f1acc-1dd6-41f7-bf51-23c49960a462');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65d9c-53f5-7ecb-a31b-87945a98ce2f', '0', 'HB1800003494', '天津军垦宾馆', '特惠标准间(部分有窗)', '2018-12-09 14:03:28', '2018-12-10 00:00:00', '2018-12-15 00:00:00', '141', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'ff0f1acc-1dd6-41f7-bf51-23c49960a462');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65d9c-53f5-8729-64d4-a7148e6be466', '0', 'HB1800003494', '天津军垦宾馆', '特惠标准间(部分有窗)', '2018-12-09 14:03:28', '2018-12-10 00:00:00', '2018-12-15 00:00:00', '141', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'ff0f1acc-1dd6-41f7-bf51-23c49960a462');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65d9c-53f5-9120-6fb2-54a7f837d93c', '0', 'HB1800003494', '天津军垦宾馆', '特惠标准间(部分有窗)', '2018-12-09 14:03:28', '2018-12-10 00:00:00', '2018-12-15 00:00:00', '141', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', 'ff0f1acc-1dd6-41f7-bf51-23c49960a462');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65e43-66c2-9e15-f6de-2d2e3c80707b', '0', 'HB1800003497', '犀客空间(北京国贸和乔丽致店)', '豪华复式影音房', '2018-12-10 09:58:25', '2018-12-11 00:00:00', '2018-12-20 00:00:00', '836', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '16c4d52c-4712-488b-a5a0-707e40e1eafe');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65e43-66c2-a2cd-89be-292e6b7aeed8', '0', 'HB1800003497', '犀客空间(北京国贸和乔丽致店)', '豪华复式影音房', '2018-12-10 09:58:25', '2018-12-11 00:00:00', '2018-12-20 00:00:00', '836', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '16c4d52c-4712-488b-a5a0-707e40e1eafe');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65e43-66c2-a912-0b03-8eaa1e936122', '0', 'HB1800003497', '犀客空间(北京国贸和乔丽致店)', '豪华复式影音房', '2018-12-10 09:58:25', '2018-12-11 00:00:00', '2018-12-20 00:00:00', '836', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '16c4d52c-4712-488b-a5a0-707e40e1eafe');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65e43-66c2-af3c-ff27-285da783d939', '0', 'HB1800003497', '犀客空间(北京国贸和乔丽致店)', '豪华复式影音房', '2018-12-10 09:58:25', '2018-12-11 00:00:00', '2018-12-20 00:00:00', '836', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '16c4d52c-4712-488b-a5a0-707e40e1eafe');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65e43-66c2-b6b8-b008-3f44c77939b6', '0', 'HB1800003497', '犀客空间(北京国贸和乔丽致店)', '豪华复式影音房', '2018-12-10 09:58:25', '2018-12-11 00:00:00', '2018-12-20 00:00:00', '836', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '16c4d52c-4712-488b-a5a0-707e40e1eafe');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65e43-66c2-c162-0d29-7e5ed5b57b1e', '0', 'HB1800003497', '犀客空间(北京国贸和乔丽致店)', '豪华复式影音房', '2018-12-10 09:58:25', '2018-12-11 00:00:00', '2018-12-20 00:00:00', '836', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '16c4d52c-4712-488b-a5a0-707e40e1eafe');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65e43-66c2-caae-eb7a-47f48bb16b3a', '0', 'HB1800003497', '犀客空间(北京国贸和乔丽致店)', '豪华复式影音房', '2018-12-10 09:58:25', '2018-12-11 00:00:00', '2018-12-20 00:00:00', '836', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '16c4d52c-4712-488b-a5a0-707e40e1eafe');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65e43-66c2-d535-1f5c-8187e07509f6', '0', 'HB1800003497', '犀客空间(北京国贸和乔丽致店)', '豪华复式影音房', '2018-12-10 09:58:25', '2018-12-11 00:00:00', '2018-12-20 00:00:00', '836', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '16c4d52c-4712-488b-a5a0-707e40e1eafe');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65e43-66c2-e042-828f-804a7a25f14f', '0', 'HB1800003497', '犀客空间(北京国贸和乔丽致店)', '豪华复式影音房', '2018-12-10 09:58:25', '2018-12-11 00:00:00', '2018-12-20 00:00:00', '836', '0', '0', '0', null, '1.000000000000000000000000000000', 'RMB', null, null, '0', '16c4d52c-4712-488b-a5a0-707e40e1eafe');
INSERT INTO `tmc_hotel_room` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '08d65f3e-702c-4322-0255-5bdcdf2a9d75', '94952721', '7964945414', '携程标准价', '大床', '0001-01-01 00:00:00', '2018-12-12 00:00:00', '2018-12-13 00:00:00', '218', '2', '0', '0', '', '1.000000000000000000000000000000', 'RMB', '豪华大床房', '', '0', 'd2218aa8-3bfa-4e2a-b7c9-ec983504dd36');

-- ----------------------------
-- Table structure for `tmc_hotel_settlement_order`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_hotel_settlement_order`;
CREATE TABLE `tmc_hotel_settlement_order` (
  `Id` char(36) NOT NULL COMMENT '主键',
  `DetailType` longtext COMMENT '订单明细类型：出票--O 退票--R',
  `Price` decimal(10,0) DEFAULT NULL COMMENT '单价',
  `Quantity` int(11) DEFAULT NULL COMMENT '间夜数',
  `Amount` decimal(10,0) DEFAULT NULL COMMENT '订单总价金额',
  `Servicefee` decimal(10,0) DEFAULT NULL COMMENT '服务费',
  `ExtraCharge` decimal(10,0) DEFAULT NULL COMMENT '加收税额',
  `AccCheckBatchNo` longtext COMMENT '结算批次号',
  `Createtime` datetime DEFAULT NULL COMMENT '明细生成时间',
  `DatachangeLasttime` datetime DEFAULT NULL COMMENT '明细最晚更新时间',
  `SubAccCheckBatchNo` longtext COMMENT '结算子批次号',
  `SettlementCurrency` longtext COMMENT '结算币种',
  `EmployeeName` longtext COMMENT '预定人名称',
  `EmployeeID` longtext COMMENT '预定人员工编号',
  `OrderDate` datetime DEFAULT NULL COMMENT '预定日期',
  `RoomName` longtext COMMENT '房型名称',
  `RoomQuantity` int(11) DEFAULT NULL COMMENT '房间数',
  `ClientName` longtext COMMENT '入住人',
  `StartTime` datetime DEFAULT NULL COMMENT '入住日期',
  `EndTime` datetime DEFAULT NULL COMMENT '离店日期',
  `HotelName` longtext COMMENT '酒店名称',
  `CityName` longtext COMMENT '酒店所在城市',
  `Star` int(11) DEFAULT NULL COMMENT '酒店星级',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_hotel_settlement_order
-- ----------------------------

-- ----------------------------
-- Table structure for `tmc_insurance`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_insurance`;
CREATE TABLE `tmc_insurance` (
  `Id` char(36) NOT NULL COMMENT '主键',
  `OrderType` int(11) DEFAULT NULL COMMENT '订单类型 1:机票 2:火车 3:酒店',
  `OrderId` longtext COMMENT '订单id',
  `PassengerInfoId` char(36) NOT NULL,
  `Sequence` int(11) DEFAULT NULL COMMENT '航程序号',
  `FlightId` int(11) DEFAULT NULL COMMENT 'FlightId',
  `FlighTicketId` int(11) DEFAULT NULL COMMENT 'FlighTicketId',
  `TmcOrderTicketId` longtext COMMENT 'TmcOrderTicketId',
  `TrainTicketOrderId` char(36) DEFAULT NULL COMMENT 'TrainTicketOrderId',
  `InsuaranceQuantity` int(11) DEFAULT NULL COMMENT '保险数量	 	Y',
  `InsuaranceUnitPrice` decimal(10,0) DEFAULT NULL COMMENT '保险单价	 	Y',
  `InsuranceStatus` longtext COMMENT '保单状态            W 已下单（携程内部保险订单已创建，但未出保）  C	已取消（未出保取消） P	已出保 R	已退保（已出保取消）',
  `InsuranceTypeName` longtext COMMENT '保险类型名称',
  `InsuranceNo` longtext,
  `CompanyName` longtext COMMENT '保险公司名称',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：未删除 1：删除',
  `FlightOrderInfoId` char(36) DEFAULT NULL COMMENT 'FlightOrderInfo主键',
  `TrainOrderInfoId` char(36) DEFAULT NULL COMMENT 'TrainOrderInfo主键',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_insurance
-- ----------------------------

-- ----------------------------
-- Table structure for `tmc_order_delivery`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_order_delivery`;
CREATE TABLE `tmc_order_delivery` (
  `Id` char(36) NOT NULL COMMENT '主键',
  `OrderType` int(11) DEFAULT NULL COMMENT '订单类型 1:机票 2:火车 3:酒店',
  `OrderId` char(36) DEFAULT NULL COMMENT '订单no',
  `DeliveryTypeName` longtext COMMENT '配送方式',
  `Province` longtext COMMENT 'String	省		Y',
  `City` longtext COMMENT 'String	市		Y',
  `Area` longtext COMMENT 'String	区/县		Y',
  `DeliveryAddress` longtext COMMENT '配送省 市 区 （街道）',
  `DeliveryAddressDetail` longtext COMMENT '配送详细地址',
  `DeliveryContactZipCode` longtext COMMENT '配送地址邮编',
  `DeliveryContactMobile` longtext COMMENT '配送接收人手机',
  `DeliveryContactName` longtext COMMENT '配送接收人姓名',
  `DeliveryContactTel` longtext COMMENT '配送接收人电话',
  `DeliveryContactEMail` longtext COMMENT '配送接收人电话',
  `DeliveryOrderType` longtext COMMENT '配送订单类型',
  `ShipmentCompany` longtext COMMENT 'String	物流公司		Y',
  `ShipmentNo` longtext COMMENT 'String	物流单号		Y',
  `DeliverStatus` longtext COMMENT 'String	快递状态		Y',
  `DeliverFailMessage` longtext COMMENT 'String	配送失败原因		Y',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：未删除 1：删除',
  `FlightOrderInfoId` char(36) DEFAULT NULL COMMENT 'FlightOrderInfo主键',
  `TrainOrderInfoId` char(36) DEFAULT NULL COMMENT 'TrainOrderInfo主键',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_order_delivery
-- ----------------------------

-- ----------------------------
-- Table structure for `tmc_passenger`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_passenger`;
CREATE TABLE `tmc_passenger` (
  `Id` char(36) NOT NULL COMMENT '主键',
  `OrderNo` longtext COMMENT '订单id',
  `OrderType` int(11) DEFAULT NULL COMMENT '订单类型 1:机票 2:火车 3:酒店',
  `PassengerId` longtext COMMENT '乘客编号 N',
  `PassengerName` longtext COMMENT '乘客姓名 N	PassengerName是用户输入姓名（可能包含非法字符），            TicketPassengerName是经过处理之后的姓名',
  `PassengerNameEn` longtext COMMENT 'String	乘机人姓名英文		Y',
  `EmployeeId` longtext COMMENT '员工号',
  `TmcUserID` longtext COMMENT 'tmc员工号',
  `NationalityCode` longtext COMMENT '国籍代码',
  `NationalityName` longtext COMMENT '国籍名称',
  `CardTypeName` longtext COMMENT '证件种类名称',
  `CardTypeNumber` longtext COMMENT '证件号码',
  `Gender` longtext COMMENT '性别',
  `Birthday` datetime DEFAULT NULL COMMENT '生日',
  `TicketPassengerName` longtext COMMENT '出票姓名 N',
  `TicketTypeName` longtext COMMENT '票类型（成人票/儿童票） N',
  `InsuranceUnitPrice` decimal(10,0) DEFAULT NULL COMMENT '保险费 N',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：未删除 1：删除',
  `TmcException` longtext COMMENT 'tmc异常标识,异常 数字以,隔开',
  `OrderId` char(36) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_passenger
-- ----------------------------
INSERT INTO `tmc_passenger` VALUES ('0028db22-3c14-447d-8182-1c55e899f9ed', 'RB1800002552', '1', '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, '身份证', '12321432432532421321', null, '0001-01-01 00:00:00', '李胜勇测试二号', '成人', '0', '0', null, 'b95361ee-83d5-4b34-a21a-17ac00a22dd4');
INSERT INTO `tmc_passenger` VALUES ('068102b8-5d42-4563-9248-4ccad604ff29', 'TB1800013787', '2', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, '身份证', '12321432432532421321', null, '0001-01-01 00:00:00', null, null, '0', '0', '', '40cf905c-73cd-406a-abba-35cc80861acd');
INSERT INTO `tmc_passenger` VALUES ('08d64462-a015-4816-73ce-ff8b228a14c0', 'HB1800003160', '1', null, '朱小华', null, 'GackG1022002', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'e470540b-63f0-489d-af0a-33333d2867ff');
INSERT INTO `tmc_passenger` VALUES ('08d64462-a015-51c6-cb73-6492ca9f03fc', 'HB1800003160', '1', null, '测试审批人', null, 'GackG1022001', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'e470540b-63f0-489d-af0a-33333d2867ff');
INSERT INTO `tmc_passenger` VALUES ('08d64562-fb6d-cfbc-12b8-b8cb8cbf62a1', 'RB1800002283', '1', null, null, null, null, null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '45c2f9db-4e33-4013-8143-00d289863b79');
INSERT INTO `tmc_passenger` VALUES ('08d64a0d-1cf3-b51c-e920-d859feec86f8', 'HB1800003237', '3', null, '朱小华', null, 'GackG1022002', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '8f1dee53-a553-4986-9a29-627e55527b16');
INSERT INTO `tmc_passenger` VALUES ('08d64abb-98a7-ef73-d87a-ba54e03d66f2', 'HB1800003248', '3', null, '朱小华', null, 'GackG1022002', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'd0056361-3cb2-4f75-8d99-8ca260dc7fc6');
INSERT INTO `tmc_passenger` VALUES ('08d64abc-6eb6-4c0e-5faa-b164c930eeba', 'HB1800003249', '3', null, '朱小华', null, 'GackG1022002', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'bee852db-c2e5-4d78-ab3f-ab4587493b6c');
INSERT INTO `tmc_passenger` VALUES ('08d655f1-6b92-fae4-5fb2-1baf5c0c6653', 'HB1800003453', '3', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '9ef0108b-1120-4002-b10c-4e80c73da771');
INSERT INTO `tmc_passenger` VALUES ('08d655f4-e948-5888-3536-ec0294809a31', 'HB1800003454', '3', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'a8b5a717-382a-459f-a247-a50e851a485a');
INSERT INTO `tmc_passenger` VALUES ('08d65666-c411-fb2b-0679-28779893f34a', 'HB1800003455', '3', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '9c516d1d-1735-4f65-bfc8-ec5492e49fc9');
INSERT INTO `tmc_passenger` VALUES ('08d6566b-cbd0-1ef5-94f4-b7f13953a1b0', 'HB1800003456', '3', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'd6b7d3f3-67d6-4cc1-a5df-5f2ad8d16bde');
INSERT INTO `tmc_passenger` VALUES ('08d6566e-bb6d-60d4-d7c7-035845ba5e18', 'HB1800003457', '3', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '62466c4c-6365-41e9-a238-313a8e65a839');
INSERT INTO `tmc_passenger` VALUES ('08d658c5-9d70-62e1-c075-6c5db540ea5f', 'HB1800003459', '3', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'c85aa5ef-984a-4a56-b2ff-d0fe7f369740');
INSERT INTO `tmc_passenger` VALUES ('08d658f1-3304-bcc4-91ca-1d371569f1cf', 'HB1800003460', '3', null, '来教育他具体在真', null, '000121_9_3887cd461d3246479020b9136c81d7ca', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '8c64f378-5b62-4468-9257-d78773d24d29');
INSERT INTO `tmc_passenger` VALUES ('08d65985-d760-6564-9f8f-f2db57ed4571', 'HB1800003461', '3', null, '大王', null, '000121_9_38b88a512970489f9f08156bf01b6f65', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '56d703a9-bd6d-4bff-b9f9-1f079a6c799d');
INSERT INTO `tmc_passenger` VALUES ('08d65986-8c29-5292-c01a-b18c33fe1e1e', 'HB1800003462', '3', null, '大王', null, '000121_9_38b88a512970489f9f08156bf01b6f65', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'a09771a0-80c1-48c2-a29c-7d23aaf7374a');
INSERT INTO `tmc_passenger` VALUES ('08d65988-12fe-e8af-fdfc-729885814b03', 'HB1800003463', '3', null, '大王', null, '000121_9_38b88a512970489f9f08156bf01b6f65', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '8e8d4711-97f9-4e0c-9f80-7b35ec9b92a7');
INSERT INTO `tmc_passenger` VALUES ('08d6598a-2e35-265d-8fe0-74116b8586c1', 'HB1800003466', '3', null, '家具加工厂', null, '000121_9_3887cd461d3246479020b9136c81d7ca', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'fd6f51c1-08d3-40a3-ab3d-01a40458e2f1');
INSERT INTO `tmc_passenger` VALUES ('08d65994-a5d2-d8c3-bff2-a2651ef75b01', 'HB1800003467', '3', null, '大王', null, '000121_9_38b88a512970489f9f08156bf01b6f65', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '00c2b357-c568-4b78-aedf-4e1ae5cf9049');
INSERT INTO `tmc_passenger` VALUES ('08d659b5-32ca-f046-6d9c-6fe7cb3e3df4', 'HB1800003468', '3', null, '家具加工厂', null, '000121_9_3887cd461d3246479020b9136c81d7ca', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'e1921744-b3f8-4a2b-9471-375e9e8b4324');
INSERT INTO `tmc_passenger` VALUES ('08d659b7-fd8f-5aad-93ed-143e37e489df', 'HB1800003469', '3', null, '家具加工厂', null, '000121_9_3887cd461d3246479020b9136c81d7ca', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '79f911e8-257f-48c1-932a-b543c8087178');
INSERT INTO `tmc_passenger` VALUES ('08d65b45-4b7b-abf2-977a-6e187e34d146', 'HB1800003476', '3', null, '大王', null, '000121_9_38b88a512970489f9f08156bf01b6f65', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'fd2fd883-5c66-4054-afef-62bef57587c6');
INSERT INTO `tmc_passenger` VALUES ('08d65c0d-c373-f3bc-738c-a590d0f64a1e', 'HB1800003485', '3', null, '苗卓', null, '000121_9_275f5267cec94dd4aa7efa0c0583b47a', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '007e1a24-b738-4f43-b655-1feab24d8894');
INSERT INTO `tmc_passenger` VALUES ('08d65c1a-a394-1003-fe2c-9c7fafece802', 'HB1800003488', '3', null, '啊啊', null, '000121_9_3784c6d793e64eeeb49a8094a879886d', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'd11fbc87-901a-4c3d-be55-eb29e903f0b0');
INSERT INTO `tmc_passenger` VALUES ('08d65c1a-a549-d942-4f63-23fb09a26ba2', 'HB1800003487', '3', null, '苗卓', null, '000121_9_275f5267cec94dd4aa7efa0c0583b47a', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'c16c5869-f9e6-4458-ae95-7f3ab05b0788');
INSERT INTO `tmc_passenger` VALUES ('08d65c1c-b7f0-ea6d-3658-da43a0f72cc9', 'HB1800003490', '3', null, '啊啊', null, '000121_9_3784c6d793e64eeeb49a8094a879886d', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '9d4ac861-a5c5-4ffb-b5c6-151e5c038888');
INSERT INTO `tmc_passenger` VALUES ('08d65d95-9fa7-7d38-ca86-5b31ca3bbb64', 'HB1800003493', '3', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '2f444293-37e9-439c-8c63-2aa5045a683c');
INSERT INTO `tmc_passenger` VALUES ('08d65d9c-53f5-9bcb-17b4-e17e86569d44', 'HB1800003494', '3', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'ff0f1acc-1dd6-41f7-bf51-23c49960a462');
INSERT INTO `tmc_passenger` VALUES ('08d65e43-66c2-ee54-a0a6-509b8507d837', 'HB1800003497', '3', null, '啊啊', null, '000121_9_3784c6d793e64eeeb49a8094a879886d', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, '16c4d52c-4712-488b-a5a0-707e40e1eafe');
INSERT INTO `tmc_passenger` VALUES ('08d65f3e-7027-e334-6903-7478cdb5617d', '7964945414', '3', null, '毛玉杰', null, '0000120001', null, null, null, null, null, null, '0001-01-01 00:00:00', null, null, '0', '0', null, 'd2218aa8-3bfa-4e2a-b7c9-ec983504dd36');
INSERT INTO `tmc_passenger` VALUES ('099123bd-f80a-40ed-a18b-59bff0cd4e55', 'TB1800013302', '2', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, '身份证', '12321432432532421321', null, '0001-01-01 00:00:00', null, null, '0', '0', '', '8abdb8a4-ffcd-4aca-8281-5640dc78164a');
INSERT INTO `tmc_passenger` VALUES ('0c468154-e435-4946-82c8-887572ef068b', 'TB1800013301', '2', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, '身份证', '12321432432532421321', null, '0001-01-01 00:00:00', null, null, '0', '0', '', 'f47bc4ed-a67b-4f2a-ae54-7daad7acb251');
INSERT INTO `tmc_passenger` VALUES ('1091536c-42d0-46b3-9354-88765d49d7b0', 'RB1800002578', '1', '000121_9_3887cd461d3246479020b9136c81d7ca', '家具加工厂', null, '000121_9_3887cd461d3246479020b9136c81d7ca', null, null, null, '身份证', '110108198503160913', null, '0001-01-01 00:00:00', '家具加工厂', '成人', '0', '0', null, '70f77e8a-4517-4e86-a96d-83baa5a4aec9');
INSERT INTO `tmc_passenger` VALUES ('13ff536f-287d-4fc7-8bae-5b90d93ec637', 'TB1800012438', '2', null, '朱小华', null, 'GackG1022002', null, null, null, '身份证', '3232432423454323', null, '0001-01-01 00:00:00', null, null, '0', '0', '', '29acfa4f-0a6f-473d-8136-958af0dded37');
INSERT INTO `tmc_passenger` VALUES ('16bea1f3-6c6b-4b93-a98b-1efc78d8f20b', 'RB1800002665', '1', '000121_9_275f5267cec94dd4aa7efa0c0583b47a', '苗卓', null, '000121_9_275f5267cec94dd4aa7efa0c0583b47a', null, null, null, '身份证', '372922199512175714', null, '0001-01-01 00:00:00', '苗卓', '成人', '0', '0', null, '797a1f83-e7a7-48ea-8284-4dcea0a2ad4a');
INSERT INTO `tmc_passenger` VALUES ('1b9c69f3-c427-4f6c-b7d5-a2add099cfef', 'TB1800012719', '2', null, '朱小华', null, 'GackG1022002', null, null, null, '身份证', '3232432423454323', null, '0001-01-01 00:00:00', null, null, '0', '0', '', 'd45d2dc6-9493-429a-84f0-5e132035e1ac');
INSERT INTO `tmc_passenger` VALUES ('214ea85c-f4c7-46a9-b6a6-95de453d08ca', 'RB1800002569', '1', '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, '身份证', '12321432432532421321', null, '0001-01-01 00:00:00', '李胜勇测试二号', '成人', '0', '0', null, '0fa77462-abe8-4ea2-828c-012d3ad9d87d');
INSERT INTO `tmc_passenger` VALUES ('370c0781-812c-4910-86d6-fdc59d0a3092', 'TB1800013750', '2', null, 'MIAO/ZHUO', null, '000121_9_275f5267cec94dd4aa7efa0c0583b47a', null, null, null, '身份证', '372922199512175714', null, '0001-01-01 00:00:00', null, null, '0', '0', '', 'e20f2747-9787-436a-bbc8-f648e61e71e4');
INSERT INTO `tmc_passenger` VALUES ('37baa238-6292-4469-9bea-1c03f4e737a0', 'RB1800002351', '1', 'GackG1022002', '朱小华', null, 'GackG1022002', null, null, null, '身份证', '3232432423454323', null, '0001-01-01 00:00:00', '朱小华', '成人', '0', '0', null, '9343fdd3-1641-4f1c-b80d-af136bf0eb59');
INSERT INTO `tmc_passenger` VALUES ('3cb94a80-e2f7-4b9a-b48c-3289cc1c7ee1', 'TB1800013429', '2', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, '身份证', '12321432432532421321', null, '0001-01-01 00:00:00', null, null, '0', '0', '', '68910679-58f7-4854-8f69-288c3ce0b7eb');
INSERT INTO `tmc_passenger` VALUES ('42270a3b-32ec-4674-ac02-3169ecfee7de', 'RB1800002611', '1', '000121_9_275f5267cec94dd4aa7efa0c0583b47a', '苗卓', null, '000121_9_275f5267cec94dd4aa7efa0c0583b47a', null, null, null, '身份证', '372922199512175714', null, '0001-01-01 00:00:00', '苗卓', '成人', '0', '0', null, '191ab313-e624-4c80-bc59-67d9358afa27');
INSERT INTO `tmc_passenger` VALUES ('453c01b4-dc1c-42a0-959c-de8d5e42e341', 'RB1800002561', '1', '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, '身份证', '12321432432532421321', null, '0001-01-01 00:00:00', '李胜勇测试二号', '成人', '0', '0', null, 'c6b2f3d2-fcb1-4c77-9947-90997bd11c3e');
INSERT INTO `tmc_passenger` VALUES ('480cfa39-660c-45cb-b910-08dd639f7ea9', 'TB1800013790', '2', null, '李', null, '', null, null, null, '身份证', '12321', null, '0001-01-01 00:00:00', null, null, '0', '0', '', 'bf394540-25c2-4805-ae5e-aefa696e5c24');
INSERT INTO `tmc_passenger` VALUES ('4bd674c6-da8b-4672-aa33-5d5a53d36566', 'RB1800002559', '1', '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, '身份证', '12321432432532421321', null, '0001-01-01 00:00:00', '李胜勇测试二号', '成人', '0', '0', null, '8f9fa2ef-eb79-4a18-85dd-5b09a45ad071');
INSERT INTO `tmc_passenger` VALUES ('4df3c91d-f580-4a89-85af-fbacdd9fbf7a', 'RB1800002266', '1', 'GackG1022002', '朱小华', null, 'GackG1022002', null, null, null, '身份证', '3232432423454323', null, '0001-01-01 00:00:00', '朱小华', '成人', '0', '0', null, '40e3ff56-648f-4a23-bf56-8dfc8b0cdbd2');
INSERT INTO `tmc_passenger` VALUES ('50964773-301a-4c18-b53d-243a073e83cd', 'RB1800002553', '1', '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, '身份证', '12321432432532421321', null, '0001-01-01 00:00:00', '李胜勇测试二号', '成人', '0', '0', null, '9cb19294-e527-483d-b762-62355d1c3122');
INSERT INTO `tmc_passenger` VALUES ('6fce40db-8d47-4bae-9bc5-be66cc1be93c', 'TB1800013699', '2', null, '苗卓', null, '000121_9_275f5267cec94dd4aa7efa0c0583b47a', null, null, null, '身份证', '372922199512175714', null, '0001-01-01 00:00:00', null, null, '0', '0', '', '96b2ec2c-96df-4ad5-b668-a031d754305e');
INSERT INTO `tmc_passenger` VALUES ('72df440f-bade-4d92-961b-f4128bf10b02', 'TB1800013786', '2', null, '李', null, '', null, null, null, '身份证', '11', null, '0001-01-01 00:00:00', null, null, '0', '0', '', 'd90f632c-681c-450b-93f8-78540c3898f4');
INSERT INTO `tmc_passenger` VALUES ('82b2be4a-e330-452b-a0de-211891343449', 'RB1800002283', '1', 'GackG1022002', '朱小华', null, 'GackG1022002', null, null, null, '身份证', '3232432423454323', null, '0001-01-01 00:00:00', '朱小华', '成人', '0', '0', null, '1f958318-4145-4815-8fb9-3a59ea19f23e');
INSERT INTO `tmc_passenger` VALUES ('84886580-52d3-463f-881a-a8bc2304b41d', 'RB1800002246', '1', 'GackG1022002', '朱小华', null, 'GackG1022002', null, null, null, '身份证', '3232432423454323', null, '0001-01-01 00:00:00', '朱小华', '成人', '0', '0', null, 'a980c9a6-0451-46f6-bd6c-b5d755129d30');
INSERT INTO `tmc_passenger` VALUES ('8bf85087-0449-4723-852d-9b02001536fc', 'TB1800013725', '2', null, '张三', null, '', null, null, null, '身份证', '372922199512175714', null, '0001-01-01 00:00:00', null, null, '0', '0', '', '2caab5bf-f005-4360-a219-8ffcdd3c0c73');
INSERT INTO `tmc_passenger` VALUES ('98527805-bdb3-4d22-8b0a-1cb143ecd294', 'TB1800013792', '2', null, '李', null, '', null, null, null, '身份证', '12321', null, '0001-01-01 00:00:00', null, null, '0', '0', '', 'e888c5ce-dd80-432f-b413-a5fa73d9bf49');
INSERT INTO `tmc_passenger` VALUES ('996f9282-856c-458a-8909-19f4cd7ecce7', 'TB1800013298', '2', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, '身份证', '12321432432532421321', null, '0001-01-01 00:00:00', null, null, '0', '0', '', '2987c927-7215-4c22-8c91-1c6beacd12da');
INSERT INTO `tmc_passenger` VALUES ('a4691785-5261-4917-abb4-2b408fe94576', 'RB1800002613', '1', '000121_9_275f5267cec94dd4aa7efa0c0583b47a', '苗卓', null, '000121_9_275f5267cec94dd4aa7efa0c0583b47a', null, null, null, '身份证', '372922199512175714', null, '0001-01-01 00:00:00', '苗卓', '成人', '0', '0', null, 'e7c9f5f2-5e9d-4616-9b55-da940ad6016a');
INSERT INTO `tmc_passenger` VALUES ('aff7e4d2-cebd-4a8b-bbc5-68aee877b091', 'RB1800002519', '1', 'GackG1022002', '朱小华', null, 'GackG1022002', null, null, null, '身份证', '3232432199001010810', null, '0001-01-01 00:00:00', '朱小华', '成人', '0', '0', null, '7fc8ae21-3dd9-4ffa-9cfa-0e304b2f50e7');
INSERT INTO `tmc_passenger` VALUES ('b1933de6-c532-41f2-8f53-11ab6ae137d1', 'RB1800002517', '1', 'GackG1022002', '朱小华', null, 'GackG1022002', null, null, null, '身份证', '3232432199001010810', null, '0001-01-01 00:00:00', '朱小华', '成人', '0', '0', null, 'deb48ae8-c6bf-47f0-967a-e0bcd0473065');
INSERT INTO `tmc_passenger` VALUES ('b2ac4b7d-1818-4d5f-a110-5fa4bc9c19d8', 'TB1800012389', '2', null, '测试审批人', null, 'GackG1022001', null, null, null, '身份证', '32234234354534523', null, '0001-01-01 00:00:00', null, null, '0', '0', '', 'd4da0343-ffd1-4bff-938a-aa3cbdc71bf3');
INSERT INTO `tmc_passenger` VALUES ('b74165e9-66fd-4958-89e6-3aea30357b75', 'TB1800013788', '2', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, '身份证', '12321432432532421321', null, '0001-01-01 00:00:00', null, null, '0', '0', '', '81618920-ad93-4617-a1ac-3a2e19332644');
INSERT INTO `tmc_passenger` VALUES ('bb5b8dcc-c40c-427e-9ea7-0abab6409d15', 'TB1800012438', '2', null, '测试审批人', null, 'GackG1022001', null, null, null, '身份证', '32234234354534523', null, '0001-01-01 00:00:00', null, null, '0', '0', '', '29acfa4f-0a6f-473d-8136-958af0dded37');
INSERT INTO `tmc_passenger` VALUES ('bbd27e2b-491e-4250-b38a-072e6fc1a936', 'TB1800012389', '2', null, '朱小华', null, 'GackG1022002', null, null, null, '身份证', '3232432423454323', null, '0001-01-01 00:00:00', null, null, '0', '0', '', 'd4da0343-ffd1-4bff-938a-aa3cbdc71bf3');
INSERT INTO `tmc_passenger` VALUES ('dd339f85-61f4-4226-8ba6-689b6ea3a7c9', 'TB1800013687', '2', null, '啊啊', null, '000121_9_3784c6d793e64eeeb49a8094a879886d', null, null, null, '身份证', '512501197203035172', null, '0001-01-01 00:00:00', null, null, '0', '0', '', '2bad5d04-dee0-49e1-8be3-9257f23b832d');
INSERT INTO `tmc_passenger` VALUES ('e85b6963-6df9-4a2a-9818-b94671d7505d', 'TB1800013791', '2', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, '身份证', '12321432432532421321', null, '0001-01-01 00:00:00', null, null, '0', '0', '', '5140734c-5574-49ba-b31a-71eefa489547');
INSERT INTO `tmc_passenger` VALUES ('ea01dd4b-e9a1-48be-bdf4-af9912db0884', 'TB1800012747', '2', null, '朱小华', null, 'GackG1022002', null, null, null, '身份证', '3232432423454323', null, '0001-01-01 00:00:00', null, null, '0', '0', '', '8a436834-e28c-4274-8435-20e44c033b77');
INSERT INTO `tmc_passenger` VALUES ('eaf14cb7-ecbd-4075-bdc0-467bef8ed9a8', 'RB1800002246', '1', 'GackG1022001', '测试审批人', null, 'GackG1022001', null, null, null, '身份证', '32234234354534523', null, '0001-01-01 00:00:00', '测试审批人', '成人', '0', '0', null, 'a980c9a6-0451-46f6-bd6c-b5d755129d30');
INSERT INTO `tmc_passenger` VALUES ('ef1e8b73-ba89-433a-a68d-1aca2cfd0828', 'TB1800013789', '2', null, '李胜勇测试二号', null, '000121_9_027712a4217f4e0ebe9ee1114b4b77e1', null, null, null, '身份证', '12321432432532421321', null, '0001-01-01 00:00:00', null, null, '0', '0', '', 'd143469f-2d9d-4cf4-bef5-804aa94eac75');

-- ----------------------------
-- Table structure for `tmc_train_order`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_train_order`;
CREATE TABLE `tmc_train_order` (
  `AppKey` longtext,
  `OrgCode` longtext,
  `TmcSupplierId` longtext,
  `OrderNo` longtext,
  `ApprovalNo` longtext,
  `Amount` decimal(65,30) NOT NULL,
  `ServiceFee` decimal(65,30) NOT NULL,
  `OnBusiness` int(11) NOT NULL,
  `PayType` longtext,
  `OrderDate` datetime(6) DEFAULT NULL,
  `ProductType` longtext,
  `CostCenterCode` longtext,
  `Id` char(36) NOT NULL COMMENT '主键',
  `OrderStatus` int(11) DEFAULT NULL COMMENT 'N:未提交 WP:待支付 PP:支付处理中 PF:支付失败 WA:待授权 AR:授权拒绝 WT:待出票 TP:购票中             TD已购票 TF:出票失败 C:已取消',
  `OrderTrainType` longtext COMMENT 'String	订单类型 N	P:配送票；E:电子票；',
  `TotalQuantity` int(11) DEFAULT NULL COMMENT '订票总张数',
  `Remark` longtext COMMENT '订单说明',
  `OrderTicketType` longtext COMMENT '0:普通票{ get; set; }1:往返票',
  `ContactName` longtext COMMENT '联系人姓名',
  `ContactPhone` longtext COMMENT '收件联系人手机号',
  `ContactEmail` longtext COMMENT '联系Email',
  `RefundFee` decimal(10,0) DEFAULT NULL COMMENT '退票费',
  `RefundTicketStatus` int(11) DEFAULT NULL COMMENT '退票状态	 	R:已退票 P:退票中 PT:部分退票',
  `DeliverFee` decimal(10,0) DEFAULT NULL COMMENT '配送费',
  `PaperTicketFee` decimal(10,0) DEFAULT NULL COMMENT '纸质票出票费 N',
  `ChangeServiceFee` decimal(10,0) DEFAULT NULL COMMENT '改签服务费 Y',
  `ChangeTicketStatus` int(11) DEFAULT NULL COMMENT '改签状态	 	C:已改签；P改签中，PC：部分改签',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：删除 1，未删除',
  `TmcException` longtext COMMENT 'tmc异常标识,异常 数字以,隔开',
  `Detail_Item_ID` varchar(100) DEFAULT NULL,
  `ChangeAmount` decimal(10,2) DEFAULT NULL,
  `EmployeeNo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_train_order
-- ----------------------------
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002569', 'TA0091811300002', '269.000000000000000000000000000000', '2.000000000000000000000000000000', '1', 'C', '2018-12-03 09:59:49.000000', 'T', '', '0fa77462-abe8-4ea2-828c-012d3ad9d87d', '1', null, '1', '', null, '李胜勇测试二号', '15216664272', '', '0', '0', '0', '0', '0', '0', '0', '', null, '0.00', '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002611', null, '1750.000000000000000000000000000000', '2.000000000000000000000000000000', '1', 'C', '2018-12-07 14:38:32.000000', 'T', '', '191ab313-e624-4c80-bc59-67d9358afa27', '1', null, '1', '', null, '苗卓', '15010437080', '', '0', '0', '0', '0', '0', '0', '0', '', null, '0.00', '000121_9_275f5267cec94dd4aa7efa0c0583b47a');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002283', 'TAGack1811070005', '79.000000000000000000000000000000', '2.000000000000000000000000000000', '1', 'P', '2018-11-08 11:08:56.000000', 'T', '', '1f958318-4145-4815-8fb9-3a59ea19f23e', '6', null, '1', '', null, '朱小华', '13321312322', '2332424@qq.com', '0', '0', '0', '0', '0', '0', '0', '', '', '-17.00', 'GackG1022002');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002266', 'TAGack1811070006', '140.500000000000000000000000000000', '2.000000000000000000000000000000', '1', 'P', '2018-11-07 13:14:48.000000', 'T', '', '40e3ff56-648f-4a23-bf56-8dfc8b0cdbd2', '4', null, '1', '', null, '朱小华', '13321312322', '2332424@qq.com', '0', '0', '0', '0', '0', '0', '0', '', null, null, 'GackG1022002');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002578', 'TA0091812040018', '941.000000000000000000000000000000', '2.000000000000000000000000000000', '1', 'C', '2018-12-04 15:05:04.000000', 'T', '', '70f77e8a-4517-4e86-a96d-83baa5a4aec9', '1', null, '1', '', null, '家具加工厂', '18311342709', '', '0', '0', '0', '0', '0', '0', '0', '', null, '0.00', '000121_9_3887cd461d3246479020b9136c81d7ca');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002665', null, '83.000000000000000000000000000000', '2.000000000000000000000000000000', '1', 'C', '2018-12-11 11:20:49.000000', 'T', '', '797a1f83-e7a7-48ea-8284-4dcea0a2ad4a', '1', null, '1', '', null, '苗卓', '15010437080', '', '0', '0', '0', '0', '0', '0', '0', '', null, '0.00', '000121_9_275f5267cec94dd4aa7efa0c0583b47a');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002519', 'TAGack1811280001', '797.000000000000000000000000000000', '2.000000000000000000000000000000', '1', 'C', '2018-11-28 14:26:52.000000', 'T', '', '7fc8ae21-3dd9-4ffa-9cfa-0e304b2f50e7', '1', null, '1', '', null, '朱小华', '13321312322', '', '0', '0', '0', '0', '0', '0', '0', '', null, '0.00', 'GackG1022002');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002559', 'TA0091811290043', '1764.500000000000000000000000000000', '2.000000000000000000000000000000', '1', 'C', '2018-11-30 15:37:49.000000', 'T', '', '8f9fa2ef-eb79-4a18-85dd-5b09a45ad071', '1', null, '1', '', null, '李胜勇测试二号', '15216664272', '', '0', '0', '0', '0', '0', '0', '0', '', null, '0.00', '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002351', 'TAGack1811070006', '48.500000000000000000000000000000', '2.000000000000000000000000000000', '1', 'C', '2018-11-14 16:28:08.000000', 'T', '', '9343fdd3-1641-4f1c-b80d-af136bf0eb59', '1', null, '1', '', null, '朱小华', '13321312322', '2332424@qq.com', '0', '0', '0', '0', '0', '0', '0', '', null, '0.00', 'GackG1022002');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002553', 'TA0091811290043', '935.000000000000000000000000000000', '2.000000000000000000000000000000', '1', 'C', '2018-11-30 09:48:19.000000', 'T', '', '9cb19294-e527-483d-b762-62355d1c3122', '1', null, '1', '', null, '李胜勇测试二号', '15216664272', '', '0', '0', '0', '0', '0', '0', '0', '', null, '0.00', '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002246', 'TAGack1811050004', '1673.000000000000000000000000000000', '4.000000000000000000000000000000', '1', 'P', '2018-11-05 20:44:27.000000', 'T', '', 'a980c9a6-0451-46f6-bd6c-b5d755129d30', '5', null, '2', '', null, '朱小华', '13321312322', '2332424@qq.com', '0', '0', '0', '0', '0', '0', '0', '', null, '0.00', 'GackG1022002');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002552', 'TA0091811290043', '560.000000000000000000000000000000', '2.000000000000000000000000000000', '1', 'C', '2018-11-29 20:24:29.000000', 'T', '', 'b95361ee-83d5-4b34-a21a-17ac00a22dd4', '1', null, '1', '', null, '李胜勇测试二号', '15216664272', '', '0', '0', '0', '0', '0', '0', '0', '', null, '0.00', '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002561', 'TA0091811290043', '1764.500000000000000000000000000000', '2.000000000000000000000000000000', '1', 'C', '2018-11-30 15:42:38.000000', 'T', '', 'c6b2f3d2-fcb1-4c77-9947-90997bd11c3e', '1', null, '1', '', null, '李胜勇测试二号', '15216664272', '', '0', '0', '0', '0', '0', '0', '0', '', null, '0.00', '000121_9_027712a4217f4e0ebe9ee1114b4b77e1');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002517', 'TAGack1811260001', '1971.500000000000000000000000000000', '2.000000000000000000000000000000', '1', 'C', '2018-11-28 14:15:07.000000', 'T', '', 'deb48ae8-c6bf-47f0-967a-e0bcd0473065', '1', null, '1', '', null, '朱小华', '13321312322', '', '0', '0', '0', '0', '0', '0', '0', '', null, '0.00', 'GackG1022002');
INSERT INTO `tmc_train_order` VALUES ('GACK_OA', 'S117614', 'T03', 'RB1800002613', null, '1750.000000000000000000000000000000', '2.000000000000000000000000000000', '1', 'C', '2018-12-07 15:35:15.000000', 'T', '', 'e7c9f5f2-5e9d-4616-9b55-da940ad6016a', '1', null, '1', '', null, '苗卓', '15010437080', '', '0', '0', '0', '0', '0', '0', '0', '', null, '0.00', '000121_9_275f5267cec94dd4aa7efa0c0583b47a');

-- ----------------------------
-- Table structure for `tmc_train_settlement_order`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_train_settlement_order`;
CREATE TABLE `tmc_train_settlement_order` (
  `Id` char(36) NOT NULL COMMENT '主键',
  `DetailType` longtext COMMENT '订单明细类型：出票--O 退票--R 改签--A',
  `PassengerName` longtext COMMENT '乘客姓名',
  `Price` decimal(10,0) DEFAULT NULL COMMENT '票面价',
  `ServerFee` decimal(10,0) DEFAULT NULL COMMENT '服务费',
  `CancelFee` decimal(10,0) DEFAULT NULL COMMENT '退票费',
  `InsureFee` decimal(10,0) DEFAULT NULL COMMENT '保险费',
  `PaperTicketFee` decimal(10,0) DEFAULT NULL COMMENT '纸质票出票费',
  `DeliverFee` decimal(10,0) DEFAULT NULL COMMENT '快递费',
  `ReBookingServiceFee` decimal(10,0) DEFAULT NULL COMMENT '改签服务费',
  `Amount` decimal(10,0) DEFAULT NULL COMMENT '费用合计',
  `BatchNo` longtext COMMENT '结算批次号',
  `SettlementCreatetime` datetime DEFAULT NULL COMMENT '明细生成时间',
  `SettlementLasttime` datetime DEFAULT NULL COMMENT '明细最晚更新时间',
  `SubAccCheckBatchNo` longtext COMMENT '结算子批次号',
  `SettlementCurrency` longtext COMMENT '结算币种',
  `OrderStatus` longtext COMMENT '订单状态 N:未提交WP:待支付PP:支付处理中PF:支付失败WA:待授权AR:授权拒绝            WT:待出票TP:购票中TD:已购票 TF:出票失败 C:已取消',
  `UserName` longtext COMMENT '用户姓名',
  `OrderDate` datetime DEFAULT NULL COMMENT '预定时间',
  `RefundTicketStatus` longtext COMMENT '退票状态P	退票处理中S:退票成功F:退票失败 D:配送票购票失败 A:配送票票张金额差价退款',
  `ChangeTicketStatus` longtext COMMENT '改签状态C	：已改签P:改签中PC:部分改签',
  `ShipAddressDetail` longtext COMMENT '配送详细地址',
  `ShipReceiverName` longtext COMMENT '配送接收人姓名',
  `EmployeeId` longtext COMMENT '预订卡员工编号',
  `JourneyReason` longtext COMMENT '出行目的',
  `TicketInfoId` longtext COMMENT '车票车次ID',
  `TrainName` longtext COMMENT '车次名',
  `FirstSeatTypeName` longtext COMMENT '首选座席名称',
  `TrainType` longtext COMMENT '列车类型id(D,G,K,T)',
  `DepartureCityName` longtext COMMENT '出发城市名字',
  `DepartureDateTime` datetime DEFAULT NULL COMMENT '出发日期时间',
  `DepartureStationName` longtext COMMENT '出发车站名',
  `ArrivalCityName` longtext COMMENT '到达城市名字',
  `ArrivalDateTime` datetime DEFAULT NULL COMMENT '到达时间',
  `ArrivalStationName` longtext COMMENT '到达车站名',
  `TainTicketType` longtext COMMENT '车票类型（D原车次车票；C改签车次车票）',
  `OrderTicketId` longtext COMMENT '订单出票车票ID',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_train_settlement_order
-- ----------------------------

-- ----------------------------
-- Table structure for `tmc_train_ticket`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_train_ticket`;
CREATE TABLE `tmc_train_ticket` (
  `CreateBy` longtext,
  `CreateAt` datetime(6) NOT NULL,
  `ModifyBy` longtext,
  `ModifyAt` datetime(6) DEFAULT NULL,
  `Id` char(36) NOT NULL COMMENT '主键',
  `OrderNo` longtext,
  `TicketInfoId` longtext COMMENT '车票车次ID',
  `TrainName` longtext COMMENT '车次名',
  `DepartCityName` longtext COMMENT '出发城市名字',
  `DepartDateTime` datetime DEFAULT NULL COMMENT '出发日期时间 格式：yyyy-MM-dd HH:mm:ss',
  `DepartStationName` longtext COMMENT '出发车站名',
  `ArrivalCityName` longtext COMMENT '到达城市名字',
  `ArrivalStationName` longtext COMMENT '到达车站名',
  `ArrivalDateTime` datetime DEFAULT NULL COMMENT '到达时间	 		格式：yyyy-MM-dd HH:mm:ss            201	硬座 203	软座 205	特等座 207	一等座 209	二等座 211	硬卧上 212	硬卧中            213硬卧下 214	软卧上 215	软卧下 218	高级软包上 219	高级软包下            221	商务座 227	无座 224	硬卧 225	软卧 226	高级软卧 301	一等软座 302	二等软座 303	一人软包             304	动卧 305	动卧上 306	动卧下 307	高级动卧 308	高级动卧上309 高级动卧下',
  `FirstSeatTypeName` longtext COMMENT '首选坐席code',
  `TicketPrice` decimal(10,0) DEFAULT NULL COMMENT '车票票面价',
  `DealTicketPrice` decimal(10,0) DEFAULT NULL COMMENT '实际出票的价格',
  `ElectronicOrderNo` longtext COMMENT '12306电子订单号{ get; set; }',
  `ServiceFee` decimal(10,0) DEFAULT NULL COMMENT '服务费',
  `DeliverFee` decimal(10,0) DEFAULT NULL COMMENT '配送费',
  `PaperTicketFee` decimal(10,0) DEFAULT NULL COMMENT '纸质票出票费',
  `TrainTicketType` longtext COMMENT '车次类型	 		 D原车次；C改签车次',
  `ChangeServiceFee` decimal(10,0) DEFAULT NULL COMMENT '改签服务费	 		 改签服务费落地',
  `GrabServiceFee` decimal(10,0) DEFAULT NULL COMMENT '抢票服务费	 		没有抢票服务费则为0',
  `ChangeStatus` longtext COMMENT '改签状态	 P/改签处理中；S/改签成功；F/改签失败',
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：未删除 1：删除',
  `TmcException` longtext COMMENT 'tmc异常标识,异常 数字以,隔开',
  `TrainOrderInfoId` char(36) DEFAULT NULL COMMENT 'TrainOrderInfos主键',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_train_ticket
-- ----------------------------
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '117cde1d-c118-4f4b-bbe8-422c452d4cb0', 'RB1800002246', 'G114', 'G114', '上海虹桥', '2018-11-27 08:15:00', '上海虹桥', '北京南', '北京南', '2018-11-27 14:13:00', '二等座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, 'a980c9a6-0451-46f6-bd6c-b5d755129d30');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '24217989-2c58-418f-aff2-33c12e8182e2', 'RB1800002559', 'G5', 'G5', '北京南', '2018-12-01 07:00:00', '北京南', '上海', '上海', '2018-12-01 11:40:00', '商务座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, '8f9fa2ef-eb79-4a18-85dd-5b09a45ad071');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '3418b285-293e-44f4-8784-b1a40c9b2fcd', 'RB1800002517', 'G1952', 'G1952', '上海虹桥', '2018-12-18 08:10:00', '上海虹桥', '石家庄', '石家庄', '2018-12-18 15:28:00', '商务座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, 'deb48ae8-c6bf-47f0-967a-e0bcd0473065');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '387d22d5-3f97-4f25-aeb8-6c5153ffe8e9', 'RB1800002561', 'G5', 'G5', '北京南', '2018-12-01 07:00:00', '北京南', '上海', '上海', '2018-12-01 11:40:00', '商务座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, 'c6b2f3d2-fcb1-4c77-9947-90997bd11c3e');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '648b1ed4-5974-44f6-95dd-82978b7a9780', 'RB1800002553', 'G123', 'G123', '北京南', '2018-11-30 11:05:00', '北京南', '上海虹桥', '上海虹桥', '2018-11-30 16:50:00', '一等座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, '9cb19294-e527-483d-b762-62355d1c3122');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '7c082909-5c9e-403d-bb45-bf4593f52626', 'RB1800002519', 'K599', 'K599', '北京西', '2018-11-30 05:14:00', '北京西', '广州', '广州', '2018-12-01 11:12:00', '软卧', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, '7fc8ae21-3dd9-4ffa-9cfa-0e304b2f50e7');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '7e44bc91-944a-419d-9145-322e96389c03', 'RB1800002266', 'G1970', 'G1970', '上海虹桥', '2018-12-01 06:10:00', '上海虹桥', '南京南', '南京南', '2018-12-01 07:37:00', '二等座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, '40e3ff56-648f-4a23-bf56-8dfc8b0cdbd2');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '8372be7d-afa8-4711-be2e-195bdc8a5b42', 'RB1800002578', 'G5', 'G5', '北京南', '2018-12-15 07:00:00', '北京南', '上海', '上海', '2018-12-15 11:40:00', '一等座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, '70f77e8a-4517-4e86-a96d-83baa5a4aec9');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '840d8d09-14cb-405b-8994-a5ee29b7ddf6', 'RB1800002351', 'K526', 'K526', '上海南', '2018-12-01 04:14:00', '上海南', '南京', '南京', '2018-12-01 08:09:00', '无座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, '9343fdd3-1641-4f1c-b80d-af136bf0eb59');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '8f0722ed-a800-4517-a23b-3d80cb1a4d67', 'RB1800002613', 'G107', 'G107', '北京南', '2018-12-09 08:05:00', '北京南', '上海虹桥', '上海虹桥', '2018-12-09 13:46:00', '商务座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, 'e7c9f5f2-5e9d-4616-9b55-da940ad6016a');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '904118af-cba4-4612-9e5e-bb1ee0d77258', 'RB1800002283', 'G7331', 'G7331', '上海虹桥', '2018-12-01 06:17:00', '上海虹桥', '杭州东', '杭州东', '2018-12-01 07:16:00', '二等座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, '1f958318-4145-4815-8fb9-3a59ea19f23e');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, '998e5ae1-515d-40b7-9427-747f3b0ba48b', 'RB1800002569', '2083', '2083', '鞍山', '2018-12-03 12:42:00', '鞍山', '白城', '白城', '2018-12-03 21:07:00', '软卧', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, '0fa77462-abe8-4ea2-828c-012d3ad9d87d');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'aff9f5d8-df25-48d6-b8d1-b3a4af7ad155', 'RB1800002611', 'G117', 'G117', '北京南', '2018-12-08 09:25:00', '北京南', '上海虹桥', '上海虹桥', '2018-12-08 15:37:00', '商务座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, '191ab313-e624-4c80-bc59-67d9358afa27');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'd19c0159-57fd-4b57-a421-8d71a2385291', 'RB1800002283', 'D3207', 'D3207', '上海虹桥', '2018-12-01 12:59:00', '上海虹桥', '杭州东', '杭州东', '2018-12-01 11:48:00', '二等座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', '', '1f958318-4145-4815-8fb9-3a59ea19f23e');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'dd1a9543-1863-4388-a1e5-9460c23abb98', 'RB1800002552', 'G5', 'G5', '北京南', '2018-11-30 07:00:00', '北京南', '上海', '上海', '2018-11-30 11:40:00', '二等座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, 'b95361ee-83d5-4b34-a21a-17ac00a22dd4');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'e20d4d77-b52a-4fd4-b0b8-64ba13b0833b', 'RB1800002665', 'Z601', 'Z601', '北京', '2019-01-01 08:51:00', '北京', '菏泽', '菏泽', '2019-01-01 14:00:00', '硬座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', null, '797a1f83-e7a7-48ea-8284-4dcea0a2ad4a');
INSERT INTO `tmc_train_ticket` VALUES (null, '0001-01-01 00:00:00.000000', null, null, 'fdbb6238-ef9f-49f1-99e9-56a9699adb87', 'RB1800002246', 'G122', 'G122', '上海虹桥', '2018-11-30 16:43:00', '上海虹桥', '北京南', '北京南', '2018-11-30 10:41:00', '二等座', '0', '0', null, '0', '0', '0', null, '0', '0', null, '0', '', 'a980c9a6-0451-46f6-bd6c-b5d755129d30');

-- ----------------------------
-- Table structure for `tmc_train_ticket_order`
-- ----------------------------
DROP TABLE IF EXISTS `tmc_train_ticket_order`;
CREATE TABLE `tmc_train_ticket_order` (
  `Id` char(36) NOT NULL COMMENT '主键',
  `ChangeOrderNo` longtext,
  `RefundOrderNo` longtext,
  `PassengerId` char(36) NOT NULL,
  `TicketInfoId` longtext COMMENT '车票车次ID	 	N',
  `OrderTicketId` longtext COMMENT '订单出票车票ID	 	N',
  `EnableRefundTicket` bit(1) DEFAULT NULL COMMENT '是否可退票	 	N',
  `DealSeatNo` longtext COMMENT '出票座位号	 	N',
  `DealSeatName` longtext COMMENT '出票座位号描述	 	N',
  `DealTicketPrice` decimal(10,2) DEFAULT NULL COMMENT '出票实际票价	 	N',
  `HeightestTicketPrice` decimal(10,0) DEFAULT NULL COMMENT '订单备选、首选坐席中最高价	 	N	火车票是先支付再出票，在支付时按照最高收费进行收取，然后退还票价和服务费差价。HeightestTicketPrice就是那个支付的价格。（预订卧铺的时候预先按照下铺价格收取）',
  `ServiceFee` decimal(10,2) DEFAULT NULL COMMENT '服务费',
  `RefundTicketStatus` longtext COMMENT '车票退票状态	 	P:退票处理中 S:退票成功 F:退票失败 D::配送票购票失败 A:配送票票张金额差价退款',
  `RefundTicketFee` decimal(10,2) DEFAULT NULL COMMENT '退票费	 	Y	只有当前车票退票状态等于退票成功才返回',
  `Refund` decimal(10,2) DEFAULT NULL COMMENT '退票退款	 	Y	只有当前车票退票状态等于退票成功才返回',
  `DealTicketServiceFee` decimal(10,0) DEFAULT NULL COMMENT '实际票张服务费	 	N	实际收取的服务费。（买票时收的是下铺的钱和按照下铺计算的服务费，当出的票是上铺时，会产生票价差和服务费差，DealTicketServiceFee是实际出票产生的服务费）',
  `TicketType` longtext COMMENT '车票类型	 	Y	（D原车次车票；C改签车次车票）',
  `ChangeStatus` longtext COMMENT '改签状态	 	Y	（P/改签处理中；S/改签成功；F/改签失败）',
  `ChangeRemark` longtext COMMENT '改签备注	 	Y	失败原因等',
  `DealChangeServiceFee` decimal(10,0) DEFAULT NULL COMMENT '实际改签服务费	 	Y',
  `EnableChangeTicket` bit(1) DEFAULT NULL COMMENT '是否可改签	 	N',
  `OriOrderTicketId` longtext COMMENT '原票号id',
  `SeatType` longtext,
  `TrainTicketInfoId` char(36) NOT NULL,
  `DeleteFlag` int(11) DEFAULT NULL COMMENT '0：未删除 1：删除',
  `TmcException` longtext COMMENT 'tmc异常标识,异常 数字以,隔开',
  `TrainOrderInfoId` char(36) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmc_train_ticket_order
-- ----------------------------
INSERT INTO `tmc_train_ticket_order` VALUES ('0302a4ab-7fbd-4310-8098-cc27dc3832ac', 'RC1800000439', null, '82b2be4a-e330-452b-a0de-211891343449', 'D3207', 'E20181108133650342A', '', '7车厢2B座', '7车厢2B座', '56.00', '0', '2.00', '0', '0.00', '0.00', '2', 'C', '3', '', '2', '', 'E20181108111934683A', '二等座', 'd19c0159-57fd-4b57-a421-8d71a2385291', '0', null, '1f958318-4145-4815-8fb9-3a59ea19f23e');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d6431c-9126-14e9-48b0-da4e0af5b9d1', null, null, '84886580-52d3-463f-881a-a8bc2304b41d', 'G114', 'E20181108112021074A', '', '12车厢4E座', '12车厢4E座', '555.00', '0', '2.00', '0', '0.00', '0.00', '2', 'D', '3', null, '0', '', null, '二等座', '117cde1d-c118-4f4b-bbe8-422c452d4cb0', '0', null, 'a980c9a6-0451-46f6-bd6c-b5d755129d30');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d64470-08e5-cded-88cc-5a532251e69f', null, 'RR1800000645', '4df3c91d-f580-4a89-85af-fbacdd9fbf7a', 'G1970', 'E20181107140351293A', '', '11车厢3C座', '11车厢3C座', '136.50', '0', '2.00', '3', '0.00', '-137.00', '2', 'D', null, null, '0', '', null, '二等座', '7e44bc91-944a-419d-9145-322e96389c03', '0', null, '40e3ff56-648f-4a23-bf56-8dfc8b0cdbd2');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d64527-bd0f-8c3e-4afe-b2bec6f31c5c', null, null, '82b2be4a-e330-452b-a0de-211891343449', 'G7331', 'E20181108111934683A', '', '10车厢3C座', '10车厢3C座', '75.00', '0', '2.00', '0', '0.00', '-19.00', '2', 'D', '3', null, '0', '', null, '二等座', '904118af-cba4-4612-9e5e-bb1ee0d77258', '0', null, '1f958318-4145-4815-8fb9-3a59ea19f23e');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d64a0b-4c12-76be-f76c-e63aab6993e7', null, null, '37baa238-6292-4469-9bea-1c03f4e737a0', 'K526', null, '', null, null, '0.00', '0', '2.00', '0', '0.00', '0.00', '2', 'D', null, null, '0', '', null, '无座', '840d8d09-14cb-405b-8994-a5ee29b7ddf6', '0', null, '9343fdd3-1641-4f1c-b80d-af136bf0eb59');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d654f9-0931-b306-a03c-110c73988cd4', null, null, 'b1933de6-c532-41f2-8f53-11ab6ae137d1', 'G1952', null, '', null, null, '0.00', '0', '2.00', '0', '0.00', '0.00', '2', 'D', null, null, '0', '', null, '商务座', '3418b285-293e-44f4-8784-b1a40c9b2fcd', '0', null, 'deb48ae8-c6bf-47f0-967a-e0bcd0473065');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d654fa-b607-5f0d-b211-a44242994615', null, null, 'aff7e4d2-cebd-4a8b-bbc5-68aee877b091', 'K599', null, '', null, null, '0.00', '0', '2.00', '0', '0.00', '0.00', '2', 'D', null, null, '0', '', null, '软卧', '7c082909-5c9e-403d-bb45-bf4593f52626', '0', null, '7fc8ae21-3dd9-4ffa-9cfa-0e304b2f50e7');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d655f5-bfe7-a3b0-aa25-5544a0af2c1c', null, null, '0028db22-3c14-447d-8182-1c55e899f9ed', 'G5', null, '', null, null, '0.00', '0', '2.00', '0', '0.00', '0.00', '2', 'D', null, null, '0', '', null, '二等座', 'dd1a9543-1863-4388-a1e5-9460c23abb98', '0', null, 'b95361ee-83d5-4b34-a21a-17ac00a22dd4');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d65666-121e-3f2a-f0ab-d8d039b1843e', null, null, '50964773-301a-4c18-b53d-243a073e83cd', 'G123', null, '', null, null, '0.00', '0', '2.00', '0', '0.00', '0.00', '2', 'D', null, null, '0', '', null, '一等座', '648b1ed4-5974-44f6-95dd-82978b7a9780', '0', null, '9cb19294-e527-483d-b762-62355d1c3122');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d65696-f65c-406e-fdca-5ac31a5326d5', null, null, '4bd674c6-da8b-4672-aa33-5d5a53d36566', 'G5', null, '', null, null, '0.00', '0', '2.00', '0', '0.00', '0.00', '2', 'D', null, null, '0', '', null, '商务座', '24217989-2c58-418f-aff2-33c12e8182e2', '0', null, '8f9fa2ef-eb79-4a18-85dd-5b09a45ad071');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d65697-a960-7015-4817-8ccae4309189', null, null, '453c01b4-dc1c-42a0-959c-de8d5e42e341', 'G5', null, '', null, null, '0.00', '0', '2.00', '0', '0.00', '0.00', '2', 'D', null, null, '0', '', null, '商务座', '387d22d5-3f97-4f25-aeb8-6c5153ffe8e9', '0', null, 'c6b2f3d2-fcb1-4c77-9947-90997bd11c3e');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d658c3-3dee-ae5e-6dde-7a3a0ca891be', null, null, '214ea85c-f4c7-46a9-b6a6-95de453d08ca', '2083', null, '', null, null, '0.00', '0', '2.00', '0', '0.00', '0.00', '2', 'D', null, null, '0', '', null, '软卧', '998e5ae1-515d-40b7-9427-747f3b0ba48b', '0', null, '0fa77462-abe8-4ea2-828c-012d3ad9d87d');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d659b7-03b7-af3d-6f8a-6dac48169c9b', null, null, '1091536c-42d0-46b3-9354-88765d49d7b0', 'G5', null, '', null, null, '0.00', '0', '2.00', '0', '0.00', '0.00', '2', 'D', null, null, '0', '', null, '一等座', '8372be7d-afa8-4711-be2e-195bdc8a5b42', '0', null, '70f77e8a-4517-4e86-a96d-83baa5a4aec9');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d65c0e-e2a9-a8dd-2c11-dd2a4d68c804', null, null, '42270a3b-32ec-4674-ac02-3169ecfee7de', 'G117', null, '', null, null, '0.00', '0', '2.00', '0', '0.00', '0.00', '2', 'D', null, null, '0', '', null, '商务座', 'aff9f5d8-df25-48d6-b8d1-b3a4af7ad155', '0', null, '191ab313-e624-4c80-bc59-67d9358afa27');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d65c16-b410-8be9-b17a-616672546183', null, null, 'a4691785-5261-4917-abb4-2b408fe94576', 'G107', null, '', null, null, '0.00', '0', '2.00', '0', '0.00', '0.00', '2', 'D', null, null, '0', '', null, '商务座', '8f0722ed-a800-4517-a23b-3d80cb1a4d67', '0', null, 'e7c9f5f2-5e9d-4616-9b55-da940ad6016a');
INSERT INTO `tmc_train_ticket_order` VALUES ('08d65f17-e15f-9ef6-d749-b5d40349add1', null, null, '16bea1f3-6c6b-4b93-a98b-1efc78d8f20b', 'Z601', null, '', null, null, '0.00', '0', '2.00', '0', '0.00', '0.00', '2', 'D', null, null, '0', '', null, '硬座', 'e20d4d77-b52a-4fd4-b0b8-64ba13b0833b', '0', null, '797a1f83-e7a7-48ea-8284-4dcea0a2ad4a');
INSERT INTO `tmc_train_ticket_order` VALUES ('7e632e5f-2244-486c-bcaa-8876a320a3f7', 'RC1800000440', null, '84886580-52d3-463f-881a-a8bc2304b41d', 'G122', 'E20181108133726346A', '', '12车厢4E座', '12车厢4E座', '553.00', '0', '2.00', '0', '0.00', '0.00', '2', 'C', '3', '', '2', '', 'E20181108112021074A', '二等座', 'fdbb6238-ef9f-49f1-99e9-56a9699adb87', '0', null, 'a980c9a6-0451-46f6-bd6c-b5d755129d30');
INSERT INTO `tmc_train_ticket_order` VALUES ('c829e8ce-3eaa-4fde-bf83-1a135f031a0b', null, 'RR1800000654', 'eaf14cb7-ecbd-4075-bdc0-467bef8ed9a8', 'G114', 'E20181108111924500A', '', '11车厢3C座', '11车厢3C座', '1110.00', '0', '2.00', '3', '10.00', '-1100.00', '2', 'D', null, null, '0', '', 'E20181108111924500A', '二等座', '117cde1d-c118-4f4b-bbe8-422c452d4cb0', '0', '600007', 'a980c9a6-0451-46f6-bd6c-b5d755129d30');

-- ----------------------------
-- Table structure for `t_org_tmcinfo`
-- ----------------------------
DROP TABLE IF EXISTS `t_org_tmcinfo`;
CREATE TABLE `t_org_tmcinfo` (
  `Id` char(36) NOT NULL COMMENT '主键',
  `OrgCode` varchar(255) DEFAULT NULL COMMENT '机构代码',
  `OrgName` varchar(20) DEFAULT NULL COMMENT '机构名称',
  `SupplierCode` varchar(50) DEFAULT NULL COMMENT '供应商代码',
  `AppKey` varchar(50) DEFAULT NULL COMMENT 'AppKey',
  `AppSecurity` varchar(50) DEFAULT NULL COMMENT 'AppSecurity',
  `SecretKey` varchar(50) DEFAULT NULL COMMENT '携程数据回调提供的密钥',
  `UseParent` bit(2) DEFAULT NULL,
  `Status` varchar(3) NOT NULL COMMENT '状态： EBL 启用 DBL 禁用',
  `OnBussiness` bit(2) NOT NULL,
  `CreateBy` varchar(50) DEFAULT NULL,
  `CreateAt` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `ModifyBy` varchar(50) DEFAULT NULL,
  `ModifyAt` timestamp(6) NOT NULL DEFAULT '0000-00-00 00:00:00.000000',
  PRIMARY KEY (`Id`),
  KEY `index_orgcode` (`OrgCode`(191))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_org_tmcinfo
-- ----------------------------
INSERT INTO `t_org_tmcinfo` VALUES ('3585b00b-4048-425e-9864-1e1f4e1b0bef', 'S117614', '国安创客（北京）科技有限公司', 'T03', 'GACK_OA', 'S117614my2018', '', '', 'EBL', '', null, '2018-12-11 15:56:43.305907', null, '2018-11-29 19:18:05.737456');
INSERT INTO `t_org_tmcinfo` VALUES ('73b7cba5-979d-4096-b13f-5a99bddb856f', '00001', '携程测试', 'T02', 'obk_yodoo', 'obk_yodoo', 'yodoo_BzI3qgEN', '', 'EBL', '', '000', '2018-10-09 14:21:34.756998', '0000', '2018-07-19 00:00:00.000000');
INSERT INTO `t_org_tmcinfo` VALUES ('7ec2bebc-3126-4d9d-9d0f-09a35ee456ae', 'kboxing', '劲霸男装（上海）有限公司', 'T02', 'obk_kboxing', 'obk_kboxing', 'yodoo_BzI3qgEN', '', 'EBL', '', null, '2018-12-11 15:56:44.388027', null, '2018-12-07 13:22:51.726440');
INSERT INTO `t_org_tmcinfo` VALUES ('829f3214-40eb-4296-9b51-e0e7dee68d46', '00002', '美亚测试', 'T03', 'LBZY', 'ff3f29b905ee4cda8123', null, '', 'EBL', '', '000', '2018-09-22 16:25:54.867529', '0000', '2018-07-19 00:00:00.000000');
INSERT INTO `t_org_tmcinfo` VALUES ('B639E14F-4362-42DA-2C2A-A7B4C27D115B', '3472095853534251888', '滴滴', null, 'a4b7c12cc2b1020d66dc8066172d30a6', 'e6a797a65f8d5e2e7f78e0024ad9b2c4', '81fe7CD2f65c69239d20', '', 'EBL', '', null, '2018-10-08 09:11:16.506141', '', '2018-07-19 00:00:00.000000');

-- ----------------------------
-- Table structure for `t_tmc_supplier`
-- ----------------------------
DROP TABLE IF EXISTS `t_tmc_supplier`;
CREATE TABLE `t_tmc_supplier` (
  `Code` varchar(50) NOT NULL COMMENT '主键',
  `Name` varchar(50) DEFAULT NULL COMMENT '名称',
  `Logo` varchar(255) DEFAULT NULL COMMENT '图标',
  `WebSite` varchar(255) DEFAULT NULL COMMENT '网站',
  `WhiteIpAddr` varchar(20) DEFAULT NULL COMMENT '白名单',
  `Phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `Status` varchar(20) NOT NULL COMMENT '状态',
  `CreateBy` varchar(50) DEFAULT NULL,
  `CreateAt` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `ModifyBy` varchar(50) DEFAULT NULL,
  `ModifyAt` timestamp(6) NOT NULL DEFAULT '0000-00-00 00:00:00.000000',
  PRIMARY KEY (`Code`),
  KEY `index_code` (`Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_tmc_supplier
-- ----------------------------
INSERT INTO `t_tmc_supplier` VALUES ('T01', '携程商旅(小客户版)', 'https://crec.feikongbao.net/tmc/ctrip.png', null, null, '400-980-6666', 'EBL', '000', '2018-07-19 14:23:31.506900', '', '2018-07-19 14:23:31.506901');
INSERT INTO `t_tmc_supplier` VALUES ('T02', '携程商旅(大客户版)', 'https://crec.feikongbao.net/tmc/ctrip.png', null, null, '400-980-6666', 'EBL', '000', '2018-07-19 14:23:31.506902', '', '2018-07-19 14:23:31.506902');
INSERT INTO `t_tmc_supplier` VALUES ('T03', '美亚商旅', 'https://crec.feikongbao.net/tmc/aig.png', null, null, '400-613-9139', 'EBL', '000', '2018-07-19 14:23:31.506903', '', '2018-07-19 14:23:31.506903');
INSERT INTO `t_tmc_supplier` VALUES ('T04', '在路上', 'https://crec.feikongbao.net/tmc/zls365.png', null, null, '400-810-9777', 'EBL', '000', '2018-07-19 14:23:31.506903', '', '2018-07-19 14:23:31.506903');
INSERT INTO `t_tmc_supplier` VALUES ('T05', '空港嘉华', 'https://crec.feikongbao.net/tmc/kgjhair.png', null, null, '010-86485852', 'EBL', '000', '2018-07-19 14:23:31.506903', '', '2018-07-19 14:23:31.506903');
INSERT INTO `t_tmc_supplier` VALUES ('T06', '华美逸达', 'https://crec.feikongbao.net/tmc/himyidea.png', null, null, '400-650-8121', 'EBL', '000', '2018-07-19 14:23:31.506904', '', '2018-07-19 14:23:31.506904');
INSERT INTO `t_tmc_supplier` VALUES ('T07', '铁航国际', 'https://crec.feikongbao.net/tmc/89898989.png', null, null, '400-800-8989', 'EBL', '000', '2018-07-19 14:23:31.506904', '', '2018-07-19 14:23:31.506904');
INSERT INTO `t_tmc_supplier` VALUES ('T08', '飞天下', 'https://crec.feikongbao.net/tmc/ftxtrip.png', null, null, '400-019-1881', 'EBL', '000', '2018-07-19 14:23:31.506905', '', '2018-07-19 14:23:31.506905');
INSERT INTO `t_tmc_supplier` VALUES ('T09', '深圳腾邦', 'https://crec.feikongbao.net/tmc/tmpus.png', null, null, '40069-40069', 'EBL', '000', '2018-07-19 14:23:31.506905', '', '2018-07-19 14:23:31.506905');

-- ----------------------------
-- Table structure for `t_tmc_supplier_config`
-- ----------------------------
DROP TABLE IF EXISTS `t_tmc_supplier_config`;
CREATE TABLE `t_tmc_supplier_config` (
  `ConfigId` varchar(255) DEFAULT NULL COMMENT '主键',
  `SupplierCode` varchar(255) DEFAULT NULL COMMENT '供应商代码',
  `ConfigName` varchar(255) DEFAULT NULL COMMENT '配置名称',
  `InterfaceUrl` varchar(255) DEFAULT NULL COMMENT '配置地址',
  `Version` varchar(255) DEFAULT NULL COMMENT '配置版本号',
  `Status` varchar(255) NOT NULL COMMENT '配置状态 EBL 启用 DBL 禁用',
  `CreateBy` varchar(255) DEFAULT NULL,
  `CreateAt` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `ModifyBy` varchar(255) DEFAULT NULL,
  `ModifyAt` timestamp(6) NOT NULL DEFAULT '0000-00-00 00:00:00.000000',
  KEY `index_suppliercode` (`SupplierCode`(191)),
  KEY `index_configname` (`ConfigName`(191))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_tmc_supplier_config
-- ----------------------------
INSERT INTO `t_tmc_supplier_config` VALUES ('T0201', 'T02', 'ticket', 'https://ct.ctrip.com/corpservice/authorize/getticket', null, 'EBL', '000', '2018-08-01 17:24:55.008756', '000', '2018-08-01 17:24:55.009580');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0602', 'T06', 'employee', 'https://tmc.himyidea.com/tmc-air-api/mvc/zhongtie/synEmployees', null, 'EBL', '000', '2018-08-01 17:24:55.010394', '000', '2018-08-01 17:24:55.010395');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0603', 'T06', 'h5_login', 'https://tmc.himyidea.com/tmc-air-api/mvc/zhongtie/loginH5', null, 'EBL', '000', '2018-08-01 17:24:55.010395', '000', '2018-08-01 17:24:55.010396');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0604', 'T06', 'login', 'https://tmc.himyidea.com/tmc-air-api/mvc/zhongtie/login', null, 'EBL', '000', '2018-08-01 17:24:55.010397', '000', '2018-08-01 17:24:55.010397');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0605', 'T06', 'approval', 'https://tmc.himyidea.com/tmc-air-api/mvc/zhongtie/tripApp/setApproval', null, 'EBL', '000', '2018-08-01 17:24:55.010398', '000', '2018-08-01 17:24:55.010398');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0701', 'T07', 'ticket', 'http://xinga.skyecho.com:8084/skyechoXaoaInterfaces/cnrailway/tokenInterface/getToken.htm', null, 'EBL', '000', '2018-08-01 17:24:55.010399', '000', '2018-08-01 17:24:55.010399');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0702', 'T07', 'employee', 'http://xinga.skyecho.com:8084/skyechoXaoaInterfaces/cnrailway/psgInterface/synEmployees.htm', null, 'EBL', '000', '2018-08-01 17:24:55.010400', '000', '2018-08-01 17:24:55.010401');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0703', 'T07', 'h5_login', 'http://xinga.skyecho.com:8084/skyechoXaoaInterfaces/cnrailway/loginInterface/applogin.htm', null, 'EBL', '000', '2018-08-01 17:24:55.010401', '000', '2018-08-01 17:24:55.010402');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0704', 'T07', 'login', 'http://xinga.skyecho.com:8084/skyechoXaoaInterfaces/cnrailway/loginInterface/weblogin.htm', null, 'EBL', '000', '2018-08-01 17:24:55.010403', '000', '2018-08-01 17:24:55.010403');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0705', 'T07', 'approval', 'http://xinga.skyecho.com:8084/skyechoXaoaInterfaces/cnrailway/approveInterface/setApproval.htm', null, 'EBL', '000', '2018-08-01 17:24:55.010404', '000', '2018-08-01 17:24:55.010404');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0801', 'T08', 'ticket', 'http://zt.ftxtrip.com/adapter/zgztoa/getToken', null, 'EBL', '000', '2018-08-01 17:24:55.010405', '000', '2018-08-01 17:24:55.010406');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0802', 'T08', 'employee', 'http://zt.ftxtrip.com/adapter/zgztoa/synEmployees', null, 'EBL', '000', '2018-08-01 17:24:55.010407', '000', '2018-08-01 17:24:55.010408');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0803', 'T08', 'h5_login', 'http://zt.ftxtrip.com/adapter/login/zgzt/loginH5', null, 'EBL', '000', '2018-08-01 17:24:55.010408', '000', '2018-08-01 17:24:55.010409');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0804', 'T08', 'login', 'http://zt.ftxtrip.com/adapter/login/zgzt/login', null, 'EBL', '000', '2018-08-01 17:24:55.010410', '000', '2018-08-01 17:24:55.010410');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0805', 'T08', 'approval', 'http://zt.ftxtrip.com/adapter/zgztoa/addTripAppForm', null, 'EBL', '000', '2018-08-01 17:24:55.010411', '000', '2018-08-01 17:24:55.010411');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0901', 'T09', 'ticket', 'https://ztszapi.tempustmc.cn/getToken', null, 'EBL', '000', '2018-08-01 17:24:55.010412', '000', '2018-08-01 17:24:55.010413');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0902', 'T09', 'employee', 'https://ztszapi.tempustmc.cn/synEmployees', null, 'EBL', '000', '2018-08-01 17:24:55.010413', '000', '2018-08-01 17:24:55.010414');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0903', 'T09', 'h5_login', 'https://ztszapi.tempustmc.cn/loginH5', null, 'EBL', '000', '2018-08-01 17:24:55.010414', '000', '2018-08-01 17:24:55.010415');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0601', 'T06', 'ticket', 'https://tmc.himyidea.com/tmc-air-api/mvc/zhongtie/getToken', null, 'EBL', '000', '2018-08-01 17:24:55.010393', '000', '2018-08-01 17:24:55.010393');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0505', 'T05', 'approval', 'https://etsmsops.yjtravel.com/crecg/tripApp/setApproval', null, 'EBL', '000', '2018-08-01 17:24:55.010391', '000', '2018-08-01 17:24:55.010392');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0504', 'T05', 'login', 'https://etsmsops.yjtravel.com/crecg/login', null, 'EBL', '000', '2018-08-01 17:24:55.010390', '000', '2018-08-01 17:24:55.010390');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0503', 'T05', 'h5_login', 'https://etsmsops.yjtravel.com/crecg/loginH5', null, 'EBL', '000', '2018-08-01 17:24:55.010389', '000', '2018-08-01 17:24:55.010389');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0202', 'T02', 'employee', 'https://ct.ctrip.com/corpservice/CorpCustService/SaveCorpCustInfoList', null, 'EBL', '000', '2018-08-01 17:24:55.010324', '000', '2018-08-01 17:24:55.010327');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0203', 'T02', 'h5_login', 'https://ct.ctrip.com/m/SingleSignOn/H5SignInfo', null, 'EBL', '000', '2018-08-01 17:24:55.010328', '000', '2018-08-01 17:24:55.010329');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0204', 'T02', 'login', 'https://ct.ctrip.com/corpservice/authorize/login', null, 'EBL', '000', '2018-08-01 17:24:55.010330', '000', '2018-08-01 17:24:55.010330');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0205', 'T02', 'approval', 'https://ct.ctrip.com/switchapi/approval.svc/rest/setapproval', null, 'EBL', '000', '2018-08-01 17:24:55.010331', '000', '2018-08-01 17:24:55.010332');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0206', 'T02', 'other_ticket', 'https://ct.ctrip.com/SwitchAPI/Order/Ticket', null, 'EBL', '000', '2018-08-01 17:24:55.010369', '000', '2018-08-01 17:24:55.010370');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0207', 'T02', 'approval_ticket', 'https://ct.ctrip.com/switchapi/platform.svc/rest/ticket', null, 'EBL', '000', '2018-08-01 17:24:55.010371', '000', '2018-08-01 17:24:55.010372');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0301', 'T03', 'ticket', 'http://121.41.36.97:6005/CrecApi.svc/GetToken', null, 'EBL', '000', '2018-10-12 15:04:11.341403', '000', '2018-08-01 17:24:55.010373');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0302', 'T03', 'employee', 'http://121.41.36.97:6005/CrecApi.svc/SynEmployees', null, 'EBL', '000', '2018-10-11 10:23:49.751867', '000', '2018-08-01 17:24:55.010374');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0904', 'T09', 'login', 'https://ztszapi.tempustmc.cn/login', 'v1', 'EBL', '000', '2018-08-01 17:24:55.010920', '000', '2018-08-01 17:24:55.010923');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0303', 'T03', 'h5_login', 'http://121.41.36.97:6005/CrecLoginH5.aspx', null, 'EBL', '000', '2018-11-28 14:08:37.211027', '000', '2018-08-01 17:24:55.010376');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0305', 'T03', 'approval', 'http://121.41.36.97:6005/CrecApi.svc/SetApproval', null, 'EBL', '000', '2018-10-11 10:23:56.393662', '000', '2018-08-01 17:24:55.010379');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0401', 'T04', 'ticket', 'http://crec.api.otw.cn/api/getToken', null, 'EBL', '000', '2018-08-01 17:24:55.010379', '000', '2018-08-01 17:24:55.010380');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0402', 'T04', 'employee', 'http://crec.api.otw.cn/api/syncEmployees', null, 'EBL', '000', '2018-08-01 17:24:55.010381', '000', '2018-08-01 17:24:55.010381');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0403', 'T04', 'h5_login', 'http://crec.api.otw.cn/api/mlogin', null, 'EBL', '000', '2018-08-01 17:24:55.010382', '000', '2018-08-01 17:24:55.010383');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0404', 'T04', 'login', 'http://crec.api.otw.cn/api/Login', null, 'EBL', '000', '2018-08-01 17:24:55.010383', '000', '2018-08-01 17:24:55.010384');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0405', 'T04', 'approval', 'http://crec.api.otw.cn/api/syncApproval', null, 'EBL', '000', '2018-08-01 17:24:55.010385', '000', '2018-08-01 17:24:55.010385');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0501', 'T05', 'ticket', 'https://etsmsops.yjtravel.com/crecg/getToken', null, 'EBL', '000', '2018-08-01 17:24:55.010386', '000', '2018-08-01 17:24:55.010387');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0502', 'T05', 'employee', 'https://etsmsops.yjtravel.com/crecg/synEmployees', null, 'EBL', '000', '2018-08-01 17:24:55.010388', '000', '2018-08-01 17:24:55.010388');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0304', 'T03', 'login', 'http://121.41.36.97:6005/CrecLogin.aspx', null, 'EBL', '000', '2018-10-11 10:24:01.817368', '000', '2018-08-01 17:24:55.010377');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0905', 'T09', 'approval', 'https://ztszapi.tempustmc.cn/tripApp/setApproval', 'v1', 'EBL', '000', '2018-08-01 17:24:55.010926', '000', '2018-08-01 17:24:55.010926');
INSERT INTO `t_tmc_supplier_config` VALUES ('T0208', 'T02', 'searchorder', 'https://ct.ctrip.com/switchapi/Order/SearchOrder', '', 'EBL', '000', '2018-08-01 17:24:55.010371', '000', '2018-08-01 17:24:55.010372');

-- ----------------------------
-- Table structure for `__efmigrationshistory`
-- ----------------------------
DROP TABLE IF EXISTS `__efmigrationshistory`;
CREATE TABLE `__efmigrationshistory` (
  `MigrationId` varchar(95) NOT NULL,
  `ProductVersion` varchar(32) NOT NULL,
  PRIMARY KEY (`MigrationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of __efmigrationshistory
-- ----------------------------
INSERT INTO `__efmigrationshistory` VALUES ('20180921060624_0921', '2.1.2-rtm-30932');
INSERT INTO `__efmigrationshistory` VALUES ('20180921062703_09211', '2.1.2-rtm-30932');
INSERT INTO `__efmigrationshistory` VALUES ('20180921063120_09211', '2.1.2-rtm-30932');
INSERT INTO `__efmigrationshistory` VALUES ('20180929081854_config', '2.1.2-rtm-30932');
INSERT INTO `__efmigrationshistory` VALUES ('20180930071656_930', '2.1.2-rtm-30932');
