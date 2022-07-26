package practice.mentorsInterviewQuestions;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class FindTheFirstAndLast {

    /*
    Write a function (getSmallestAndLargest) that finds the lexicographically
     smallest and largest substrings of length k:


     */

    static String finedFirstAndLast(String s, int k) {
        int a = s.length() - k + 1;
        String[] str = new String[a];
        for (int i = 0; i < a; i++) {
            str[i] = s.substring(i, i + k);

        }
        return finedFirstAndLast(s, k);


    }
    static String finedFirstAndLast2(String s, int k){
        int a = s.length() - k +1;
        String []str = new String[a];
        for (int i = 0; i < a; i++) {
            str[i] = s.substring(i,i +k);

            System.out.println(Arrays.toString(str));
            Arrays.sort(str);
            System.out.println(Arrays.toString(str));

            
        }
        return str [0]+"\n"+str[a-1];
    }

}