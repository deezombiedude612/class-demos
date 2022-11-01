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

		if ($_POST["cupcakeqty"] === "" && $_POST["puffqty"] === "" && $_POST["muffinqty"] === "") :
			// Display message if nothing has been ordered
	?>
		<p>You did not order anything from the previous page!</p>
		<?php
		else :
			$qty = array();
			if ($_POST["cupcakeqty"] !== "") $qty["cupcake"] = (int)($_POST["cupcakeqty"]); // cupcake quantity
			if ($_POST["puffqty"] !== "") $qty["puff"] = (int)($_POST["puffqty"]);  // puff quantity
			if ($_POST["muffinqty"] !== "") $qty["muffin"] = (int)($_POST["muffinqty"]); // muffin quantity

			// var_dump($qty);
		?>
		<p class="font-bold">Your order is as follows:</p>

		<p>
			<?php
				if (isset($qty["cupcake"])) {
				?>
			<?= $qty["cupcake"]; ?> cupcakes<br>
			<?php
				}
				?>
			<?= $qty["puff"]; ?> puffs<br>
			<?= $qty["muffin"]; ?> muffins
		</p>

		<p>
			Items Ordered: <?= sizeof($qty); ?><br>
			<?php
				$price = ["cupcake" => 2.50, "puff" => 3, "muffin" => 4];
				$subtotal = $qty["cupcake"] * $price["cupcake"] + $qty["puff"] * $price["puff"] + $qty["muffin"] * $price["muffin"];
				$total = $subtotal * 1.06;

				if ($qty["cupcake"] >= 100) {
					// apply 20% discount
					$total *= 0.8;
				} elseif ($qty["cupcake"] >= 50) {
					// apply 10% discount
					$total *= 0.9;
				} elseif ($qty["cupcake"] >= 10) {
					// apply 5% discount
					$total *= 0.95;
				}
				?>

			Subtotal: $<?= number_format($subtotal, 2); ?><br>
			Total including tax: $<?= number_format($total, 2); ?><br>
		</p>

		<p>How you found Wendy's: <br>
			<?php
				// var_dump($_POST);

				switch ($_POST["find"]) {
					case "a":
						echo "I am a regular customer.";
						break;

					case "b":
						echo "TV Advertising";
						break;

					case "c":
						echo "Phone Directory";
						break;

					case "d":
						echo "Word of Mouth";
						break;

					default:
				}
				?>
		</p>

		<table id="freight-table">
			<thead>
				<tr>
					<th>Distance</th>
					<th>Cost</th>
				</tr>
			</thead>
			<tbody>
				<?php
					$freight = [
						["distance" => 50, "cost" => 5],
						["distance" => 100, "cost" => 10],
						["distance" => 150, "cost" => 15],
						["distance" => 200, "cost" => 20],
						["distance" => 250, "cost" => 25],
					];
					// var_dump($freight);
					foreach ($freight as $f) {
					?>
				<tr>
					<td><?= $f["distance"]; ?></td>
					<td><?= $f["cost"]; ?></td>
				</tr>
				<?php
					}
					?>
			</tbody>
		</table>

		<?php
		endif;
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
						<p><label for="find">How did you find Wendy's?</label></p>
						<select name="find" id="find">
							<option disabled selected>Select option</option>
							<option value="a">I am a regular customer.</option>
							<option value="b">TV Advertising</option>
							<option value="c">Phone Directory</option>
							<option value="d">Word of Mouth</option>
						</select>
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
