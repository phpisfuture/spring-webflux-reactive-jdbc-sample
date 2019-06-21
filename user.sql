# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 140.143.19.138 (MySQL 5.6.40)
# Database: iot_waste_upgraded
# Generation Time: 2019-06-21 10:57:13 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table iot_user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `iot_user`;

CREATE TABLE `iot_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(64) DEFAULT NULL COMMENT '用户名',
  `pass_word` varchar(64) DEFAULT NULL COMMENT '密码',
  `company_id` varchar(64) DEFAULT NULL,
  `company_type` int(3) DEFAULT NULL,
  `last_login_time` timestamp NULL DEFAULT NULL,
  `last_login_ip` varchar(32) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL,
  `register_status` int(3) DEFAULT NULL COMMENT '用于新的注册流程。0表示完成注册全部流程。大于0表示未完成',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

LOCK TABLES `iot_user` WRITE;
/*!40000 ALTER TABLE `iot_user` DISABLE KEYS */;

INSERT INTO `iot_user` (`id`, `user_name`, `pass_word`, `company_id`, `company_type`, `last_login_time`, `last_login_ip`, `create_time`, `update_time`, `register_status`)
VALUES
	(1,'1','1','1',1,NULL,'1',NULL,NULL,1),
	(2,'weilai','cool',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
	(3,'weilai','cool',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
	(4,'weilai','cool',NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*!40000 ALTER TABLE `iot_user` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
