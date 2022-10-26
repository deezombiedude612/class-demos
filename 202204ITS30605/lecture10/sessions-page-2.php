<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>PHP Sessions 2</title>
	</head>

	<body>
		<?php
	if (isset($_SESSION["fullname"])) {
		echo "\$_SESSION['fullname'] = " . $_SESSION["fullname"] . "<br>";
	}
	if (isset($_SESSION["email"])) {
		echo "\$_SESSION['email'] = " . $_SESSION["email"] . "<br>";
	}
	?>
		<a href="sessions-page-1.php">Go back to Page 1</a><br>
		<a href="sessions-page-3.php">Go to Page 3 (Destroy Session)</a>
	</body>

</html>
