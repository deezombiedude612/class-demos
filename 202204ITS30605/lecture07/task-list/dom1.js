document.addEventListener("DOMContentLoaded", function() {
	// By default, submit and clear buttons should be disabled
	document.querySelector("#submit").disabled = true;
	document.querySelector("#btn-clearLast").disabled = true;
	document.querySelector("#btn-clearFirst").disabled = true;

	/**
	 * Activates submit button depending on whether text has been
	 * entered into input#task.
	 */
	document.querySelector("#task").onkeyup = () => {
		const TASK_INPUT = document.querySelector("#task");
		const SUBMIT_BUTTON = document.querySelector("#submit");

		// Enable submit button only if text input value is not empty
		if (TASK_INPUT.value.length > 0) {
			SUBMIT_BUTTON.disabled = false;
		} else {
			SUBMIT_BUTTON.disabled = true;
		}
	};

	/**
	 * Function that adds a new <li> element to ul#tasks based on what
	 * has been entered into input#task.
	 *
	 * This uses a special programming trick called a lambda expression.
	 * To put simply, this is a programming shortcut that requires less
	 * code to be typed in.
	 */
	document.querySelector("form").onsubmit = () => {
		const TASK = document.querySelector("#task").value; // retrieves entered task value
		// console.log(TASK); // display entered task value in the console

		// create an <li> element for each task entered in
		const LI = document.createElement("li");
		LI.innerHTML = TASK;

		document.querySelector("#tasks").append(LI);

		// reset the text input value
		document.querySelector("#task").value = "";
		document.querySelector("#submit").disabled = true;

		// item added, activate #btn-clearLast and #btn-clearFirst
		document.querySelector("#btn-clearLast").disabled = false;
		document.querySelector("#btn-clearFirst").disabled = false;

		// Stop form from submitting
		return false;
	};

	/**
	 * Removes last <li> element from ul#task.
	 * Disables input#btn-clearLast if ul#task ends up being empty.
	 */
	document.querySelector("#btn-clearLast").onclick = () => {
		// retrieve <ul> element
		const UL_TASKS = document.querySelector("ul#tasks");

		/**
		 * Check to see if <ul> has any child elements (expecting <li> only)
		 * before deleting the last one.
		 * UL_TASKS.childNodes produces an array of all the child elements.
		 * If there are no child elements (i.e., no <li> elements)
		 * then there's nothing in this array => array size is 0.
		 */
		if (UL_TASKS.childNodes.length > 0) {
			UL_TASKS.removeChild(UL_TASKS.lastElementChild);
		} else {
			alert("Nothing to remove!");
		}

		// If after deletion, ul#tasks is empty, disable #btn-clearLast
		if (!UL_TASKS.hasChildNodes()) {
			document.querySelector("#btn-clearFirst").disabled = true;
			document.querySelector("#btn-clearLast").disabled = true;
		}
	};

	/**
	 * Removes last <li> element from ul#task.
	 * Disables input#btn-clearLast if ul#task ends up being empty.
	 */
	document.querySelector("#btn-clearFirst").onclick = () => {
		// retrieve <ul> element
		const UL_TASKS = document.querySelector("ul#tasks");

		/**
		 * Check to see if <ul> has any child elements (expecting <li> only)
		 * before deleting the first one.
		 * UL_TASKS.childNodes produces an array of all the child elements.
		 * If there are no child elements (i.e., no <li> elements)
		 * then there's nothing in this array => array size is 0.
		 */
		if (UL_TASKS.childNodes.length > 0) {
			UL_TASKS.removeChild(UL_TASKS.firstElementChild);
		} else {
			alert("Nothing to remove!");
		}

		// If after deletion, ul#tasks is empty, disable #btn-clearLast and #btn-clearFirst
		if (!UL_TASKS.hasChildNodes()) {
			document.querySelector("#btn-clearFirst").disabled = true;
			document.querySelector("#btn-clearLast").disabled = true;
		}
	};
});
