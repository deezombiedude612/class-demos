<?php
date_default_timezone_set('Asia/Kuala_Lumpur');	// set time zone to Malaysia

$hour = date("H");	// return hour in 24-hour format with leading zero
$timeNow = date("g:ia");
$dateNow = date("Y/M/D");

if ($hour < 4 || $hour > 19) {
	echo "It's night time!";
} elseif ($hour < 12) {
	echo "Good morning!";
} elseif ($hour < 15) {
	echo "Good afternoon!";
} else {
	echo "Good evening!";
}

echo "<p>The time now is " . $timeNow . ", " . $dateNow . "</p>";
