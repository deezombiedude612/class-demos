<?php

$data = [1, 1., NULL, new stdClass, 'foo'];

foreach ($data as $value) {
	echo gettype($value), "\n";
}
