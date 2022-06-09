package day20_forEachLoopPractice;//not good

import utilities.StringUtility;

public class Palindrome {

    public static void main(String[] args) {
        String [] array = {"anna", " level", " Java"};

        int count = 0;

        for (String each : array){
            if(StringUtility.reverse(each).equals(each)){
                count++;
            }
        }
        System.out.println(count);
    }
}



