package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_05 {
    public static void main(String[] args) {

        int[] str1 = new int[] {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int index = 0;

        for(int i = 0; i < str1.length; i++){
            if(str1[i] != 77){
                index++;
            } else {
                break;
            }
            
        }

        System.out.print("The input Array: ");
        System.out.println(Arrays.toString(str1));

        System.out.println("Index position of 77 is: " + index);

    }
}