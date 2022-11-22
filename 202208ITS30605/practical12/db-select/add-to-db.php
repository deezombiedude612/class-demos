<?php

require "db-connect.php";

// var_dump($_POST);

$first_name = $_POST["first_name"];
$last_name = $_POST["last_name"];
$age = $_POST["age"];
$email = $_POST["email"];
$active = $_POST["active"];

$sql = "INSERT INTO `Student` (`first_name`, `last_name`, `age`, `email`, `active`) VALUES
('" . $first_name . "', '" . $last_name . "', " . $age . ", '" . $email . "', " . $active . ");";

echo $sql;

// Run the SQL statement
if ($conn->query($sql)) {
	echo "Inserted new record successfully";

	// Redirect to index.php after successful entry
	header("Location: index.php");
} else echo "Error inserting record: " . $conn->error;
