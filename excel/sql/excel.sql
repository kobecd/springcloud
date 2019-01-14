/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : 127.0.0.1:3306
 Source Schema         : excel

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 13/01/2019 23:17:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_mall
-- ----------------------------
DROP TABLE IF EXISTS `t_mall`;
CREATE TABLE `t_mall`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `task_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '任务名称',
  `mall_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '任务所属商场',
  `mall_area` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '门店地址，具体地址',
  `province_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '省',
  `city_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '市',
  `district_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '区',
  `town_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '镇',
  `road` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '街道',
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_mall
-- ----------------------------
INSERT INTO `t_mall` VALUES (1, '阿三地方是', '士大夫撒旦', '撒地方公司', '撒的高发时段', '撒地方公司', '岁的法国', '反对法国士兵', '地方根本', '的是不打算放过');
INSERT INTO `t_mall` VALUES (2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '岁的法国的');

-- ----------------------------
-- Table structure for t_mall_area
-- ----------------------------
DROP TABLE IF EXISTS `t_mall_area`;
CREATE TABLE `t_mall_area`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `area_code` bigint(20) NULL DEFAULT NULL COMMENT '地区代码',
  `short_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '手机区号',
  `area_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '省',
  `tag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '地址标签',
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_mall_question
-- ----------------------------
DROP TABLE IF EXISTS `t_mall_question`;
CREATE TABLE `t_mall_question`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `question` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '名称',
  `answer` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '答案',
  `reason` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '依据',
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `create_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_mall_task
-- ----------------------------
DROP TABLE IF EXISTS `t_mall_task`;
CREATE TABLE `t_mall_task`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '任务标题',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '代码(注意导入的数据是name+code，入库时候分离了)',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '任务名称',
  `lot_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '批次号',
  `step_id` bigint(20) NULL DEFAULT NULL COMMENT '分步模板ID',
  `series_id` bigint(20) NULL DEFAULT NULL COMMENT '系列任务模板ID',
  `worker_id` bigint(20) NULL DEFAULT NULL COMMENT '完成人ID',
  `task_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '任务类型',
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '任务详细描述',
  `task_picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '任务图片',
  `finish_picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '任务完成图片',
  `gps_check` int(1) NOT NULL DEFAULT 0 COMMENT '是否完成GPS校验',
  `longitude_begin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '开始经度 Longitude 简写Lng',
  `latitude_begin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '开始纬度 Latitude 简写Lat',
  `longitude_end` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '结束经度 Longitude 简写Lng',
  `latitude_end` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '结束纬度 Latitude 简写Lat',
  `salary` int(20) NULL DEFAULT NULL COMMENT '报酬',
  `salary_total` int(20) NULL DEFAULT NULL COMMENT '报酬解算金额',
  `salary_increase` int(20) NULL DEFAULT NULL COMMENT '调价幅度',
  `integral` int(20) NULL DEFAULT NULL COMMENT '积分',
  `effective_distance` int(11) NULL DEFAULT 0 COMMENT '有效距离',
  `outside_range_time` int(11) NULL DEFAULT 0 COMMENT '出签到范围次数',
  `re_sign_time` int(11) NULL DEFAULT 0 COMMENT '再次签到次数',
  `limit_time` int(11) NULL DEFAULT 0 COMMENT '限时（任务完成时限，单位：min）',
  `cost_time` int(11) NULL DEFAULT 0 COMMENT '耗时（做单时长，单位：min）',
  `review_time` int(11) NULL DEFAULT 0 COMMENT '审核实际（审单时间）单位：min',
  `admin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '管理员',
  `need_worker_numbewr` int(11) NULL DEFAULT 0 COMMENT '需要人数',
  `customer_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '客户编号',
  `can_priority` int(1) NOT NULL DEFAULT 0 COMMENT '是否金牌用户优先',
  `can_task_repeat_execution` int(1) NOT NULL DEFAULT 0 COMMENT '任务能否重复执行',
  `can_worker_repeat_execution` int(1) NOT NULL DEFAULT 0 COMMENT '执行人能否重复执行',
  `can_topping` int(1) NOT NULL DEFAULT 0 COMMENT '是否置顶',
  `can_propaganda` int(1) NOT NULL DEFAULT 0 COMMENT '是否为宣称任务',
  `can_repeat_receive` int(1) NOT NULL DEFAULT 0 COMMENT '是否允许多次接单',
  `can_display_in_hall` int(1) NOT NULL DEFAULT 0 COMMENT '是否在大厅显示',
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `state` int(11) NULL DEFAULT 0 COMMENT '状态',
  `online_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '任务上线时间',
  `offline_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '任务下线时间',
  `beigin_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '任务开始时间',
  `end_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '任务结束时间',
  `create_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间（任务浏览开始时间）',
  `update_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间（管理员更新时间）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_sys_file
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_file`;
CREATE TABLE `t_sys_file`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '显示名称',
  `suffix` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '后缀',
  `version` int(11) NULL DEFAULT NULL COMMENT '版本信息id',
  `code` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '版本号',
  `key` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件标识',
  `size` bigint(20) NULL DEFAULT NULL COMMENT '文件大小',
  `url` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文件存放url',
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `check_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '校验方式',
  `check_code` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '校验码',
  `state` int(1) NULL DEFAULT NULL COMMENT '逻辑删除用的标识',
  `create_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统文件记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_file
-- ----------------------------
INSERT INTO `t_sys_file` VALUES (1, '154738025739788ff7ac1d1654f33ac8c77e15ef20ecd1234.png', 'png', NULL, NULL, NULL, NULL, 'C:\\Users\\X\\Desktop\\upload\\154738025739788ff7ac1d1654f33ac8c77e15ef20ecd1234.png', 'C:\\Users\\X\\Desktop\\upload\\154738025739788ff7ac1d1654f33ac8c77e15ef20ecd1234.png', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_sys_file` VALUES (2, '154738045091284a921e8410c431fba3ea98234446b431234.png', 'png', NULL, NULL, NULL, NULL, 'C:\\Users\\X\\Desktop\\upload\\154738045091284a921e8410c431fba3ea98234446b431234.png', 'C:\\Users\\X\\Desktop\\upload\\154738045091284a921e8410c431fba3ea98234446b431234.png', NULL, NULL, NULL, '2019-01-13 19:54:15', '2019-01-13 19:54:15');
INSERT INTO `t_sys_file` VALUES (3, '1547380750700b7bf38b3e30a497baf981e475466f156_1234.png', 'png', NULL, NULL, NULL, NULL, 'C:\\Users\\X\\Desktop\\upload\\1547380750700b7bf38b3e30a497baf981e475466f156_1234.png', 'C:\\Users\\X\\Desktop\\upload\\1547380750700b7bf38b3e30a497baf981e475466f156_1234.png', NULL, NULL, NULL, '2019-01-13 19:59:10', '2019-01-13 19:59:10');
INSERT INTO `t_sys_file` VALUES (4, '1547380760212c0af7b038fdd4b808d3f47e151729ed5_原始文件.xlsx', 'xlsx', NULL, NULL, NULL, NULL, 'C:\\Users\\X\\Desktop\\upload\\1547380760212c0af7b038fdd4b808d3f47e151729ed5_原始文件.xlsx', 'C:\\Users\\X\\Desktop\\upload\\1547380760212c0af7b038fdd4b808d3f47e151729ed5_原始文件.xlsx', NULL, NULL, NULL, '2019-01-13 19:59:20', '2019-01-13 19:59:20');

SET FOREIGN_KEY_CHECKS = 1;


# 题目规则
CREATE TABLE `t_question_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `task_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '任务名称',
  `town_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '镇',
  `road` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '街道',
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '备注',
  `state` int(1) NULL DEFAULT NULL COMMENT '逻辑删除用的标识',
  `create_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

#列对应规则  用level分级， 用parent分组，有多组方案注意
CREATE TABLE `t_excel_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `parent_id`  bigint(20)  DEFAULT NULL COMMENT '父级id',
    `level` int(3) DEFAULT NULL COMMENT '级别',
  `x_axis` int(10) NULL DEFAULT NULL COMMENT 'x轴',
  `y_axis`int(10) NULL DEFAULT NULL  COMMENT 'y轴',
  `address` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'excel描述方式的坐标位置',

  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '名称',
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '备注',

  `cell_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '单元格类型：STRING/NUMERIC/BOOLEAN/FORMULA/BLANK',
  `create_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

