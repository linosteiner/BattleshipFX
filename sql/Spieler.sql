-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 19. Dez 2018 um 13:33
-- Server-Version: 10.1.28-MariaDB
-- PHP-Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `schiffeversenken`
--

create database `schneeger`;
use `schneeger`;

--
-- Tabellenstruktur für Tabelle `Spieler`
--

CREATE TABLE `spieler` (
  `Spieler_ID` int(10) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Anzahl_Spiele` int(10) NOT NULL,
  `Siege` int(10) NOT NULL,
  `Niederlagen` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `Spieler`
--
ALTER TABLE `Spieler`
  ADD PRIMARY KEY (`Spieler_ID`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `Spieler`
--
ALTER TABLE `Spieler`
  MODIFY `Spieler_ID` int(10) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;