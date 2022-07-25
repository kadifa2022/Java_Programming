package practice.mentorsInterviewQuestions;

import java.util.ArrayList;

/*
Question 2 Find Palindrome Strings in given array
        Write a method that takes in a non-empty array of Strings that will return an
        ArrayList which consist of palindromic strings in given array.
        The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.Examples:
        Input:String[] arr= {“abc”, “car”, “ada”, “racecar”, “cool”}
        Output:[“ada”, “racecar”]
        Explanation:These two are the only palindrome strings in the given array Input:String[] arr= {“def”, “ab”}

public class Array_isPalindrome {


    ArrayList<String> getPalindrome(String[] array){
        ArrayList<String> result = new ArrayList<>();
        for (String s : array) {

             //call the methode you have created for question1
            if(Q1_PalindromeString.isPalindrome(s)){
                result.add(s);
            }

        }
        return result;
    }

}*/
public class Array_isPalindrome2{


     ArrayList<String> getPalindromes(String [] input) {
         ArrayList<String> result = new ArrayList<>() ;
         for(String str : input){
             String s = str.toLowerCase().replace(" ", "");
             boolean flag = true;

             for (int i = 0, j = s.length()-1 ; i<s.length()/2; i++, j--) {
                 if (s.charAt(i) != s.charAt(j)){
                     flag = false;
                     break;
                 }
             }
             if (flag){
                 result.add(str);
             }
         }
         return result;
     }
}