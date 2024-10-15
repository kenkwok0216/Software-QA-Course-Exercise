package academy.teenfuture.crse.problem_30;

public enum Suit {
	HEARTS("Hearts", "Red"), DIAMONDS("Diamonds", "Red"), CLUBS("Clubs", "Black"), SPADES("Spades", "Black");

	private final String name;
	private final String color;

	Suit(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}
}