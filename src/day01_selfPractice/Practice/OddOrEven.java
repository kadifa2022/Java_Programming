package day01_selfPractice.Practice;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write a nuber.");
        int number = input.nextInt();
        boolean isEven = number %2 ==0, isOdd = number % 2 !=0;
        System.out.println(number + " is a even number: " + isEven + "\n" + number + "is an odd number: " + isOdd);

    }
}
