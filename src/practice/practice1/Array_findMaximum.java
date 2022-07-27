package practice.practice1;


import day21_selfPractice.Arrays;

public class Array_findMaximum {




   /*
Write a function that can find the maximum number from an int Array */

    public static int maxValue(int[] n){

        int max = Integer.MIN_VALUE;
        for (int each: n) {
            if(each > max){
                max = each;
            }

            
        }
        return max;


    }

}
