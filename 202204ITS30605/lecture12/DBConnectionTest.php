<?php
/* This file will test if a connection to the MySQL server can be established. */

// To establish a connection to MySQL, you need these three values
$servername = "localhost"; // or 127.0.0.1
$username = "root";
$password = ""; // typically in real-life you would want a password

$conn = new mysqli($servername, $username, $password);

// Check connection; if error occurs, display error message and force exit
if ($conn->connect_error) {
	die("Connection failed: " . $conn->connect_error);
}

echo "Successfully connected to database.";
