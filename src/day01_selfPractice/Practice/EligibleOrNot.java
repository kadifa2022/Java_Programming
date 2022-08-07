package day01_selfPractice.Practice;

import java.util.Scanner;

public class EligibleOrNot {

    public static void main(String[] args) {

        System.out.println("Please enter your age:");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String result;

        if (age >=21){
            result = "Eligible to buy alcohol";

        }else{
            result = "Not Eligible to buy alcohol";

        }
        System.out.println(result);

    }
}
