package day12_customMethods;

public class CustomMethodsPractice {


    public static void main(String[] args) {

        maxNum(10.5, 20.5);//max number


        System.out.println("---------------------------------------");//custom methode

        maxNum(15000, 16000);

        System.out.println("-------------------------------------");

        maxNum(-200, -20);


        System.out.println("-------------------------------------");//initial

        initial("Cydeo", "School");


        System.out.println("-------------------------------------");

        initial("Mohammad", "Karim"); //M.K

        System.out.println("-------------------------------------");

        initial("Hasan", "Ayhan"); //H.A

        System.out.println("------------------------------------");

        initial("Java", "Programming"); //J.P


    }


    // create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)
    public static void maxNum(double num1, double num2) {//Methode to find maxNumber

        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number");//Methode for any two numbers to find maxNumber int and decimal any number 
        } else if (num2 > num1) {
            System.out.println(num2 + " is the maximum number");
        } else {
            System.out.println("Equal");
        }

    }


    //Create a method that can display the initials of a person  (firstName, lastName)
    public static void initial(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);//Custom Method for initial

        System.out.println("initial is: " + initial);

    }


}
/*
   2. Create a methode that can display the initials of a parson.

    1. Create a methode that can print the maximum number between two numbers, if both are equal print"equal".
 */










