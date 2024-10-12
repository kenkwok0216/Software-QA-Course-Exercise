package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_10 {
    public static void main(String[] args) {

        int[] str1 = new int[] {1, 2, 5, 5, 6, 6, 7, 2};

        System.out.print("The input Array: ");
        System.out.println(Arrays.toString(str1));

        for (int i = 0; i < str1.length; i++) {
            for (int j = i + 1; j < str1.length; j++) {
                if (str1[i] == str1[j]) {
                    System.out.println("Duplcate Element: " + str1[i]);
                    break;
                }
            }
        }

    }
}