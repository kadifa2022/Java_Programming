package day12_selfPractice;


import java.sql.SQLOutput;

public class capitalization {


    public static void main(String[] args) {


        capitalization("cyDeO", "sCHooL");

    }

    public static void capitalization(String firstName, String lastName){

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(firstName+" " +lastName);


    }


}
/*
    Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School

*/
