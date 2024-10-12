package academy.teenfuture.crse;

import java.util.Scanner;


class Problem_31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num_1 = scan.nextInt();
        String operation = scan.next();
        int num_2 = scan.nextInt();


        if(operation.equals("+")){
            System.out.println(num_1 + num_2);
        } else if(operation.equals("-")){
            System.out.println(num_1 - num_2);
        } else if(operation.equals("*")){
            System.out.println(num_1 * num_2);
        } else if(operation.equals("/")){
            System.out.println(num_1 / num_2);
        }
        scan.close();
    }
}