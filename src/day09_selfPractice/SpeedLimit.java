package day09_selfPractice;

import java.util.Scanner;


public class SpeedLimit {

    public static void main(String[] args) {


        int speedLimit = 55;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your current speed limit");
        int currentSpeed = input.nextInt();

        input.close();

        int overTheLimit = currentSpeed - speedLimit;

        if(overTheLimit > 0){
            System.out.println("You are driving " + overTheLimit + " mph over the speed limit. Slow down!");

        }



    }


}

/*
2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed,
        29 Ex:
        30 speedLimit = 55;
        31 Enter current speed:
        32 105
        33 output:
        34


        You're driving 50 mph over the limit. Slow down!
 */