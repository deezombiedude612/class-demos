<?php

$nan = acos(8);	// cos^-1, accepts numbers between -1 and 1 (inclusive)
// echo is_nan($nan);	// prints out 1 (TRUE)

var_dump($nan, is_nan($nan));
