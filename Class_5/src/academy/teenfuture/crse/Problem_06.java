package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_06 {
    public static void main(String[] args) {

        int[] str1 = new int[] {1, 2, 3, 4, 5};

        int index = 1;

        System.out.print("The array before deletion: ");
        System.out.println(Arrays.toString(str1));

        for(int i = index; i < str1.length - 1; i++){
            str1[i] = str1[i + 1];
        }

        int[] str2 = new int[str1.length - 1];

        for(int i = 0; i < str1.length - 1; i++){
            str2[i] = str1[i];
        }

        System.out.print("The array after deletion: ");
        System.out.println(Arrays.toString(str2));

    }
}