package classPractice;

import java.lang.reflect.Array;

public class Array_FindMinimum {
    /* Write a function that can find the minimum number from Array

     */

    public static int minValue(int[]n){
        int min = Integer.MAX_VALUE;
        for (int each: n) {
            if ( each<min){
                min=each;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        int [] min = { 10,20,39,40,49};

        System.out.println(min);
    }

}
