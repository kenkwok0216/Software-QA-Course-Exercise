package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the original string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter the start position: ");
		int num1 = scanner.nextInt();

		if (num1 > str1.length()) {
			System.out.println("The input number exceed the string length");
			System.out.println("The program terminate");
			scanner.close();
			return;
		} else if (num1 < 0) {
			System.out.println("The input number must be positive");
			System.out.println("The program terminate");
			scanner.close();
			return;
		}

		System.out.print("Enter the end position: ");
		int num2 = scanner.nextInt();

		if (num2 > str1.length()) {
			System.out.println("The input number exceed the string length");
			System.out.println("The program terminate");
			scanner.close();
			return;
		} else if (num2 < 0) {
			System.out.println("The input number must be positive");
			System.out.println("The program terminate");
			scanner.close();
			return;
		}

		System.out.print("The new String is \"");
		System.out.println(str1.substring(num1, num2) + "\"");

		scanner.close();

	}
}