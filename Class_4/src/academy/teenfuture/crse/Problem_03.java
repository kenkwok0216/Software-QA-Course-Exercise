package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original String: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter Specified sequence of char values: ");
        String str2 = scanner.nextLine();

        boolean result = str1.contains(str2);

        if(result){
            System.out.println("\"" + str1 + "\" is contained \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is not contained \"" + str2 + "\"");
        }


        scanner.close();


    }
}