package day_InterviewQuestions.string;

public class String_CountOfRepeatingChars {
    /* Write a methode that compresses a string based on the count of repeated characters. aabcccddaaa-->a2b1c3d2a4
    */


    public static String solution(String str){
        String result = "";
        int count =0;
        char temp = str.charAt(0);

        for (char c : str.toCharArray()){
            if(temp==c){
                count++;
            }else{
                result +=""+temp + count;
                temp =c;
                count = 1;

            }
        }

        result += "" +temp + count;
        return result;
    }


    }

