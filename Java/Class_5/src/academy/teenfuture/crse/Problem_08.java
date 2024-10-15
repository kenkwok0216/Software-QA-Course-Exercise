package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_08 {
    public static void main(String[] args) {

        int[] str1 = new int[] {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        Arrays.sort(str1);

        System.out.print("The input Array: ");
        System.out.println(Arrays.toString(str1));

        System.out.println("The maximum value of the above array is " + str1[str1.length - 1]);
        System.out.println("The minimum value of the above array is " + str1[0]);




    }
}