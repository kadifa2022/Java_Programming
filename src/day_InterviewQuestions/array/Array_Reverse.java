package day_InterviewQuestions.array;

import java.util.Arrays;

public class Array_Reverse {

        /*
    write a function that can reverse an array
    */

public static int[] reverse (int[] arr) {
    int [] result = new int [arr.length];

    for (int i = arr.length -1, j=0 ; i >= 0 ;i--, i++) {
        result[j] = arr[i];

    }
    return result;
}
}
