/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : crm2017

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-12-15 03:37:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `attendance`
-- ----------------------------
DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `signIp` varchar(255) DEFAULT NULL,
  `signInTime` datetime DEFAULT NULL,
  `signOutTime` datetime DEFAULT NULL,
  `state` tinyint(11) DEFAULT NULL,
  `emp_id` bigint(255) DEFAULT NULL,
  `signTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `emp_id` (`emp_id`) USING BTREE,
  KEY `state_id` (`state`) USING BTREE,
  CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of attendance
-- ----------------------------
INSERT INTO `attendance` VALUES ('77', 'admin', '192.168.6.130', '2017-11-14 15:13:03', '2017-11-14 15:13:16', '1', null, '2017-11-14 15:15:00');
INSERT INTO `attendance` VALUES ('78', 'admin', '0:0:0:0:0:0:0:1', '2017-11-15 14:42:33', '2017-11-15 14:42:37', '4', null, '2017-11-15 14:42:00');
INSERT INTO `attendance` VALUES ('79', 'admin', '127.0.0.1', '2018-01-11 14:43:43', null, '2', null, null);
INSERT INTO `attendance` VALUES ('80', 'admin', '127.0.0.1', '2018-02-08 14:32:53', null, '2', null, null);

-- ----------------------------
-- Table structure for `attendanceout`
-- ----------------------------
DROP TABLE IF EXISTS `attendanceout`;
CREATE TABLE `attendanceout` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `time` datetime DEFAULT NULL,
  `late` int(11) DEFAULT NULL,
  `sign` int(11) DEFAULT NULL,
  `attendance_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attendanceout
-- ----------------------------
INSERT INTO `attendanceout` VALUES ('1', '2017-11-14 15:40:07', '1', '1', '73');

-- ----------------------------
-- Table structure for `cat`
-- ----------------------------
DROP TABLE IF EXISTS `cat`;
CREATE TABLE `cat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cat
-- ----------------------------

-- ----------------------------
-- Table structure for `checks`
-- ----------------------------
DROP TABLE IF EXISTS `checks`;
CREATE TABLE `checks` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sn` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `signIp` varchar(255) DEFAULT NULL,
  `signInTime` datetime DEFAULT NULL,
  `signOutTime` datetime DEFAULT NULL,
  `state` tinyint(11) DEFAULT NULL,
  `emp_id` bigint(255) DEFAULT NULL,
  `signTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `emp_id` (`emp_id`),
  KEY `state_id` (`state`),
  CONSTRAINT `checks_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of checks
-- ----------------------------
INSERT INTO `checks` VALUES ('40', 'ss', 'admin', '127.0.0.1', '2017-03-07 22:17:35', '2017-03-07 22:44:51', '0', '1', '2017-03-07 22:45:00');
INSERT INTO `checks` VALUES ('45', null, 'John', null, '2017-11-10 22:45:14', null, '0', null, '2017-11-07 22:45:00');
INSERT INTO `checks` VALUES ('46', null, 'John', null, '2017-11-10 22:45:55', null, null, null, null);
INSERT INTO `checks` VALUES ('47', null, 'John', null, '2017-11-10 22:45:59', null, null, null, null);

-- ----------------------------
-- Table structure for `classroom`
-- ----------------------------
DROP TABLE IF EXISTS `classroom`;
CREATE TABLE `classroom` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `seating` int(20) DEFAULT NULL,
  `state` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classroom
-- ----------------------------
INSERT INTO `classroom` VALUES ('1', '1', '1', '122', '0');
INSERT INTO `classroom` VALUES ('2', '2', '2', '111', '0');

-- ----------------------------
-- Table structure for `contract`
-- ----------------------------
DROP TABLE IF EXISTS `contract`;
CREATE TABLE `contract` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sn` varchar(255) DEFAULT NULL,
  `customer_id` bigint(255) DEFAULT NULL,
  `contractDate` date DEFAULT NULL,
  `saler_id` bigint(255) DEFAULT NULL,
  `contractAmount` decimal(10,0) DEFAULT NULL,
  `paymentAmount` decimal(10,0) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `attachment` varchar(255) DEFAULT NULL,
  `modifier_id` bigint(255) DEFAULT NULL,
  `modifyTime` date DEFAULT NULL,
  `state` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contract
-- ----------------------------
INSERT INTO `contract` VALUES ('1', 'SN01', '1', '2017-11-16', '1', '1000', '1000', '测试摘要显示', '/upload/65eaa19d-44e2-4a99-b6f4-09f6cd287c9d.jpg', '1', '2017-11-09', '2');
INSERT INTO `contract` VALUES ('2', 'SN02', '2', '2017-11-02', '2', '2000', '2000', '没有内容', '/upload/32140bb1-eeeb-4190-b957-79af9ddb41b6.jpg', '1', '2017-11-14', '1');
INSERT INTO `contract` VALUES ('3', 'SN1212', '1', '1900-01-01', '4', '2000', '4', '45', '', '1', '1900-01-01', '3');
INSERT INTO `contract` VALUES ('4', 'SN1212', '1', '1900-01-01', '4', '2000', '5', '5', '', '1', '1900-01-01', '3');
INSERT INTO `contract` VALUES ('5', 'SN1212', '1', '1900-01-01', '3', '2000', '1000', '爱学习的人', '', '2', '1900-01-01', '3');
INSERT INTO `contract` VALUES ('6', 'SN1212', '3', '1900-01-01', '2', '2000', '1000', '爱学习的人', '/upload/a3422399-c9ae-4108-9459-cbdb29c7ed7c.jpg', '3', '2017-11-14', '3');
INSERT INTO `contract` VALUES ('8', '67f763c5-86d7-4154-96f0-4f3be8e2fc1a', '33', '2017-11-29', '4444', '6666', '66', '6,6', '', '555', '2017-11-10', '1');
INSERT INTO `contract` VALUES ('10', '95227f1a-59ac-4f1e-8e21-cd795cc31b12', '3', '2017-11-29', '2', '6666', '66', '6,6', '/upload/06a55b44-dacc-45a0-8673-7a9a5f961546.jpg', '2', '2018-02-08', '-1');
INSERT INTO `contract` VALUES ('12', '087950c9-4a58-48a4-ac84-732c93551b3c', '3', '2017-11-29', '2', '6666', '66', '6,6', '', '555', '2017-11-10', '0');
INSERT INTO `contract` VALUES ('14', '3ac1bbba-6ef2-41e0-8f91-62e463f536cb', '3', '2017-11-29', '2', '6666', '66', '6,6', '', '555', '2017-11-10', '-1');
INSERT INTO `contract` VALUES ('15', '9262c5be-0f21-4e8a-9f26-6871d73153cc', '2', '2017-11-22', '3', '4', '4', '4,4', '', '4', '2017-11-10', '-1');
INSERT INTO `contract` VALUES ('16', 'ed5f6bb1-0504-481f-b143-1d70c356f307', '1', '2017-11-06', '4', '55', '5', '5,4', '', '43', '2017-11-10', '2');
INSERT INTO `contract` VALUES ('17', 'fde64762-fb3b-4285-a0e3-de5a46cecf43', '2', null, '3', '333', '2', '啊姐姐', '', '3', '2017-11-10', '-1');
INSERT INTO `contract` VALUES ('18', '738e771c-6a0c-441f-8d14-b6642d9c1834', '3', '2017-11-02', '2', '22', '2', '2', '', '3', '2017-11-14', '-1');

-- ----------------------------
-- Table structure for `customerdevplan`
-- ----------------------------
DROP TABLE IF EXISTS `customerdevplan`;
CREATE TABLE `customerdevplan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `planTime` date DEFAULT NULL,
  `planSubject` varchar(255) DEFAULT NULL,
  `planDetails` varchar(255) DEFAULT NULL,
  `traceResult` tinyint(4) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `customerId` bigint(20) DEFAULT NULL,
  `inputUser` varchar(255) DEFAULT NULL,
  `inputTime` date DEFAULT NULL,
  `state` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customerdevplan
-- ----------------------------

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sn` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `state` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', 'BOSS', '总经办', '0');
INSERT INTO `department` VALUES ('2', 'PERSONAL', '人事部', '0');
INSERT INTO `department` VALUES ('3', 'MARKET', '市场部', '0');
INSERT INTO `department` VALUES ('4', 'SALE', '营销部', '0');

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `realname` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `inputtime` date DEFAULT NULL,
  `state` tinyint(1) DEFAULT NULL,
  `admin` tinyint(1) DEFAULT NULL,
  `dept_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_emp_dept` (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', 'admin', '超级管理员', '1', '122121', '121212@q1.com', '2017-04-17', '1', '1', '1');
INSERT INTO `employee` VALUES ('2', 'liudh', '刘德华', '1', '13088888888', 'liudh@520it.com', '2017-04-17', '0', '0', '2');
INSERT INTO `employee` VALUES ('3', 'zhangxy', '张学友', '1', '13088888887', 'liudh@520it.com', '2017-04-17', '0', '0', '3');
INSERT INTO `employee` VALUES ('5', 'liming', '黎明', '1', '13088888886', 'liming@520it.com', '2017-04-19', '0', '0', '4');
INSERT INTO `employee` VALUES ('6', 'guofc', '郭富城', '1', '13088888885', 'guofc@520it.com', '2017-06-21', '1', '0', '4');
INSERT INTO `employee` VALUES ('7', '演示', '演示', '0644efd8b5bf1f01c33caa763e23d5e1', '9090', '623299342@qq.com', '2017-11-14', '0', '0', null);
INSERT INTO `employee` VALUES ('8', '最终测试1', '最终测试1', '52b04928a73f302f2d95a5aa37b393ae', '13800138000', '123@qq.com', '2017-11-14', '0', '0', '2');

-- ----------------------------
-- Table structure for `employee_role`
-- ----------------------------
DROP TABLE IF EXISTS `employee_role`;
CREATE TABLE `employee_role` (
  `employee_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee_role
-- ----------------------------
INSERT INTO `employee_role` VALUES ('2', '2');
INSERT INTO `employee_role` VALUES ('5', '4');
INSERT INTO `employee_role` VALUES ('3', '4');
INSERT INTO `employee_role` VALUES ('3', '3');
INSERT INTO `employee_role` VALUES ('3', '2');
INSERT INTO `employee_role` VALUES ('7', '2');
INSERT INTO `employee_role` VALUES ('8', '2');
INSERT INTO `employee_role` VALUES ('8', '3');
INSERT INTO `employee_role` VALUES ('8', '4');

-- ----------------------------
-- Table structure for `exam`
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `examSn` varchar(255) DEFAULT NULL,
  `examName` varchar(255) DEFAULT NULL,
  `examTime` datetime DEFAULT NULL,
  `examRemark` varchar(255) DEFAULT NULL,
  `examHandMan_id` bigint(20) DEFAULT NULL,
  `examSubject` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO `exam` VALUES ('2', 'asdas', 'java一期考试', '2017-11-16 01:59:50', 'asdasd', '1', 'UI');
INSERT INTO `exam` VALUES ('3', 'javasss', 'java18期考试', '2017-11-15 09:27:34', 'javasss', '1', 'Java');
INSERT INTO `exam` VALUES ('4', 'c++', 'C++5期考试', '2017-11-13 09:30:04', 'ccc', '1', 'C++');
INSERT INTO `exam` VALUES ('5', 'new recrument', '入学考试', '2017-11-18 18:23:37', 'new stduent', '1', 'Java');
INSERT INTO `exam` VALUES ('7', '3', '3', '2017-11-14 21:56:58', '3', '1', 'Java');
INSERT INTO `exam` VALUES ('8', '56565', 'ghghg', '2017-11-14 23:58:05', 'hughj', '1', 'C++');

