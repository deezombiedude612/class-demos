<?php
if (!isset($_GET["id"])) header("Location: index.php");

require "db-connect.php";

$id = $_GET["id"];
$sql = "DELETE FROM `Student` WHERE `id` = " . $id;

// echo $sql;

// Run the SQL statement
if ($conn->query($sql)) {
	echo "Deleted record with ID " . $id . " successfully";

	// Redirect to index.php after successful update
	header("Location: index.php");
} else echo "Error deleting record " . $id . ": " . $conn->error;
