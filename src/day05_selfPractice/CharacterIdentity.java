package day05_selfPractice;

public class CharacterIdentity {


    public static void main(String[] args) {

        char ch = 'A';

     boolean isDigit = ch >= '0' && ch <= '9';
     boolean isLetter = (ch >= 'A' && ch <='Z') || (ch >= 'a' && ch<='z');
     boolean isSpecialChar = !isDigit && !isLetter;

     String result = "";

     if (isDigit){
         result = "isDigit";
     }
     if( isLetter){
         result = "Alphabetic";
     }
     if (isSpecialChar){
         result = " Special Character";

     }

        System.out.println(result);
    }




}
/*

    Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic C
        Ex:
        ch = '@'
        output:
        Special Character
        ch = '1'
        output:
        digit
        HINT: You may  check out the numbers of the characters on ASCII table
 */