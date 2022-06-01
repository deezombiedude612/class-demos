let students = ["Anthony", "Barry", "Desmond", "Grenda"];

for (let s of students) console.log(s);

// Pop Grenda (last element) from the students array
const popped = students.pop();
console.log(students);

// Add Marie and Zacchaeus at the end of the students array
students.push("Marie", "Zacchaeus");
console.log(students);

// Shift Anthony (first element) out from the students array
const shifted = students.shift();
console.log(students);

// Add Charlie as the first element of the students array
students.unshift("Charlie");
console.log(students);
