package day09_selfPractice;

import java.util.Scanner;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = input.nextInt();


        if (age >= 21 ){
            System.out.println("Eligible to buy alcohol");

        }else{
            System.out.println("Not eligible to buy alcohol");
        }
        System.out.println(age);

        input.close();





    }
}
