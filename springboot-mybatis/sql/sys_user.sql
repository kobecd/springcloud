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
INSERT INTO `sys_user` VALUES ('3', '鹰酱', '7a57a5a743894a0e', 'USA', '132345444', '2434444@163.com', '0', '2018-03-19 17:21:20', '2018-03-19 17:32:44');
INSERT INTO `sys_user` VALUES ('5', '毛熊', '7a57a5a743894a0e', '俄羅斯', '1355885555', '24123424@163.com', '0', '2018-03-20 09:38:48', null);
INSERT INTO `sys_user` VALUES ('7', '高丽', '7a57a5a743894a0e', '朝鲜', '1355885577', '24123477@163.com', '1', '2018-03-20 09:43:53', null);
INSERT INTO `sys_user` VALUES ('13', 'cat22', '7a57a5a743894a0e', '研究生', '17255577877', '5242452777', '0', '2018-03-22 10:14:13', '2018-04-04 09:50:41');
INSERT INTO `sys_user` VALUES ('14', 'zzz', '7a57a5a743894a0e', 'CS', '1356565656', '453245245@as.com', '0', '2018-03-22 21:13:04', '2018-04-04 09:52:31');
INSERT INTO `sys_user` VALUES ('15', '4444', '7a57a5a743894a0e', '44', '135788785', null, '0', '2018-03-22 21:19:47', null);
INSERT INTO `sys_user` VALUES ('20', 'ccc', '7a57a5a743894a0e', '霍建华', '13556546', '764564564@qq.com', '0', '2018-04-02 00:39:50', null);
INSERT INTO `sys_user` VALUES ('21', '0000', '196a4758191e42f7', '管理员', '17670000000', '33333435@163.com', '0', '2018-04-02 05:37:54', null);
INSERT INTO `sys_user` VALUES ('24', '11', '196a4758191e42f7', '管理员', '117154864', '113435@163.com', '0', '2018-04-02 06:11:17', null);
INSERT INTO `sys_user` VALUES ('25', 'admin1', '196a4758191e42f7', '管理员', '17671541111', '1113435@163.com', '0', '2018-04-02 06:22:57', null);
INSERT INTO `sys_user` VALUES ('26', 'admin2', '7a57a5a743894a0e', '管理员', '176715486411', '11111435@163.com', '0', '2018-04-02 06:24:36', null);
INSERT INTO `sys_user` VALUES ('27', '微风瑟夫', '7a57a5a743894a0e', '啊书法大赛的', '134234', '234234', '0', '2018-04-02 06:48:00', null);
INSERT INTO `sys_user` VALUES ('31', 'abcd', '7a57a5a743894a0e', '用户1', '18646846854', '425456@qq.com', '0', '2018-04-10 09:09:06', '2018-04-10 09:09:37');
INSERT INTO `sys_user` VALUES ('32', 'abc', '7a57a5a743894a0e', '权限小一点的', '1312545454', '2121@qq.com', '0', '2018-04-10 09:12:22', '2018-04-10 09:12:54');
INSERT INTO `sys_user` VALUES ('33', '11111', '279d34fa1dfd71aa', '额外', '135453', '54353', '1', '2018-04-13 16:15:33', '2018-04-13 16:15:33');
INSERT INTO `sys_user` VALUES ('34', 'besttone', 'd3db681fb9f8091c', '', '', '', '0', '2018-04-13 16:42:09', '2018-04-13 16:42:09');
