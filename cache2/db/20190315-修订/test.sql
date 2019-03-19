-- ----------------------------
-- Table structure for t_sys_user  MYSQL 8.0
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `nickname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户昵称',
  `avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `status` int(11) NOT NULL DEFAULT 0 COMMENT '账号状态状态，status, condition, mode, position, state of affairs, fettle',
  `create_date` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
INSERT INTO `t_sys_user` VALUES (1, 'admin', '1', 1, '2018-03-01 16:00:04', '2018-03-01 16:00:11');
INSERT INTO `t_sys_user` VALUES (2, 'test', '2', 1, '2018-03-01 16:01:00', '2018-03-07 16:01:05');
INSERT INTO `t_sys_user` VALUES (3, '二毛', '5', 1, '2018-03-22 10:14:13', NULL);
INSERT INTO `t_sys_user` VALUES (4, '毛熊', '3', 1, '2018-03-20 09:38:48', NULL);
INSERT INTO `t_sys_user` VALUES (5, '高丽', '4', 1, '2018-03-20 09:43:53', NULL);
INSERT INTO `t_sys_user` VALUES (6, '高鹿', '6', 1, '2018-03-22 21:13:04', NULL);
INSERT INTO `t_sys_user` VALUES (7, '狮子', '7', 1, '2018-03-22 21:19:47', NULL);
INSERT INTO `t_sys_user` VALUES (8, '老鼠', '7', 1, '2018-03-22 21:24:48', NULL);
INSERT INTO `t_sys_user` VALUES (9, '山鸡', '8', 1, '2018-03-22 21:25:55', NULL);
