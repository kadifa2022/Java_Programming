package day16_selfPractice;


import java.util.Scanner;

public class HashTag {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int n = input.nextInt();
        for (int i = 0; i < n ; i++){
            System.out.print("#");
        }

    }
}
