package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Input a number: ");
        Double num = scan.nextDouble();

        if(num == 0){
            System.out.println("zero");
        } else if(num < 0){
            if(Math.abs(num) < 1){
                System.out.println("Small negative number");
            } else if (Math.abs(num) > 1000000){
                System.out.println("Large negative number");
            } else {
                System.out.println("Negative number");   
            } 
        } else if(num > 0){
            if(Math.abs(num) < 1){
                System.out.println("Small positive number");
            } else if (Math.abs(num) > 1000000){
                System.out.println("Large positive number");
            } else {
                System.out.println("Positive number");   
            }
        }

        


        scan.close();
    }


}