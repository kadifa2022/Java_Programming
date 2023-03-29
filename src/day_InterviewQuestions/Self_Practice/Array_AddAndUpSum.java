package day_InterviewQuestions.Self_Practice;

import javax.management.MBeanAttributeInfo;
import java.util.HashMap;
import java.util.Map;

public class Array_AddAndUpSum {
/*

given an int[] 'arr' and another int 'sum',
Write a function which can find a pair of ints in 'arr' that add up to 'sum'.
Example:
arr = [8, 7, 2, 5, 3, 1] sum = 8
Output:
{8=2, 7=3}
*/
public static void main(String[] args) {
    int [] arr ={8,7,2,5,3,1};
    int sum = 10;

    Map<Integer, Integer> pairs = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if(arr[i] + arr[j]==sum){
                pairs.put(arr[i], arr[j]);
            }

        }

    }
    System.out.println(pairs);

}




}
