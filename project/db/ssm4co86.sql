-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: database
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssm4co86/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssm4co86/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssm4co86/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `keyanrenyuan`
--

DROP TABLE IF EXISTS `keyanrenyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `keyanrenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonghao` varchar(200) NOT NULL COMMENT '工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `xiangpian` varchar(200) DEFAULT NULL COMMENT '相片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gonghao` (`gonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1620292919481 DEFAULT CHARSET=utf8 COMMENT='科研人员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `keyanrenyuan`
--

LOCK TABLES `keyanrenyuan` WRITE;
/*!40000 ALTER TABLE `keyanrenyuan` DISABLE KEYS */;
INSERT INTO `keyanrenyuan` VALUES (21,'2021-05-06 09:16:49','科研人员1','123456','姓名1','男','773890001@qq.com','13823888881','http://localhost:8080/ssm4co86/upload/keyanrenyuan_xiangpian1.jpg'),(24,'2021-05-06 09:16:49','科研人员4','123456','姓名4','男','773890004@qq.com','13823888884','http://localhost:8080/ssm4co86/upload/keyanrenyuan_xiangpian4.jpg'),(25,'2021-05-06 09:16:49','科研人员5','123456','姓名5','男','773890005@qq.com','13823888885','http://localhost:8080/ssm4co86/upload/keyanrenyuan_xiangpian5.jpg'),(26,'2021-05-06 09:16:49','科研人员6','123456','姓名6','男','773890006@qq.com','13823888886','http://localhost:8080/ssm4co86/upload/keyanrenyuan_xiangpian6.jpg'),(1620292919480,'2021-05-06 09:21:59','222','222','李四','男','189@163.com','18999999999','http://localhost:8080/ssm4co86/upload/1620292942651.png');
/*!40000 ALTER TABLE `keyanrenyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shenqingzhuanli`
--

DROP TABLE IF EXISTS `shenqingzhuanli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shenqingzhuanli` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhuanlibianhao` varchar(200) NOT NULL COMMENT '专利编号',
  `zhuanlimingcheng` varchar(200) NOT NULL COMMENT '专利名称',
  `zhuanlileixing` varchar(200) DEFAULT NULL COMMENT '专利类型',
  `zhuanlijianjie` longtext COMMENT '专利简介',
  `zhuanliwenjian` varchar(200) DEFAULT NULL COMMENT '专利文件',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhuanlibianhao` (`zhuanlibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1620293046870 DEFAULT CHARSET=utf8 COMMENT='申请专利';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shenqingzhuanli`
--

LOCK TABLES `shenqingzhuanli` WRITE;
/*!40000 ALTER TABLE `shenqingzhuanli` DISABLE KEYS */;
INSERT INTO `shenqingzhuanli` VALUES (31,'2021-05-06 09:16:49','专利编号1','专利名称1','专利类型1','专利简介1','','工号1','姓名1','2021-05-06','是',''),(32,'2021-05-06 09:16:49','专利编号2','专利名称2','专利类型2','专利简介2','','工号2','姓名2','2021-05-06','是',''),(33,'2021-05-06 09:16:49','专利编号3','专利名称3','专利类型3','专利简介3','','工号3','姓名3','2021-05-06','是',''),(34,'2021-05-06 09:16:49','专利编号4','专利名称4','专利类型4','专利简介4','','工号4','姓名4','2021-05-06','是',''),(35,'2021-05-06 09:16:49','专利编号5','专利名称5','专利类型5','专利简介5','','工号5','姓名5','2021-05-06','是',''),(36,'2021-05-06 09:16:49','专利编号6','专利名称6','专利类型6','专利简介6','','工号6','姓名6','2021-05-06','是',''),(1620293046869,'2021-05-06 09:24:06','1620292822529','智能清洗发明','小型发明','可以帮助人们节省时间23323','http://localhost:8080/ssm4co86/upload/1620293026702.docx','222','李四','2021-05-06','是','这里是专家编辑通过或者不通过的原因，供科研或者管理员查看');
/*!40000 ALTER TABLE `shenqingzhuanli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1620292919480,'222','keyanrenyuan','科研人员','6tfjyj939zmd69vvf0njte31a04wxnco','2021-05-06 09:22:06','2021-05-06 10:28:27'),(2,1,'abo','users','管理员','zqeamifvh5u3rcr9hegplms42ypaogzo','2021-05-06 09:22:45','2021-05-06 10:26:57'),(3,1620292894475,'111','zhuanjia','专家','30w2tr3srlz30di705wk2o5ngt52laef','2021-05-06 09:24:16','2021-05-06 10:24:16');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-05-06 09:16:49');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhuanjia`
--

