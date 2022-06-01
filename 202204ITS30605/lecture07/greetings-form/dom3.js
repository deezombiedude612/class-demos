function changeMessage() {
	const MESSAGE = document.querySelector("#message");
	MESSAGE.innerHTML = "Good afternoon!!";
	MESSAGE.style.fontSize = "24px";
	MESSAGE.style.color = "#89623d";
}

function toConfirm() {
	const RESULT = confirm("Do you wish to submit the form?");
	if (!RESULT) {
		return false; // prevent the form from submitting
	}
}

function promptName() {
	const NAME = document.querySelector("#student_name").value;

	alert(`The name entered is: ${NAME}`);
}
