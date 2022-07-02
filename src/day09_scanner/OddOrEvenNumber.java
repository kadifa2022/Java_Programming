package day09_scanner;

import java.util.Scanner;

public class OddOrEvenNumber {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");

        int num = input.nextInt();

        if (num %2==0){
            System.out.println("is a even number");
        }else{
            System.out.println("is a odd number");
        }
        System.out.println(num);

        input.close();



        }
}
