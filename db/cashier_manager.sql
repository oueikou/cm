/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : cashier_manager

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2017-06-28 17:28:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cm_category
-- ----------------------------
DROP TABLE IF EXISTS `cm_category`;
CREATE TABLE `cm_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `category_code` varchar(50) DEFAULT NULL COMMENT '类别编码',
  `category_name` varchar(100) DEFAULT NULL COMMENT '类别名称',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父级id',
  `create_user` bigint(20) DEFAULT NULL COMMENT '创建人id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_user` bigint(20) DEFAULT NULL COMMENT '修改人id',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='类别表';

-- ----------------------------
-- Records of cm_category
-- ----------------------------
INSERT INTO `cm_category` VALUES ('1', 'meat', '肉类', null, '1', '2017-06-28 14:46:25', '1', '2017-06-28 14:46:29');
INSERT INTO `cm_category` VALUES ('2', 'mutton', '羊肉', '1', '1', '2017-06-28 14:47:26', '1', '2017-06-28 14:47:29');
INSERT INTO `cm_category` VALUES ('3', 'beef', '牛肉', '1', '1', '2017-06-28 14:47:51', '1', '2017-06-28 14:47:54');
INSERT INTO `cm_category` VALUES ('4', 'drinks', '酒水类', null, '1', '2017-06-28 14:49:47', '1', '2017-06-28 14:49:51');
INSERT INTO `cm_category` VALUES ('5', 'spirit', '白酒', '4', '1', '2017-06-28 14:51:07', '1', '2017-06-28 14:51:10');
INSERT INTO `cm_category` VALUES ('6', 'beer', '啤酒', '4', '1', '2017-06-28 14:51:44', '1', '2017-06-28 14:51:47');
INSERT INTO `cm_category` VALUES ('7', 'beverage', '饮料', '4', '1', '2017-06-28 14:52:42', '1', '2017-06-28 14:52:45');
INSERT INTO `cm_category` VALUES ('8', 'chicken', '鸡肉', '1', '1', '2017-06-28 15:51:34', '1', '2017-06-28 15:51:38');

-- ----------------------------
-- Table structure for cm_food
-- ----------------------------
DROP TABLE IF EXISTS `cm_food`;
CREATE TABLE `cm_food` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `food_name` varchar(255) DEFAULT NULL COMMENT '食品名称',
  `food_cost` decimal(10,2) DEFAULT NULL COMMENT '成本单价',
  `food_price` decimal(10,2) DEFAULT NULL COMMENT '销售单价',
  `food_unit` varchar(50) DEFAULT NULL COMMENT '单位',
  `food_photo` varchar(255) DEFAULT NULL COMMENT '展示图片',
  `food_introduction` varchar(255) DEFAULT NULL COMMENT '简介',
  `is_marketable` tinyint(1) DEFAULT NULL COMMENT '是否上架：1-上架；0-下架',
  `category_id` bigint(20) DEFAULT NULL COMMENT '类别id',
  `create_user` bigint(20) DEFAULT NULL COMMENT '创建人id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_user` bigint(20) DEFAULT NULL COMMENT '修改人id',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `fk_food_category` (`category_id`),
  CONSTRAINT `fk_food_category` FOREIGN KEY (`category_id`) REFERENCES `cm_category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='食品表';

-- ----------------------------
-- Records of cm_food
-- ----------------------------
INSERT INTO `cm_food` VALUES ('1', '鸡肉', '60.00', '88.00', '只', null, '鸡还用介绍吗', '1', '8', '1', '2017-06-28 15:52:43', '1', '2017-06-28 15:52:45');
INSERT INTO `cm_food` VALUES ('2', '招牌肥牛片', '150.00', '168.00', '份', null, '好像就是牛肉', '1', '3', '1', '2017-06-28 15:55:34', '1', '2017-06-28 15:55:39');
INSERT INTO `cm_food` VALUES ('3', '雪花啤酒', '3.00', '10.00', '瓶', null, '一瓶啤酒，不算酒；两瓶啤酒，扶墙走；三瓶啤酒，墙走我不走', '1', '6', '1', '2017-06-28 15:57:18', '1', '2017-06-28 15:57:23');
INSERT INTO `cm_food` VALUES ('4', '大力', '10.00', '20.00', '瓶', null, '知道大力哥不', '1', '7', '1', '2017-06-28 16:00:59', '1', '2017-06-28 16:01:04');

-- ----------------------------
-- Table structure for cm_order
-- ----------------------------
DROP TABLE IF EXISTS `cm_order`;
CREATE TABLE `cm_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_sn` varchar(50) DEFAULT NULL COMMENT '订单编号',
  `order_status` tinyint(2) DEFAULT NULL COMMENT '订单状态：0-未下单或下单失败；1-已下单，未支付；2-交易已完成；3-订单已取消',
  `order_cost` decimal(10,2) DEFAULT NULL COMMENT '订单总成本',
  `order_amount` decimal(10,2) DEFAULT NULL COMMENT '订单总金额',
  `create_user` bigint(20) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_user` bigint(20) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Records of cm_order
