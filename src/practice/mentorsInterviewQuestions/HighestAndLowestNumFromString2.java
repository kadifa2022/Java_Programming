package practice.mentorsInterviewQuestions;



public class HighestAndLowestNumFromString2 {
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
        String highAndLow(String str){
            String [] strings =str.split(" ");
            int min = Integer.MAX_VALUE;
            int max = Integer.MAX_VALUE;
            for (String s:strings) {
                int num = Integer.parseInt(s);
                min = Math.min(num,min);
                max = Math.max(num, max);

            }
            return max + " " + min;
        }


    }


