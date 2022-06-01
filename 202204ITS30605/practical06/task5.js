const MOVIE = {
	title: "Big Hero 6",
	year: 2014,
	rating: 7.8,
	director_1: "Don Hall",
	director_2: "Chris Williams",
};

for (let key in MOVIE) {
	if (typeof MOVIE[key] === "string") console.log(key);
}
