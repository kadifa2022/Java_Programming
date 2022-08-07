package day01_selfPractice.Practice;

import java.util.Scanner;

public class IdentifyNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write a number");
        int number = input.nextInt();
        boolean isPositive = number > 0,
                isNegative = number < 0,
                isZero = number ==0;
        System.out.println(number+ " is positive number:" + isPositive + "\n" + number + " is a negative number: " + isNegative + "\n" +
                number + " is zero:" + isZero);


    }

}
