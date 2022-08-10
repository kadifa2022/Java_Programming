package day_InterviewQuestions.list;

import java.util.Iterator;
import java.util.List;



public class List_RemovePalindromeString1 {

    /*
    remove palindrome strings from a List of String
    */
    //solution 1

    public static List<String> removePalindrome(List<String>list){
        Iterator <String> it= list.iterator();
        while (it.hasNext()) {
            String word = it.next();
            String reversed = "";


            for (int i = 0; i <word.length()-1 ; i--) {
                reversed += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reversed)){
                it.remove();
            }
        }
        return list;
    }

}
