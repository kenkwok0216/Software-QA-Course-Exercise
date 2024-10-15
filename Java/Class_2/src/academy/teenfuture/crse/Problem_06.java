package academy.teenfuture.crse;
import java.util.Scanner;

class Problem_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");

        Double r = scan.nextDouble();

        System.out.println("Area of the circle: " + round_decimal(Math.PI * r * r, 3));
        System.out.println("Perimeter of the circle: " + round_decimal(2 * Math.PI * r, 3));

        scan.close();
    }


    //This method is used to correct to the nearest t decimal place
    public static double round_decimal(double num, int t){

        Double scale = Math.pow(10, t);

        return Math.round(num * scale)/scale;
    }


}