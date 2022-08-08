package day_InterviewQuestions.string;

import java.util.Arrays;

public class String_Anagram1 {
    /*
    Write a function that check if a string is build out of the same letters as another string.
         Ex: same("abc", "cab"); -> true , Solution 1: same("abc", "abb"); -> false:

   */
    //solution 1:

    public static boolean same(String a, String b){
        char [] ch1 = a.toCharArray();
        char [] ch2 = b.toCharArray();


        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String a1 ="", a2 ="";

        for (char each:ch1) {
            a1 +=each;
        }
        for (char each:ch2) {
            a2 += each;

        }
         return a1.equals(a2);
    }




}
