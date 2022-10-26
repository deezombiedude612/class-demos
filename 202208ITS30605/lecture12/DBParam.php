<?php
require "DBConnection.php";

// prepare and bind
$stmt = $conn->prepare(
	"INSERT INTO `Staff` (`first_name`, `last_name`, `email`) VALUES (?, ?, ?)"
);
$stmt->bind_param("sss", $firstName, $lastName, $email);

// set params and execute
$firstName = "Jack";
$lastName = "Adams";
$email = "JAdams@gmail.com";
$stmt->execute(); // this executes $stmt

$firstName = "Mary";
$lastName = "Rose";
$email = "MRose@gmail.com";
$stmt->execute();

$firstName = "Michael";
$lastName = "Grimm";
$email = "MGrimm@gmail.com";
$stmt->execute();

echo "New records created successfully";
$stmt->close();

$conn->close();
