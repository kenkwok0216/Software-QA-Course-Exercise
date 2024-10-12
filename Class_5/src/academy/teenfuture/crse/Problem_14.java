package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_14 {
    public static void main(String[] args) {

        int[] str1 = new int[] {-1, 4, 0, 2, 7, -3};

        System.out.print("The input Array: ");
        System.out.println(Arrays.toString(str1));

        Arrays.sort(str1);

        System.out.println("The second lowest value is " + str1[1]);



    }
}