-- ----------------------------
-- Table structure for `examcontrol`
-- ----------------------------
DROP TABLE IF EXISTS `examcontrol`;
CREATE TABLE `examcontrol` (
  `id` bigint(20) NOT NULL,
  `examName` varchar(255) DEFAULT NULL,
  `examSn` varchar(255) DEFAULT NULL,
  `studentName_id` bigint(20) DEFAULT NULL,
  `saleman_id` bigint(20) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `class_id` bigint(255) DEFAULT NULL,
  `examTime` datetime DEFAULT NULL,
  `examResult` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `conductor_id` varchar(255) DEFAULT NULL,
  `auditState` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of examcontrol
-- ----------------------------

-- ----------------------------
-- Table structure for `examitem`
-- ----------------------------
DROP TABLE IF EXISTS `examitem`;
CREATE TABLE `examitem` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `exam_register` tinyint(4) DEFAULT NULL,
  `exam_id` bigint(20) DEFAULT NULL,
  `exam_name` varchar(255) DEFAULT NULL,
  `exam_sn` varchar(255) DEFAULT NULL,
  `exam_subject` varchar(255) DEFAULT NULL,
  `exam_time` datetime DEFAULT NULL,
  `exam_score` varchar(255) DEFAULT NULL,
  `exam_remark` varchar(255) DEFAULT NULL,
  `exam_handMan_id` bigint(20) DEFAULT NULL,
  `stu_id` bigint(20) DEFAULT NULL,
  `stu_name` varchar(255) DEFAULT NULL,
  `stu_qq` varchar(255) DEFAULT NULL,
  `stu_tel` varchar(255) DEFAULT NULL,
  `stu_state` bigint(255) DEFAULT NULL,
  `stu_saleman_id` bigint(20) DEFAULT NULL,
  `stu_schoolClass_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of examitem
-- ----------------------------
INSERT INTO `examitem` VALUES ('1', '0', '1', 'java考试', 'javaup', 'java', '2017-11-23 00:44:48', '30', 'aaa', '1', '1', '1', '1', '1', '37', '1', '1');
INSERT INTO `examitem` VALUES ('22', '0', '2', 'java一期考试', 'asdas', 'UI', '2017-11-16 01:59:50', '100', 'asdasd', '1', '46', '小红', '55', '120', '39', '3', '2');
INSERT INTO `examitem` VALUES ('23', '0', '2', 'java一期考试', 'asdas', 'UI', '2017-11-16 01:59:50', '90', 'asdasd', '1', '49', '小鸡', '1', null, '37', null, null);
INSERT INTO `examitem` VALUES ('26', '1', '4', 'C++5期考试', 'c++', 'C++', '2017-11-14 01:30:04', null, 'ccc', '1', '49', '小鸡', '1', null, '37', null, null);
INSERT INTO `examitem` VALUES ('29', '0', '5', '入学考试', 'new recrument', 'Java', '2017-11-19 10:23:37', null, 'new stduent', '1', '49', '小鸡', '1', '', '37', '2', null);
INSERT INTO `examitem` VALUES ('30', '0', '2', 'java一期考试', 'asdas', 'UI', '2017-11-16 17:59:50', '100', 'asdasd', '1', '53', '最终测试学员1', '12345678910', '12345678910', '37', '1', '3');
INSERT INTO `examitem` VALUES ('32', '0', '8', 'ghghg', '56565', 'C++', '2017-11-15 15:58:05', '898', 'hughj', '1', '45', '小明', '992', '992', '37', '1', '2');

-- ----------------------------
-- Table structure for `followstudent`
-- ----------------------------
DROP TABLE IF EXISTS `followstudent`;
CREATE TABLE `followstudent` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `followTime` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `saleman_id` bigint(20) DEFAULT NULL,
  `nextVisitTime` datetime DEFAULT NULL,
  `followAim` varchar(255) DEFAULT NULL,
  `wantingClass` varchar(255) DEFAULT NULL,
  `wantingLevel` varchar(255) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `consultWay` varchar(255) DEFAULT NULL,
  `abstract` varchar(255) DEFAULT NULL,
  `school_id` bigint(20) DEFAULT NULL,
  `linkman_id` bigint(20) DEFAULT NULL,
  `consultTime` int(11) DEFAULT NULL,
  `meetTime` datetime DEFAULT NULL,
  `nowState` varchar(255) DEFAULT NULL,
  `conversation` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of followstudent
-- ----------------------------

-- ----------------------------
-- Table structure for `getmoneybill`
-- ----------------------------
DROP TABLE IF EXISTS `getmoneybill`;
CREATE TABLE `getmoneybill` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `student_id` bigint(255) DEFAULT NULL,
  `getMoneyAmount` decimal(10,0) DEFAULT NULL,
  `currentClass_id` bigint(255) DEFAULT NULL,
  `getMoneyMan_id` bigint(20) DEFAULT NULL,
  `getMoneyWay` varchar(255) DEFAULT NULL,
  `getMoneyType` varchar(255) DEFAULT NULL,
  `billNum` varchar(255) DEFAULT NULL,
  `takeBillOrNot` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `salesman_id` bigint(20) DEFAULT NULL,
  `classChange` varchar(255) DEFAULT NULL,
  `getMoneyTime` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of getmoneybill
-- ----------------------------
INSERT INTO `getmoneybill` VALUES ('1', '5', '1000', '1', '1', '银行卡', '学费', '1111', null, 'java学员', 'wwww', '1', '退学', '2017-10-02');
INSERT INTO `getmoneybill` VALUES ('2', '1', '15000', '1', '5', '银行卡', '大神版学费', '8979869', null, 'Java', '9999', '1', '升大神班', '2017-11-07');
INSERT INTO `getmoneybill` VALUES ('3', '6', '5000', '2', '1', '支付宝', '基础班学费', '9876588', null, 'Java', 'jkl', '1', '留级', '2017-11-10');
INSERT INTO `getmoneybill` VALUES ('4', '8', '2000', null, '3', '支付宝', '其它', '', 'on', 'Java', '迟到罚款', '1', '无', '2017-11-11');
INSERT INTO `getmoneybill` VALUES ('5', '49', '700', '1', '3', '现金', '报名费', '', null, 'C++', '', null, '000', '2017-11-11');
INSERT INTO `getmoneybill` VALUES ('6', '47', '900', null, '2', '银行卡', '报名费', '141', 'on', 'Java', 'java基础班', null, 'java基础班', '2017-11-15');

-- ----------------------------
-- Table structure for `institute`
-- ----------------------------
DROP TABLE IF EXISTS `institute`;
CREATE TABLE `institute` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sn` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of institute
-- ----------------------------
INSERT INTO `institute` VALUES ('1', 'java学院', '001');
INSERT INTO `institute` VALUES ('2', 'h5学院', '002');

-- ----------------------------
-- Table structure for `log`
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `opuser_id` bigint(20) DEFAULT NULL,
  `opip` varchar(255) DEFAULT NULL,
  `function` varchar(255) DEFAULT NULL,
  `params` varchar(255) DEFAULT NULL,
  `optime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of log
-- ----------------------------
INSERT INTO `log` VALUES ('1', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"currentUserId\":1,\"page\":1,\"rows\":10,\"start\":0}]', null);
INSERT INTO `log` VALUES ('2', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"currentUserId\":1,\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-07 22:16:56');
INSERT INTO `log` VALUES ('3', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-09 10:55:19');
INSERT INTO `log` VALUES ('4', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-09 16:57:46');
INSERT INTO `log` VALUES ('5', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-10 10:30:48');
INSERT INTO `log` VALUES ('6', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-10 10:31:05');
INSERT INTO `log` VALUES ('7', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-10 10:34:49');
INSERT INTO `log` VALUES ('8', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-10 11:07:37');
INSERT INTO `log` VALUES ('9', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-10 11:36:28');
INSERT INTO `log` VALUES ('10', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-10 11:53:23');
INSERT INTO `log` VALUES ('11', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-10 14:25:24');
INSERT INTO `log` VALUES ('12', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-10 16:22:42');
INSERT INTO `log` VALUES ('13', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-10 16:24:47');
INSERT INTO `log` VALUES ('14', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-10 20:49:16');
INSERT INTO `log` VALUES ('15', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-11 11:08:13');
INSERT INTO `log` VALUES ('16', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-11 17:27:06');
INSERT INTO `log` VALUES ('17', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-11 20:53:17');
INSERT INTO `log` VALUES ('18', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-11 20:53:49');
INSERT INTO `log` VALUES ('19', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-11 20:53:55');
INSERT INTO `log` VALUES ('20', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-12 14:13:07');
INSERT INTO `log` VALUES ('21', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-12 14:26:11');
INSERT INTO `log` VALUES ('22', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-12 14:26:28');
INSERT INTO `log` VALUES ('23', '1', '127.0.0.1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-12 16:46:26');
INSERT INTO `log` VALUES ('24', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-12 18:48:58');
INSERT INTO `log` VALUES ('25', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-12 18:49:47');
INSERT INTO `log` VALUES ('26', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 08:55:07');
INSERT INTO `log` VALUES ('27', '1', '127.0.0.1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 11:21:33');
INSERT INTO `log` VALUES ('28', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:41:17');
INSERT INTO `log` VALUES ('29', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:41:17');
INSERT INTO `log` VALUES ('30', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:41:31');
INSERT INTO `log` VALUES ('31', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:41:31');
INSERT INTO `log` VALUES ('32', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:41:37');
INSERT INTO `log` VALUES ('33', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:41:37');
INSERT INTO `log` VALUES ('34', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:41:55');
INSERT INTO `log` VALUES ('35', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:41:55');
INSERT INTO `log` VALUES ('36', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:42:53');
INSERT INTO `log` VALUES ('37', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:42:53');
INSERT INTO `log` VALUES ('38', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:42:58');
INSERT INTO `log` VALUES ('39', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:42:58');
INSERT INTO `log` VALUES ('40', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:43:30');
INSERT INTO `log` VALUES ('41', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:43:30');
INSERT INTO `log` VALUES ('42', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:43:52');
INSERT INTO `log` VALUES ('43', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:43:52');
INSERT INTO `log` VALUES ('44', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:44:02');
INSERT INTO `log` VALUES ('45', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:44:02');
INSERT INTO `log` VALUES ('46', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:44:16');
INSERT INTO `log` VALUES ('47', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:44:16');
INSERT INTO `log` VALUES ('48', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:44:18');
INSERT INTO `log` VALUES ('49', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:44:18');
INSERT INTO `log` VALUES ('50', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:45:11');
INSERT INTO `log` VALUES ('51', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:45:26');
INSERT INTO `log` VALUES ('52', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:45:26');
INSERT INTO `log` VALUES ('53', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:45:48');
INSERT INTO `log` VALUES ('54', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:45:48');
INSERT INTO `log` VALUES ('55', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:46:02');
INSERT INTO `log` VALUES ('56', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":20,\"start\":0}]', '2017-11-13 11:46:02');
INSERT INTO `log` VALUES ('57', '1', '127.0.0.1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 11:56:55');
INSERT INTO `log` VALUES ('58', '1', '127.0.0.1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 13:32:13');
INSERT INTO `log` VALUES ('59', '1', '127.0.0.1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 13:32:22');
INSERT INTO `log` VALUES ('60', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 15:37:17');
INSERT INTO `log` VALUES ('61', '1', '127.0.0.1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 15:38:43');
INSERT INTO `log` VALUES ('62', '1', '127.0.0.1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 17:19:26');
INSERT INTO `log` VALUES ('63', '1', '127.0.0.1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 18:22:59');
INSERT INTO `log` VALUES ('64', '1', '127.0.0.1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 18:42:09');
INSERT INTO `log` VALUES ('65', '1', '127.0.0.1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 21:39:16');
INSERT INTO `log` VALUES ('66', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 21:38:07');
INSERT INTO `log` VALUES ('67', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 21:38:39');
INSERT INTO `log` VALUES ('68', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 21:46:29');
INSERT INTO `log` VALUES ('69', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-13 22:21:55');
INSERT INTO `log` VALUES ('70', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 08:45:54');
INSERT INTO `log` VALUES ('71', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 08:58:51');
INSERT INTO `log` VALUES ('72', '1', '192.168.6.225', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 10:24:38');
INSERT INTO `log` VALUES ('73', '1', '192.168.6.110', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 10:24:58');
INSERT INTO `log` VALUES ('74', '1', '192.168.6.110', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 10:25:40');
INSERT INTO `log` VALUES ('75', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:11:15');
INSERT INTO `log` VALUES ('76', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:24:43');
INSERT INTO `log` VALUES ('77', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:25:06');
INSERT INTO `log` VALUES ('78', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:32:22');
INSERT INTO `log` VALUES ('79', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:33:27');
INSERT INTO `log` VALUES ('80', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:33:36');
INSERT INTO `log` VALUES ('81', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:33:43');
INSERT INTO `log` VALUES ('82', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:34:03');
INSERT INTO `log` VALUES ('83', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:34:14');
INSERT INTO `log` VALUES ('84', '1', '127.0.0.1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:38:27');
INSERT INTO `log` VALUES ('85', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:47:22');
INSERT INTO `log` VALUES ('86', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:47:25');
INSERT INTO `log` VALUES ('87', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:47:30');
INSERT INTO `log` VALUES ('88', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:49:50');
INSERT INTO `log` VALUES ('89', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:55:53');
INSERT INTO `log` VALUES ('90', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 11:56:44');
INSERT INTO `log` VALUES ('91', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:01:33');
INSERT INTO `log` VALUES ('92', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:01:42');
INSERT INTO `log` VALUES ('93', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:02:56');
INSERT INTO `log` VALUES ('94', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:03:27');
INSERT INTO `log` VALUES ('95', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:03:29');
INSERT INTO `log` VALUES ('96', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:03:56');
INSERT INTO `log` VALUES ('97', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:05:15');
INSERT INTO `log` VALUES ('98', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:05:39');
INSERT INTO `log` VALUES ('99', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:06:22');
INSERT INTO `log` VALUES ('100', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:08:37');
INSERT INTO `log` VALUES ('101', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:09:22');
INSERT INTO `log` VALUES ('102', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:10:08');
INSERT INTO `log` VALUES ('103', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:10:36');
INSERT INTO `log` VALUES ('104', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:11:25');
INSERT INTO `log` VALUES ('105', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:11:59');
INSERT INTO `log` VALUES ('106', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:12:13');
INSERT INTO `log` VALUES ('107', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:57:18');
INSERT INTO `log` VALUES ('108', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:57:57');
INSERT INTO `log` VALUES ('109', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:58:50');
INSERT INTO `log` VALUES ('110', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 12:58:56');
INSERT INTO `log` VALUES ('111', '1', '192.168.6.225', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 13:06:14');
INSERT INTO `log` VALUES ('112', '1', '192.168.6.130', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 14:30:05');
INSERT INTO `log` VALUES ('113', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-14 14:53:07');
INSERT INTO `log` VALUES ('114', '1', '0:0:0:0:0:0:0:1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2017-11-15 15:16:21');
INSERT INTO `log` VALUES ('115', '1', '127.0.0.1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2018-02-08 14:21:19');
INSERT INTO `log` VALUES ('116', '1', '127.0.0.1', 'com._520it.crm.service.impl.EmployeeServiceImpl:queryPage', '[{\"page\":1,\"rows\":10,\"start\":0}]', '2018-02-08 14:22:02');

-- ----------------------------
-- Table structure for `orderbill`
-- ----------------------------
DROP TABLE IF EXISTS `orderbill`;
CREATE TABLE `orderbill` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_id` bigint(20) DEFAULT NULL,
  `signingTime` date DEFAULT NULL,
  `saler_id` bigint(20) DEFAULT NULL,
  `orderBillAmount` decimal(10,0) DEFAULT NULL,
  `deposit` decimal(10,0) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `attachment` varchar(255) DEFAULT NULL,
  `modifier_id` bigint(20) DEFAULT NULL,
  `modifyTime` date DEFAULT NULL,
  `state` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderbill
-- ----------------------------
INSERT INTO `orderbill` VALUES ('1', '1', '2017-11-09', '1', '12', '12', '记录', '/upload/65eaa19d-44e2-4a99-b6f4-09f6cd287c9d.jpg', '2', '2017-11-14', '3');
INSERT INTO `orderbill` VALUES ('3', '3', '2017-11-09', '7', '77', '34', '我发你看见你发的是', '/upload/e15c2a6f-3927-4360-8abc-d1f6434844df.jpg', '3', '2017-11-14', '-1');

-- ----------------------------
-- Table structure for `paymoneybill`
-- ----------------------------
DROP TABLE IF EXISTS `paymoneybill`;
CREATE TABLE `paymoneybill` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `payMoneyTime` date DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `handman_id` bigint(20) DEFAULT NULL,
  `payMoneyType` varchar(255) DEFAULT NULL,
  `billNum` varchar(255) DEFAULT NULL,
  `payMoneyAmount` double(255,0) DEFAULT NULL,
  `cashier_id` bigint(20) DEFAULT NULL,
  `payMoneyWay` varchar(255) DEFAULT NULL,
  `smallType` varchar(255) DEFAULT NULL,
  `shareMoney` double(255,0) DEFAULT NULL,
  `shareMoneyType` varchar(255) DEFAULT NULL,
  `belongSubject` varchar(255) DEFAULT NULL,
  `audit` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paymoneybill
-- ----------------------------
INSERT INTO `paymoneybill` VALUES ('1', '2017-11-03', '1111', '1', '1111', '1111', '1111', '1', '111', '11', '11111', '1111', '1', '1');
INSERT INTO `paymoneybill` VALUES ('4', '2017-11-10', '妹子多', '1', '庆祝活动', '123321', '1000', '1', '支付宝', '好的', '1000', '公司报销', 'UI', '1');
INSERT INTO `paymoneybill` VALUES ('5', '2017-11-10', '222', '0', '招待客户', '123', '3000', '1', '支付宝', '222', '321', '部门承担', 'C++', '0');
INSERT INTO `paymoneybill` VALUES ('6', '2017-11-14', '剩余500', null, '庆祝活动', '9090', '1000', '1', '支付宝', '900', '900', '公司报销', 'C++', null);

-- ----------------------------
-- Table structure for `permission`
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `resource` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('5', '员工数据', 'employee:list');
INSERT INTO `permission` VALUES ('6', '员工新增', 'employee:save');
INSERT INTO `permission` VALUES ('7', '员工列表', 'employee:index');
INSERT INTO `permission` VALUES ('8', '员工更新', 'employee:update');
INSERT INTO `permission` VALUES ('9', '员工离职', 'employee:quit');
INSERT INTO `permission` VALUES ('10', '教室数据', 'classRoom:list');
INSERT INTO `permission` VALUES ('11', '教室新增', 'classRoom:save');
INSERT INTO `permission` VALUES ('12', '教室更新', 'classRoom:update');
INSERT INTO `permission` VALUES ('13', '教室删除', 'classRoom:quit');
INSERT INTO `permission` VALUES ('14', '教室列表', 'classRoom:list');
INSERT INTO `permission` VALUES ('15', '合同数据', 'contract:list');
INSERT INTO `permission` VALUES ('16', '合同新增', 'contract:save');
INSERT INTO `permission` VALUES ('17', '合同删除', 'contract:delete');
INSERT INTO `permission` VALUES ('18', '合同更新', 'contract:update');
INSERT INTO `permission` VALUES ('19', '合同销售者自审', 'contract:revisions1');
INSERT INTO `permission` VALUES ('20', '合同经理审核', 'contract:revisions2');
INSERT INTO `permission` VALUES ('21', '合同财务部审核', 'contract:revisions3');
INSERT INTO `permission` VALUES ('22', '部门数据', 'department:list');
INSERT INTO `permission` VALUES ('23', '部门新增', 'department:save');
INSERT INTO `permission` VALUES ('24', '部门更新', 'department:update');
INSERT INTO `permission` VALUES ('25', '部门离职', 'department:quit');
INSERT INTO `permission` VALUES ('26', '部门列表', 'department:list');
INSERT INTO `permission` VALUES ('27', '学院列表', 'institute:list');
INSERT INTO `permission` VALUES ('28', '学院新增', 'institute:save');
INSERT INTO `permission` VALUES ('29', '学院更新', 'institute:update');
INSERT INTO `permission` VALUES ('30', '合同数据', 'orderBill:list');
INSERT INTO `permission` VALUES ('31', '合同新增', 'orderBill:save');
INSERT INTO `permission` VALUES ('32', '合同删除', 'orderBill:delete');
INSERT INTO `permission` VALUES ('33', '合同更新', 'orderBill:update');
INSERT INTO `permission` VALUES ('34', '合同销售者自审', 'orderBill:revisions1');
INSERT INTO `permission` VALUES ('35', '合同经理审核', 'orderBill:revisions2');
INSERT INTO `permission` VALUES ('36', '合同财务部审核', 'orderBill:revisions3');
INSERT INTO `permission` VALUES ('37', '权限加载', 'permission:load');
INSERT INTO `permission` VALUES ('38', '权限列表', 'permission:list');
INSERT INTO `permission` VALUES ('39', '资源池数据', 'potentialCustomer:list');
INSERT INTO `permission` VALUES ('40', '资源池新增', 'potentialCustomer:save');
INSERT INTO `permission` VALUES ('41', '资源池删除', 'potentialCustomer:delete');
INSERT INTO `permission` VALUES ('42', '资源池更新', 'potentialCustomer:update');
INSERT INTO `permission` VALUES ('43', '资源池更新--转移到资源池', 'potentialCustomer:addStudent');
INSERT INTO `permission` VALUES ('44', '角色列表', 'role:list');
INSERT INTO `permission` VALUES ('45', '角色保存', 'role:save');
INSERT INTO `permission` VALUES ('46', '角色删除', 'role:delete');
INSERT INTO `permission` VALUES ('47', '角色更新', 'role:update');
INSERT INTO `permission` VALUES ('48', '班级列表', 'schoolClass:list');
INSERT INTO `permission` VALUES ('49', '班级新增', 'schoolClass:save');
INSERT INTO `permission` VALUES ('50', '班级更新', 'schoolClass:update');
INSERT INTO `permission` VALUES ('51', '课程数据', 'syllabus:list');
INSERT INTO `permission` VALUES ('52', '课程新增', 'syllabus:save');
INSERT INTO `permission` VALUES ('53', '课程更新', 'syllabus:update');
INSERT INTO `permission` VALUES ('54', '课程删除', 'syllabus:quit');
INSERT INTO `permission` VALUES ('55', '字典数据', 'systemDictionary:list');
INSERT INTO `permission` VALUES ('56', '字典新增', 'systemDictionary:save');
INSERT INTO `permission` VALUES ('57', '字典删除', 'systemDictionary:delete');
INSERT INTO `permission` VALUES ('58', '字典更新', 'systemDictionary:update');
INSERT INTO `permission` VALUES ('59', '字典新增', 'systemDictionaryItem:save');
INSERT INTO `permission` VALUES ('60', '字典删除', 'systemDictionaryItem:delete');
INSERT INTO `permission` VALUES ('61', '字典更新', 'systemDictionaryItem:update');
INSERT INTO `permission` VALUES ('62', '字典明细加载', 'systemDictionaryItem:queryBy');
INSERT INTO `permission` VALUES ('63', '菜单保存', 'menu:save');
INSERT INTO `permission` VALUES ('64', '菜单删除', 'menu:delete');
INSERT INTO `permission` VALUES ('65', '菜单更新', 'menu:update');
INSERT INTO `permission` VALUES ('66', '移交历史数据', 'history:list');

-- ----------------------------
-- Table structure for `potentialcustomer`
-- ----------------------------
DROP TABLE IF EXISTS `potentialcustomer`;
CREATE TABLE `potentialcustomer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `state` tinyint(4) DEFAULT NULL,
  `student_id` bigint(20) DEFAULT NULL,
  `inChargeUser_id` varchar(255) DEFAULT NULL,
  `inputUser_id` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` tinyint(4) DEFAULT NULL,
  `gender` tinyint(4) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
  `wechat` varchar(255) DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  `salaryLevel` varchar(255) DEFAULT NULL,
  `customerSource` varchar(255) DEFAULT NULL,
  `inputTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of potentialcustomer
-- ----------------------------
INSERT INTO `potentialcustomer` VALUES ('1', '0', '1', '2', '5', '科奇', '33', '1', '1551313', '8698@gmail.com', '23434', '45656', '教授', '8000', '学校', '2017-12-09 20:34:58');
INSERT INTO `potentialcustomer` VALUES ('2', '4', '2', '2', '5', '柯南', '13', '1', '13514334', '345@qq.com', '545465', '6667', '学生', '0', '网站', '2017-11-19 20:35:02');
INSERT INTO `potentialcustomer` VALUES ('3', '4', '3', '3', '4', '小心', '7', '2', '58', '/', '/', null, '无业', '0', '/', null);
INSERT INTO `potentialcustomer` VALUES ('6', '0', '48', '3', '4', '信息', '6', '2', '87', '/', '/', null, '4564', '0', '/', null);
INSERT INTO `potentialcustomer` VALUES ('7', '0', '47', '3', '4', '小新', '6', '2', '8', null, '/', null, '6654', '0', '/', null);
INSERT INTO `potentialcustomer` VALUES ('8', '4', '49', '3', '4', '大大', '6', '2', '87', '/', '/', null, '656', '0', '/', null);
INSERT INTO `potentialcustomer` VALUES ('9', '4', '10', '3', '4', '谷歌', '6', '2', '889', '/', '/', null, null, '0', null, null);
INSERT INTO `potentialcustomer` VALUES ('24', '4', '55', null, null, '柯南', '0', '0', '324243', null, '32121', null, null, null, null, '2017-11-14 18:47:30');
INSERT INTO `potentialcustomer` VALUES ('25', '4', '55', null, null, '柯南', '0', '0', '324243', null, '32121', null, null, null, null, '2018-02-08 14:29:47');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sn` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('2', 'HR', '人事专员');
INSERT INTO `role` VALUES ('3', 'MARKETMAN', '市场专员');
INSERT INTO `role` VALUES ('4', 'SALEMAN', '销售专员');
INSERT INTO `role` VALUES ('5', 'TEST', '测试');

-- ----------------------------
-- Table structure for `role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu` (
  `role_id` bigint(20) DEFAULT NULL,
  `menu_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES ('2', '3');
INSERT INTO `role_menu` VALUES ('2', '29');
INSERT INTO `role_menu` VALUES ('2', '30');
INSERT INTO `role_menu` VALUES ('2', '31');
INSERT INTO `role_menu` VALUES ('2', '32');
INSERT INTO `role_menu` VALUES ('2', '36');
INSERT INTO `role_menu` VALUES ('2', '37');
INSERT INTO `role_menu` VALUES ('3', '2');
INSERT INTO `role_menu` VALUES ('3', '7');
INSERT INTO `role_menu` VALUES ('3', '26');
INSERT INTO `role_menu` VALUES ('3', '27');
INSERT INTO `role_menu` VALUES ('3', '28');
INSERT INTO `role_menu` VALUES ('4', '4');
INSERT INTO `role_menu` VALUES ('4', '33');
INSERT INTO `role_menu` VALUES ('4', '34');
INSERT INTO `role_menu` VALUES ('4', '35');

-- ----------------------------
-- Table structure for `role_permission`
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `role_id` bigint(20) DEFAULT NULL,
  `permission_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES ('2', '5');
INSERT INTO `role_permission` VALUES ('2', '7');
INSERT INTO `role_permission` VALUES ('2', '6');
INSERT INTO `role_permission` VALUES ('2', '9');
INSERT INTO `role_permission` VALUES ('2', '8');
INSERT INTO `role_permission` VALUES ('3', '7');
INSERT INTO `role_permission` VALUES ('3', '5');
INSERT INTO `role_permission` VALUES ('4', '7');
INSERT INTO `role_permission` VALUES ('4', '5');
INSERT INTO `role_permission` VALUES ('4', '8');
INSERT INTO `role_permission` VALUES ('5', '6');
INSERT INTO `role_permission` VALUES ('5', '7');
INSERT INTO `role_permission` VALUES ('5', '9');
INSERT INTO `role_permission` VALUES ('5', '8');

-- ----------------------------
-- Table structure for `salary`
-- ----------------------------
DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sn` varchar(255) DEFAULT NULL,
  `year` varchar(255) DEFAULT NULL,
  `month` varchar(255) DEFAULT NULL,
  `salaryAmount` decimal(10,0) DEFAULT NULL,
  `employeeName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salary
-- ----------------------------
INSERT INTO `salary` VALUES ('1', '001', '2017', '1月', '3000', '段誉');
INSERT INTO `salary` VALUES ('2', '1', '2017', '11月', '3000', '张三');
INSERT INTO `salary` VALUES ('3', '1', '2017', '11月', '3000', '张三');
INSERT INTO `salary` VALUES ('4', '1', '2017', '11月', '3000', '张三');
INSERT INTO `salary` VALUES ('5', '1', '1', '1', '1', '1');
INSERT INTO `salary` VALUES ('6', '2', '2', '2', '2', '2');
INSERT INTO `salary` VALUES ('7', '1', '1', '1', '1', '1');
INSERT INTO `salary` VALUES ('8', '1', '2017', '12', '20000', '1');
INSERT INTO `salary` VALUES ('9', '1', '2017', '13', '20000', '1');

-- ----------------------------
-- Table structure for `school`
-- ----------------------------
DROP TABLE IF EXISTS `school`;
CREATE TABLE `school` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `shortNameOne` varchar(255) DEFAULT NULL,
  `shortNameTwo` varchar(255) DEFAULT NULL,
  `belongDepartment_id` bigint(20) DEFAULT NULL,
  `saleman_id` bigint(20) DEFAULT NULL,
  `followSaleman_id` bigint(20) DEFAULT NULL,
  `trainNumber` int(20) DEFAULT NULL,
  `linkman_id` bigint(20) DEFAULT NULL,
  `schoolType` varchar(255) DEFAULT NULL,
  `diploma` varchar(255) DEFAULT NULL,
  `area` varchar(255) DEFAULT NULL,
  `schoolProperty` varchar(255) DEFAULT NULL,
  `buildTime` datetime DEFAULT NULL,
  `starLevel` varchar(255) DEFAULT NULL,
  `controlDepartment` varchar(255) DEFAULT NULL,
  `schoolSystem` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `postalCode` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `fax` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `homepage` varchar(255) DEFAULT NULL,
  `headmaster` varchar(255) DEFAULT NULL,
  `employeeNumber` int(11) DEFAULT NULL,
  `teacherNumber` int(11) DEFAULT NULL,
  `studentNumber` int(11) DEFAULT NULL,
  `itStudentNumber` int(11) DEFAULT NULL,
  `joinSchool` varchar(255) DEFAULT NULL,
  `signNumber` int(11) DEFAULT NULL,
  `hotPointLevel` varchar(255) DEFAULT NULL,
  `hotPointIntro` varchar(255) DEFAULT NULL,
  `schoolIntro` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of school
-- ----------------------------
INSERT INTO `school` VALUES ('1', '清华大学', '1', '1', '1', '1', '1', null, '1', '1', '1', '1', '1', '2017-11-10 00:00:00', '2**', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '是', '1', '低', '1', '1');
INSERT INTO `school` VALUES ('2', '北京大学', '121212', '1', '1', '1', '1', null, null, '1', '1', '1', '1', '2017-11-13 00:00:00', '2**', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '否', '1', '低', '1', '1');
INSERT INTO `school` VALUES ('8', '点点滴滴', '对对对', '对对对', '2', '2', '2', null, null, '24', '13', '25', '27', '2017-11-06 00:00:00', '3***', '东孚大道', '31', '地方', '454454', '4343', '34343', '34343', '34343', '广泛的负担', '333', '3333', '333', '333', '否', '22', '高', '对方答复的', '对方答复的的');
INSERT INTO `school` VALUES ('9', '中山大学', '噩噩噩噩噩', '地方得到的', '1', '5', '5', null, null, '本科', '学历2', '地域1', '公办', '1900-01-10 00:00:00', '5*****', '教务处', '学制1', '奋斗奋斗对方的', '4444434', '23224434', '34534434343', '43434343rerer', '3434rdfddf', 'ddddd', '333', '333', '333', '33', '否', '444', '热点1', 'erererere', 'fdfdfdfdf');

-- ----------------------------
-- Table structure for `schoolclass`
-- ----------------------------
DROP TABLE IF EXISTS `schoolclass`;
CREATE TABLE `schoolclass` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `teacher_id` bigint(20) DEFAULT NULL,
  `institute_id` bigint(20) DEFAULT NULL,
  `syllabus_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of schoolclass
-- ----------------------------
INSERT INTO `schoolclass` VALUES ('1', '数据库班级1', '1', '1', '4');
INSERT INTO `schoolclass` VALUES ('2', '数据库班级2', '1', '1', '7');
INSERT INTO `schoolclass` VALUES ('3', '数据库班级3', '3', '1', '6');
INSERT INTO `schoolclass` VALUES ('4', '数据库班级4', '2', '2', '8');
INSERT INTO `schoolclass` VALUES ('5', '数据库班级5', '6', '2', null);

-- ----------------------------
-- Table structure for `schoollinkman`
-- ----------------------------
DROP TABLE IF EXISTS `schoollinkman`;
CREATE TABLE `schoollinkman` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `school_id` bigint(20) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `primaryLinkman` tinyint(4) DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  `faculty` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `intro` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of schoollinkman
-- ----------------------------
INSERT INTO `schoollinkman` VALUES ('1', '张三', '2', '1', '1', '1', null, '1', '1', '1', '1', null);
INSERT INTO `schoollinkman` VALUES ('2', '联系人2', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `schoollinkman` VALUES ('3', '点点滴滴', '9', '2222', '454', '222', null, 'rrr', 'rrr', '男', '对对对', null);
INSERT INTO `schoollinkman` VALUES ('4', '对对对', '8', '4343', null, '34343', null, null, null, null, '地方', null);

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ishere` tinyint(4) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `followStu_id` bigint(20) DEFAULT NULL,
  `school_id` bigint(20) DEFAULT NULL,
  `state` tinyint(11) DEFAULT NULL,
  `idPicture` varchar(255) DEFAULT NULL,
  `auditIntro` varchar(255) DEFAULT NULL,
  `grade` varchar(255) DEFAULT NULL,
  `studyPicture` varchar(255) DEFAULT NULL,
  `experience` varchar(255) DEFAULT NULL,
  `queryType` varchar(255) DEFAULT NULL,
  `queryTime` int(10) DEFAULT NULL,
  `fileAddress` varchar(255) DEFAULT NULL,
  `talkingContent` varchar(255) DEFAULT NULL,
  `followIntro` varchar(255) DEFAULT NULL,
  `followAim` varchar(255) DEFAULT NULL,
  `schoolLinkman_id` bigint(20) DEFAULT NULL,
  `wantWork` varchar(255) DEFAULT NULL,
  `imagePath` varchar(255) DEFAULT NULL,
  `emergencyContact` varchar(255) DEFAULT NULL,
  `emergencyPhone` int(255) DEFAULT NULL,
  `idNumber` int(255) DEFAULT NULL,
  `saleman_id` bigint(255) DEFAULT NULL,
  `visitNumber` bigint(20) DEFAULT NULL,
  `communication` varchar(255) DEFAULT NULL,
  `followTime` date DEFAULT NULL,
  `lastVisiTtime` date DEFAULT NULL,
  `meetTime` date DEFAULT NULL,
  `nextMeetTime` date DEFAULT NULL,
  `nowState` varchar(255) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `finishPay` tinyint(10) DEFAULT NULL,
  `prevCallPayTime` date DEFAULT NULL,
  `callPayNumber` int(10) DEFAULT NULL,
  `nextCallPayTime` date DEFAULT NULL,
  `endPayTime` date DEFAULT NULL,
  `planPay` varchar(255) DEFAULT NULL,
  `discount` varchar(255) DEFAULT NULL,
  `discountMoney` varchar(255) DEFAULT NULL,
  `schoolCustomer` tinyint(4) DEFAULT NULL,
  `tranSaleman` tinyint(4) DEFAULT NULL,
  `schoolName` varchar(255) DEFAULT NULL,
  `wantingLevel` varchar(255) DEFAULT NULL,
  `wantingArea` varchar(255) DEFAULT NULL,
  `schoolClass_id` bigint(255) DEFAULT NULL,
  `intro` varchar(255) DEFAULT NULL,
  `followType` tinyint(11) DEFAULT NULL,
  `buildFileTime` date DEFAULT NULL,
  `author_id` bigint(20) DEFAULT NULL,
  `inputTime` date DEFAULT NULL,
  `comeFrom` varchar(255) DEFAULT NULL,
  `weChat` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `otherDiscount` varchar(255) DEFAULT NULL,
  `discountInstructions` varchar(255) DEFAULT NULL,
  `otherPay` varchar(255) DEFAULT NULL,
  `trainPay` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `homeAddress` varchar(255) DEFAULT NULL,
  `homeBookAddress` varchar(255) DEFAULT NULL,
  `englishLevel` varchar(255) DEFAULT NULL,
  `otherLevel` varchar(255) DEFAULT NULL,
  `diploma` varchar(255) DEFAULT NULL,
  `speciality` varchar(255) DEFAULT NULL,
  `area` varchar(255) DEFAULT NULL,
  `yearOfWork` varchar(255) DEFAULT NULL,
  `introduceStudent_id` bigint(20) DEFAULT NULL,
  `introducedBy_id` bigint(20) DEFAULT NULL,
  `customerType` varchar(255) DEFAULT NULL,
  `otherSaleman_id` bigint(20) DEFAULT NULL,
  `bringComputer` varchar(255) DEFAULT NULL,
  `inSchoolTime` date DEFAULT NULL,
  `schoolClassName` varchar(255) DEFAULT NULL,
  `payType` tinyint(255) DEFAULT NULL,
  `wantingSubject` varchar(255) DEFAULT NULL,
  `attentionQuestion` varchar(255) DEFAULT NULL,
  `formerClass` varchar(255) DEFAULT NULL,
  `gotoClass` varchar(255) DEFAULT NULL,
  `salesFlowWater` varchar(255) DEFAULT NULL,
  `totalStudyMoneyAmount` double(50,0) DEFAULT NULL,
  `proxyPaidStudyMoneyAmount` double(50,0) DEFAULT NULL,
  `paidStudyMoney` double(50,0) DEFAULT NULL,
  `payStudyMoneyState` varchar(255) DEFAULT NULL,
  `payStudyMoneyWay` varchar(255) DEFAULT NULL,
  `notify` varchar(255) DEFAULT NULL,
  `otherMoney` double(255,0) DEFAULT NULL,
  `upDownClassTime` date DEFAULT NULL,
  `listenCourseDayNum` bigint(20) DEFAULT NULL,
  `looseClass` varchar(255) DEFAULT NULL,
  `looseStage` varchar(255) DEFAULT NULL,
  `looseCause` varchar(255) DEFAULT NULL,
  `recordman_id` bigint(20) DEFAULT NULL,
  `payBackMoneyOrNot` varchar(255) DEFAULT NULL,
  `currentClass_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '0', '小黑', null, '1', '41', null, null, null, null, '', null, null, null, '交流内容', '摘要', '跟进目的2', '1', null, '/upload/a4c33cb6-3cb1-4747-bc8a-5b1c48cd0a10.jpg', '', null, null, '1', '1', null, null, '2017-10-31', '2017-10-31', '2017-10-31', '状态1', '120', '1', '120', null, null, '0', null, null, '', '', '', null, null, '1', '1', '1', '1', '1', '1', '2017-11-10', '1', '2017-11-08', '1', '1', '1', '1', '', '', '', '', '1', '', '', '', '', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2017-11-14', '前面1', '0', '1', '1', '1', '1', '1', '10000', '9500', '500', '未缴清', '支付宝', '已通知学员', '1', '2017-11-14', '1', '1', '1', '1', '1', '1', '3');
INSERT INTO `student` VALUES ('2', '0', '奥巴马', null, '2', '43', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '0', null, null, '2017-11-10', '2017-11-05', '2017-11-09', '状态1', '1000000000', '992@qq.com', '15900000000', '0', '2017-11-11', '0', '2017-11-11', '2017-11-11', '10000', '', '10001', null, null, '在', '意向程度2', '校区2', '2', '222', '0', '2017-11-10', '1', '2017-11-03', '来源2', '992', '100', '性别2', '10004', '10005', '10003', '10002', '啊', '家庭住址', '', '', '', '学历2', '高分子', '地域1', '工作年限1', '1', '1', '客户类型2', '1', '笔记本电脑2', '2017-11-03', '前面2', '1', '22', '111', null, null, '10007', '10006', '0', '10006', '已缴清', '以死相逼', '已通知学员', null, null, null, null, null, null, null, null, '2');
INSERT INTO `student` VALUES ('3', '0', '里根', null, null, '40', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '0', null, null, '2017-11-10', null, null, '', '623289', '', '139387', null, null, '0', null, null, '', '', '', null, null, '', '', '', '2', '', '0', null, null, '2017-11-22', '', '', null, '性别1', '', '', '', '', '', '', '', '', '', '', '', '', '', null, null, '', null, '', '2017-11-14', '', '1', '', '', null, null, '', '20000', '10000', '10000', '未缴清', '', '已通知学员', null, null, '900', '3', '777', '8888', null, '已退款', '1');
INSERT INTO `student` VALUES ('4', '0', '哥伦布', null, '1', '41', '/upload/6782c1ed-80d3-40cd-b829-5500360e9f4e.jpg', null, null, '/upload/47a71aa2-ef96-45b5-9e8d-8d7a7d1cfe1b.jpg', '', null, null, null, null, null, null, null, null, '/upload/cd44e8b5-87e0-470d-a7a8-fe2f4addbb53.jpg', '', null, null, '1', '0', null, null, '2017-11-11', '2017-11-03', '2017-11-07', '状态1', '992', '992', '992', null, null, '0', null, null, '', '', '', null, null, '学校或培训机构', '意向程度2', '校区2', '2', '222', '0', '2017-11-08', '1', '2017-10-31', '来源2', '992', '11', '性别2', '', '', '', '', '啊', '', '', '', '', '学历2', '专业', '地域1', '工作年限1', '1', '1', '客户类型2', '1', '笔记本电脑2', '2017-11-13', '前面2', '0', '22', '111', '1', null, '666', '20000', '19334', '666', '未缴清', '支付宝', '已通知学员', null, '2017-11-10', null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('5', '0', '特朗普', null, '1', '41', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '0', null, null, '2017-11-11', '2017-11-03', '2017-11-07', '状态1', '992', '992', '992', '1', '2017-12-04', '0', '2017-11-11', '2017-11-11', '11111', '优惠方式2', '11111', null, null, '在', '意向程度2', '校区2', '2', '222', '0', '2017-11-08', '1', '2017-10-31', '来源2', '992', '11', '性别2', '11111', '11111', '11111', '11111', '啊', '11111', '11111', 'CET-6', '11111', '学历2', '啊', '地域1', '工作年限1', '1', '1', '客户类型2', '1', '笔记本电脑2', '2017-11-01', '前面2', '1', '22', '111', '2', null, '11111', '11111', '0', '11111', '已缴清', '一次、性付款', '已通知学员', null, '2017-11-14', null, null, null, null, null, null, '3');
INSERT INTO `student` VALUES ('6', '0', '华盛顿', null, '1', '40', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '0', null, null, '2017-11-11', '2017-11-04', '2017-11-08', '状态1', '992', '992', '992', null, null, '0', null, null, '', '', '', null, null, '在', '意向程度2', '校区2', '2', '222', '0', '2017-11-09', '1', '2017-11-03', '来源2', '992', '11', '性别2', '', '', '', '', '啊', '', '', '', '', '学历2', '啊', '地域1', '工作年限1', '1', '1', '客户类型2', '1', '笔记本电脑2', '2017-10-26', '前面2', '1', '22', '111', '1', null, '', '11111', '0', '11111', '已缴清', '', null, null, '2017-11-13', null, '2', null, null, null, null, '2');
INSERT INTO `student` VALUES ('7', '0', '新测试', null, null, '42', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2', '0', null, null, '2017-11-11', null, null, '', '888', '', '1890', null, null, '0', null, null, '', '', '', null, null, '北京大学', '', '', null, '', '0', null, '1', '2017-11-16', '', '', null, '性别1', '', '', '', '11111', '', '', '', '', '', '', '', '', '', null, null, '', null, '', '2017-11-24', '', null, '', '', '3', null, '8989', '11111', '0', '11111', '已缴清', '', null, '90', '2017-11-14', null, null, null, null, null, null, '1');
INSERT INTO `student` VALUES ('8', '0', '李小龙', null, '8', '38', null, null, null, null, null, null, null, null, null, null, null, null, null, '/upload/8981979c-52ed-4372-addc-0a089587f8f8.jpg', null, null, null, '1', '0', null, null, '2017-11-11', null, null, '', '', '', '', null, null, '0', null, null, '', '', '', null, null, '北京大学', '', '', null, '', '0', null, '1', '2017-11-20', '', '', null, '性别1', '', '', '', '', '', '', '', '', '', '', '', '', '', null, null, '', null, '', null, '', null, '', '', null, null, '', null, null, null, '未缴清', '', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `student` VALUES ('9', '0', '所有数据对象', null, '1', '100', '4b081f4a396c.jpg', 'youliang', '差', null, null, '默认方式', '120', null, '交流内容', '摘要', '跟进目的1', '1', null, null, null, null, null, '1', '0', '交流方式1', '2017-11-01', '2015-09-11', '2015-09-11', '2015-09-11', '状态1', '666666666666', '120', '110', null, null, null, null, null, null, null, null, '0', '0', '学校', '意向程度2', '校区1', '3', '备注', '0', '2016-10-31', '1', '2017-10-31', '来源1', 'BBWX', '21', '性别1', null, null, null, null, '联系地址', null, null, null, null, '学历1', '专业', '地域1', '工作年限1', '17', '1', '客户类型2', '5', '笔记本地电脑1', '2015-11-10', '大学班级', '0', '21', '关注问题', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `student` VALUES ('10', '0', 'all数据对象test', null, '8', '40', '', 'youliang', '优', '', '', '默认方式', '120', '', '交流内容', '摘要', '跟进目的1', '1', null, '', '', null, null, '1', '0', null, null, '2015-09-11', '2015-09-10', '2015-09-10', '状态2', '6666666666665', '120', '110', '1', '2017-11-14', '0', '2017-11-14', '2017-11-14', '123', '', '123', '0', '0', '学校', '意向程度2', '校区1', '1', '备注', '0', '2016-10-30', '1', '2017-10-30', '来源1', 'BBWX234', '21', '性别2', '123', '123', '123', '123', '联系地址', '', '', '', '', '学历1', '专业', '地域1', '工作年限1', '10', '1', '客户类型1', '5', '笔记本地电脑1', '2015-11-09', '大学班级', '1', '21', '关注问题', '1', '', '123', '10000', '100', '10000', '已缴清', '', '已通知学员', '1', '2017-11-14', '1', '2', '1', '1', '1', '1', '2');
INSERT INTO `student` VALUES ('11', '0', '张杰', null, null, '43', '/upload/eb7b7c00-c42b-413c-b20e-4b081f4a396c.jpg', null, null, '/upload/aed0e637-219b-4ea1-af14-af4a41ec3002.jpg', '', null, null, null, null, null, null, null, null, '/upload/b470b13c-808d-43f9-9da4-674325361ef2.jpg', '', null, null, '1', '0', null, null, '2017-11-12', null, null, '', '123456', '', '13598957388', null, null, '0', null, null, '', '', '', null, null, '', '', '', null, '', '0', '2017-11-12', '1', '2017-11-15', '', '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', '', null, null, '', null, '', '2017-11-14', '', null, '', '', '3', null, '', '9000', '4000', '5000', '未缴清', '微信', '已通知学员', null, '2017-11-13', null, null, null, null, null, null, '1');
INSERT INTO `student` VALUES ('12', '0', '没有名字', null, '1', '100', null, '', '差', null, '', '默认方式', null, null, '', '', '', null, null, '/upload/f22b7c5a-219b-4b70-8b71-d5f46f00b717.jpg', '', null, null, '1', '0', '', null, '2017-11-10', '2017-11-10', '2017-11-10', '状态2', '110', '', '110', null, null, '0', null, null, '', '', '', '0', null, '', '意向程度1', '', '1', '', '0', '2017-11-12', '1', '2017-11-29', '', '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', '', null, null, '', null, '', null, '', null, '', '', null, null, '', null, null, null, '未缴清', '', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `student` VALUES ('44', '0', '阿紫', null, '8', '39', null, 'you', '优', null, '', '默认方式', '6666', null, 'jiaoliu', 'zhaiyao', '跟进目的2', '2', null, '/upload/f52f91d6-04e5-4a18-84be-6b675f78b264.jpg', '', null, null, '1', '1', '交流方式2', '2017-11-14', '2016-10-31', '2016-10-31', '2016-10-31', '状态1', '777777777', '', '120', null, null, '0', null, null, '', '', '', '0', null, '清华大学', '意向程度1', '校区1', '1', '备注', '0', null, null, '2017-11-14', '', '', null, '', '', '', '', '', '', '', '', '', '', '', '', '', '', null, null, '客户类型2', null, '', null, '', null, '', '', null, null, '', null, null, null, '未缴清', '', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `student` VALUES ('45', '0', '小明', null, '9', '37', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '0', null, null, '2017-11-11', '2017-11-03', '2017-11-07', '状态1', '992', null, '992', null, null, null, null, null, null, null, null, null, null, '清华大学', '意向程度2', '校区2', '2', '222', '0', null, null, '2017-11-14', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '客户类型1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `student` VALUES ('46', '0', '小红', null, '1', '39', null, '666', '优', null, null, null, '5', null, '55', '55', '跟进目的2', '2', null, null, null, null, null, '3', '1', '交流方式2', '2017-11-08', null, '2017-11-08', '2017-11-08', '状态2', '55', null, '120', null, null, null, null, null, null, null, null, '1', null, '北京大学', '意向程度2', '校区2', '2', '222', '0', null, null, '2017-11-14', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '客户类型2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `student` VALUES ('48', '0', '小黄', null, '1', '38', null, null, null, null, '', null, null, null, null, null, null, null, null, null, '', null, null, '1', '1', null, null, '2017-11-11', '2017-11-11', '2017-11-11', '状态1', '992', '', '992', null, null, '0', null, null, '', '', '', null, null, '学校或培训机构', '意向程度2', '校区2', '2', '222', '0', null, null, '2017-11-24', '', null, null, '', '', '', '', '', '', '', '', '', '', '', '', null, '', null, null, '客户类型2', null, '', '2017-10-26', null, null, null, null, null, null, '', '1000', '500', '500', '未缴清', '支付宝', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `student` VALUES ('49', '0', '小鸡', null, '9', '37', null, null, null, null, null, null, null, null, null, null, null, '1', null, '1', '1', '1', '1', '2', '1', null, '2017-11-08', '2017-11-17', '2017-11-30', '2017-12-01', '1', '1', '', '', null, null, null, null, null, null, null, null, null, null, '', '意向程度2', '', null, '', null, null, null, '2017-11-24', '', '', null, '', null, null, null, null, '', null, null, null, null, '', '', '', '', null, null, '客户类型1', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1');
INSERT INTO `student` VALUES ('50', '0', '小鸟', null, '9', '37', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '0', null, null, '2017-11-14', '2017-11-24', '2017-11-15', '', '8989', 'qqq', '90909', null, null, null, null, null, null, null, null, null, null, '', '意向程度2', '校区1', null, '', '0', '2017-11-15', '1', '2017-11-15', '来源1', '9090', '56', '性别1', null, null, null, null, '', null, null, null, null, '学历1', '', '', '', null, null, '客户类型1', null, '', '2017-11-15', '', null, '', '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `student` VALUES ('52', '4', 'fdfdd', null, '8', '39', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '5', '0', null, null, '2017-11-14', '2017-09-03', '2017-09-05', '状态1', '424324', '334343434', '42222', null, null, null, null, null, null, null, null, null, null, '奋斗奋斗', '意向程度2', '校区1', '2', '东方东方东方东方对方的', '0', '2017-09-01', '5', '2017-09-02', '来源1', '323223', '24', '性别1', null, null, null, null, 'fdfdfdfd', null, null, null, null, '学历1', '地方的地方', '地域1', '工作年限1', '1', '5', '客户类型1', '3', '笔记本电脑2', '2015-09-09', '2222', '0', '22', '大大大大大大的', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `student` VALUES ('53', '4', '最终测试学员1', null, '8', '37', '/upload/ac79492d-f75f-4c3c-acc6-b6c1fff78d13.jpg', '优等生', '优', '/upload/d20f3914-38ca-4560-868b-5dd5c85bc99a.jpg', '工作经历', '默认方式', '120', null, '测试: 交流内容', '测试摘要', '跟进目的1', '1', 'IBM/外企', '/upload/69f1c00c-ddcd-451e-a38c-e1ac3eb300a5.jpg', '', null, null, '1', '0', null, null, '2016-11-01', '2016-11-01', '2016-11-01', '状态2', '12345678910', '666@qq.com', '12345678910', null, null, '0', null, null, '', '', '', '0', null, '深圳大学', '意向程度2', '校区1', '3', '备注', '0', '2016-11-01', '8', '2016-11-01', '来源2', 'weixin1', '10', '性别1', '', '', '', '', '广州', '', '', '', '', '学历1', '高分子', '地域1', '工作年限1', '5', '8', '客户类型1', '3', '笔记本地电脑1', '2017-11-14', '1', '1', '21', '关注问题', null, null, '', null, null, null, '未缴清', '', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `student` VALUES ('54', '0', '啊啊', null, '8', '37', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '0', null, null, '2017-11-14', null, null, '', '', '', '', null, null, null, null, null, null, null, null, null, null, '', '意向程度2', '', null, '', '0', '2017-11-14', '1', null, '来源1', '', null, '', null, null, null, null, '', null, null, null, null, '', '', '', '', null, null, '客户类型1', null, '', null, '', null, '', '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `student` VALUES ('55', '0', '柯南', '1', '8', '37', '/upload/ac79492d-f75f-4c3c-acc6-b6c1fff78d13.jpg', '喵', '优', '/upload/ac79492d-f75f-4c3c-acc6-b6c1fff78d13.jpg', '无', null, '120', null, null, null, null, null, null, null, null, '1', '1', '1', '1', null, null, null, null, null, '1', '32121', '2323@sw', '324243', null, null, null, null, null, null, null, null, '2', null, null, '意向程度1', null, null, null, null, null, null, null, null, null, null, '男', null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '1', null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', null, '1');
INSERT INTO `student` VALUES ('57', null, '测试转移 ', '2', '1', '37', null, '测试', '优', null, null, null, '22', null, null, null, null, null, null, null, null, '1', '1', '1', '1', null, null, null, null, null, '1', 'qqqq', '343@', '3432434333333', null, null, null, null, null, null, null, null, '2', null, null, null, null, null, null, null, null, null, null, null, null, null, '女', null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '1', null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', null, '1');

-- ----------------------------
-- Table structure for `syllabus`
-- ----------------------------
DROP TABLE IF EXISTS `syllabus`;
CREATE TABLE `syllabus` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `inputtime` datetime DEFAULT NULL,
  `week` varchar(255) DEFAULT NULL,
  `schoolclass_id` bigint(20) DEFAULT NULL,
  `course` varchar(255) DEFAULT NULL,
  `teacher_id` bigint(20) DEFAULT NULL,
  `lecturer_id` bigint(20) DEFAULT NULL,
  `classRoom_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of syllabus
-- ----------------------------
INSERT INTO `syllabus` VALUES ('4', '2010-10-09 00:00:00', '2', '2', '2', '1', '5', '1');
INSERT INTO `syllabus` VALUES ('6', '2017-11-09 00:00:00', '五', '3', 'shiro', '1', '5', '1');
INSERT INTO `syllabus` VALUES ('7', '2017-11-11 00:00:00', '六', '1', 'spring', '1', '6', '1');
INSERT INTO `syllabus` VALUES ('8', '2017-10-03 00:00:00', '六', '2', 'ssx', '1', '6', '1');
INSERT INTO `syllabus` VALUES ('9', '2017-11-13 00:00:00', '一', '3', '项目', '2', '3', '1');
INSERT INTO `syllabus` VALUES ('10', '2017-11-13 00:00:00', '一', '4', '项目二', '5', '5', '1');
INSERT INTO `syllabus` VALUES ('11', '2017-11-13 00:00:00', '一', '5', 'ss', '6', '6', '1');

-- ----------------------------
-- Table structure for `systemdictionary`
-- ----------------------------
DROP TABLE IF EXISTS `systemdictionary`;
CREATE TABLE `systemdictionary` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sn` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `intro` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of systemdictionary
-- ----------------------------
INSERT INTO `systemdictionary` VALUES ('1', 'nowState', '当前状态', '十号风球');
INSERT INTO `systemdictionary` VALUES ('2', 'wantingLevel', '意向程度', '宁采臣');
INSERT INTO `systemdictionary` VALUES ('3', 'wantingArea', '意向校区', '奔向未来的日子');
INSERT INTO `systemdictionary` VALUES ('4', 'wantingClass', '意向班级', '追');
INSERT INTO `systemdictionary` VALUES ('5', 'comeFrom', '来源', '风继续吹');
INSERT INTO `systemdictionary` VALUES ('6', 'sex', '性别', '八号风球');
INSERT INTO `systemdictionary` VALUES ('7', 'diploma', '学历', '葡萄成熟时');
INSERT INTO `systemdictionary` VALUES ('8', 'yearOfWord', '工作年限', '十年饮冰不凉热血');
INSERT INTO `systemdictionary` VALUES ('9', 'customerType', '客户类型', '日本东京');
INSERT INTO `systemdictionary` VALUES ('10', 'bringComputer', '是否携带笔记本电脑', '逝水流年');
INSERT INTO `systemdictionary` VALUES ('11', 'wantingSubject', '意向学科', '春夏秋冬');
INSERT INTO `systemdictionary` VALUES ('12', 'schoolType', '学校类型', '高山流水');
INSERT INTO `systemdictionary` VALUES ('13', 'area', '地域', '蒙古高原');
INSERT INTO `systemdictionary` VALUES ('14', 'schoolProperty', '办学性质', '无偿');
INSERT INTO `systemdictionary` VALUES ('15', 'starLevel', '星级水平', '客户星级');
INSERT INTO `systemdictionary` VALUES ('16', 'schoolSystem', '学制', '终身制');
INSERT INTO `systemdictionary` VALUES ('17', 'joinSchool', '是否合作院校', '连锁高校');
INSERT INTO `systemdictionary` VALUES ('18', 'hotPointLevel', '热点等级', '信号满格');
INSERT INTO `systemdictionary` VALUES ('21', 'state', '状态', '学员是何种类型的学员');
INSERT INTO `systemdictionary` VALUES ('28', 'year', '年份', '最近5年');
INSERT INTO `systemdictionary` VALUES ('29', 'month', '月份', '12个月');
INSERT INTO `systemdictionary` VALUES ('30', 'englishLevel', '外语水平', '十级你懂吗');
INSERT INTO `systemdictionary` VALUES ('31', 'payType', '付款方式', '转正页面：付款方式');
INSERT INTO `systemdictionary` VALUES ('32', 'discount', '优惠方式', '转正页面：优惠方式');
INSERT INTO `systemdictionary` VALUES ('33', 'communication', '交流方式', '跟踪页面');
INSERT INTO `systemdictionary` VALUES ('34', 'followAim', '跟进目的', '跟踪页面');
INSERT INTO `systemdictionary` VALUES ('35', 'grade', '评分', 'studentFollow审计功能');

-- ----------------------------
-- Table structure for `systemdictionaryitem`
-- ----------------------------
DROP TABLE IF EXISTS `systemdictionaryitem`;
CREATE TABLE `systemdictionaryitem` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `intro` varchar(255) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of systemdictionaryitem
-- ----------------------------
INSERT INTO `systemdictionaryitem` VALUES ('1', '状态1', 'one', '1');
INSERT INTO `systemdictionaryitem` VALUES ('2', '状态2', 'two', '1');
INSERT INTO `systemdictionaryitem` VALUES ('3', '意向程度1', 'one', '2');
INSERT INTO `systemdictionaryitem` VALUES ('4', '意向程度2', 'two', '2');
INSERT INTO `systemdictionaryitem` VALUES ('5', '校区1', 'one', '3');
INSERT INTO `systemdictionaryitem` VALUES ('6', '校区2', 'two', '3');
INSERT INTO `systemdictionaryitem` VALUES ('7', '班级1', 'one', '4');
INSERT INTO `systemdictionaryitem` VALUES ('8', '班级2', 'two', '4');
INSERT INTO `systemdictionaryitem` VALUES ('9', '来源1', 'one', '5');
INSERT INTO `systemdictionaryitem` VALUES ('10', '来源2', 'two', '5');
INSERT INTO `systemdictionaryitem` VALUES ('11', '性别1', 'one', '6');
INSERT INTO `systemdictionaryitem` VALUES ('12', '性别2', 'two', '6');
INSERT INTO `systemdictionaryitem` VALUES ('13', '学历1', 'one', '7');
INSERT INTO `systemdictionaryitem` VALUES ('14', '学历2', 'two', '7');
INSERT INTO `systemdictionaryitem` VALUES ('15', '工作年限1', 'one', '8');
INSERT INTO `systemdictionaryitem` VALUES ('16', '工作年限2', 'two', '8');
INSERT INTO `systemdictionaryitem` VALUES ('17', '客户类型1', 'one', '9');
INSERT INTO `systemdictionaryitem` VALUES ('18', '客户类型2', 'two', '9');
INSERT INTO `systemdictionaryitem` VALUES ('19', '笔记本地电脑1', 'one', '10');
INSERT INTO `systemdictionaryitem` VALUES ('20', '笔记本电脑2', 'two', '10');
INSERT INTO `systemdictionaryitem` VALUES ('21', '学科1', 'one', '11');
INSERT INTO `systemdictionaryitem` VALUES ('22', '学科2', 'two', '11');
INSERT INTO `systemdictionaryitem` VALUES ('23', '专科', 'one', '12');
INSERT INTO `systemdictionaryitem` VALUES ('24', '本科', 'two', '12');
INSERT INTO `systemdictionaryitem` VALUES ('25', '华东', '', '13');
INSERT INTO `systemdictionaryitem` VALUES ('26', '东北', '测试', '13');
INSERT INTO `systemdictionaryitem` VALUES ('27', '公办', 'one', '14');
INSERT INTO `systemdictionaryitem` VALUES ('28', '民办', 'two', '14');
INSERT INTO `systemdictionaryitem` VALUES ('29', '1*', 'one', '15');
INSERT INTO `systemdictionaryitem` VALUES ('30', '2**', 'two', '15');
INSERT INTO `systemdictionaryitem` VALUES ('31', '学制1', 'one', '16');
INSERT INTO `systemdictionaryitem` VALUES ('32', '学制2', 'two', '16');
INSERT INTO `systemdictionaryitem` VALUES ('33', '院校1', 'one', '17');
INSERT INTO `systemdictionaryitem` VALUES ('34', '院校2', 'two', '17');
INSERT INTO `systemdictionaryitem` VALUES ('35', '热点1', 'one', '18');
INSERT INTO `systemdictionaryitem` VALUES ('36', '热点2', 'two', '18');
INSERT INTO `systemdictionaryitem` VALUES ('37', '潜在学员', null, '21');
INSERT INTO `systemdictionaryitem` VALUES ('38', '正式学员', null, '21');
INSERT INTO `systemdictionaryitem` VALUES ('39', '客户池中的学员', null, '21');
INSERT INTO `systemdictionaryitem` VALUES ('40', '流失学员', null, '21');
INSERT INTO `systemdictionaryitem` VALUES ('41', '生班学员', null, '21');
INSERT INTO `systemdictionaryitem` VALUES ('42', '留级学员', null, '21');
INSERT INTO `systemdictionaryitem` VALUES ('43', '休学学员', '', '21');
INSERT INTO `systemdictionaryitem` VALUES ('44', '2017', '', '28');
INSERT INTO `systemdictionaryitem` VALUES ('45', '2016', '', '28');
INSERT INTO `systemdictionaryitem` VALUES ('46', '1月', '', '29');
INSERT INTO `systemdictionaryitem` VALUES ('47', '2月', '', '29');
INSERT INTO `systemdictionaryitem` VALUES ('48', '3月', '', '29');
INSERT INTO `systemdictionaryitem` VALUES ('49', '4月', '', '29');
INSERT INTO `systemdictionaryitem` VALUES ('50', '5月', '', '29');
INSERT INTO `systemdictionaryitem` VALUES ('51', '6月', '', '29');
INSERT INTO `systemdictionaryitem` VALUES ('52', '7月', '', '29');
INSERT INTO `systemdictionaryitem` VALUES ('53', '8月', '', '29');
INSERT INTO `systemdictionaryitem` VALUES ('54', '9月', '', '29');
INSERT INTO `systemdictionaryitem` VALUES ('55', '10月', '', '29');
INSERT INTO `systemdictionaryitem` VALUES ('56', '11月', '', '29');
INSERT INTO `systemdictionaryitem` VALUES ('57', '12月', '', '29');
INSERT INTO `systemdictionaryitem` VALUES ('58', 'CET-4', null, '30');
INSERT INTO `systemdictionaryitem` VALUES ('59', 'CET-6', null, '30');
INSERT INTO `systemdictionaryitem` VALUES ('60', 'level-10', null, '30');
INSERT INTO `systemdictionaryitem` VALUES ('61', '一次性付款', null, '31');
INSERT INTO `systemdictionaryitem` VALUES ('62', '一次、性付款', null, '31');
INSERT INTO `systemdictionaryitem` VALUES ('63', '贷款', null, '31');
INSERT INTO `systemdictionaryitem` VALUES ('64', '优惠方式1', null, '32');
INSERT INTO `systemdictionaryitem` VALUES ('65', '优惠方式2', null, '32');
INSERT INTO `systemdictionaryitem` VALUES ('66', '微信', null, '31');
INSERT INTO `systemdictionaryitem` VALUES ('67', '支付宝', null, '31');
INSERT INTO `systemdictionaryitem` VALUES ('68', '以死相逼', null, '31');
INSERT INTO `systemdictionaryitem` VALUES ('69', '优惠方式3', null, '32');
INSERT INTO `systemdictionaryitem` VALUES ('70', 'p30', null, '30');
INSERT INTO `systemdictionaryitem` VALUES ('71', '交流方式1', null, '33');
INSERT INTO `systemdictionaryitem` VALUES ('72', '交流方式2', null, '33');
INSERT INTO `systemdictionaryitem` VALUES ('73', '跟进目的1', null, '34');
INSERT INTO `systemdictionaryitem` VALUES ('74', '跟进目的2', null, '34');
INSERT INTO `systemdictionaryitem` VALUES ('75', '优', null, '35');
INSERT INTO `systemdictionaryitem` VALUES ('76', '良', null, '35');
INSERT INTO `systemdictionaryitem` VALUES ('77', '中', null, '35');
INSERT INTO `systemdictionaryitem` VALUES ('78', '差', null, '35');
INSERT INTO `systemdictionaryitem` VALUES ('79', '独立高校', 'three', '14');
INSERT INTO `systemdictionaryitem` VALUES ('80', '3***', '3', '15');
INSERT INTO `systemdictionaryitem` VALUES ('81', '4****', '4', '15');
INSERT INTO `systemdictionaryitem` VALUES ('82', '5*****', '5', '15');
INSERT INTO `systemdictionaryitem` VALUES ('83', '6******', '6', '15');
INSERT INTO `systemdictionaryitem` VALUES ('84', '7*******', '7', '15');
INSERT INTO `systemdictionaryitem` VALUES ('85', '8********', '8', '15');
INSERT INTO `systemdictionaryitem` VALUES ('86', '9*********', '9', '15');
INSERT INTO `systemdictionaryitem` VALUES ('87', '其他', null, '14');
INSERT INTO `systemdictionaryitem` VALUES ('88', '2018', '2018年份字典', '28');
INSERT INTO `systemdictionaryitem` VALUES ('89', '华中', '华中地区测试', '13');
INSERT INTO `systemdictionaryitem` VALUES ('90', '西南', '', null);
INSERT INTO `systemdictionaryitem` VALUES ('91', '西南', '', '13');

-- ----------------------------
-- Table structure for `systemmenu`
-- ----------------------------
DROP TABLE IF EXISTS `systemmenu`;
CREATE TABLE `systemmenu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `text` varchar(20) DEFAULT NULL,
  `iconCls` varchar(20) DEFAULT NULL,
  `url` varchar(500) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_parent` (`parent_id`)
) ENGINE=InnoDB AUTO_INCREMENT=190 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of systemmenu
-- ----------------------------
INSERT INTO `systemmenu` VALUES ('1', '系统管理', 'icon-system', '', null);
INSERT INTO `systemmenu` VALUES ('4', '客户服务(售前)模块', 'icon-myadd', null, null);
INSERT INTO `systemmenu` VALUES ('8', '学员管理(售后)', 'icon-emp', '', null);
INSERT INTO `systemmenu` VALUES ('29', '员工管理', 'icon-pplan', '/employee', '1');
INSERT INTO `systemmenu` VALUES ('30', '部门管理', 'icon-dept', '/department', '1');
INSERT INTO `systemmenu` VALUES ('31', '角色管理', 'icon-role', '/role', '1');
INSERT INTO `systemmenu` VALUES ('32', '数据字典', 'icon-zidian', '/systemDictionary', '1');
INSERT INTO `systemmenu` VALUES ('36', '权限管理', 'icon-yingxiao', '/permission', '1');
INSERT INTO `systemmenu` VALUES ('37', '菜单管理', 'icon-tool', '/systemMenu', '1');
INSERT INTO `systemmenu` VALUES ('38', '教育管理', 'icon-reload', null, null);
INSERT INTO `systemmenu` VALUES ('39', '教室情况', 'icon-search', '/classRoom', '38');
INSERT INTO `systemmenu` VALUES ('40', '学院', 'icon-print', '/institute', '38');
INSERT INTO `systemmenu` VALUES ('41', '工资模块', 'icon-gongzi', '', null);
INSERT INTO `systemmenu` VALUES ('56', '薪水账单', 'icon-log', '/salary', '41');
INSERT INTO `systemmenu` VALUES ('58', '合同管理', 'icon-redo', '/contract', '60');
INSERT INTO `systemmenu` VALUES ('59', '订单管理', 'icon-pan', '/orderBill', '60');
INSERT INTO `systemmenu` VALUES ('60', '合同与订单', 'icon-shouhou', null, null);
INSERT INTO `systemmenu` VALUES ('81', '正式学员管理', 'icon-cchart', '/afterSale', '8');
INSERT INTO `systemmenu` VALUES ('82', '学员升班留级', 'icon-dinghe', '/studentClass', '8');
INSERT INTO `systemmenu` VALUES ('83', '学员流失', 'icon-mchart', '/looseStudent', '8');
INSERT INTO `systemmenu` VALUES ('84', '支出管理', 'icon-mini-add', '/payMoneyBill', '8');
INSERT INTO `systemmenu` VALUES ('85', '收款管理', 'icon-qchart', '/getMoneyBill', '8');
INSERT INTO `systemmenu` VALUES ('112', '考勤管理', 'icon-help', '', null);
INSERT INTO `systemmenu` VALUES ('113', '考勤', 'icon-ziyuanchi', '/attendance', '112');
INSERT INTO `systemmenu` VALUES ('114', '考勤导出', 'icon-yingxiao', '/attendanceout', '112');
INSERT INTO `systemmenu` VALUES ('115', '报表管理', 'icon-gongzi', '', null);
INSERT INTO `systemmenu` VALUES ('116', '潜在客户新增报表', 'icon-dept', '/latetnmber', '115');
INSERT INTO `systemmenu` VALUES ('117', '班级管理', 'icon-role', '/schoolClass', '38');
INSERT INTO `systemmenu` VALUES ('119', '招生分析报表', 'icon-log', '/studentGroupDept', '115');
INSERT INTO `systemmenu` VALUES ('120', '销售金额统计报表', 'icon-hetong', '/amountGroup', '115');
INSERT INTO `systemmenu` VALUES ('121', '课程表', 'icon-dingdan', '/syllabus', '38');
INSERT INTO `systemmenu` VALUES ('132', '今日计划', 'icon-chart', '', null);
INSERT INTO `systemmenu` VALUES ('170', '潜在学员', 'icon-qianzai', '/student', '4');
INSERT INTO `systemmenu` VALUES ('171', '考试管理', 'icon-emp', '/exam', '4');
INSERT INTO `systemmenu` VALUES ('173', '移交历史', 'icon-mini-refresh', '/transferHistory', '4');
INSERT INTO `systemmenu` VALUES ('174', '大客户管理（学校）', 'icon-tip', '/school', '4');
INSERT INTO `systemmenu` VALUES ('175', '学校联系人管理', 'icon-back', '/schoolLinkman', '4');
INSERT INTO `systemmenu` VALUES ('176', '潜在客户池', 'icon-redo', '/potentialCustomer', '4');
INSERT INTO `systemmenu` VALUES ('187', '当日任务', 'icon-task', '/todaytask', '132');
INSERT INTO `systemmenu` VALUES ('188', '学员跟踪管理', 'icon-save', '/student/studentFollow', '4');
INSERT INTO `systemmenu` VALUES ('189', '测试0011', '', 'www.bing.com', '1');

-- ----------------------------
-- Table structure for `todaytask`
-- ----------------------------
DROP TABLE IF EXISTS `todaytask`;
CREATE TABLE `todaytask` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `teskTime` datetime DEFAULT NULL,
  `taskdescribe` varchar(255) DEFAULT NULL,
  `handledescribe` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `handleUser_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_rhcekxxfpr3sip05si7ghtben` (`handleUser_id`),
  CONSTRAINT `FK_rhcekxxfpr3sip05si7ghtben` FOREIGN KEY (`handleUser_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of todaytask
-- ----------------------------
INSERT INTO `todaytask` VALUES ('12', '2017-11-12 16:12:57', '1111', '2222', '1', '6');
INSERT INTO `todaytask` VALUES ('13', '2017-11-13 15:44:20', '一把绿皮大狙', '80发子弹', '0', '1');
INSERT INTO `todaytask` VALUES ('14', '2017-11-13 15:44:54', '八号风球', '三级头三级甲', '0', '3');
INSERT INTO `todaytask` VALUES ('17', '2017-11-13 15:48:52', '去武当', '学太极', '0', '6');
INSERT INTO `todaytask` VALUES ('18', '2017-11-13 15:46:43', '四号风球', '开着吉普', '0', '5');
INSERT INTO `todaytask` VALUES ('19', '2017-11-13 11:50:21', '222', '333', '1', '3');
INSERT INTO `todaytask` VALUES ('21', '2017-11-13 15:43:35', '十号风球', '一把98k', '2', '2');
INSERT INTO `todaytask` VALUES ('22', '2017-11-13 15:47:58', '去少林', '偷学打狗棒法', '0', '2');
INSERT INTO `todaytask` VALUES ('23', '2017-11-13 15:49:22', '去淘宝', '买买衣服', '0', '3');
INSERT INTO `todaytask` VALUES ('24', '2017-11-13 15:49:40', '去京东', '买个外星人', '0', '2');
INSERT INTO `todaytask` VALUES ('25', '2017-11-13 15:50:01', '去小码哥', '学java', '0', '1');
INSERT INTO `todaytask` VALUES ('26', '2017-11-13 15:50:49', '去上班', '打代码', '0', '5');
INSERT INTO `todaytask` VALUES ('27', '2017-11-13 15:51:39', '去玩游戏', '得五杀', '0', '3');
INSERT INTO `todaytask` VALUES ('28', '2017-11-13 18:44:01', '渣渣你来啦 ：）', '渣渣你来啦 ：）', '0', '1');
INSERT INTO `todaytask` VALUES ('29', '2017-11-13 15:52:58', '伏地狂魔', '干掉一个', '2', '1');
INSERT INTO `todaytask` VALUES ('30', '2017-11-13 15:53:34', '去韩国', '感受中韩文化', '2', '1');
INSERT INTO `todaytask` VALUES ('31', '2017-11-13 15:54:51', '完成新手任务', '恭喜您', '0', '5');
INSERT INTO `todaytask` VALUES ('32', '2017-11-13 18:36:52', '学好java', '加油', '0', '2');
INSERT INTO `todaytask` VALUES ('33', '2017-11-13 18:37:12', '学号ui', '加油啊', '0', '6');
INSERT INTO `todaytask` VALUES ('34', '2017-11-13 18:37:25', '学好h5', '加油啊', '0', '5');
INSERT INTO `todaytask` VALUES ('35', '2017-11-13 18:39:10', '去旅游', '看风景', '0', '3');
INSERT INTO `todaytask` VALUES ('36', '2017-11-13 18:40:19', '看电影', '先买票', '0', '5');
INSERT INTO `todaytask` VALUES ('37', '2017-11-13 18:40:51', '开车兜风', '先加油', '0', '5');
INSERT INTO `todaytask` VALUES ('38', '2017-11-13 18:41:50', '写第二个项目', '不能休息', '0', '5');

-- ----------------------------
-- Table structure for `train`
-- ----------------------------
DROP TABLE IF EXISTS `train`;
CREATE TABLE `train` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `trainTime` datetime DEFAULT NULL,
  `trainContent` varchar(255) DEFAULT NULL,
  `trainLocation` varchar(255) DEFAULT NULL,
  `trainEffect` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `school_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of train
-- ----------------------------
INSERT INTO `train` VALUES ('1', '2017-11-14 08:41:57', '上山打老虎', '大大大大大', '很好', '点点滴滴', '1');
INSERT INTO `train` VALUES ('2', '2017-11-15 00:00:00', 'dffdfd', 'dfdf代付电费dfdfd', '迭代', '对对对', '1');
INSERT INTO `train` VALUES ('3', '2017-11-16 00:00:00', '复古风风光111', '11', '11', '11', '1');
INSERT INTO `train` VALUES ('7', '2017-11-22 00:00:00', '', '', '', '', null);
INSERT INTO `train` VALUES ('8', '2017-11-22 00:00:00', '444', '444辅导费', '对方答复的', '对方答复的', null);
INSERT INTO `train` VALUES ('9', '2017-11-20 00:00:00', 'dfdfdfd', 'dfdfddf', '对方答复的', '对方答复的', null);
INSERT INTO `train` VALUES ('10', null, '从vcvc', '', '', '', null);
INSERT INTO `train` VALUES ('11', null, '东方东方东方的', '', '', '', null);
INSERT INTO `train` VALUES ('12', null, 'drdfd', 'dfdsfdfd', 'pppp', '', '1');
INSERT INTO `train` VALUES ('13', null, 'sdsdssd', 'sdsdsd', 'sdsds', '', '1');
INSERT INTO `train` VALUES ('14', null, 'dfdfdgrgr果然果然人', 'dfdfd', '', '', '1');
INSERT INTO `train` VALUES ('15', null, 'dfdfd', '', '', '', '1');
INSERT INTO `train` VALUES ('16', null, 'dfdfd', 'dfdfdffgf', '', '', '1');
INSERT INTO `train` VALUES ('17', null, 'sdsdssd', 'sdsdsdfff方法', 'sdsds', '', '1');
INSERT INTO `train` VALUES ('18', null, 'ddsdddd', '代付电费', '', '', '1');
INSERT INTO `train` VALUES ('19', '2017-11-02 00:00:00', 'ddsdddd', '代付电费', '', '', '1');
INSERT INTO `train` VALUES ('20', '2017-11-16 00:00:00', '萨达萨达', '', '', '', '9');
INSERT INTO `train` VALUES ('21', null, '', '', '', '', '1');

-- ----------------------------
-- Table structure for `transferhistory`
-- ----------------------------
DROP TABLE IF EXISTS `transferhistory`;
CREATE TABLE `transferhistory` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_id` varchar(255) DEFAULT NULL,
  `transferTime` datetime DEFAULT NULL,
  `transferReason` varchar(255) DEFAULT NULL,
  `originalSaleman_id` bigint(20) DEFAULT NULL,
  `aimSaleman_id` bigint(20) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of transferhistory
-- ----------------------------
INSERT INTO `transferhistory` VALUES ('1', '1', '2017-11-15 16:25:28', '没有原因', '2', '3', '2132134324', '1331323');
INSERT INTO `transferhistory` VALUES ('2', '3', '2017-11-03 16:26:02', '测试而已', '4', '5', '57454', '13433');
INSERT INTO `transferhistory` VALUES ('3', '10', '2017-11-14 12:08:16', '记录移交历史', null, null, '/', '889');
INSERT INTO `transferhistory` VALUES ('7', '2', '2017-11-14 13:54:43', '记录移交历史', null, '5', '545465', '13514334');
INSERT INTO `transferhistory` VALUES ('8', '3', '2017-11-14 13:54:56', '记录移交历史', null, null, '/', '58');
INSERT INTO `transferhistory` VALUES ('10', '52', '2017-11-14 14:02:54', '移交标记', null, null, '424324', '42222');
INSERT INTO `transferhistory` VALUES ('16', '54', '2017-11-14 14:14:12', '移交标记', null, null, '', '');
INSERT INTO `transferhistory` VALUES ('17', '53', '2017-11-14 14:27:05', '移交标记', null, null, '12345678910', '12345678910');
INSERT INTO `transferhistory` VALUES ('18', '49', '2017-11-14 14:37:38', '记录移交历史', null, null, '/', '87');
INSERT INTO `transferhistory` VALUES ('20', '55', '2017-11-14 14:41:45', '移交标记', null, null, null, null);
INSERT INTO `transferhistory` VALUES ('21', '3', '2017-11-14 14:45:10', '记录移交历史', null, null, null, null);
INSERT INTO `transferhistory` VALUES ('22', '56', '2017-11-14 14:48:09', '移交标记', null, null, null, null);
INSERT INTO `transferhistory` VALUES ('23', '56', '2017-11-14 14:50:43', '记录移交历史', null, null, null, null);
INSERT INTO `transferhistory` VALUES ('24', '56', '2017-11-14 14:53:56', '记录移交历史', null, null, null, null);
INSERT INTO `transferhistory` VALUES ('25', '56', '2017-11-14 18:20:58', '移交标记', null, null, null, null);
INSERT INTO `transferhistory` VALUES ('26', '55', '2017-11-14 18:24:26', '移交标记', null, null, null, null);
INSERT INTO `transferhistory` VALUES ('27', '3', '2017-11-14 18:25:00', '记录移交历史', null, null, '32434', '68967');
INSERT INTO `transferhistory` VALUES ('28', '55', '2017-11-14 18:29:21', '移交标记', null, null, '32121', '324243');
INSERT INTO `transferhistory` VALUES ('29', '55', '2017-11-14 18:35:09', '移交标记', null, null, '32121', '324243');
INSERT INTO `transferhistory` VALUES ('30', '54', '2017-11-14 18:37:13', '移交标记', null, null, '', '');
INSERT INTO `transferhistory` VALUES ('31', '55', '2017-11-14 18:47:26', '移交标记', null, null, '32121', '324243');
INSERT INTO `transferhistory` VALUES ('32', '55', '2017-11-14 18:48:14', '记录移交历史', null, null, '32121', '324243');
INSERT INTO `transferhistory` VALUES ('33', '55', '2018-02-08 14:29:47', '移交标记', null, null, '32121', '324243');
INSERT INTO `transferhistory` VALUES ('34', '55', '2018-02-08 14:30:07', '记录移交历史', null, null, '32121', '324243');
