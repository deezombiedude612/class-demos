<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>PHP foreach Loop</title>

		<?php
	$x = 12;
	$body_class;

	if ($x > 10) {
		$body_class = "class1";
	} else {
		$body_class = "class2";
	}
	?>
	</head>

	<body class="<?= $body_class; ?>">
		<?php
	$colors = ["red", "green", "blue", "yellow"];

	foreach ($colors as $value) {
		echo
		"<div style='text-align: center; padding: 10px; background-color: $value;'>" .
			$value .
			"</div>";
	}
	?>
	</body>

</html>
