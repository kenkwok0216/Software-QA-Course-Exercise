package acadeny.teenfuture.crse.main;

public class Problem_07 {

	public boolean startsWithPrefix(String mainString, String prefix) {

		if (mainString == null || prefix == null) {
			return false; // Handle null cases
		}

		return mainString.startsWith(prefix);
	}
}
