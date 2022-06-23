package day_InterviewQuestions;

import java.util.ArrayList;//please check

/*public class ArrayPalindrome {

    public static void main(String[] args) {
        String[] arr = {"abc", "car", "ada", "racecar", "cool" };

        System.out.println((isArrayPalindrome1(arr)));
        System.out.println((isArrayPalindrome(arr)));


    }

    public static ArrayList<String> isArrayPalindrome(String[] arr) {
        //array list
        //check each element in the array
        ArrayList<String> palindrome = new ArrayList<>();

        // now we check if it is a palindrome

        String reverse = "";
        for (String each : arr) {
            reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            if (reverse.equals(each)) {
                palindrome.add(each);
            }
        }


        return palindrome;
    }

    public static ArrayList<String> isArrayPalindrome1(String[] arr) {
        //array list
        //check each element in the array
        ArrayList<String> palindrome = new ArrayList<>();

        // now we check if it is a palindrome


        for (String each : arr) {
            //using V's method

            if (PalindromeString.isPalindrome(each)){

                palindrome.add(each);
            }
        }


        return palindrome;
    }
}
/*
Input: String[] arr = {“abc”, “car”, “ada”, “racecar”, “cool”}
Output: [“ada”, “racecar”]
Explanation: These two are the only palindrome strings in the given array
Input: String[] arr = {“def”, “ab”}
Output:[]

*/