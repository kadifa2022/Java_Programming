package day10_selfPractice_day11Practice;

import java.util.Scanner;

public class NumberOfPeople {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you leave with");
        int number = input.nextInt();

        input.close();//no longer needed

        String result= "";

        if(number < 3 ){
            result = " Leave with less than 3 people";

        }else if (number <= 6) {
            result = " Leave with 3-6 people";
        }else{
            result= "Leave with more than 6 people";


        }

        System.out.println(result);
    }
}
