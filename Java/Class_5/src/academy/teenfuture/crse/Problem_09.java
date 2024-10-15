package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		System.out.print("Input the starting point: ");
		int num_1 = scan.nextInt();

		System.out.print("Input the end point: ");
		int num_2 = scan.nextInt();

		System.out.print("Input the divisor: ");
		int num_3 = scan.nextInt();

		for (int i = num_1; i <= num_2; i++) {
			if (i % num_3 == 0) {
				count++;
			} else {
				// do nothing
			}
		}

		System.out.println("There are " + count + " integer divisible by " + num_3);

		scan.close();
	}

}