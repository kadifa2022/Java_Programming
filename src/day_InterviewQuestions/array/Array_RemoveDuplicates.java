package day_InterviewQuestions.array;

import java.util.Arrays;
import java.util.ArrayList;

public class Array_RemoveDuplicates {


        /*
    Write a function that can remove the duplicates from an array of integers
    */

    //solution 1

    public static int[] removeDuplicates(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }

    //Solution 2

    public static int[] removeDuplicates2(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each:array) {
            if(!list.contains(each)){
                    list.add(each);
            }
        }

        array  = new int[list.size()];
        for (int i=0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
