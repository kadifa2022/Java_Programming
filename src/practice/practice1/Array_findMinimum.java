package practice.practice1;

public class Array_findMinimum {

    public static  int findMinimum(int[] n){


        int min=Integer.MIN_VALUE;

        for (int each: n) {
            if(each<min){
                min=each;
            }

        }
       return min;

    }
}
