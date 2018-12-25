/*
Navicat MySQL Data Transfer

Source Server         : duobao
Source Server Version : 50634
Source Host           : 47.90.59.220:3306
Source Database       : antsoft

Target Server Type    : MYSQL
Target Server Version : 50634
File Encoding         : 65001

Date: 2017-03-02 16:12:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_transactional_test
-- ----------------------------
DROP TABLE IF EXISTS `t_transactional_test`;
CREATE TABLE `t_transactional_test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(3) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_transactional_test
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(64) COLLATE utf8_bin DEFAULT '',
  `password` varchar(128) COLLATE utf8_bin DEFAULT '',
  `account_type` tinyint(4) DEFAULT '0',
  `balance` decimal(11,2) DEFAULT '0.00',
  `nick_name` varchar(64) COLLATE utf8_bin DEFAULT '',
  `mobile_no` varchar(13) COLLATE utf8_bin DEFAULT '',
  `recommend_mobile_no` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `reg_time` datetime DEFAULT NULL,
  `last_modify_time` datetime DEFAULT NULL,
  `status` tinyint(4) DEFAULT '1',
  `client_id` varchar(128) COLLATE utf8_bin DEFAULT '',
  `avatar` varchar(256) COLLATE utf8_bin DEFAULT '',
  `account_desc` varchar(512) COLLATE utf8_bin DEFAULT '',
  `signature` varchar(256) COLLATE utf8_bin DEFAULT '',
  `sex` tinyint(4) DEFAULT '0',
  `vip` tinyint(4) DEFAULT '1',
  `last_login_time` datetime DEFAULT NULL,
  `last_login_lon` decimal(11,4) DEFAULT NULL COMMENT '经度',
  `last_login_lat` decimal(11,4) DEFAULT NULL COMMENT '纬度',
  `open_push` int(4) NOT NULL DEFAULT '1' COMMENT '1未开2开',
  `open_sound` int(4) NOT NULL DEFAULT '1' COMMENT '1没开2开',
  `openid` varchar(255) COLLATE utf8_bin DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=351 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
