<?php
/* copy PHP code from db-connect.php, or include it as follows: */
require "db-connect.php"; 	// db-connect.php is treated like an attachment

$sql = "DROP TABLE IF EXISTS `Student`;";

// Run the SQL statement
if ($conn->query($sql)) echo "Table `Student` dropped successfully";
else echo "Error dropping table: " . $conn->error;

$conn->close();
