package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String str1 = scanner.nextLine();

		System.out.print("The new String is \"");
		System.out.println(str1.replaceAll("[AEIOUaeiou]", "") + str1.replaceAll("[^AEIOUaeiou]", "") + "\"");

		scanner.close();

	}
}