package acadeny.teenfuture.crse.main;

public class Problem_04 {

	public boolean isAscending(int[] arr) {
		// An empty array or array with 1 element is be definition is ascending
		if (arr == null || arr.length < 2) {
			return true;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			// if [..., 4, 3, ....]
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}

		return true;

	}
}