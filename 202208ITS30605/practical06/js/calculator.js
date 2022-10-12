function multiply() {
	const NUM_A = parseFloat(document.querySelector("#num_A").value);
	const NUM_B = parseFloat(document.querySelector("#num_B").value);

	const RESULT = NUM_A * NUM_B;
	document.querySelector("#num_C").value = RESULT;
}

function divide() {
	const NUM_A = parseFloat(document.querySelector("#num_A").value);
	const NUM_B = parseFloat(document.querySelector("#num_B").value);

	const RESULT = NUM_A / NUM_B;
	document.querySelector("#num_C").value = RESULT;
}

function modulo() {
	const NUM_A = parseFloat(document.querySelector("#num_A").value);
	const NUM_B = parseFloat(document.querySelector("#num_B").value);

	const RESULT = NUM_A % NUM_B;
	document.querySelector("#num_C").value = RESULT;
}
function exp() {
	const NUM_A = parseFloat(document.querySelector("#num_A").value);
	const NUM_B = parseFloat(document.querySelector("#num_B").value);

	const RESULT = Math.pow(NUM_A, NUM_B);
	document.querySelector("#num_C").value = RESULT;
}
