package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_11 {
    public static void main(String[] args) {

        String[] str1 = new String[] {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

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