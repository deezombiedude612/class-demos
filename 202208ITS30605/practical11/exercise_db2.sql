-- Example of implementing foreign keys in database tables
DROP DATABASE IF EXISTS `exercise_db2`;
CREATE DATABASE `exercise_db2`;

USE `exercise_db2`;


DROP TABLE IF EXISTS `Class`;
CREATE TABLE `Class` (
  `id` varchar(2) NOT NULL PRIMARY KEY,
  `name` varchar(50) NOT NULL
);

INSERT INTO `Class` (`id`, `name`) VALUES ("4E", "4 Excel");

DROP TABLE IF EXISTS `Student`;
CREATE TABLE `Student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `full_name` varchar(255) NOT NULL,
  `class_id` varchar(2) NOT NULL,

	PRIMARY KEY (`id`),

	-- Make `class_id` from the `Student` table take reference 
	-- from `id` column in `Class` as a foreign key.
	FOREIGN KEY (`class_id`) REFERENCES `Class` (`id`)
);
