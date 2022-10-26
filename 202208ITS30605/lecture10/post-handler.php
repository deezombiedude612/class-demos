<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>PHP POST Handler</title>
		<link rel="stylesheet" href="post-handler.css">
	</head>

	<body>
		<?php if ($_SERVER["REQUEST_METHOD"] == "POST") : ?>
		<table>
			<tr>
				<th>Field</th>
				<th>Value</th>
			</tr>
			<tr>
				<td>Name</td>
				<td><?= $_POST["fullname"]; ?></td>
			</tr>
			<tr>
				<td>E-mail</td>
				<td><?= $_POST["email"]; ?></td>
			</tr>
		</table>
		<?php else : ?>
		<form action="post-handler.php" method="post">
			<input type="text" name="fullname" id="fullname" placeholder="Full Name"><br>
			<input type="email" name="email" id="email" placeholder="E-mail"><br><br>

			<input type="submit">
		</form>
		<?php endif; ?>
	</body>

</html>
