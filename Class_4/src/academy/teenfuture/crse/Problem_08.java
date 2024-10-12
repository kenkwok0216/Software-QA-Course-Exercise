package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the original string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter string that you have to replace: ");
		String str2 = scanner.nextLine();

		if (!(str1.contains(str2))) {
			System.out.println("\"" + str1 + "\" do not contained \"" + str2 + "\"");
			System.out.println("The program terminate");
			scanner.close();
			return;
		}

		System.out.print("Enter string that you want to replace: ");
		String str3 = scanner.nextLine();

		System.out.print("The new String is \"");
		System.out.println(str1.replace(str2, str3) + "\"");

		scanner.close();

	}
}