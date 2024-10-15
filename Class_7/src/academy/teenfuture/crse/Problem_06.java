package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Enter the integer: ");
			int num_1 = scan.nextInt();

			if (num_1 < 0) {
				throw new IllegalArgumentException(
						"Error: Cannot convert a nagative integer to binary representation.");
			}

			String byte_string = Integer.toBinaryString(num_1);
			System.out.println("The square root of " + num_1 + " is " + byte_string);

		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());

		} finally {

			scan.close();

		}
	}

}