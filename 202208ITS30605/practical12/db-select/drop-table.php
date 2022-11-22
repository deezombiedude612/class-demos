<?php
/* copy PHP code from DBConnection.php, or include it as follows: */
require "DBConnection.php"; 	//DBConnection.phpistreatedlikeanattachment

$sql = "DROP TABLE IF EXISTS `Student`;";

// Run the SQL statement
if ($conn->query($sql)) echo "Table `Student` dropped successfully";
else echo "Error dropping table: " . $conn->error;

$conn->close();
