if (document.querySelector("#logout")) {
	document.querySelector("#logout").addEventListener("click", () => {
		const response = confirm("Confirm logout?");

		if (response) window.location.href = "logout.php";
	});
}
