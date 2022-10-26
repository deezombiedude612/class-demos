<?php session_start(); ?>
<html lang="en">

	<head>
		<title>PHP Sessions 1</title>

		<style>
		input {
			margin-bottom: 1rem;
		}

		</style>
	</head>

	<body>
		<form method="post" action="sessions-page-1.php">
			Full Name: <input type="text" name="fullname"></br>
			Email Address: <input type="text" name="email"></br>
			<input type="submit">
		</form>

		<?php
	if ($_SERVER['REQUEST_METHOD'] == "POST") {
		$_SESSION["fullname"] = $_POST["fullname"];
		$_SESSION["email"] = $_POST["email"];
		echo "Two session variables, fullname and email are set.<br>";
	} else echo "No variables set yet";
	?>
		<a href="sessions-page-2.php">Go to Page 2</a>
	</body>

</html>
