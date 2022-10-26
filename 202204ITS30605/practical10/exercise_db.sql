-- Creating a New Database
DROP DATABASE IF EXISTS `exercise_db`;
CREATE DATABASE `exercise_db`;

USE `exercise_db`;

-- Create a Table
DROP TABLE IF EXISTS `Student`;
CREATE TABLE `Student` (
	`id`                INT NOT NULL AUTO_INCREMENT,
	`first_name`        VARCHAR(50) NOT NULL,
	`last_name`         VARCHAR(50) NOT NULL,
	`age`               INT(3) NOT NULL,
	`email`             VARCHAR(255),
	`active`            BOOLEAN NOT NULL DEFAULT TRUE,

	PRIMARY KEY(`id`)
);

-- Populating the Database Table
INSERT INTO `Student` (`first_name`, `last_name`, `age`, `email`, `active`) VALUES
("Adam", "Burns", 18, "adam_burns@gmail.com", 1);

-- The following does the same:
-- INSERT INTO `Student` (`first_name`, `last_name`, `age`, `email`) VALUES
-- ("Adam", "Burns", 18, "adam_burns@gmail.com");

INSERT INTO `Student` (`first_name`, `last_name`, `age`, `email`, `active`) VALUES
("Karen", "Allen", 19, "karen_allen@outlook.com", 1),
("Mark", "Weiss", 24, "hello@mweiss.com", 0),
("Tyson", "Russell", 16, "ask@tyson.com", 1);

-- Updating Records in a Table
UPDATE `Student` SET `active` = 1 WHERE `id` = 3;
UPDATE `Student` SET `email` = "adam@burnings.com" WHERE `id` = 1;
UPDATE `Student` SET `active` = 0 WHERE `id` = 4;
UPDATE `Student` SET `age` = 20 WHERE `age` = 2;

-- Selecting Records from a Table
SELECT * FROM `Student`;

SELECT * FROM `Student` WHERE `id` = 2;
SELECT `first_name`, `last_name` FROM `Student` WHERE `age` > 21;
SELECT * FROM `Student` WHERE `age` <= 20;
SELECT `first_name`, `last_name`, `email` FROM `Student` WHERE `active` = 1;

-- Deleting Records from a Table
DELETE FROM `Student` WHERE `id` = 4;     # Tyson's record id value is 4
