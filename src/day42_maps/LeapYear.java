package day42_maps;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        int year;
        System.out.println("Enter a year::");
        Scanner sc=new Scanner(System.in);
        year= sc.nextInt();

        //evenly divisible(%4==0) logical and(%400=0) logical and (%100 not equal 0)
        if(((year %4==0) &&(year %100 !=0)) ||(year %400 ==0)){
            System.out.println("Specific year is a leap year");
        }else
            System.out.println("Specific year is not a leap year");




    }

}
