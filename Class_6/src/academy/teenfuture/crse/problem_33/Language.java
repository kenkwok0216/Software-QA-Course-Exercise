package academy.teenfuture.crse.problem_33;

public enum Language {
	// reference: https://spectrum.ieee.org/top-programming-languages-2024
	PYTHON("Python", 1991, 1), JAVA("Java", 1995, 2), JAVASCRIPT("JavaScript", 1995, 3), C_PLUS_PLUS("C++", 1980, 4),
	TYPESCRIPT("TypeSCript", 2012, 5), SQL("SQL", 1978, 6), C_SHARP("C#", 2001, 7), GO("Go", 2009, 8), C("C", 1972, 9),
	HTML("HTML", 1993, 10), RUST("Rust", 2015, 11), MATHEMATICA("Mathematica", 1988, 12), PHP("PHP", 1995, 13),
	SHELL("Shell", 1971, 14), LUA("Lua", 1979, 15);

	private final String name;
	private final int yearOfCreation;
	private final int popularityRanking;

	Language(String name, int yearOfCreation, int popularityRanking) {
		this.name = name;
		this.yearOfCreation = yearOfCreation;
		this.popularityRanking = popularityRanking;
	}

	public String getName() {
		return name;
	}

	public int getYearOfCreation() {
		return yearOfCreation;
	}

	public int getPopularityRanking() {
		return popularityRanking;
	}
}