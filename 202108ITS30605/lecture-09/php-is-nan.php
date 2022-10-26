<?php
// Invalid calculation
$nan = acos(8);
echo $nan . "<br>";
var_dump($nan, is_nan($nan));
