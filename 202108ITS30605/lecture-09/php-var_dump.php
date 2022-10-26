<?php
$x = 28;
$str = "Hello World";
$names = ["John", "Mary", "Michael"];

class Person {
	public $name;

	public function __construct($name) {
		$this->name = $name;
	}
	public function doSomething() {
		echo $this->name;
	}
}

$obj = new Person("Jackie");
// var_dump($x, $str, $names, $obj);

// print_r($x);
// echo "<br>";
// print_r($str);
// echo "<br>";
// print_r($names);
// echo "<br>";
// print_r($obj);
