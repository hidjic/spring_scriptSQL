-- --------------------------------------------------------
-- Hôte :                        127.0.0.1
-- Version du serveur:           5.7.19 - MySQL Community Server (GPL)
-- SE du serveur:                Win64
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Export de la structure de la base pour proxibanquedb
CREATE DATABASE IF NOT EXISTS `proxibanquedb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `proxibanquedb`;

-- Export de la structure de la table proxibanquedb. client
CREATE TABLE IF NOT EXISTS `client` (
  `idClient` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `email` varchar(125) DEFAULT NULL,
  `adresse` varchar(45) DEFAULT NULL,
  `codePostal` varchar(45) DEFAULT NULL,
  `ville` varchar(45) DEFAULT NULL,
  `idConseiller` int(11) NOT NULL,
  PRIMARY KEY (`idClient`),
  KEY `fk_idConseiller_idx` (`idConseiller`),
  CONSTRAINT `fk_idConseiller` FOREIGN KEY (`idConseiller`) REFERENCES `conseiller` (`idConseiller`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Export de données de la table proxibanquedb.client : ~0 rows (environ)
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
/*!40000 ALTER TABLE `client` ENABLE KEYS */;

-- Export de la structure de la table proxibanquedb. compte
CREATE TABLE IF NOT EXISTS `compte` (
  `idCompte` int(11) NOT NULL AUTO_INCREMENT,
  `numCompte` varchar(45) DEFAULT NULL,
  `dateCreation` varchar(45) DEFAULT NULL,
  `isActive` int(11) NOT NULL DEFAULT '0',
  `solde` float NOT NULL DEFAULT '0',
  `decouvert` float NOT NULL DEFAULT '0',
  `taux` float NOT NULL DEFAULT '0',
  `idClient` int(11) NOT NULL,
  PRIMARY KEY (`idCompte`),
  KEY `fk_idClient_idx` (`idClient`),
  CONSTRAINT `fk_idClient` FOREIGN KEY (`idClient`) REFERENCES `client` (`idClient`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Export de données de la table proxibanquedb.compte : ~0 rows (environ)
/*!40000 ALTER TABLE `compte` DISABLE KEYS */;
/*!40000 ALTER TABLE `compte` ENABLE KEYS */;

-- Export de la structure de la table proxibanquedb. conseiller
CREATE TABLE IF NOT EXISTS `conseiller` (
  `idConseiller` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `login` varchar(45) NOT NULL,
  `pwd` varchar(45) NOT NULL,
  PRIMARY KEY (`idConseiller`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Export de données de la table proxibanquedb.conseiller : ~1 rows (environ)
/*!40000 ALTER TABLE `conseiller` DISABLE KEYS */;
INSERT INTO `conseiller` (`idConseiller`, `nom`, `prenom`, `login`, `pwd`) VALUES
	(1, 'Dupond', 'Pierre', 'test', '123');
/*!40000 ALTER TABLE `conseiller` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
