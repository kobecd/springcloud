/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : security

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-12-15 03:36:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `ROLE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(85) NOT NULL COMMENT '角色名称',
  `ROLE_TYPE` varchar(45) NOT NULL COMMENT '角色类型',
  `STATUS` int(11) NOT NULL DEFAULT '1',
  `CREATION_DATE` datetime NOT NULL COMMENT '创建时间',
  `CREATED_BY` int(11) NOT NULL COMMENT '创建人',
  `LAST_UPDATE_DATE` datetime NOT NULL COMMENT '最后更新时间',
  `LAST_UPDATED_BY` int(11) NOT NULL COMMENT '最后更新人',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理员', 'ADMIN', '1', '2016-10-11 00:00:00', '1', '2016-10-11 00:00:00', '1');
INSERT INTO `role` VALUES ('2', '普通用户', 'USER', '1', '2016-10-11 00:00:00', '1', '2016-10-11 00:00:00', '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(45) NOT NULL COMMENT '用户名',
  `PASSWORD` varchar(200) NOT NULL,
  `PHONE` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `STATUS` int(11) NOT NULL DEFAULT '1' COMMENT '用户状态',
  `CREATION_DATE` datetime NOT NULL COMMENT '创建时间',
  `CREATED_BY` int(11) NOT NULL COMMENT '创建人',
  `LAST_UPDATE_DATE` datetime NOT NULL COMMENT '最后修改时间',
  `LAST_UPDATED_BY` int(11) NOT NULL COMMENT '最后修改人',
  PRIMARY KEY (`USER_ID`),
  UNIQUE KEY `USER_NAME_UNIQUE` (`USER_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', '789', '789', '1', '2016-10-11 00:00:00', '1', '2016-10-11 00:00:00', '1');
INSERT INTO `user` VALUES ('2', 'ZHANGSAN', '123', '123', '123', '1', '2016-10-11 00:00:00', '1', '2016-10-11 00:00:00', '1');

-- ----------------------------
-- Table structure for `user_role`
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `USER_ROLE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) NOT NULL COMMENT '用户ID',
  `ROLE_ID` int(11) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`USER_ROLE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户角色表';

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1', '1');
INSERT INTO `user_role` VALUES ('2', '1', '2');
INSERT INTO `user_role` VALUES ('3', '2', '2');
