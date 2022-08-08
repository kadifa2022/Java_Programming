package day01_selfPractice.Practice;

import java.util.Scanner;

public class firstLastLetterSame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first word1:");
        String word1 = input.next();

        System.out.println("Please enter second word2: ");
        String word2 = input.next();
        input.close();

        if(word1.charAt(word1.length()-1 ) == word2.charAt(0)){
            System.out.println(word1 + word2.substring(1));

        }else{
            System.out.println(word1 + word2);
        }


    }
}
/*
    Ask user to enter two words, then add them together and print. But if the last letter if the first
     word and the first letter of the last letter is the same.
 */