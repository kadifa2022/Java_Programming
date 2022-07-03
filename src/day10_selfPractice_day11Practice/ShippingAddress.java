package day10_selfPractice_day11Practice;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();
        System.out.println("Enter your building number:");
        String buildingNumber = input.next();
        input.nextLine();
        System.out.println("Enter your Street name:");
        String streetName = input.nextLine();
        System.out.println("Enter your city name:");
        String cityName = input.nextLine();
        System.out.println("Enter your State:");
        String state = input.nextLine();
        System.out.println("Enter your zip code");
        String zipCode = input.next();


        System.out.println("Your shipping address is:");

        System.out.println("\t" + full_name);
        System.out.println("\t" + buildingNumber+ " " +streetName);
        System.out.println("\t" + cityName + ", " + state + " " + zipCode
        );
    }}
/*
        System.out.println("full_name= " + full_name);
        System.out.println("buildingNumber= " + buildingNumber);
        System.out.println("streetName= " + streetName);
        System.out.println("cityName =" + cityName);
        System.out.println("state= " + state);
        System.out.println("zipCode + " + zipCode);






1. Create a class named ShippingAddress and ask the user to:
        1.1 Enter your full name ( nextLine() )
        1.2 Enter your building number ( next() )
        1.3 Enter your Street name ( nextLine() )
        1.4 Enter your city name ( nextLine() )
        1.5 Enter your state ( nextLine() )
        1.6 Enter your zip code ( next() )
        1.1 Enter your full name ( nextLine() )
        1.2 Enter your building number ( next() )
        1.3 Enter your Street name ( nextLine() )
        1.4 Enter your city name ( nextLine() )
        1.5 Enter your state ( nextLine() )
        1.6 Enter your zip code ( next() )

        1.7 Display the shipping address
        Ex:
        Your shipping address is:
        John Smith
        7925 Jones Branch Dr
        McLean, VA 22012
        1.7 Display the shipping address
        Ex:
        Your shipping address is:
        John Smith
        7925 Jones Branch Dr
        McLean, VA 22012

 */
