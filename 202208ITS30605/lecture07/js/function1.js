function calculateArea() {
	const LENGTH = document.querySelector("input").value;

	const AREA = LENGTH * LENGTH;

	document.getElementById("result").innerHTML = `Area of square with length ${LENGTH} units is ${AREA} sq. units.`;
}
