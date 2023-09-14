-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: nutrient_tracker
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `foods`
--

DROP TABLE IF EXISTS `foods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `foods` (
  `food_id` int NOT NULL AUTO_INCREMENT,
  `food_name` varchar(100) NOT NULL,
  `fat_g` float NOT NULL,
  `carbohydrate_g` float NOT NULL,
  `sugar_g` float NOT NULL,
  `fiber_g` float NOT NULL,
  `protein_g` float NOT NULL,
  `vitamin_a_mcg` float DEFAULT NULL,
  `vitamin_b1_mg` float DEFAULT NULL,
  `vitamin_b2_mg` float DEFAULT NULL,
  `vitamin_b3_mg` float DEFAULT NULL,
  `vitamin_b5_mg` float DEFAULT NULL,
  `vitamin_b6_mg` float DEFAULT NULL,
  `vitamin_b7_mcg` float DEFAULT NULL,
  `vitamin_b9_mcg` float DEFAULT NULL,
  `vitamin_b12_mcg` float DEFAULT NULL,
  `vitamin_c_mg` float DEFAULT NULL,
  `vitamin_d_mcg` float DEFAULT NULL,
  `vitamin_e_mg` float DEFAULT NULL,
  `vitamin_k_mcg` float DEFAULT NULL,
  `calcium_mg` float DEFAULT NULL,
  `iron_mg` float DEFAULT NULL,
  `magnesium_mg` float DEFAULT NULL,
  `phosphorus_mg` float DEFAULT NULL,
  `potassium_mg` float DEFAULT NULL,
  `sodium_mg` float DEFAULT NULL,
  `zinc_mg` float DEFAULT NULL,
  `copper_mg` float DEFAULT NULL,
  `manganese_mg` float DEFAULT NULL,
  `selenium_mcg` float DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`food_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `foods`
--

LOCK TABLES `foods` WRITE;
/*!40000 ALTER TABLE `foods` DISABLE KEYS */;
INSERT INTO `foods` VALUES (1,'Broccoli',0.4,7.2,2.4,3.3,3.7,623,0.071,0.117,0.639,0.573,0.175,21,108,0,89.2,1.1,1.4,101.6,47,0.73,21,66,316,33,0.41,0.034,0.175,2.5,NULL),(2,'Salmon',13.4,0,0,0,25.4,59,0.15,0.32,8.6,1.85,0.55,5,36,2.6,0,9.8,1.1,0.3,12,0.55,27,212,363,59,0.34,0.081,0.015,20.3,NULL),(3,'Banana',0.3,27,14.4,3.1,1.3,64,0.031,0.073,0.665,0.334,0.367,3,20,0,8.7,0.1,0.1,0.5,5,0.26,27,22,358,1,0.15,0.078,0.27,1,NULL);
/*!40000 ALTER TABLE `foods` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-14 11:13:19
