let students = ["Anthony", "Barry", "Desmond", "Grenda"];

for (let s of students) {
	console.log(s);
}

console.log(students);

const POPPED = students.pop();

console.log(students);
console.log(POPPED);

students.push("Marie", "Zacchaeus");
console.log(students);

const SHIFTED = students.shift();
console.log(students);
console.log(SHIFTED);

students.unshift("Charlie");
console.log(students);
