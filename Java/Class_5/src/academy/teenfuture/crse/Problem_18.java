package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_18 {
	public static void main(String[] args) {

		int[] str = new int[] { 2, 3, 5, 7, -7, 5, 8, -5 };
		int max = str[0] * str[1];
		int x = 0;
		int y = 1;

		System.out.print("The input Array: ");
		System.out.println(Arrays.toString(str));

		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] * str[j] > max) {
					x = str[i];
					y = str[j];
					max = str[i] * str[j];
				}
			}
		}

		System.out.println("The pair is (" + x + ", " + y + "), Maximum Product: " + max);

	}
}