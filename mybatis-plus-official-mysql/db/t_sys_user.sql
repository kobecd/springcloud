/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : 127.0.0.1:3306
 Source Schema         : se

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 06/05/2019 22:42:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账号密码',
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `state` int(11) NOT NULL DEFAULT 0 COMMENT '账号状态状态，status, condition, mode, position, state of affairs, fettle',
  `create_date` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 48 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
INSERT INTO `t_sys_user` VALUES (1, 'admin', '1', 1, '2018-03-01 16:00:04', '2018-03-01 16:00:11');
INSERT INTO `t_sys_user` VALUES (2, 'test', '2', 1, '2018-03-01 16:01:00', '2018-03-07 16:01:05');
INSERT INTO `t_sys_user` VALUES (3, '毛熊', '3', 1, '2018-03-20 09:38:48', NULL);
INSERT INTO `t_sys_user` VALUES (4, '高丽', '4', 1, '2018-03-20 09:43:53', NULL);
INSERT INTO `t_sys_user` VALUES (5, '二毛', '5', 1, '2018-03-22 10:14:13', NULL);
INSERT INTO `t_sys_user` VALUES (6, '长鹿', '6', 1, '2018-03-22 21:13:04', NULL);
INSERT INTO `t_sys_user` VALUES (7, '狮子', '7', 1, '2018-03-22 21:19:47', NULL);
INSERT INTO `t_sys_user` VALUES (8, '老鼠', '7', 1, '2018-03-22 21:24:48', NULL);
INSERT INTO `t_sys_user` VALUES (9, '山鸡', '8', 1, '2018-03-22 21:25:55', NULL);
INSERT INTO `t_sys_user` VALUES (48, 'abc', 'abc', 2, '2019-05-06 22:42:46', '2019-05-06 22:42:46');

SET FOREIGN_KEY_CHECKS = 1;
