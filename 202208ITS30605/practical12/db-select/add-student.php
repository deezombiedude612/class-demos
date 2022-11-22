<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Add Student</title>
	</head>

	<body>
		<h1>Add Student</h1>

		<form action="add-to-db.php" method="post">
			<p>
				First Name
				<input type="text" name="first_name" id="first_name" required>
			</p>
			<p>
				Last Name
				<input type="text" name="last_name" id="last_name" required>
			</p>
			<p>
				Age
				<input type="number" name="age" id="age" required>
			</p>
			<p>
				Email
				<input type="email" name="email" id="email" required>
			</p>
			<p>
				Active?
				<input type="radio" name="active" value="1" id="active-yes" checked> Yes
				<input type="radio" name="active" value="0" id="active-no"> No
			</p>

			<p>
				<input type="submit" value="Submit">
				<input type="reset" value="Reset">
			</p>
		</form>
	</body>

</html>
