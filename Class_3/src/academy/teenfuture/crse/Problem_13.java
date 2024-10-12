package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        Double num_1 = scan.nextDouble();
        System.out.print("Input another floating-point number: ");
        Double num_2 = scan.nextDouble();

        if(round_decimal(num_1, 3) == round_decimal(num_2, 3)){
            System.out.println("The result is true");
        } else {
            System.out.println("The result is false");
        }


        scan.close();
    }

    //This method is used to correct to the nearest t decimal place
    public static double round_decimal(double num, int t){

        Double scale = Math.pow(10, t);

        return Math.round(num * scale)/scale;
    }

}