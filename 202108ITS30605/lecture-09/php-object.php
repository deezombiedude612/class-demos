<?php
class Person {
	// properties
	private $fName;
	private $lName;
	private $age;

	// methods
	public function __construct($fName, $lName, $age) {
		$this->fName = $fName;
		$this->lName = $lName;
		$this->age = $age;
	}

	public function set_fName($fName) {
		$this->fName = $fName;
	}
	public function set_lName($lName) {
		$this->lName = $lName;
	}
	public function get_fName() {
		return $this->fName;
	}
	public function get_lName() {
		return $this->lName;
	}

	public function introduce() {
		echo "This person's name is " . $this->fName;
		echo "<br>This person's age is " . $this->age;
	}
}

$obj = new Person("Mike", "Rallison", 32);
$obj->introduce();
