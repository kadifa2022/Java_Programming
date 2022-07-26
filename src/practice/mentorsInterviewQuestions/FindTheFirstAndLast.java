package practice.mentorsInterviewQuestions;

public class FindTheFirstAndLast{

    /*
    Write a function (getSmallestAndLargest) that finds the lexicographically
     smallest and largest substrings of length k:


     */

    static String finedFirstAndLast(String s, int k){
        int a = s.length()-k + 1;
        String[] str = new String[a];
        for (int i = 0; i < a; i++){
            str[i] = s.substring(i, i+k);

        }
        return finedFirstAndLast(s, k);


    }
}