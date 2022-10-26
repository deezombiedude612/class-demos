<?php

$x = 28;
$str = "Hello World";
$name = ["John", "Mary", "Michael"];

class Person {
	public $name;

	public function __construct($name) {
		$this->name = $name;
	}
	public function doSomething() {
		echo $this->name;
	}
}

$obj1 = new Person("Jackie");
$obj2 = new Person("Kendra");

// var_dump($x, $str);
// var_dump($name);
var_dump($obj1);
var_dump($obj2);
