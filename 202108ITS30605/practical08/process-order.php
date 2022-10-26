<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Wendy's Bakery - Order Form</title>

		<style>
		.font-bold {
			font-weight: bold;
		}

		thead tr {
			/* table tr:first-of-type { */
			background-color: #cccccc;
		}

		th,
		td {
			padding: .5rem 1.5rem;
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
	?>
		<p>Order processed on <?= date("F jS Y, l, H:i:s"); ?></p>

		<?php
		var_dump($_POST);
		// print_r($_POST);
		if ($_POST["cupcakeqty"] === "" && $_POST["puffqty"] === "" && $_POST["muffinqty"] === "") :
		?>
		<p>You did not order anything from the previous page!</p>
		<?php
		else :
			$qty = array();
			if ($_POST["cupcakeqty"] !== "") $qty["cupcake"] = (int)($_POST["cupcakeqty"]);
			if ($_POST["puffqty"] !== "") $qty["puff"] = (int)($_POST["puffqty"]);
			if ($_POST["muffinqty"] !== "") $qty["muffin"] = (int)($_POST["muffinqty"]);
		?>
		<section id="order-details">
			<p class="font-bold">Your order is as follows:</p>

			<p>
				<?php
					if (isset($qty["cupcake"])) {
					?>
				<?= $qty["cupcake"] ?> cupcakes<br>
				<?php
					}

					if (isset($qty["puff"])) {
					?>
				<?= $qty["puff"]; ?> puffs<br>
				<?php
					}

					if (isset($qty["muffin"])) {
					?>
				<?= $qty["muffin"]; ?> muffins<br>
				<?php
					}
					?>
			</p>

			<p>
				Items Ordered: <?= sizeof($qty); ?><br>
				<?php
					$price = ["cupcake" => 2.50, "puff" => 3, "muffin" => 4];
					$subtotal = 0;

					if (isset($qty["cupcake"]))
						$subtotal = $qty["cupcake"] * $price["cupcake"];
					if (isset($qty["puff"]))
						$subtotal += ($qty["puff"] * $price["puff"]);
					if (isset($qty["muffin"]))
						$subtotal += ($qty["muffin"] * $price["muffin"]);

					// $subtotal = $qty["cupcake"] * $price["cupcake"] + $qty["puff"] * $price["puff"] + $qty["muffin"] * $price["muffin"];
					$total = $subtotal * 1.06;
					?>
				Subtotal: $<?= number_format($subtotal, 2); ?><br>
				Total including tax: $<?= number_format($total, 2); ?><br>
				<?php
					if ($qty["cupcake"] >= 10) {
						if ($qty["cupcake"] >= 100) {
							$total *= .8;
						} elseif ($qty["cupcake"] >= 50) {
							$total *= .9;
						} else {
							$total *= .95;
						}

						echo "Total including tax after discount: $" . number_format($total, 2);
					}
					?>

				<br>
				How they found Wendy's:
				<?php
					if (isset($_POST["find"])) {
						switch ($_POST["find"]) {
							case "a":
								echo "Just a regular customer.";
								break;

							case "b":
								echo "TV Advertising";
								break;

							case "c":
							case "d":
							default:
						}
					}
					?>
			</p>
		</section>

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
		?>
		<?php
	} else {
	?>
		<form action="process-order.php" method="post">
			<table>
				<thead>
					<tr>
						<th>Item</th>
						<th>Quantity</th>
					</tr>
				</thead>
				<tbody>
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
				</tbody>
			</table>
		</form>
		<?php
	}
	?>

	</body>

</html>
