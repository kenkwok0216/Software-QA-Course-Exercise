package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Input the first integer: ");
        int num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }



        scan.close();
    }


}