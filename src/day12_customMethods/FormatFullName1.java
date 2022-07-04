package day12_customMethods;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class FormatFullName1 {

    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstN = input.nextLine();//trim method use if you have empty spaces.trim()

        System.out.println("Enter your last name:");
        String lastN = input.nextLine();

        System.out.println(firstN+  " " +lastN);


        System.out.println("--------------------------------------------------------------------");


        String first = "kAdiFA";
        String last = "kUdIC";
        first = first.substring(0,1).toUpperCase()+ first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase()+ last.substring(1).toLowerCase();

        String fullName=first + " " +last;

        System.out.println(fullName);

    }
}
