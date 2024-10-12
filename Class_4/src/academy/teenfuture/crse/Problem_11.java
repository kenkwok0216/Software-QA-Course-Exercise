package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String str1 = scanner.nextLine();

        System.out.print("The new String is \"");
        System.out.println(str1.toLowerCase() + "\"");

        scanner.close();


    }
}