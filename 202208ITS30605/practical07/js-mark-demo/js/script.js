function calculate() {
	let asgn1_total = 0,
		asgn2_total = 0,
		grand_total = 0;

	const TABLE = document.querySelector("table");

	// Calculate number of rows in between top and bottom row
	const NUMBER_OF_STUDENTS = TABLE.rows.length - 2;

	for (let i = 1; i <= NUMBER_OF_STUDENTS; ++i) {
		/**
		 * Check if #stu?_asgn1 and #stu?_asgn2 are empty
		 * If empty, place in 0 values.
		 */
		if (document.querySelector(`#stu${i}_asgn1`).value == "") {
			document.querySelector(`#stu${i}_asgn1`).value = "0";
		}
		if (document.querySelector(`#stu${i}_asgn2`).value == "") {
			document.querySelector(`#stu${i}_asgn2`).value = "0";
		}

		// calculate the marks from total percentage
		let asgn1_points = parseFloat(document.querySelector(`#stu${i}_asgn1`).value) * 0.2;
		let asgn2_points = parseFloat(document.querySelector(`#stu${i}_asgn2`).value) * 0.3;
		document.querySelector(`#stu${i}_asgn1_points`).value = asgn1_points.toFixed(2);
		document.querySelector(`#stu${i}_asgn2_points`).value = asgn2_points.toFixed(2);

		// calculate total marks for given student
		let stu_total =
			parseFloat(document.querySelector(`#stu${i}_asgn1_points`).value) +
			parseFloat(document.querySelector(`#stu${i}_asgn2_points`).value);
		document.querySelector(`#stu${i}_total_points`).value = stu_total.toFixed(2);

		// add to respective totals
		asgn1_total += asgn1_points;
		asgn2_total += asgn2_points;
		grand_total += stu_total;
	}
	// Note: use parseFloat() to get number with decimal places, and parseInt() to get Integer values (non-decimal)

	// calculate average
	const asgn1_avg = asgn1_total / NUMBER_OF_STUDENTS;
	const asgn2_avg = asgn2_total / NUMBER_OF_STUDENTS;
	const grand_avg = grand_total / NUMBER_OF_STUDENTS;

	// assign average to correct input fields
	document.querySelector(`#avg1`).value = asgn1_avg.toFixed(2);
	document.querySelector(`#avg2`).value = asgn2_avg.toFixed(2);
	document.querySelector(`#avg_total`).value = grand_avg.toFixed(2);
	// Note: toFixed(2) sets number values to display 2 decimal places
}

function clearTable() {
	document.querySelectorAll(`input:not(:read-only)`).forEach((inputField) => (inputField.value = "0"));
	document.querySelectorAll(`input:read-only`).forEach((inputField) => (inputField.value = "0.00"));
}

window.onload = clearTable();
