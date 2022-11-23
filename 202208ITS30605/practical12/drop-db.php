<?php
require "db-connect-test.php";

$sql = "DROP DATABASE IF EXISTS `exercise_db`"; // create SQL statement to be executed by MySQL

if ($conn->query($sql) === TRUE) {
	echo "Database dropped successfully.";
} else {
	echo "Error dropping database: " . $conn->error;
	// $conn->error retrieves the latest error message generated from the MySQL server
}
// $conn->query($sql) runs the SQL statement inside $sql, returns TRUE if successful 

$conn->close(); // closes the database connection
