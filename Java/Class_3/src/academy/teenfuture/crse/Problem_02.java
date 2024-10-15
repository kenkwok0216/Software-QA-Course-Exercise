package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Input the first integer: ");
        int num_1 = scan.nextInt();

        System.out.print("Input the second integer: ");
        int num_2 = scan.nextInt();

        //Check equal
        if(num_1 == num_2){
            System.out.println(num_1 + " = " + num_2);
        } else {
            System.out.println(num_1 + " != " + num_2);
        }

        //Check lesser
        if(num_1 < num_2){
            System.out.println(num_1 + " < " + num_2);
        } else {
            System.out.println(num_1 + " => " + num_2);
        }

        //Check larger
        if(num_1 > num_2){
            System.out.println(num_1 + " > " + num_2);
        } else {
            System.out.println(num_1 + " <= " + num_2);
        }



        scan.close();
    }


}