-- ----------------------------
-- Table structure for `pull_log`
-- ----------------------------
DROP TABLE IF EXISTS `pull_log`;
CREATE TABLE `pull_log` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '日志主键',
  `success` tinyint(4) DEFAULT NULL COMMENT '状态码成功与否',
  `name` varchar(100) DEFAULT NULL COMMENT '操作名称',
  `source_address` varchar(100) DEFAULT NULL COMMENT '操作的资源地址',
  `operator` varchar(100) DEFAULT NULL COMMENT '操作者名称',
  `remark` varchar(225) DEFAULT NULL COMMENT '操作备注',
  `success_quantity` int(11) DEFAULT '0' COMMENT '成功数量  successQuantity=updateQuantity+saveQuantity',
  `update_quantity` int(11) DEFAULT '0' COMMENT '更新数量',
  `insert_quantity` int(11) DEFAULT NULL,
  `request_date` datetime DEFAULT NULL COMMENT '任务请求时刻',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `url` varchar(225) DEFAULT NULL COMMENT '操作者的HOST',
  PRIMARY KEY (`id`),
  KEY `id` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='产品表';
