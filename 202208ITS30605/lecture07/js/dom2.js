function showPage(page) {
	document.querySelectorAll("section").forEach((section) => {
		section.style.display = "none";
	});

	document.querySelector(`#${page}`).style.display = "block";
}

document.addEventListener("DOMContentLoaded", function() {
	document.querySelectorAll("button").forEach((button) => {
		button.onclick = function() {
			showPage(this.dataset.page);
		};
	});
});
