package academy.teenfuture.crse;

import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

class Problem_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String str1 = scanner.nextLine();

		boolean result = str1.matches("^[a-zA-Z0-9]+$");

		if (result) {
			System.out.println("The result is true");
		} else {
			System.out.println("The result is false");
		}

		/*
		 * //This is also valid ways to do the matches Pattern pattern =
		 * Pattern.compile("^[a-zA-Z0-9]+$"); Matcher matcher = pattern.matcher(str1);
		 * boolean matchFound = matcher.find(); System.out.println(matchFound);
		 */

		scanner.close();

	}
}