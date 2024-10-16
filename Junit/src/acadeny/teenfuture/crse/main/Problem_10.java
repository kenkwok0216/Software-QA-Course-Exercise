package acadeny.teenfuture.crse.main;

public class Problem_10 {

	public int lengthOfLongestString(String[] strings) {
		if (strings == null || strings.length == 0) {
			return 0; // Return 0 for null or empty array
		}

		int maxLength = 0;
		for (String str : strings) {
			if (str != null) { // Check for null strings
				if (maxLength < str.length()) {
					maxLength = str.length();
				}
			}
		}
		return maxLength;
	}

}
