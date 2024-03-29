<?php
/* copy PHP code from db-connect.php, or include it as follows: */
require "db-connect.php"; 	// db-connect.php is treated like an attachment

$sql = "CREATE TABLE IF NOT EXISTS `Student` (
	`id`                INT NOT NULL AUTO_INCREMENT,
	`first_name`        VARCHAR(50) NOT NULL,
	`last_name`         VARCHAR(50) NOT NULL,
	`age`               INT(3) NOT NULL,
	`email`             VARCHAR(255),
	`active`            BOOLEAN NOT NULL DEFAULT TRUE,

	PRIMARY KEY(`id`)
);";

// Run the SQL statement
if ($conn->query($sql)) echo "Table `Student` created successfully";
else echo "Error creating table: " . $conn->error;

$conn->close();
