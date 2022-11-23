<?php

require "db-connect.php";

// var_dump($_POST);

$id = $_POST["id"];
$first_name = $_POST["first_name"];
$last_name = $_POST["last_name"];
$age = $_POST["age"];
$email = $_POST["email"];
$active = $_POST["active"];

if ($age <= 0) {
	echo "<script>
	alert('Invalid age, must be positive!');
	window.location.href = 'update-student.php?id=" . $id . "';
	</script>";
} else {
	$sql = "UPDATE `Student` SET 
	`first_name` = '" . $first_name . "',
	`last_name` = '" . $last_name . "',
	`age` = " . $age . ",
	`email` = '" . $email . "',
	`active` = " . $active . "
	WHERE `id` = " . $id;

	// echo $sql;

	// Run the SQL statement
	if ($conn->query($sql)) {
		echo "Updated record with ID " . $id . " successfully";

		// Redirect to index.php after successful update
		header("Location: index.php");
	} else echo "Error updating record " . $id . ": " . $conn->error;
}
