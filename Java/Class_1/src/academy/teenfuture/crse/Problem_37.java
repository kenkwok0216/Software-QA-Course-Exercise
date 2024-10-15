package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_37 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		System.out.println(num * num);
		System.out.println(num * num * num);
		scan.close();
	}
}