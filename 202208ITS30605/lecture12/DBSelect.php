<?php
require "DBConnection.php";

// Place SELECT statement
$sql = "SELECT `id`, `first_name`, `last_name` FROM `Staff`;";

// instead of placing it straight into the if statement, we place the query result into a separate variable
$result = $conn->query($sql);

/**
 * First, check to see if database selection query is successful.
 * $result will contain query results if successful and FALSE value otherwise
 */
if ($result) { // if there are query results
	if ($result->num_rows > 0) { // $result->num_rows returns the number of row results
		// output data of each row
		while ($row = $result->fetch_assoc()) {
			echo "id: " . $row['id'] . " – Name: " . $row['first_name'] . " "
				. $row['last_name'] . "<br>";
		}
	} else echo "No data found."; // $result->num_rows = 0 (no rows of results are retrieved)
} else echo "Error retrieving results: " . $conn->error; // database selection query not successful
