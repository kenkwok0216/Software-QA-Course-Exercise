package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        String result = str1.concat(str2);

        System.out.println("The concatenated string: " + result);


        scanner.close();


    }
}