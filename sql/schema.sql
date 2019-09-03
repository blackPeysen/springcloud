DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(64) COLLATE utf8_unicode_ci NOT NULL COMMENT '类目名称',
  `category_type` int(11) NOT NULL COMMENT '类目编号',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `uqe_catetory_type` (`category_type`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `product_category` VALUES ('1', '口碑榜', '1', '2019-09-03 10:51:32', '2019-09-03 14:32:38');
INSERT INTO `product_category` VALUES ('2', '热榜', '2', '2019-09-03 10:51:32', '2019-09-03 10:51:32');

DROP TABLE IF EXISTS `product_info`;
CREATE TABLE `product_info` (
  `product_id` varchar(32) NOT NULL,
  `product_name` varchar(64) NOT NULL COMMENT '商品名称',
  `product_price` decimal(8,2) NOT NULL COMMENT '商品价格',
  `product_stock` int(11) NOT NULL COMMENT '商品库存',
  `product_desc` varchar(64) DEFAULT NULL COMMENT '商品描述',
  `product_icon` varchar(512) DEFAULT NULL COMMENT '商品头像',
  `product_status` smallint(3) DEFAULT '0' COMMENT '商品状态,1下架；0正常',
  `product_type` int(11) NOT NULL COMMENT '商品类目编号',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `product_info` VALUES ('123456', '皮蛋粥', '12.34', '34', '好吃的皮蛋粥', 'icon1', '0', '1', '2019-09-03 11:16:57', '2019-09-03 11:16:57');
INSERT INTO `product_info` VALUES ('123457', '排骨面', '34.34', '31', '一般般啦', 'ICon3', '0', '2', '2019-09-03 11:17:59', '2019-09-03 11:17:59');
INSERT INTO `product_info` VALUES ('234567', '重庆小面', '19.32', '233', '还不错，够辣', 'icon2', '0', '1', '2019-09-03 11:17:34', '2019-09-03 11:17:34');

CREATE TABLE `order_master` (
  `order_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `buyer_name` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `buyer_phone` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `buyer_address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `buyer_open_id` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `order_amount` decimal(8,0) NOT NULL,
  `order_status` tinyint(4) DEFAULT NULL,
  `pay_status` tinyint(4) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `order_detail` (
  `detail_id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `product_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_price` decimal(8,2) DEFAULT NULL,
  `product_num` int(11) DEFAULT NULL,
  `product_icon` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;