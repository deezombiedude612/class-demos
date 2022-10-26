<?php
session_start(); // start the session
?>
<html lang="en">

	<head>
		<title>PHP Simple Sessions</title>
	</head>

	<body>
		<?php
	session_unset(); // remove all session variables
	session_destroy(); // destroy the session
	print_r($_SESSION); // Notice that this prints an empty array
	?>
	</body>

</html>
