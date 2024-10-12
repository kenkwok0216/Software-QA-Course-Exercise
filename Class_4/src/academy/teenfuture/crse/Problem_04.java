package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter string: ");
		String str1 = scanner.nextLine();

		CharSequence str2 = "example.com";
		// System.out.print("Enter second string: ");
		// String str2 = scanner.nextLine();

		boolean result = str1.contentEquals(str2);

		if (result) {
			System.out.println("Comparing \"" + str1 + "\" and \"" + str2 + "\": " + result);
		} else {
			System.out.println("Comparing \"" + str1 + "\" and \"" + str2 + "\": " + result);
		}

		scanner.close();

	}
}