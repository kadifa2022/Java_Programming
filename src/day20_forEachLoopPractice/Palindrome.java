package day20_forEachLoopPractice;//not good

import utilities.StringUtility;

public class Palindrome {

    public static void main(String[] args) {
        String [] array = {"anna", " level", " Java"};
        String reverse = " ";
        int count = 0;

        for (String each : array){

            for (int i = each.length() - 1; i >= 0; i--) {


                reverse += each.charAt(i);

                if (each.equalsIgnoreCase(reverse)){
                    count ++;
                }
        }
        reverse = " ";
        }
        System.out.println(count);
    }
}

/*
write a program that can count how many palindromes in an array of string
        Ex:
                {"anna", "level", "Java"};

                output:
                2



 */



