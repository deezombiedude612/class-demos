<?php
/* copy PHP code from DBConnection.php, or include it as follows: */
require "DBConnection.php"; // DBConnection.php is treated like an attachment

$sql = "CREATE TABLE `Staff` (
`id` INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
`first_name` VARCHAR(50) NOT NULL,
`last_name` VARCHAR(50) NOT NULL,
`email` VARCHAR(30),
`reg_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);";

// Run the SQL statement
if ($conn->query($sql)) echo "Table `Staff` created successfully";
else echo "Error creating table: " . $conn->error;

$conn->close();
