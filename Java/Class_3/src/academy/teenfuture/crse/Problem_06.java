package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Input seconds: ");
        int seconds = scan.nextInt();

        int in_hours = seconds / 60 / 60;
        int in_minutes = seconds / 60 - in_hours * 60;
        int in_seconds = seconds - in_minutes * 60 - in_hours * 60 * 60;
        System.out.println(String.format("%02d",in_hours) + ":" + String.format("%02d",in_minutes) + ":" + String.format("%02d",in_seconds));



        scan.close();
    }


}