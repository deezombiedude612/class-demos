function fizzBuzz(input) {
	if (typeof input !== "number") {
		return "Not a number";
	}
	if (input % 3 == 0 && input % 5 == 0) {
		return "FizzBuzz";
	}
	if (input % 3 == 0) {
		return "Fizz";
	}
	if (input % 5 == 0) {
		return "Buzz";
	}

	return input;
}

const number = "31"; // edit this constant value to test fizzBuzz()
document.getElementById("result").innerHTML = fizzBuzz(number);
