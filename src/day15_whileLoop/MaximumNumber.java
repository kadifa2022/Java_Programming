package day15_whileLoop;


import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int max = -2147483648; //i: 1 2 3 4// any number that user entered will be grater than this number

        for(int i = 0; i < 5; i++){
            System.out.println("Enter a number");
            int num = input.nextInt();//-25,35,15,40,0

            if(num> max){//if the user entered entry is grater than current maximum number that we have
                max =  num;//then user entered number should be the maximum number


            }


        }

        System.out.println("Maximum number is: = " + max);
        input.close();


    }


}


/*
2. Write a program that can ask the user to enter a number for 5 times and returns the maximum number
 */