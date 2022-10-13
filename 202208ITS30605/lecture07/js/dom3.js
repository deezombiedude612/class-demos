function changeMessage() {
	const message = document.querySelector("#message");
	message.innerHTML = "Good afternoon!";
	message.style.fontSize = "24px";
	message.style.color = "#89623d";
}

function toConfirm() {
	const result = confirm("Do you wish to submit the form?");
	if (!result) return false; // prevent the form from submitting
}

function promptName() {
	const name = document.querySelector("#student_name").value;

	alert(`The name entered is ${name}`);
}
