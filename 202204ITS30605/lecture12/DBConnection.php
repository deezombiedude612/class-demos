<?php

/** You can copy the code from DBConnectTest.php, or you can use the following:
 * NOTE: Ensure that DBConnectionTest.php is in the same directory. Otherwise, apply any 
 * necessary directory prefixes (i.e., .., parent/etc.).
 */
$servername = "localhost";
$username = "root";
$password = "";
$dbName = "myFirstDB"; // database name here, fourth value required

$conn = new mysqli($servername, $username, $password, $dbName);

// Check connection; if error occurs, display error message and force exit
if ($conn->connector_error) {
	die("Connection failed: " . $conn->connect_error);
}

// only print this if you want to test if connection to database works
echo "Successfully connected to database.";
