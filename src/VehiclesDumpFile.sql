CREATE DATABASE  IF NOT EXISTS `vehicles` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `vehicles`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: vehicles
-- ------------------------------------------------------
-- Server version	5.7.10-log

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
-- Table structure for table `enginetype`
--

DROP TABLE IF EXISTS `enginetype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `enginetype` (
  `engineTypeID` int(11) NOT NULL AUTO_INCREMENT,
  `engineType` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`engineTypeID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='This table will contain the vehicle engine types';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enginetype`
--

LOCK TABLES `enginetype` WRITE;
/*!40000 ALTER TABLE `enginetype` DISABLE KEYS */;
INSERT INTO `enginetype` VALUES (1,'Gas'),(2,'Hybrid'),(3,'Electric'),(4,'None'),(5,'');
/*!40000 ALTER TABLE `enginetype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehicle` (
  `vehicleID` int(11) NOT NULL AUTO_INCREMENT,
  `vehicleTypeID` int(11) DEFAULT NULL,
  `vinNumber` int(11) DEFAULT NULL,
  `vehicleBrandID` int(11) DEFAULT NULL,
  `vehicleColorID` int(11) DEFAULT NULL,
  `engineTypeID` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  PRIMARY KEY (`vehicleID`),
  KEY `vehicleTypeID_idx` (`vehicleTypeID`),
  KEY `vehicleBrandID_idx` (`vehicleBrandID`),
  KEY `vehicleColorID_idx` (`vehicleColorID`),
  KEY `engineTypeID_idx` (`engineTypeID`),
  CONSTRAINT `engineTypeID` FOREIGN KEY (`engineTypeID`) REFERENCES `enginetype` (`engineTypeID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vehicleBrandID` FOREIGN KEY (`vehicleBrandID`) REFERENCES `vehiclebrand` (`vehicleBrandID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vehicleColorID` FOREIGN KEY (`vehicleColorID`) REFERENCES `vehiclecolor` (`vehicleColorID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vehicleTypeID` FOREIGN KEY (`vehicleTypeID`) REFERENCES `vehicletype` (`vehicleTypeID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='This table will contain a variety of information about the vehicle';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES (1,1,1234,1,1,1,24000,2016),(2,2,1235,2,2,2,27000,2015),(3,2,1236,2,1,1,19000,2015),(4,2,1237,2,3,1,21000,2014),(5,3,1238,3,3,2,17000,2016),(6,1,1239,3,3,2,17000,2016),(7,2,1240,4,1,1,17000,2014),(8,1,1241,5,2,3,85000,2016),(9,4,1242,6,4,4,2000,2015),(10,4,1243,7,4,4,150,2014),(11,4,1244,8,5,4,1200,2016),(12,2,1245,4,4,3,25000,2009),(13,2,1246,9,6,1,1000,1984),(14,2,1247,10,7,1,500,1981),(15,2,1248,11,8,1,100,1977),(16,2,1249,12,9,5,10,1985),(17,2,1250,13,12,5,2500000,2016),(18,2,1251,14,1,5,84000,2016),(19,2,1252,3,3,1,5000,2002),(20,2,1253,3,10,1,13000,2015),(21,2,1254,4,11,1,13000,2014),(22,2,1255,15,3,1,13000,2014);
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiclebrand`
--

DROP TABLE IF EXISTS `vehiclebrand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehiclebrand` (
  `vehicleBrandID` int(11) NOT NULL AUTO_INCREMENT,
  `brand` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`vehicleBrandID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='This table will contain the vehicles brands';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiclebrand`
--

LOCK TABLES `vehiclebrand` WRITE;
/*!40000 ALTER TABLE `vehiclebrand` DISABLE KEYS */;
INSERT INTO `vehiclebrand` VALUES (1,'GMC'),(2,'Toyota'),(3,'Honda'),(4,'Hyundai'),(5,'Tesla'),(6,'Cervelo'),(7,'Huffy'),(8,'Trek'),(9,'Ford Pinto'),(10,'Chevy Vega'),(11,'AMC Hornet'),(12,'Yugo'),(13,'Bugatti Veyron'),(14,'Tesla model-S'),(15,'Subaru');
/*!40000 ALTER TABLE `vehiclebrand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiclecolor`
--

DROP TABLE IF EXISTS `vehiclecolor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehiclecolor` (
  `vehicleColorID` int(11) NOT NULL AUTO_INCREMENT,
  `color` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`vehicleColorID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='This table will contain the vehicls colors types';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiclecolor`
--

LOCK TABLES `vehiclecolor` WRITE;
/*!40000 ALTER TABLE `vehiclecolor` DISABLE KEYS */;
INSERT INTO `vehiclecolor` VALUES (1,'Red'),(2,'Green'),(3,'Blue'),(4,'White'),(5,'Orange'),(6,'Light Blue'),(7,'Dark Blue'),(8,'Tan'),(9,'Gray'),(10,'Silver'),(11,'Gold'),(12,'Black');
/*!40000 ALTER TABLE `vehiclecolor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicletype`
--

DROP TABLE IF EXISTS `vehicletype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehicletype` (
  `vehicleTypeID` int(11) NOT NULL AUTO_INCREMENT,
  `vehicleType` varchar(45) DEFAULT 'truck, car,motorcycle, bicycle',
  PRIMARY KEY (`vehicleTypeID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='This table will contain the vehicles types';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicletype`
--

LOCK TABLES `vehicletype` WRITE;
/*!40000 ALTER TABLE `vehicletype` DISABLE KEYS */;
INSERT INTO `vehicletype` VALUES (1,'Truck'),(2,'Car'),(3,'Motorcycle'),(4,'Bicycle');
/*!40000 ALTER TABLE `vehicletype` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-12 20:17:31
