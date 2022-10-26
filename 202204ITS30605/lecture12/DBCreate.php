<?php

/** You can copy the code from DBConnectTest.php, or you can use the following:
 * NOTE: Ensure that DBConnectionTest.php is in the same directory. Otherwise, apply any 
 * necessary directory prefixes (i.e., .., parent/etc.).
 */
require "DBConnectionTest.php";

$sql = "CREATE DATABASE `myFirstDB`"; // create SQL statement to be executed by MySQL

if ($conn->query($sql) === TRUE) {
	echo "Database created successfully.";
} else {
	echo "Error creating database: " . $conn->error;
	// $conn->error retrieves the latest error message generated from the MySQL server
}

// $conn->query($sql) runs the SQL statement inside $sql, returns TRUE if successful

$conn->close(); // closes the database connection
