package academy.teenfuture.crse.problem_32;

public enum DayOfWeek {
	MONDAY("Monday", 1, false), TUESDAY("Tuesday", 2, false), WEDNESDAY("Wednesday", 3, false),
	THURSDAY("Thursday", 4, false), FRIDAY("Friday", 5, false), SATURDAY("Saturday", 6, true),
	SUNDAY("Sunday", 7, true);

	private final String name;
	private final int number;
	private final boolean isWeekend;

	DayOfWeek(String name, int number, boolean isWeekend) {
		this.name = name;
		this.number = number;
		this.isWeekend = isWeekend;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public boolean isWeekend() {
		return isWeekend;
	}
}