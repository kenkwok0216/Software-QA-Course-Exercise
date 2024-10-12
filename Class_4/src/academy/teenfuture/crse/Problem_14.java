package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String str1 = scanner.nextLine();

		boolean result = str1.matches("^pq*$");

		if (result) {
			System.out.println("The result is true");
		} else {
			System.out.println("The result is false");
		}

		scanner.close();

	}
}