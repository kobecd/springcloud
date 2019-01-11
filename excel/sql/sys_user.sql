/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50720
Source Host           : 127.0.01:3306
Source Database       : sys

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-12-27 23:39:30
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
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8 COMMENT='系统用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '7a57a5a743894a0e', '管理员', '1767211111', '11112235@163.com', '0', '2018-03-01 16:00:04', '2018-03-01 16:00:11');
INSERT INTO `sys_user` VALUES ('2', 'cat22', '7a57a5a743894a0e', '研究生', '17255577877', '5242452777', '0', '2018-03-22 10:14:13', '2018-04-04 09:50:41');
INSERT INTO `sys_user` VALUES ('3', '鹰酱', '7a57a5a743894a0e', 'USA', '132345444', '2434444@163.com', '0', '2018-03-19 17:21:20', '2018-03-19 17:32:44');
INSERT INTO `sys_user` VALUES ('4', '微风瑟夫', '7a57a5a743894a0e', '啊书法大赛的', '134234', '234234', '0', '2018-04-02 06:48:00', null);
INSERT INTO `sys_user` VALUES ('5', '毛熊', '7a57a5a743894a0e', '俄羅斯', '1355885555', '24123424@163.com', '0', '2018-03-20 09:38:48', null);
INSERT INTO `sys_user` VALUES ('6', '小鸡', '7a57a5a743894a0e', 'CS', '1356565656', '453245245@as.com', '0', '2018-03-22 21:13:04', '2018-04-04 09:52:31');
INSERT INTO `sys_user` VALUES ('7', '高丽', '7a57a5a743894a0e', '朝鲜', '1355885577', '24123477@163.com', '1', '2018-03-20 09:43:53', null);
INSERT INTO `sys_user` VALUES ('8', '兔子', '7a57a5a743894a0e', '44', '135788785', null, '0', '2018-03-22 21:19:47', null);
INSERT INTO `sys_user` VALUES ('9', 'ccc', '7a57a5a743894a0e', '霍建华', '13556546', '764564564@qq.com', '0', '2018-04-02 00:39:50', null);
