<?php
$forbidden = true;
$heading = "My First PHP Page";
$students = ["Mamat", "Minah", "Joyah", "Adam"];
$ids = ["101A", "102B", "103C", "201F"];
?>

<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>My PHP Page</title>

		<style>
		table,
		th,
		td {
			border: 1px solid black;
		}

		table {
			border-collapse: collapse;
		}

		th,
		td {
			padding: 5px;
		}

		</style>
	</head>

	<body>
		<?php if ($forbidden == false) { ?>
		<h1><?= $heading; ?></h1>
		<table>
			<thead>
				<tr>
					<th>No.</th>
					<th>Name</th>
					<th>Class</th>
				</tr>
			</thead>
			<tbody>
				<?php for ($i = 0; $i < sizeof($students); $i++) { ?>
				<tr>
					<th><?= $i + 1; ?></th>
					<td><?= $students[$i]; ?></td>
					<td><?= $ids[$i]; ?></td>
				</tr>
				<?php } ?>
			</tbody>
		</table>
		<?php } else { ?>
		<h1>You are unauthorized to view the data on this page.</h1>
		<?php } ?>
	</body>

</html>
