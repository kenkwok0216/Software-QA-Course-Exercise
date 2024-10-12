package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Input a month number: ");
        int month = scan.nextInt();

        System.out.print("Input year: ");
        int year = scan.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June", "Augest", "September", "October", "November", "December"};

        //Check equal
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println(months[month - 1] + " " + year + " has 31 days");
        } else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println(months[month - 1] + " " + year + " has 30 days");
        } else if(month == 2){
            if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
                System.out.println(months[month - 1] + " " + year + " has 29 days");
            } else {
                System.out.println(months[month - 1] + " " + year + " has 28 days");
            }
            
        }



        scan.close();
    }


}