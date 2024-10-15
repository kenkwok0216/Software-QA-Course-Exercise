package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_31.Season;

public class Problem_31 {
	public static void main(String[] args) {
		// Create an array of strings to hold activities for each season
		String[] activities = new String[Season.values().length];

		// Assign activities based on the season index
		activities[Season.WINTER.ordinal()] = "Skiing, Snowboarding";
		activities[Season.SPRING.ordinal()] = "Hiking, Gardening";
		activities[Season.SUMMER.ordinal()] = "Swimming, Beach Volleyball";
		activities[Season.FALL.ordinal()] = "Leaf Peeping, Apple Picking";

		// Access activities using the enum
		for (Season season : Season.values()) {
			System.out.println(season + ": " + activities[season.ordinal()]);
		}
	}
}