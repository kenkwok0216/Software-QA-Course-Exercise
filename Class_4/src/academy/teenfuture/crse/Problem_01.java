package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter second string: ");
		String str2 = scanner.nextLine();

		// The method return negative if lesser; 0 if equals; positive if larger
		int result = str1.compareToIgnoreCase(str2);

		if (result < 0) {
			System.out.println("\"" + str1 + "\" is lexicographically less than \"" + str2 + "\".");
		} else if (result == 0) {
			System.out.println("\"" + str1 + "\" is lexicographically equal to \"" + str2 + "\".");
		} else {
			System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\".");
		}

		scanner.close();

	}
}