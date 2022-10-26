<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>PHP GET Handler</title>

	<style>
		table {
			border-collapse: collapse;
			width: 200px;
		}

		tr,
		td {
			border: 1px solid black;
		}
	</style>
</head>

<body>
	<table>
		<tr>
			<td>Field</td>
			<td>Value</td>
		</tr>
		<?php if (isset($_GET["name"])) : ?>
			<tr>
				<td>Name</td>
				<td><?= $_GET["name"]; ?></td>
			</tr>
		<?php endif;
		/**
		 * NOTE:
		 * This is an alternative way of implementing if-else statements if you wish to display
		 * a large number of HTML elements for any condition imposed.
		 */
		if (isset($_GET['age'])) : ?>
			<tr>
				<td>Age</td>
				<td><?= $_GET['age']; ?></td>
			</tr>
		<?php
		endif;
		?>
	</table>
</body>

</html>