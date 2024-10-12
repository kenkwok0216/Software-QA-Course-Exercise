package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_18 {
    public static void main(String[] args) {

        int[] str = new int[]  {1, 2, 3, 0, 4, 6};

        System.out.print("The input Array: ");
        System.out.println(Arrays.toString(str));

        Arrays.sort(str);

        System.out.print("Largest number using the said arrays numbers: ");

        for(int i = str.length - 1; i >= 0; i--){
            System.out.print(str[i]);
        }

    }
}