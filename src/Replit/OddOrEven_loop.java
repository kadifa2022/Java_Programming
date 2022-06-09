package Replit;

public class OddOrEven_loop {
    public static void main(String[] args) {

        String result1 = "";
        String result2 = "";

        for (int i = 2; i <=20 ; i++) {
            if(i % 2 == 0){
                result1 = result1 + i + " ";
            }
        }
        for (int j = 1; j <= 20 ; j++) {
            if (j % 2 !=0){
                result2 = result2 + j + " ";
            }
        }
        System.out.print(result1 + "" + "\n" + result2 + "");

    }



}
/*
Use a loop to print all the even numbers from 1 to 20. Print each number on the same line, with spaces between each
Use another loop to print all the odd numbers from 1 to 20. Print each number on the same line, with spaces between each
Note: In the end there will be two lines. First the line to show all the even numbers and then another line to show all the odd numbers
Main topics: loops, primitive data types, if statement, operators

Example Flow:

2 4 6 .... 18 20
1 3 5 .... 17 19




 */