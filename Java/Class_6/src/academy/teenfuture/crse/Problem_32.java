package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_32.DayOfWeek;

public class Problem_32 {
	public static void main(String[] args) {
		for (DayOfWeek day : DayOfWeek.values()) {
			System.out.println(
					"Day: " + day.getName() + ", Number: " + day.getNumber() + ", Is Weekend: " + day.isWeekend());
		}
	}
}
