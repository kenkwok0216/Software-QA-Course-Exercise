package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Input the first number: ");
		int num_1 = scan.nextInt();

		System.out.print("Input the second number: ");
		int num_2 = scan.nextInt();

		if (num_1 % 10 == num_2 % 10 || num_1 / 10 == num_2 / 10) {
			System.out.println("The result is true");
		} else {
			System.out.println("The result is false");
		}

		scan.close();
	}

}