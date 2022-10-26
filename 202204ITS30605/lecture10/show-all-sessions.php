<?php
session_start(); // start the session
?>
<html lang="en">

	<head>
		<title>PHP Simple Sessions</title>
	</head>

	<body>
		<?php
	print_r($sessions); // a more elegant alternative to var_dump()
	?>
	</body>

</html>
