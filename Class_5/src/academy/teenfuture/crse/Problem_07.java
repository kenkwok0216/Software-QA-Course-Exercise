package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_07 {
    public static void main(String[] args) {

        int[] str1 = new int[] {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] str2 = new int[str1.length];

        System.out.print("The input Array: ");
        System.out.println(Arrays.toString(str1));

        
        System.out.print("The New Array before iterating: ");
        System.out.println(Arrays.toString(str2));
        for(int i = 0 ; i < str1.length; i++){
            str2[i] = str1[i];
        }
        System.out.print("The New Array after iterating: ");
        System.out.println(Arrays.toString(str2));



    }
}