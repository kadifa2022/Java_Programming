package day_InterviewQuestions.mentorsInterviewQuestions;


import java.util.ArrayList;

import java.util.Collections;

public class HighestAndLowestNumFromString {
    /*
    Question-3 Highest and Lowest Num From String
    You are given a string of space separated numbers and should return the highest and lowest number.
    Examples:
    highAndLow("1 2 3 4 5") // return "5 1"
    highAndLow("1 2 -3 4 5") // return "5 -3"
    highAndLow("1 9 3 4 -5") // return "9 -5"
    Notes:
    All numbers are valid Int32, no need to validate them.
    There will always be at least one number in the input string.
    Output string must be two numbers separated by a single space, and highest number is first.

     */

    //Solution 1
    String highAndLow(String str){
        String [] strings = str.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s:strings) {
            list.add(Integer.valueOf(s));
        }
            return Collections.max(list)+ " " + Collections.min(list);
        }
    }


