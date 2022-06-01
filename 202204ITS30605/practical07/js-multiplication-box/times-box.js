function multiply() {
	let num1 = parseInt(document.querySelector("#num1").value);
	let num2 = parseInt(document.querySelector("#num2").value);

	// replace num1 and num2 with parsed integer (if not integers)
	// alert user when number is replaced
	if (parseFloat(document.querySelector("#num1").value) !== parseInt(document.querySelector("#num1").value)) {
		if (document.querySelector("#num1").value == "") {
			alert("First number input is empty.");
		} else {
			alert("First number isn't an integer. Replacing value at input field with parsed integer value instead.");
			document.querySelector("#num1").value = num1;
		}
	}
	if (parseFloat(document.querySelector("#num2").value) !== parseInt(document.querySelector("#num2").value)) {
		if (document.querySelector("#num2").value == "") {
			alert("Second number input is empty.");
		} else {
			alert("Second number isn't an integer. Replacing value at input field with parsed integer value instead.");
			document.querySelector("#num2").value = num2;
		}
	}

	// check if num1 and num2 is between 10 and 99 (inclusive)
	if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {
		// show number in num?_show
		document.querySelector("#num1_show").innerHTML = num1;
		document.querySelector("#num2_show").innerHTML = num2;

		// split number into digits based on tens and units value
		let arr_num1 = [Math.floor(num1 / 10) * 10, num1 % 10];
		let arr_num2 = [Math.floor(num2 / 10) * 10, num2 % 10];

		// show digits in num?a or num?b
		document.querySelector("#num1a").innerHTML = arr_num1[0];
		document.querySelector("#num1b").innerHTML = arr_num1[1];
		document.querySelector("#num2a").innerHTML = arr_num2[0];
		document.querySelector("#num2b").innerHTML = arr_num2[1];

		/**
		 * Calculate intermediary multiplication values
		 *
		 * Key:
		 * m1 = num1a * num2a
		 * m2 = num1b * num2a
		 * m3 = num1a * num2b
		 * m4 = num1b * num2b
		 */
		const m1 = arr_num1[0] * arr_num2[0];
		const m2 = arr_num1[1] * arr_num2[0];
		const m3 = arr_num1[0] * arr_num2[1];
		const m4 = arr_num1[1] * arr_num2[1];

		// Display intermediary multiplication values
		document.querySelector("#m1").innerHTML = m1;
		document.querySelector("#m2").innerHTML = m2;
		document.querySelector("#m3").innerHTML = m3;
		document.querySelector("#m4").innerHTML = m4;

		// add horizontal row values and display the sums
		document.querySelector("#m1_m2").innerHTML = m1 + m2;
		document.querySelector("#m3_m4").innerHTML = m3 + m4;

		// add vertical column values and display the sums
		document.querySelector("#m1_m3").innerHTML = m1 + m3;
		document.querySelector("#m2_m4").innerHTML = m2 + m4;

		// display full product in table
		// document.querySelector("#m_total").innerHTML =
		// 	parseInt(document.querySelector("#m1_m2").innerHTML) + parseInt(document.querySelector("#m3_m4").innerHTML);

		// // display full product in answer input field
		// document.querySelector("#numAns").value =
		// 	parseInt(document.querySelector("#m1_m2").innerHTML) + parseInt(document.querySelector("#m3_m4").innerHTML);

		// calculate product
		// const product =
		// 	parseInt(document.querySelector("#m1_m2").innerHTML) + parseInt(document.querySelector("#m3_m4").innerHTML);
		// or
		const product =
			parseInt(document.querySelector("#m1_m3").innerHTML) + parseInt(document.querySelector("#m2_m4").innerHTML);

		// display full product in table
		document.querySelector("#m_total").innerHTML = product;

		// display full product in answer input field
		document.querySelector("#numAns").value = product;
	} else {
		if (num1 < 10 || num1 > 99) {
			alert("First number should be between 10 and 99!");
			document.querySelector("#num1").value = "";
		}

		if (num2 < 10 || num2 > 99) {
			alert("Second number should be between 10 and 99!");
			document.querySelector("#num2").value = "";
		}
	}
}
