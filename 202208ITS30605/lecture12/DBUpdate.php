<?php
require "DBConnection.php";

$id = 2; // let's assume we want to delete a row where the ID value is 1
$sql = "UPDATE `Staff`
SET `first_name` = 'John',
`last_name` = 'Dillon'
WHERE `id` = " . $id . ";";

$result = $conn->query($sql); // not compulsory here, but it's a good practice

// Run the SQL statement
if ($result) echo "Successfully updated record with ID: " . $id;
else echo "Error updating record with ID " . $id . ": " . $conn->error;

$conn->close();
