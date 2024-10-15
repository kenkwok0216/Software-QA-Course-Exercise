package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_33.Language;

public class Problem_33 {
	public static void main(String[] args) {
		System.out.println("Welcome to the Programming Languages Comedy Club!");
		System.out.println("Here are the stars of our show:");

		// Print all programming languages defined in the Language enum
		for (Language lang : Language.values()) {
			System.out.println(lang.getPopularityRanking() + ": " + lang.getName() + " (Created in "
					+ lang.getYearOfCreation() + ") - " + getFunnyComment(lang));
		}

		System.out.println("\nRemember, every language has its quirks, just like us!");
	}

	private static String getFunnyComment(Language lang) {
		switch (lang) {
		case PYTHON:
			return "The snake charm of programming!";
		case JAVA:
			return "A cup of code to keep you awake!";
		case JAVASCRIPT:
			return "The cool kid on the web block!";
		case C_PLUS_PLUS:
			return "The old-school hero with extra features!";
		case TYPESCRIPT:
			return "The strict parent of JavaScript!";
		case SQL:
			return "Always searching for relationships!";
		case C_SHARP:
			return "The musical note in programming!";
		case GO:
			return "The language that just wants to go!";
		case C:
			return "The grandfather of them all!";
		case HTML:
			return "The architect of the web!";
		case RUST:
			return "Safe and sound, just like a crab!";
		case MATHEMATICA:
			return "The math wizard in a coding cloak!";
		case PHP:
			return "The server-side superhero!";
		case SHELL:
			return "The shell that holds all the secrets!";
		case LUA:
			return "The playful language of scripts!";
		default:
			return "A mystery language!";
		}
	}
}