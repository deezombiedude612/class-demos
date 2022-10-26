<?php
require "DBConnection.php";

// Insert records into Staff table
$sql = "INSERT INTO Staff (`first_name`, `last_name`, `email`)
VALUES ('Jack', 'Adams', 'JAdams@gmail.com');";
$sql .= "INSERT INTO Staff (`first_name`, `last_name`, `email`)
VALUES ('Mary', 'Jane', 'MJane@gmail.com');";
$sql .= "INSERT INTO Staff (`first_name`, `last_name`, `email`)
VALUES ('Vanessa', 'Lockwood', 'VLockwood@gmail.com');";

// run the SQL statement
if ($conn->query($sql)) echo "New multiple records created successfully";
else echo "Error inserting record(s): " . $conn->error;

$conn->close();
