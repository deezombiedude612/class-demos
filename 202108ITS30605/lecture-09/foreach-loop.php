<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>foreach Loop</title>
	</head>

	<body>
		<?php
	$colors = ["red", "green", "blue", "yellow"];

	foreach ($colors as $value) {
		/**
		 * You can break through the PHP block especially if you have lots of HTML elements to print (based on conditions, for example)
		 * <?=  ?> can only be used to print values, nothing else
		*/
		?>
		<div style="text-align: center; padding: 10px; background-color: <?= $value; ?>;">
			<?php echo $value; ?>
		</div>
		<?php
	}
	?>
	</body>

</html>
