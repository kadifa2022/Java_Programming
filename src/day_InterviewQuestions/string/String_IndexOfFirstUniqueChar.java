package day_InterviewQuestions.string;

public class String_IndexOfFirstUniqueChar {
/*
Given a string, find the first non-repeating character in it and return
 its index. If it doesn't exist, return -1.
*/
    public static int IndexOfFirstNonRepeatingChar(String s){
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (char each: s. toCharArray()){
                if(each ==s.charAt(i)){
            }
        }
        if (count == 1) {
            return i;
        }
    }
    return -1;
}
}