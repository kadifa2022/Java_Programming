package day01_selfPractice.Practice;

import java.util.Scanner;

public class GallonsToLitters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter gallons");
        double gallon = scanner.nextInt();
        double litters = gallon * 3.79;
        System.out.println(gallon + " is equal to " + litters + "litters." );


    }
}
