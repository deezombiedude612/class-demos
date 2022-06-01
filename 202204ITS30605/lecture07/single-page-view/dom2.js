function showPage(page) {
	// hide all page sections
	document.querySelectorAll("section").forEach((section) => {
		section.style.display = "none";
	});

	// based on value of "page", show relevant page section
	document.querySelector(`#${page}`).style.display = "block";
}

document.addEventListener("DOMContentLoaded", function() {
	document.querySelectorAll("button").forEach((button) => {
		button.onclick = function() {
			showPage(this.dataset.page);
		};
	});
});
