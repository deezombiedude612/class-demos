<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>Wendy's Bakery - Order Form</title>

		<style>
		.font-bold {
			font-weight: bold;
		}

		th {
			background-color: #cccccc;
		}

		th,
		td {
			padding: 0.5rem 1.5rem;
		}

		form td {
			text-align: center;
		}

		#freight-table tbody td {
			text-align: right;
		}

		#order-details {
			margin-bottom: 1rem;
		}

		</style>
	</head>

	<body>
		<h1>Wendy's Bakery</h1>
		<h2>Order Results</h2>

		<?php
	if ($_SERVER['REQUEST_METHOD'] == 'POST') {
		// If a form with POST superglobal variable is sent, display this message
		echo "<p>Order processed on " . date("F jS Y, l, H:i:s") . "</p>";

	?>
		<p class="font-bold">Your order is as follows:</p>

		<p>
			20 cupcakes<br>
			10 puffs<br>
			15 muffins
		</p>

		<p>
			Items Ordered: 3<br>
			Subtotal: $140.00<br>
			Total including tax: $148.40<br>
		</p>
		<?php
	} else {
		/**
		 * NOTE:
		 * You can break through to HTML in the middle of a PHP block,
		 * especially if you have a lot of HTML elements to display under
		 * set conditions.
		 */
	?>
		<form action="process-order.php" method="post">
			<table>
				<tr>
					<th>Item</th>
					<th>Quantity</th>
				</tr>
				<tr>
					<td>Cupcakes</td>
					<td>
						<input type="text" name="cupcakeqty" size="3" maxlength="3" />
					</td>
				</tr>
				<tr>
					<td>Puffs</td>
					<td>
						<input type="text" name="puffqty" size="3" maxlength="3" />
					</td>
				</tr>
				<tr>
					<td>Muffins</td>
					<td>
						<input type="text" name="muffinqty" size="3" maxlength="3" />
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Submit Order" />
					</td>
				</tr>
			</table>
		</form>
		<?php
	}
	?>
	</body>

</html>
