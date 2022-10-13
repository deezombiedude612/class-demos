function calculateArea(length) {
	const AREA = length * length;

	return AREA;
}

function getMessage() {
	const LENGTH = document.querySelector("input").value;

	// target p#result to print out the area
	document.querySelector("#result").innerHTML = `Area of square with length ${LENGTH} units is ${calculateArea(
		LENGTH
	)} sq. units.`;
}
