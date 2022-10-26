<?php
require "DBConnection.php";

$id = 1; // let's assume we want to delete a row where the ID value is 1
$sql = "DELETE FROM `Staff` WHERE `id` = " . $id . ";";
$result = $conn->query($sql); // not compulsory here, but it's a good practice

// Run the SQL statement
if ($result) echo "Successfully deleted record with ID: " . $id;
else echo "Error deleting record with ID " . $id . ": " . $conn->error;

$conn->close();
