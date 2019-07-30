-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: entertainment
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tv_shows`
--

DROP TABLE IF EXISTS `tv_shows`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tv_shows` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(45) NOT NULL,
  `Year` date NOT NULL,
  `Genre_id` int(11) NOT NULL,
  `Synopsis` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_shows._genre_idx` (`Genre_id`),
  CONSTRAINT `fk_shows._genre` FOREIGN KEY (`Genre_id`) REFERENCES `genres` (`idgenres`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tv_shows`
--

LOCK TABLES `tv_shows` WRITE;
/*!40000 ALTER TABLE `tv_shows` DISABLE KEYS */;
INSERT INTO `tv_shows` VALUES (3,'30 Rocks','2006-01-05',4,'Liz Lemon, head writer of the sketch comedy show \"TGS with Tracy Jordan\", must deal with an arrogant new boss and a crazy new star, all while trying to run a successful television show without losing her mind.'),(4,'Agents of S.H.I.E.L.D','2015-05-07',1,'The missions of the Strategic Homeland Intervention, Enforcement and Logistics Division.'),(5,'Hannibal','2013-12-22',8,'Explores the early relationship between the renowned psychiatrist and his patient, a young FBI criminal profiler, who is haunted by his ability to empathize with serial killers.'),(6,'Jessica Jones ','2019-11-04',1,'Following the tragic end of her brief superhero career, Jessica Jones tries to rebuild her life as a private investigator, dealing with cases involving people with remarkable abilities in New York City.'),(7,'Prison Break ','2011-11-11',1,'Due to a political conspiracy, an innocent man is sent to death row and his only hope is his brother, who makes it his mission to deliberately get himself sent to the same prison in order to break the both of them out, from the inside.'),(8,'The Punisher ','2018-06-15',1,'After the murder of his family, Marine veteran Frank Castle becomes the vigilante known as \"The Punisher,\" with only one goal in mind: to avenge them.'),(9,'Hawaii Five-0 ','2003-02-28',1,'Steve McGarrett returns home to Oahu, in order to find his father\'s killer. The Governor offers him the chance to run his own task force (Five-0).'),(10,'The 100 ','2009-04-22',2,'Set ninety-seven years after a nuclear war has destroyed civilization, when a spaceship housing humanity\'s lone survivors sends one hundred juvenile delinquents back to Earth, in hopes of possibly re-populating the planet.'),(11,'Lost ','2003-09-16',2,'The survivors of a plane crash are forced to work together in order to survive on a seemingly deserted tropical island.'),(12,'Black Sails','2004-03-04',2,'Follows Captain Flint and his pirates twenty years prior to Robert Louis Stevenson\'s classic novel \"Treasure Island.\"'),(13,'Sherlock ','2011-06-23',2,'A modern update finds the famous sleuth and his doctor partner solving crime in 21st century London.'),(14,'Smallville ','2000-07-19',2,'A young Clark Kent struggles to find his place in the world as he learns to harness his alien powers for good and deals with the typical troubles of teenage life in Smallville, Kansas.'),(15,'American Crime Story ','2002-04-09',3,'An anthology series centered around America\'s most notorious crimes and criminals.'),(16,'Narcos ','2019-05-02',3,'A chronicled look at the criminal exploits of Colombian drug lord Pablo Escobar, as well as the many other drug kingpins who plagued the country through the years.'),(17,'Muhtesem Yüzyil ','2014-01-02',3,'From 1520, follows Suleiman the Magnificent and his relatives from his great conquests to the \"Battle of Szigeth\".'),(18,'John Adams ','2004-06-11',3,'The life of one of the USA\'s Founding Fathers, its second President, and his role in the nation\'s first 50 years.'),(19,'The Durrells in Corfu ','2003-12-11',3,'Based on the real-life events of the Durrell family as they resettle from England to Greece.'),(20,'Arrested Development ','2007-10-04',4,'Level-headed son Michael Bluth takes over family affairs after his father is imprisoned. But the rest of his spoiled, dysfunctional family are making his job unbearable.'),(21,'Parks and Recreation','2011-01-19',4,'The absurd antics of an Indiana town\'s public officials as they pursue sundry projects to make their city a better place.'),(22,'Veep ','2019-04-06',4,'Former Senator Selina Meyer finds that being Vice President of the United States is nothing like she hoped and everything that everyone ever warned her about.'),(23,'Friends ','2015-07-22',4,'Follows the personal and professional lives of six twenty to thirty-something-year-old friends living in Manhattan.'),(24,'Criminal Minds','2017-03-28',5,'The cases of the F.B.I. Behavioral Analysis Unit (B.A.U.), an elite group of profilers who analyze the nation\'s most dangerous serial killers and individual heinous crimes in an effort to anticipate their next moves before they strike again.'),(25,'True Detective ','2018-06-25',5,'Seasonal anthology series in which police investigations unearth the personal and professional secrets of those involved, both within and outside the law.'),(26,'Breaking Bad ','2008-11-21',5,'A high school chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine in order to secure his family\'s future.'),(27,'Luther ','2009-10-04',5,'DCI John Luther is a near-genius murder detective whose brilliant mind can\'t always save him from the dangerous violence of his passions.'),(28,'The Handmaid\'s Tale','1993-04-09',6,'Set in a dystopian future, a woman is forced to live as a concubine under a fundamentalist theocratic dictatorship.'),(29,'Peaky Blinders ','1999-11-16',6,'A gangster family epic set in 1919 Birmingham, England; centered on a gang who sew razor blades in the peaks of their caps, and their fierce boss Tommy Shelby.'),(30,'The Crown ','2004-10-10',6,'Follows the political rivalries and romance of Queen Elizabeth II\'s reign and the events that shaped the second half of the 20th century.'),(31,'The Wire ','2008-08-15',6,'Baltimore drug scene, seen through the eyes of drug dealers and law enforcement.'),(32,'Full House','1994-05-19',7,'A widowed broadcaster raises his three children with the assistance of his rock \'n\' roll brother-in-law and his madcap best friend.'),(33,'Modern Family ','2007-09-20',7,'Three different but related families face trials and tribulations in their own uniquely comedic ways.'),(34,'Gilmore Girls ','2000-11-10',7,'A dramedy centering around the relationship between a thirtysomething single mother and her teen daughter living in Stars Hollow, Connecticut.'),(35,'iCarly ','2009-07-29',7,'Carly hosts her own home-grown web show, iCarly, Carly and sidekick Sam\'s regular Web casts ultimately feature everything from comedy sketches and talent contests to interviews, recipes, and problem-solving.'),(36,'American Horror Story ','2011-09-27',8,'An anthology series centering on different characters and locations, including a house with a murderous past, an insane asylum, a witch coven, a freak show, a hotel, a possessed farmhouse, a cult, and the apocalypse.'),(37,'Penny Dreadful','2019-11-04',8,'Explorer Sir Malcolm Murray, American gunslinger Ethan Chandler, scientist Victor Frankenstein, and medium Vanessa Ives unite to combat supernatural threats in Victorian London.'),(38,'Bates Motel ','2016-03-01',8,'A contemporary prequel to Psycho, giving a portrayal of how Norman Bates\' psyche unravels through his teenage years, and how deeply intricate his relationship with his mother, Norma, truly is.'),(39,'Supernatural ','2013-05-01',8,'Two brothers follow their father\'s footsteps as hunters, fighting evil supernatural beings of many kinds, including monsters, demons, and gods that roam the earth.'),(40,'The Expanse ','2010-09-11',9,'A police detective in the asteroid belt, the first officer of an interplanetary ice freighter and an earth-bound United Nations executive slowly discover a vast conspiracy that threatens the Earth\'s rebellious colony on the asteroid belt.'),(41,'Stranger Things','2004-12-29',9,'When a young boy disappears, his mother, a police chief, and his friends must confront terrifying forces in order to get him back.'),(42,'Lost in Space ','2007-07-07',9,'After crash-landing on an alien planet, the Robinson family fight against all odds to survive and escape, but they\'re surrounded by hidden dangers.'),(43,'Altered Carbon','2001-09-24',9,'Set in a future where consciousness is digitized and stored, a prisoner returns to life in a new body and must solve a mind-bending murder to win his freedom.'),(44,'Star Trek: Discovery ','2018-03-06',9,'Ten years before Kirk, Spock, and the Enterprise, the USS Discovery discovers new worlds and lifeforms as one Starfleet officer learns to understand all things alien.'),(45,'Deadwood ','2003-05-02',10,'A show set in the late 1800s, revolving around the characters of Deadwood, South Dakota; a town of deep corruption and crime.'),(46,'Bonanza ','2000-04-11',10,'The adventures of Ben Cartwright and his sons as they run and defend their ranch while helping the surrounding community.'),(47,'Wild Wild West','1993-10-15',10,'The two best special agents in the Wild West must save President Grant from the clutches of a diabolical, wheelchair-bound, steampunk-savvy, Confederate scientist bent on revenge for losing the Civil War.'),(48,'Longmire ','1990-11-12',10,'Walt Longmire is the dedicated and unflappable sheriff of Absaroka County, Wyoming. Widowed only a year, he is a man in psychic repair but buries his pain behind his brave face, unassuming grin and dry wit.'),(49,'Death Valley Days','2004-01-23',10,'Western stories and legends based, and filmed, in and around Death Valley, California. One of the longest-running Western series, originating on radio in the 1930s. The continuing sponsor was \"20 Mule Team\" Borax, a product formerly mined in Death Valley.');
/*!40000 ALTER TABLE `tv_shows` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-17 20:12:41
