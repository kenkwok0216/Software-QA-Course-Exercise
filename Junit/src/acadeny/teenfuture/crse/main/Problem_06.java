package acadeny.teenfuture.crse.main;

public class Problem_06 {

	public boolean hasElement(int[] array, int element) {

		if (array == null) {
			return false;
		}

		for (int value : array) {
			if (value == element) {
				return true;
			}
		}

		return false;
	}
}