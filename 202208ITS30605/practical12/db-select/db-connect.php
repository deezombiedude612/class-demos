<?php

$servername = "localhost";
$username = "root";
$password = "";	// password for you should be empty
$dbName = "exercise_db"; // database name here, fourth value required

$conn = new mysqli($servername, $username, $password, $dbName);

// Check connection; if error occurs, display error message and force exit 
if ($conn->error) {
	die("Connection failed: " . $conn->connect_error);
}
