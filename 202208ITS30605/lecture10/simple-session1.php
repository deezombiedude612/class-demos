<?php
session_start(); // start the session
?>
<html lang="en">

	<head>
		<title>PHP Simple Sessions</title>
	</head>

	<body>
		<?php
	// set session variables
	$_SESSION["StudentName"] = "Mike";
	$_SESSION["Age"] = 7;
	echo "Session variables are set.";
	?>
	</body>

</html>
