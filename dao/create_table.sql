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