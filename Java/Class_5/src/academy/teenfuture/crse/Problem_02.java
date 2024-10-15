package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_02 {
    public static void main(String[] args) {

        int[] str1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int i = 0; i < str1.length; i++){
            sum += str1[i];
        }

        System.out.print("The input Array: ");
        System.out.println(Arrays.toString(str1));
        System.out.println("The sum of number in the array is " + sum);
       


    }
}