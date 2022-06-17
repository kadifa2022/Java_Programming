package day21_multiDimensionalArray;//task day20

import java.util.Arrays;

public class RemoveExtraSpace {
    public static void main(String[] args) {
        String str = "Hello word   I    love    Java     ";

        str = str.trim();//you don't need this statement
        System.out.println(str);

        String [] words = str.split("");

        System.out.println(Arrays.toString(words));
        str = "";// set to empty string--- than create for each loop
        //add variable -string variable/
        for (String each: words){
            if (!each.isEmpty()){
                str += each+ "";
            }
        }
        str = str.trim();//for extra spaces on the end
        System.out.println(str);


    }

}


 /*1. Write a program that can remove all the extra space from string
        Ex:
        str = "  Hello world      I      love      Java    "

        Output:
        Hello world I love Java

  */