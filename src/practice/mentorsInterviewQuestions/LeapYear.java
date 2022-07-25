package practice.mentorsInterviewQuestions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        int year;
        System.out.println("Enter a year :: ");
        Scanner sc= new Scanner(System.in);
        year = sc.nextInt();

        //evenly divisible (%4==0) logical And (%400=0) logical And(%100 not equal 0)
         if(((year % 4 == 0) && (year % 100!=0))|| (year % 400==0)) {

             System.out.println("Specified year is a leap year");
         } else
        System.out.println("Specified year is not a leap year");

    }
}
