<?php
session_start(); // start the session
?>
<html lang="en">

	<head>
		<title>PHP Simple Sessions</title>
	</head>

	<body>
		<?php
	// echo session variables that were set on previous page
	echo "Student name is " . $_SESSION["StudentName"] . "<br>";
	echo "Age is " . $_SESSION["Age"] . ".";
	?>
	</body>

</html>
