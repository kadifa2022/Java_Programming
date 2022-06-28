package day10_string;


import java.util.Scanner;

public class StringMethod1 {

    public static void main(String[] args) {//to find  each character
        String str = "Cydeo";
        //  index:    01234

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        // char nthChar = str.charAt(25);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

        //   System.out.println(nthChar);


        System.out.println("--------------------------------------------------");

        String sentence = "Java Programming Language";//length of string 25 and

        int length = sentence.length();//int for the number of the length

        System.out.println(length);

        int lastIndex = length - 1;

        System.out.println(lastIndex);//to find last index


        System.out.println("--------------------------------------------------");

        String s1 = "Java is the best programming language";

        char f = s1.charAt(0); //first

        int lastIndexNum = s1.length() - 1;//last character of sentence

        char l = s1.charAt(lastIndexNum);//last index methode

        System.out.println(f + " : " + l);

        System.out.println("--------------------------------------------------");

        String name1 = "Umran";//equals methode
        String name2 = new String("Umran");

        System.out.println(name1 == name2);//false
        System.out.println(name1.equals(name2));//use  methode equals than become true

        System.out.println("---------------------------------------------------");

        String r1 = "Java";
        String r2 = "Java";

        String r3 = new String("Java");


        System.out.println(r1 == r2); // true
        System.out.println(r1 == r3); // false
        System.out.println(r2 == r3);  // false

        System.out.println(r1.equals(r3)); //true
        System.out.println(r2.equals(r3)); // true

        System.out.println("------------------------------------------------------");

        Scanner input= new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();//for age

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next(); //for literate

        if (age >= 21 && answer.equals("yes")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }


        input.close();


    }
}












