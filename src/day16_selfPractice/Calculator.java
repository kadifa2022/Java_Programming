package day16_selfPractice;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Please Enter your first number");
            double num1 = input.nextDouble();
            System.out.println("Please enter your second number");
            double num2 = input.nextDouble();

            System.out.println("Please enter a math operator");
            char operator = input.next().charAt(0);

            while(!(operator == '+' || operator == '-' || operator == '*' || operator == '/') ) {
                System.err.println("Invalid operator ! Please re-enter the math operator");
                operator = input.next().charAt(0);
            }

            if(operator == '+'){
                System.out.println(num1 + num2);
            }else if(operator == '-') {
                System.out.println(num1 - num2);
            } else if (operator == '*') {
                System.out.println(num1 * num2);
            }else {
                System.out.println(num1 / num2);
            }
            System.out.println("Would you like to continue? (Yes/No)");
            String answer = input.next().toLowerCase();

          input.close();
        }
    }
}