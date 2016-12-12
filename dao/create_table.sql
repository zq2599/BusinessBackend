drop table if EXISTS ext_attr;

CREATE TABLE `ext_attr` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `main_id` bigint DEFAULT NULL,
  `create_time` bigint DEFAULT NULL,
  `modify_time` bigint DEFAULT NULL,
  `name` varchar(128) DEFAULT NULL,
  `value` varchar(512) DEFAULT NULL,
  `type` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;


--基础库存表
drop table if EXISTS base_stock;

CREATE TABLE `base_stock` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `create_time` bigint DEFAULT NULL,
  `modify_time` bigint DEFAULT NULL,
  `name` varchar(128) DEFAULT NULL,
  `type` varchar(32) DEFAULT NULL,
  `max_value` int DEFAULT NULL,
  `stock_value` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;