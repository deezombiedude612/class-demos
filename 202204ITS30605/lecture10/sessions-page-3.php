<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>PHP Sessions 3</title>
	</head>

	<body>
		<?php
	session_unset();
	echo "All SESSION variables have been removed.<br>";
	session_destroy();
	echo "SESSION has been destroyed.<br>";
	?>
		<a href="sessions-page-1.php">Go back to Page 1</a><br>
		<a href="sessions-page-2.php">Go back to Page 2</a>
	</body>

</html>
