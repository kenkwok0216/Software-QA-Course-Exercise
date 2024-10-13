package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_14 {
	public static void main(String[] args) {

		int[] str1 = new int[] { 10789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

		System.out.print("The input Array: ");
		System.out.println(Arrays.toString(str1));

		Arrays.sort(str1);

		System.out.println("The second larest value is " + str1[str1.length - 2]);

	}
}