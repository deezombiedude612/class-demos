<?php
require "db-connect.php";
?>

<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Student Records</title>

		<style>
		table {
			border-collapse: collapse;
		}

		th,
		td {
			border: 1px solid black;
			padding: 5px;
		}

		</style>
	</head>

	<body>
		<h1>Student Records</h1>

		<?php
	$sql = "SELECT * FROM `Student`";
	$result = $conn->query($sql);

	if ($result) {	// check to see if query was successful
		if ($result->num_rows > 0) {	// $result->num_rows returns the number of row results
	?>
		<table>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Email</th>
				<th>Active</th>
			</tr>
			<?php
				while ($row = $result->fetch_assoc()) {
				?>
			<tr>
				<td><?= $row["id"]; ?></td>
				<td><?= $row["first_name"]; ?></td>
				<td><?= $row["last_name"]; ?></td>
				<td><?= $row["age"]; ?></td>
				<td><?= $row["email"]; ?></td>
				<td><?= $row["active"]; ?></td>
			</tr>
			<?php
				}
				?>
		</table>
		<?php
		} else echo "No data found.";				// $result->num_rows = 0 (no rows of results are retrieved)
	} else echo "Error retrieving results: " . $conn->error; // database selection query not successful
	?>
	</body>

</html>
