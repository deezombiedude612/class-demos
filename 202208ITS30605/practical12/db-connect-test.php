<?php

$servername = "localhost";
$username = "root";
$password = "";	// password for you should be empty

$conn = new mysqli($servername, $username, $password);
// Check connection; if error occurs, display error message and force exit 

if ($conn->error) {
	die("Connection failed: " . $conn->connect_error);
}
