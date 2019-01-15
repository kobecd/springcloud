use hla;
CREATE TABLE `authority` (
  `id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `parent_id` INT(11) NOT NULL COMMENT '上级ID',
  `name` VARCHAR(255) DEFAULT NULL COMMENT '权限名称',
  `value` VARCHAR(255) DEFAULT NULL COMMENT '权限值',
  PRIMARY KEY (`id`),
  KEY `unq_parid` (`parent_id`) USING BTREE
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='权限表';

CREATE TABLE `role_authority` (
  `id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `role_id` INT(11) NOT NULL COMMENT '角色ID',
  `authority_id` INT(11) NOT NULL COMMENT '角色权限ID',
  PRIMARY KEY (`id`)
) ENGINE=INNODB  DEFAULT CHARSET=utf8 COMMENT='角色权限表';


CREATE TABLE `role` (
  `id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(255) NOT NULL  COMMENT '角色名称',
  `status` TINYINT(4) UNSIGNED DEFAULT NULL  COMMENT '角色状态 0正常 1停用',
  `memo` VARCHAR(512) DEFAULT NULL  COMMENT '备注',
  `create_at` TIMESTAMP NULL DEFAULT NULL  COMMENT '创建时间',
  `update_at` TIMESTAMP NULL DEFAULT NULL COMMENT '修改时间',
  `create_by` INT(11) DEFAULT NULL COMMENT '创建人ID',
  `update_by` INT(11) DEFAULT NULL COMMENT '修改人ID',
  `reason` VARCHAR(512) DEFAULT NULL COMMENT '停用理由',
  `disable_at` TIMESTAMP NULL DEFAULT NULL COMMENT '停用时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB  DEFAULT CHARSET=utf8 COMMENT='角色表';


DROP TABLE IF EXISTS ` user_role`;

CREATE TABLE `user_role` (
  `id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `user_id` INT(11) NOT NULL COMMENT '用户ID',
  `role_id` INT(11) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`)
) ENGINE=INNODB  DEFAULT CHARSET=utf8 COMMENT='用户角色表';



DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(255) NOT NULL COMMENT '账号',
  `password` VARCHAR(255) DEFAULT NULL COMMENT '密码',
  `name` VARCHAR(255) DEFAULT NULL COMMENT '名字',
  `nickname` VARCHAR(255) DEFAULT NULL COMMENT '昵称',
  `phone` VARCHAR(32) DEFAULT NULL COMMENT '手机号',
  `memo` VARCHAR(512) DEFAULT NULL COMMENT '备注',
  `status` TINYINT(4) DEFAULT NULL COMMENT '0未激活，1正常、2被锁定、3凭证过期',
  `create_at` TIMESTAMP NULL DEFAULT NULL COMMENT '创建时间',
  `update_at` TIMESTAMP NULL DEFAULT NULL COMMENT '修改时间',
  `create_by` VARCHAR(255) DEFAULT NULL COMMENT '创建者ID',
  `update_by` VARCHAR(255) DEFAULT NULL COMMENT '修改者ID',
  `reason` VARCHAR(255) DEFAULT NULL COMMENT '停用理由',
  `disable_at` TIMESTAMP NULL DEFAULT NULL COMMENT '停用时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB  DEFAULT CHARSET=utf8 COMMENT='用户表';

/************************* ry_oms库表结构 end****************************/


/*************************  ry_oms库初始化数据 start*************************/
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('1', '0', '账号管理', 'ACT');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('2', '1', '内部员工账号', 'ACT_RY');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('3', '2', '浏览', 'ACT_RY_VIEW');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('4', '2', '新建', 'ACT_RY_ADD');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('5', '2', '修改', 'ACT_RY_EDIT');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('6', '2', '启用/停用', 'ACT_RY_OPT');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('7', '2', '分配角色', 'ACT_RY_ASSIGNROLE');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('8', '2', '重置密码', 'ACT_RY_RSTPWD');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('9', '3', '商品列表', 'GOODS');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('10', '9', '浏览', 'GOODS_VIEW');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('11', '9', '新建', 'GOODS_ADD');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('12', '9', '修改', 'GOODS_EDIT');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('13', '2', '设备管理', 'EQUIPMENT');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('14', '13', '浏览', 'EQUIPMENT_VIEW');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('15', '13', '新建', 'EQUIPMENT_ADD');
INSERT INTO `hla`.`authority` (`id`, `parent_id`, `name`, `value`) VALUES ('16', '13', '修改', 'EQUIPMENT_EDIT');


/* 后台superadmin账号,默认密码123456 */
INSERT INTO `hla`.`user` (`id`, `username`, `password`, `name`, `nickname`, `phone`, `memo`, `status`, `create_at`, `update_at`, `create_by`, `update_by`, `reason`, `disable_at`) VALUES ('1', 'superadmin', '4c2fb3bcc416e122', 'superadmin', '超级管理员', NULL, NULL, '1', '2018-08-18 00:00:00', '2018-08-18 00:00:00', NULL, NULL, NULL, '2018-08-19 20:28:58');
INSERT INTO `hla`.`role` (`id`, `name`, `status`, `memo`, `create_at`, `update_at`, `create_by`, `update_by`, `reason`, `disable_at`) VALUES ('1', '超级管理员', '0', NULL, '2018-08-18 00:00:00', '2018-08-18 00:00:00', NULL, NULL, NULL, NULL);
INSERT INTO `hla`.`user_role` (`id`, `user_id`, `role_id`) VALUES ('1', '1', '1');
INSERT INTO `hla`.`role_authority` (`id`, `role_id`, `authority_id`) VALUES  (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,1,5),(6,1,6),(7,1,7),(8,1,8),(9,1,9),(10,1,10),(11,1,11),(12,1,12),(13,1,13),(14,1,14),(15,1,15),(16,1,16);
