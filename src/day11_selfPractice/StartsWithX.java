package day11_selfPractice;



public class StartsWithX {
    public static void main(String[] args) {
        String str="xcodex";
        if (str.charAt(0) =='x'){
            str=str.replaceFirst("x", "a");

        }
        System.out.println(str);
    }

}
/*
Create a class named StartsWithX and write a program that asks user to
enter a word. If the word starts with x, replace Input:
xcodex Output:
acodex

 */