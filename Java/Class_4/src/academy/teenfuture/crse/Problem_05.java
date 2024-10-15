package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();


        boolean result = str1.endsWith(str2);

        if(result){
            System.out.println("\"" + str1 + "\" is ended with \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is not ended with \"" + str2 + "\"");
        }

        scanner.close();


    }
}