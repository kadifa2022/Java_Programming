package practice.numberTask;

import java.sql.SQLIntegrityConstraintViolationException;

public class Number_MaximumPossibleNumber {


/*
Write a function solution that, given an integer N, returns the maximum possible value obtained by inserting one '5' digit inside the decimal representation of integer N.
Examples: 1. Given
2. Given 3. Given 4. Given
N = 268, the function should return 5268
N = 670, the function should return 6750. N = 0, the function should return 50.
N = -999, the function should return -5999.
Assume that:
• N is an integer within the range (-8,000..8,000).
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
*/


    public static int solution(int N) {
        String s = "" + Math.abs(N);
        int max = Integer.valueOf(s + 5);
        if (N > 0) {
            for (int i = 0; i < s.length(); i++) {
                String c = "" + s.charAt(i);
                String t = s.replaceFirst(c, 5 + c);
                if (Integer.valueOf(t) > max) {
                    max = Integer.valueOf(t);
                }
            }
        } else if (N < 0) {
            for (int i = 0; i < s.length(); i++) {
                String c = "" + s.charAt(i);
                String t = s.replaceFirst(c, 5 + c);
                if (Integer.valueOf(t) < max) {
                    max = Integer.valueOf(t);
                }
            }
            max = -max;
        } else {
            max = 50;
        }
        return max;
    }
    }