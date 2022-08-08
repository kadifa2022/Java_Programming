package day14_selfPractice;

public class PalindromeString {

    public static void main(String[] args) {
        String s = " ana";
        String result = "";


        for (int i = s.length() -1; i >=0; i--) {
            result +=s.charAt(i);

        }
        boolean isPalindrome = s.equalsIgnoreCase(result);
        System.out.println(result);

    }



}
