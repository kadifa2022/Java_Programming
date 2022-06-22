package day23_selfPractice;

import java.util.ArrayList;//not right
import java.util.Arrays;

public class ExtractTheSpecialCharacters {

    public static void main(String[] args) {
        String str ="ABCD123$%#@&456EFG!";

        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> letter= new ArrayList<>();
        ArrayList<String> ch = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i)) ){
                letter.add(""+str.charAt(i));
                if(Character.isDigit(str.charAt(i))){
                    num.add(Integer.valueOf(str.charAt(i)));
                    if (!(Character.isLetterOrDigit(str.charAt(i)))){
                        ch.add(""+str.charAt(i));
                    }
        }
                System.out.println("list1=" + letter +"list2=" + num + "list3=" +ch);







            }
        }




    }
}
/*
Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */