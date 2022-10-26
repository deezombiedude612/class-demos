<?php
require "DBConnection.php";

$sql = "INSERT INTO `Staff` (`first_name`, `last_name`, `email`) VALUES
('John', 'Smith', 'JSmith@gmail.com');";

// Run the SQL statement
if ($conn->query($sql)) echo "Inserted new record successfully";
else echo "Error inserting record: " . $conn->error;

$conn->close();
