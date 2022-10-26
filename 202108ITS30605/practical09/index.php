<?php
session_start();
require_once "credentials.php";

$invalid_login = false;

if ($_SERVER["REQUEST_METHOD"] == "POST") {
	// check credentials first
	if ($_POST["username"] === $username && $_POST["password"] === $pw) {
		$_SESSION["username"] = $_POST["username"];
		// $_SESSION["pw"] = $_POST["pw"];
	} else $invalid_login = true;
}

// var_dump($_SESSION);
?>

<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Login Example</title>

		<link rel="stylesheet" href="css/style.css">
	</head>

	<body>
		<section id="container">
			<?php
		if (isset($_SESSION["username"])) :
		?>
			<h1>Hello, <?= $_SESSION["username"]; ?>!</h1>

			<p id="time"></p>
			<?php var_dump($_SESSION); ?>

			<button id="logout">Log Out</button>
			<?php
		else : ?>
			<h1>Login Page</h1>

			<form action="." method="post">
				<p id="error">
					<?php
					if ($invalid_login) :
					?>
					Invalid credentials!
					<?php
					endif;
					?>
				</p>
				<input type="text" name="username" id="username" placeholder="Username"><br>
				<input type="password" name="password" id="password" placeholder="Password"><br>

				<input type="submit" value="Log In">
				<input type="reset" value="Reset">
			</form>
			<?php
		endif;
		?>
		</section>

		<script src="js/index.js"></script>
	</body>

</html>
