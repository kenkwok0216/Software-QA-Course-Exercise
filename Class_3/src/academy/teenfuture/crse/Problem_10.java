package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num = scan.nextInt();

        if(num < 0){
            System.out.println("The number is negative");
        } else if (num > 0){
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is neither positive nor negative");
        }
        


        scan.close();
    }


}