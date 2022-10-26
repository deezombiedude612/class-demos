<?php
class Person {
	// properties
	private $name;
	private $age;

	// methods/functions
	public function __construct($name, $age) {
		$this->name = $name;
		$this->age = $age;
	}

	public function set_name($name) {
		$this->name = $name;
	}
	public function get_name($name) {
		return $this->name;
	}

	public function set_age($age) {
		$this->$age = $age;
	}
	public function get_age($age) {
		return $this->age;
	}

	public function introduce() {
		echo "This person's name is " . $this->name;
		echo "<br>This person's age is " . $this->age;
	}
}

// Create a new Person object from the class
$obj = new Person("Mike Rallison", 32);

$obj->introduce();	// invoke introduce()
