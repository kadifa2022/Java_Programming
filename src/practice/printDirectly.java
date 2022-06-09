package practice;

import java.util.Scanner;

public class printDirectly {
    public static void main(String[] args) {

            System.out.println("Be yourself: everyone else is already taken");
            System.out.println("Be yourself: everyone else is already taken");
            System.out.println("Be yourself: everyone else is already taken");
            System.out.println("Be yourself: everyone else is already taken");
            System.out.println("Be yourself: everyone else is already taken");
            System.out.println("--------------------------------------------------");


        for(int i = 0; i <5; i++) {
            System.out.println("Be yourself: everyone else is already taken");

        }

        System.out.println("-------------------------------------------------" );

        int counter = 0;
        while(counter < 5){
            System.out.println("Be yourself: everyone else is already taken");
            counter = counter + 1;
        }
        System.out.println("--------------------------------------------------" );

        int number1 = (int)(Math.random() * 10); //while loop-continuation-condition
        int number2 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + " ? ");

        int sum = number1 + number2;
        int userAnswer = input.nextInt();

        while (sum == userAnswer){
            System.out.println("Try again.");
            userAnswer= input.nextInt();
        }
        System.out.println("You Got it!");
        System.out.println("----------------------------------------------------");


        int sum1 = number1 + number2;
        int userAnswer1 = 0;
        do{
            System.out.println("What is " + number1 + " + " + number2 + "? ");
            userAnswer1 = input.nextInt();
        }while(sum1 == userAnswer1);
        System.out.println("You got it!");



        }
    }
