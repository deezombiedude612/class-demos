<?php

$data = [1, 1., NULL, new stdClass, 'foo'];

/**
 * $data is the array to be iterated over
 * $value will contain each value in $data while carrying out iterations
 */
foreach ($data as $value) {
	echo gettype($value), "<br>";
}
