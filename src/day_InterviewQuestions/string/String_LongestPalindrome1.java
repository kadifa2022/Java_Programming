package day_InterviewQuestions.string;

import day21_selfPractice.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class String_LongestPalindrome1 {
    /*
Write a program that can return the longest palindrome from a string
*/
            //Solution 1: (easier but involves to use data structure)
    public static String longestPalindrome(String str){
        String longest = "";
        ArrayList<String>list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length() ; j++) {
                list.add(str.substring(i,j));
            }
        }
        for(String each: list){
            String reverse= "";
            for (int i = each.length()-1; i >+0 ; i--) {
                reverse +=each.charAt(i);
            }
            if(each.equalsIgnoreCase(reverse) && each.length()> longest.length()){
                longest = each;
            }

        }
        return longest;
    }
    
    //Solution 2: //(Harder but does not need data structure)
    public String longestPalindrome2(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int b = i;
            int e = i;
            while (b>=0 && e<= str.length() -1 && str.charAt(b) ==str.charAt(e)) {
                b--;
                e++;
            }
            String temp = str.substring( b+ 1, e);
            if(temp.length()>result.length()) result = temp;

            b = i;//for even length palindrome
            e = i + 1;
            while (b>=0 && e<= str.length()-1 && str.charAt(b)==str.charAt(e)){
                b --;
                e ++;
            }
            temp = str.substring(b+ 1, e);
            if(temp.length()>result.length()){
                result=temp;
            }

            
        }
        return result;
        
    }
}
