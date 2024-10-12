package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_09 {
    public static void main(String[] args) {

        int[] str1 = new int[] {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};

        System.out.print("The input Array: ");
        System.out.println(Arrays.toString(str1));

        //invert from middle
        for(int i = 0; i < str1.length / 2; i++){
            int temp = str1[i];
            str1[i] = str1[str1.length - 1 - i];
            str1[str1.length - 1 - i] = temp;
        }

        System.out.print("The inverted Array: ");
        System.out.println(Arrays.toString(str1));




    }
}