package academy.teenfuture.crse;

import java.util.Arrays;

class Problem_01 {
    public static void main(String[] args) {

        int[] str1 = new int[] {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        System.out.print("The original Array: ");
        System.out.println(Arrays.toString(str1));
        Arrays.sort(str1);
        System.out.print("The sorted Array: ");
        System.out.println(Arrays.toString(str1));

        String[] str2 = new String[] {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        System.out.print("The original Array: ");
        System.out.println(Arrays.toString(str2));
        Arrays.sort(str2);
        System.out.print("The sorted Array: ");
        System.out.println(Arrays.toString(str2));


    }
}