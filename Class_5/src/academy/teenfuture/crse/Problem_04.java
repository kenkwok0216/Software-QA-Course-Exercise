package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_04 {
    public static void main(String[] args) {

        int[] str1 = new int[] {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};
       
        boolean result_2013 = false;
        boolean result_2015 = false;

        for(int i = 0; i < str1.length; i++){
            if(str1[i] == 2013){
                result_2013 = true;
            }
            if(str1[i] == 2015){
                result_2015 = true;
            } 
        }

        System.out.print("The input Array: ");
        System.out.println(Arrays.toString(str1));

        if(result_2013){
            System.out.println("The array does contain 2013");
        } else {
            System.out.println("The array does NOT contain 2013");
        }

        if(result_2015){
            System.out.println("The array does contain 2015");
        } else {
            System.out.println("The array does NOT contain 2015");
        }

    }
}