package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a: ");
        Double a = scan.nextDouble();
        System.out.print("Input b: ");
        Double b = scan.nextDouble();
        System.out.print("Input c: ");
        Double c = scan.nextDouble();

        Double determinant = b * b - 4 * a * c;

        if(determinant < 0){
            System.out.println("This equation have no real root");
        } else {
            Double root_1 = (- b + Math.sqrt(determinant)) / (2 * a);
            Double root_2= (- b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("The roots are " + root_1 + " and " + root_2);
        }
        


        scan.close();
    }


}