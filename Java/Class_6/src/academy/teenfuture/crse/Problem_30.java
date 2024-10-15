package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_30.Suit;

public class Problem_30 {
	public static void main(String[] args) {
		// Iterate through all suits and display their properties
		// For all suit in suit.values [the enum set in the java enum]
		for (Suit suit : Suit.values()) {
			System.out.println("Suit: " + suit.getName() + ", Color: " + suit.getColor());
		}
	}
}