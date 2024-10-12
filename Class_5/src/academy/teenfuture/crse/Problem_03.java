package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_03 {
    public static void main(String[] args) {

        int[] str1 = new int[] {20, 30, 25, 35, -16, 60, -100};
        double sum = 0;
        for(int i = 0; i < str1.length; i++){
            sum += str1[i];
        }


        System.out.print("The input Array: ");
        System.out.println(Arrays.toString(str1));
        System.out.printf("The average of the numbers in the array is %.3f", (sum/str1.length));
       


    }
}