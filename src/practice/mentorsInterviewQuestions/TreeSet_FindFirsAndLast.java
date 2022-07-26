package practice.mentorsInterviewQuestions;

import java.util.TreeSet;

public class TreeSet_FindFirsAndLast {
    /*
    Write a function (getSmallestAndLargest) that finds the lexicographically smallest and
    largest substrings of length k:


     */

    static String findFirsAndLast(String s, int k){
        int a = s.length()-k +1;

        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < a; i++) {
            set.add(s.substring(i, i + k));

            
        }
        System.out.println(set);
        return set.first()+"\n"+set.last();



    }

    public static void main(String[] args) {
        System.out.println();
    }



}