-- ----------------------------

-- ----------------------------
-- Table structure for cm_order_item
-- ----------------------------
DROP TABLE IF EXISTS `cm_order_item`;
CREATE TABLE `cm_order_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_item_food_cost` decimal(10,2) DEFAULT NULL COMMENT '下单时成本价',
  `order_item_food_price` decimal(10,2) DEFAULT NULL COMMENT '下单时销售价',
  `order_item_quantity` int(11) DEFAULT NULL COMMENT '数量',
  `order_item_subtotal` decimal(10,2) DEFAULT NULL COMMENT '小计',
  `food_id` bigint(20) DEFAULT NULL COMMENT '食品id',
  `order_id` bigint(20) DEFAULT NULL COMMENT '订单id',
  `create_user` bigint(20) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_user` bigint(20) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `fk_order_item_food` (`food_id`),
  KEY `fk_order_item_order` (`order_id`),
  CONSTRAINT `fk_order_item_order` FOREIGN KEY (`order_id`) REFERENCES `cm_order` (`id`),
  CONSTRAINT `fk_order_item_food` FOREIGN KEY (`food_id`) REFERENCES `cm_food` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单项表';

-- ----------------------------
-- Records of cm_order_item
-- ----------------------------

-- ----------------------------
-- Table structure for cm_payment
-- ----------------------------
DROP TABLE IF EXISTS `cm_payment`;
CREATE TABLE `cm_payment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `payment_sn` varchar(50) DEFAULT NULL COMMENT '支付编号',
  `payment_amount` decimal(10,2) DEFAULT NULL COMMENT '支付金额',
  `payment_method` tinyint(2) DEFAULT NULL COMMENT '支付方式：0-现金支付；1-支付宝支付；2-微信支付；3-银联卡支付',
  `payment_status` tinyint(2) DEFAULT NULL COMMENT '支付状态：0-未支付；1-已支付',
  `order_id` bigint(20) DEFAULT NULL COMMENT '订单id',
  `create_user` bigint(20) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_user` bigint(20) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `fk_payment_order` (`order_id`),
  CONSTRAINT `fk_payment_order` FOREIGN KEY (`order_id`) REFERENCES `cm_order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付信息表';

-- ----------------------------
-- Records of cm_payment
-- ----------------------------

-- ----------------------------
-- Table structure for cm_user
-- ----------------------------
DROP TABLE IF EXISTS `cm_user`;
CREATE TABLE `cm_user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `login_name` varchar(100) DEFAULT NULL COMMENT '登录名',
  `password` varchar(100) DEFAULT NULL COMMENT '登录密码',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_login_name` (`login_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of cm_user
-- ----------------------------
INSERT INTO `cm_user` VALUES ('1', 'zhangsan', '123456');
INSERT INTO `cm_user` VALUES ('2', 'lisi', '555');
INSERT INTO `cm_user` VALUES ('4', 'wangwu', '789');
INSERT INTO `cm_user` VALUES ('5', 'dfgdfh', '5684');
INSERT INTO `cm_user` VALUES ('6', 'jhjhdfgh', '9087654');
