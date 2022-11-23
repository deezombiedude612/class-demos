<?php
if (!isset($_GET["id"])) header("Location: index.php");

require "db-connect.php";

$sql = "SELECT * FROM `Student` WHERE `id` = " . $_GET["id"];
$result = $conn->query($sql);

?>

<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Update Student</title>
	</head>

	<body>
		<h1>Update Student</h1>

		<?php
	if ($result) {
		if ($result->num_rows > 0) {
			$row = $result->fetch_assoc();
	?>

		<form action="update-db.php" method="post">
			<input type="hidden" name="id" value="<?= $row["id"]; ?>">

			<p>Updating Student with ID: <?= $row["id"]; ?></p>

			<p>
				First Name
				<input type="text" name="first_name" id="first_name" value="<?= $row["first_name"]; ?>" required>
			</p>
			<p>
				Last Name
				<input type="text" name="last_name" id="last_name" value="<?= $row["last_name"]; ?>" required>
			</p>
			<p>
				Age
				<input type="number" name="age" id="age" value="<?= $row["age"]; ?>" required>
			</p>
			<p>
				Email
				<input type="email" name="email" id="email" value="<?= $row["email"]; ?>" required>
			</p>
			<p>
				Active?
				<input type="radio" name="active" value="1" id="active-yes" <?= ($row["active"] == 1) ? " checked" : ""; ?>> Yes
				<input type="radio" name="active" value="0" id="active-no" <?= ($row["active"] == 0) ? " checked" : ""; ?>> No
			</p>

			<p>
				<input type="submit" value="Submit">
				<input type="reset" value="Reset">
			</p>
		</form>
		<?php
		} else echo "No data found.";				// $result->num_rows = 0 (no rows of results are retrieved)
	} else echo "Error retrieving results: " . $conn->error; // database selection query not successful 
	?>
	</body>

</html>
