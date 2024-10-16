package com.example;

public class Problem_08 {

	public boolean startsWithPrefix(String mainString, String suffix) {

		if (mainString == null || suffix == null) {
			return false; // Handle null cases
		}

		return mainString.endsWith(suffix);
	}
}
