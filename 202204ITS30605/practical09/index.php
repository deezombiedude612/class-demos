<?php
session_start();	// this always goes first!!!
require_once "credentials.php";

// flag to indicate whether credentials match (i.e., FALSE) or not (i.e., TRUE)
$invalid_login = false;

if ($_SERVER["REQUEST_METHOD"] == "POST") {
	// check credentials first
	if ($_POST["username"] === $username && $_POST["password"] === $pw) {
		$_SESSION["username"] = $_POST["username"];
	} else {
		$invalid_login = true;
	}

	// var_dump($_POST);
	// var_dump($_SESSION);
	// echo $invalid_login;
}
?>

<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>Login Example</title>

		<link rel="stylesheet" href="css/style.css" />
	</head>

	<body>
		<section id="container">
			<?php
		if (isset($_SESSION["username"])) :
		?>
			<h1>Hello, <?= $_SESSION["username"]; ?>!</h1>

			<p id="time"></p>

			<button id="logout">Log Out</button>
			<?php
		else :
		?>
			<h1>Login Page</h1>

			<form action="." method="post" autocomplete="off">
				<p id="error">
					<?php
					if ($invalid_login) {
						echo "Invalid credentials!";
					}
					?>
				</p>
				<input type="text" name="username" id="username" placeholder="Username" autocomplete="off" /><br />
				<input type="password" name="password" id="password" placeholder="Password" /><br />

				<input type="submit" value="Log In" />
				<input type="reset" value="Reset" />
				<?php
		endif;
			?>

			</form>
		</section>

		<script src="js/index.js"></script>
	</body>

</html>
