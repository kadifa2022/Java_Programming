package day15_selfPractice;

import java.util.Locale;
import java.util.Scanner;

public class marriageProposal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me");
        String answer = input.next().toLowerCase();

        while(!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid answer, please answer yes or no:");
            answer=input.next().toLowerCase();
        }
        if(answer.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Good Bye");
        }

        input.close();

    }
}




/*
1.  Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
        if the answer is yes, print "Congrats."
        if the answer is no, print "Goodbye"
        if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
*/