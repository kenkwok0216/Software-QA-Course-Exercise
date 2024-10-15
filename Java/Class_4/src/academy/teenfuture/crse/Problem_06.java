package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();


        boolean result = str1.equals(str2);

        if(result){
            System.out.println("\"" + str1 + "\" is equals to \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is not equlals to \"" + str2 + "\"");
        }

        scanner.close();


    }
}