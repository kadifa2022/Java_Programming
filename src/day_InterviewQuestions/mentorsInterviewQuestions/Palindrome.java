package day_InterviewQuestions.mentorsInterviewQuestions;

import java.util.Locale;

public class Palindrome {
    /*
    Question 1 Palindrome String
    A string is said to be palindrome after converting all uppercase
    letters into lowercase letters and removing all spaces it reads the same backward as forward.
    For e.g.civic, radar, level, rotor, race car are palindrome because if we try to read it from backward,
    it is same as forward.
    Write a method that accepts a String as argument and return true if it is a palindrome, or false otherwise.
    Assume string has only alphanumeric characters include letters and numbers and spaces,
    ignore upper-lowercase characters.
    Examples:
    Radar →true
    rotator →true
    Summer→false
    Was it a car or a cat I saw →true
    “” →true
    “ ” →true
   */
    public static void main(String[] args) {
        System.out.println(isPalindrome("Java" ));
        System.out.println("-----------------------------------");

        System.out.println(isPalindrome2("ana voli milovana"));
    }

    //Solution 1

    public static boolean isPalindrome(String str){
        if(str.isBlank()){
            return true;
        }
        str =str.toLowerCase().replace(" ","");
        int strLength = str.length();
        for (int i = 0, j = strLength-1 ; i <strLength/2; i++, j--) {
            if (str.charAt(i) !=str.charAt(j)){
                return false;
            }

        }
        return true;
    }

    //Solution2

    public static boolean isPalindrome2(String str){
        if(str.isBlank()){
            return true;

        }
        str = str.replace(" ","").toLowerCase();
        String reverseStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseStr +=""+str.charAt(i);

        }
        return reverseStr.equals(str);
    }
}

