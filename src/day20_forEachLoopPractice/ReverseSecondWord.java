package day20_forEachLoopPractice;



public class ReverseSecondWord {
    public static void main(String[] args) {


        String str = "I love Java";
        String[] word = str.split(" ");
        String reverse = " ";
        for (int i = word[1].length() - 1; i >= 0; i--) {
            reverse += word[1].charAt(i);
        }
        System.out.println(word[0] + " " + reverse + " " + word [2]);
    }
}
/*

1. Write a program that can reverse the second word of the sentence
        Ex:
        sentence = "I Love Java";

        output:
        I evoL Java
   */