DROP TABLE IF EXISTS `zhuanjia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhuanjia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhuanjiazhanghao` varchar(200) NOT NULL COMMENT '专家账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `zhuanjiaxingming` varchar(200) NOT NULL COMMENT '专家姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `xiangpian` varchar(200) DEFAULT NULL COMMENT '相片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhuanjiazhanghao` (`zhuanjiazhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1620292894476 DEFAULT CHARSET=utf8 COMMENT='专家';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhuanjia`
--

LOCK TABLES `zhuanjia` WRITE;
/*!40000 ALTER TABLE `zhuanjia` DISABLE KEYS */;
INSERT INTO `zhuanjia` VALUES (12,'2021-05-06 09:16:49','专家2','123456','专家姓名2摄氏度','男','773890002@qq.com','13823888882','http://localhost:8080/ssm4co86/upload/zhuanjia_xiangpian2.jpg'),(13,'2021-05-06 09:16:49','专家3','123456','专家姓名3','男','773890003@qq.com','13823888883','http://localhost:8080/ssm4co86/upload/zhuanjia_xiangpian3.jpg'),(14,'2021-05-06 09:16:49','专家4','123456','专家姓名4','男','773890004@qq.com','13823888884','http://localhost:8080/ssm4co86/upload/zhuanjia_xiangpian4.jpg'),(15,'2021-05-06 09:16:49','专家5','123456','专家姓名5','男','773890005@qq.com','13823888885','http://localhost:8080/ssm4co86/upload/zhuanjia_xiangpian5.jpg'),(16,'2021-05-06 09:16:49','专家6','123456','专家姓名6','男','773890006@qq.com','13823888886','http://localhost:8080/ssm4co86/upload/zhuanjia_xiangpian6.jpg'),(1620292894475,'2021-05-06 09:21:34','111','111','张三','男','132@163.com','13222222222','http://localhost:8080/ssm4co86/upload/1620293071590.png');
/*!40000 ALTER TABLE `zhuanjia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhuanlileixing`
--

DROP TABLE IF EXISTS `zhuanlileixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhuanlileixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhuanlileixing` varchar(200) NOT NULL COMMENT '专利类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1620292979340 DEFAULT CHARSET=utf8 COMMENT='专利类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhuanlileixing`
--

LOCK TABLES `zhuanlileixing` WRITE;
/*!40000 ALTER TABLE `zhuanlileixing` DISABLE KEYS */;
INSERT INTO `zhuanlileixing` VALUES (41,'2021-05-06 09:16:49','虚拟专利'),(43,'2021-05-06 09:16:49','专利类型3'),(44,'2021-05-06 09:16:49','专利类型4'),(45,'2021-05-06 09:16:49','专利类型5'),(46,'2021-05-06 09:16:49','专利类型6'),(1620292979339,'2021-05-06 09:22:58','小型发明');
/*!40000 ALTER TABLE `zhuanlileixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhuanlixinxi`
--

DROP TABLE IF EXISTS `zhuanlixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhuanlixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhuanlibianhao` varchar(200) DEFAULT NULL COMMENT '专利编号',
  `zhuanlimingcheng` varchar(200) DEFAULT NULL COMMENT '专利名称',
  `zhuanlileixing` varchar(200) DEFAULT NULL COMMENT '专利类型',
  `zhuanlijianjie` longtext COMMENT '专利简介',
  `zhuanliwenjian` varchar(200) DEFAULT NULL COMMENT '专利文件',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1620293258190 DEFAULT CHARSET=utf8 COMMENT='专利信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhuanlixinxi`
--

LOCK TABLES `zhuanlixinxi` WRITE;
/*!40000 ALTER TABLE `zhuanlixinxi` DISABLE KEYS */;
INSERT INTO `zhuanlixinxi` VALUES (51,'2021-05-06 09:16:49','专利编号1','专利名称1','专利类型1','专利简介1','','工号1','姓名1','2021-05-06'),(52,'2021-05-06 09:16:49','专利编号2','专利名称2','专利类型2','专利简介2','','工号2','姓名2','2021-05-06'),(53,'2021-05-06 09:16:49','专利编号3','专利名称3','专利类型3','专利简介3','','工号3','姓名3','2021-05-06'),(54,'2021-05-06 09:16:49','专利编号4','专利名称4','专利类型4','专利简介4','','工号4','姓名4','2021-05-06'),(55,'2021-05-06 09:16:49','专利编号5','专利名称5','专利类型5','专利简介5','','工号5','姓名5','2021-05-06'),(56,'2021-05-06 09:16:49','专利编号6','专利名称6','专利类型6','专利简介6','','工号6','姓名6','2021-05-06'),(1620293258189,'2021-05-06 09:27:37','1620292822529','智能清洗发明','小型发明','可以帮助人们节省时间23323','http://localhost:8080/ssm4co86/upload/1620293026702.docx','222','李四','2021-05-06');
/*!40000 ALTER TABLE `zhuanlixinxi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-07 17:17:19
