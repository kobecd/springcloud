/*
Navicat MySQL Data Transfer

Source Server         : aliyun
Source Server Version : 50616
Source Host           : rdsdhymc6hu2u0854dzny.mysql.rds.aliyuncs.com:3306
Source Database       : bianmin_114

Target Server Type    : MYSQL
Target Server Version : 50616
File Encoding         : 65001

Date: 2018-06-14 16:05:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `display_name` varchar(255) DEFAULT NULL COMMENT '账号姓名',
  `tel` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `email` varchar(128) DEFAULT NULL COMMENT '电子邮箱',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '账号状态(0：正常 1:暂停)',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='系统用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '7a57a5a743894a0e', '管理员', '18674192466', '2320158606@163.com', '0', '2018-05-08 16:45:27', '2018-06-01 10:03:26');
INSERT INTO `sys_user` VALUES ('2', '110000zx', '7a57a5a743894a0e', '坐席管理员', '18911111111', '23202226@163.com', '0', '2018-05-08 16:51:45', '2018-05-08 17:37:59');
INSERT INTO `sys_user` VALUES ('7', 'order', '296bcd59bba7cc67', 'order', '15555555555', '155555@163.com', '0', '2018-06-01 09:53:47', '2018-06-01 10:00:47');
INSERT INTO `sys_user` VALUES ('8', 'oa', 'a0b63336a7ebaa3c', '活动管理员', '15555555555', '1555555@163.com', '0', '2018-06-14 14:53:23', '2018-06-14 14:53:40');
