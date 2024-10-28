package academy.teenfuture.crse.main;

public class Problem_05 {

	public boolean hasSubstring(String mainString_1, String subString_1) {

		if (mainString_1 == null || subString_1 == null) {
			return false; // Handle null cases
		}

		return mainString_1.contains(subString_1);
	}
}