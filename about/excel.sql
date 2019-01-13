/*
Navicat MySQL Data Transfer

Source Server         : 10.0.0.32
Source Server Version : 50505
Source Host           : 10.0.0.32:3306
Source Database       : gree

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-10-30 15:21:33
*/





#1.总表中省份、城市、地区、门店名称和门店地址这五个信息，是直接从导购表和短促表中表头对应列中粘贴过来的，其中原表的任务所属商场就是总表的门店名称。
#2.五个新产品分别对应第五个问题到第十个问题的答案，不过，这五个问题在导购表中出现了三次，只需查找有答案的问题，再把数据导入总表中。
#3.导购是否在岗的汇总里，答案来自于导购表中第四题，第五题、第十四题、第二十三题，如果不好理解，建议把答案都导出来。
#4.其中根据导购在岗身穿工服判断后面的是否穿工服。导购是否主动营销的答案来自于导购表的第十三题，第二十四题，第三十二题，把这三题的答案合并就可以了。
#5.地堆/花车的两个问题来自于第11和第12题的答案，第21题和第22题的答案，第30题和第31题的答案，这三个来源答案合并。





#门店地址 问题  	答案   依据

CREATE TABLE `t_mall_area` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `area_code` bigint(20) NOT NULL COMMENT '地区代码',
  `area_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '省',
  `short_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机区号',
  `tag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '地址标签',
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;


# 任务表
# 数据入主表的时候同时 记录到
#从表
#1 地址表
#2 任务表

CREATE TABLE `t_mall_task` (

  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '任务标题',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '代码(注意导入的数据是name+code，入库时候分离了)',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '任务名称',
  `lot_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '批次号',
  `step_id` bigint(20) NOT NULL COMMENT '分步模板ID',
  `series_id` bigint(20) NOT NULL COMMENT '系列任务模板ID',
  `worker_id` bigint(20) NOT NULL COMMENT '完成人ID',

  `task_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '任务类型',
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '任务详细描述',

  `task_picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '任务图片',
  `finish_picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '任务完成图片',


  `gps_check` int(1) NOT NULL DEFAULT '0' COMMENT '是否完成GPS校验',

  `longitude_begin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '开始经度 Longitude 简写Lng',
  `latitude_begin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '开始纬度 Latitude 简写Lat',

  `longitude_end` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '结束经度 Longitude 简写Lng',
  `latitude_end` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '结束纬度 Latitude 简写Lat',

  `salary` int(20) NOT NULL COMMENT '报酬',
  `salary_total` int(20) NOT NULL COMMENT '报酬解算金额',
  `salary_increase` int(20) NOT NULL COMMENT '调价幅度',
  `integral` int(20) NOT NULL COMMENT '积分',

  `effective_distance` int(11) NOT NULL DEFAULT '0' COMMENT '有效距离',
  `outside_range_time` int(11) NOT NULL DEFAULT '0' COMMENT '出签到范围次数',
  `re_sign_time` int(11) NOT NULL DEFAULT '0' COMMENT '再次签到次数',

  `limit_time` int(11) NOT NULL DEFAULT '0' COMMENT '限时（任务完成时限，单位：min）',
  `cost_time` int(11) NOT NULL DEFAULT '0' COMMENT '耗时（做单时长，单位：min）',
  `review_time` int(11) NOT NULL DEFAULT '0' COMMENT '审核实际（审单时间）单位：min',


  `admin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '管理员',
  `need_worker_numbewr` int(11) NOT NULL DEFAULT '0' COMMENT '需要人数',
  `customer_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '客户编号',

  `can_priority` int(1) NOT NULL DEFAULT '0' COMMENT '是否金牌用户优先',
  `can_task_repeat_execution` int(1) NOT NULL DEFAULT '0' COMMENT '任务能否重复执行',
  `can_worker_repeat_execution` int(1) NOT NULL DEFAULT '0' COMMENT '执行人能否重复执行',
  `can_topping` int(1) NOT NULL DEFAULT '0' COMMENT '是否置顶',
  `can_propaganda` int(1) NOT NULL DEFAULT '0' COMMENT '是否为宣称任务',
  `can_repeat_receive` int(1) NOT NULL DEFAULT '0' COMMENT '是否允许多次接单',
  `can_display_in_hall` int(1) NOT NULL DEFAULT '0' COMMENT '是否在大厅显示',




  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '备注',

  `state` int(11) NOT NULL DEFAULT '0' COMMENT '状态',
  `online_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '任务上线时间',
  `offline_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '任务下线时间',

  `beigin_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '任务开始时间',
  `end_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '任务结束时间',

   `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间（任务浏览开始时间）',
  `update_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间（管理员更新时间）',

  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;





#
CREATE TABLE `t_mall_question` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `question` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '名称',
  `answer` varchar(255) DEFAULT NULL COMMENT '答案',
  `reason` varchar(255) DEFAULT NULL COMMENT '依据',
    `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '备注',
   `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;



#

CREATE TABLE `t_mall` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `task_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '任务名称',
  `mall_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '任务所属商场',
  `mall_area` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '门店地址，具体地址',
  `province_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '省',
  `city_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '市',
  `district_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '区',
  `town_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '镇',
  `road` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '街道',
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;
































