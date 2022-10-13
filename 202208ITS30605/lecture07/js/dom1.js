document.addEventListener("DOMContentLoaded", function() {
	// By default, submit button should be disabled
	document.querySelector("#submit").disabled = true;

	document.querySelector("#task").onkeyup = () => {
		// Enable submit button only if text input is not empty
		if (document.querySelector("#task").value.length > 0) {
			document.querySelector("#submit").disabled = false;
		} else {
			document.querySelector("#submit").disabled = true;
		}
	};

	document.querySelector("form").onsubmit = () => {
		const task = document.querySelector("#task").value;
		// console.log(task); // displays entered task value in the console

		// Create an <li> element for each task entered in
		const LI = document.createElement("li");
		LI.innerHTML = task;

		document.querySelector("#tasks").append(LI);

		// Reset the text input value
		document.querySelector("#task").value = "";
		document.querySelector("#submit").disabled = true;

		// Stop form from submitting
		return false;
	};
});
