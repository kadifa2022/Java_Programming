package day20_forEachLoopPractice;

public class ReverseSecondWord1 {

    public static void main(String[] args) {

        String str= "I love Java";
        String [] word = str.split(" ");
        String reverse = " ";
        for (int i = word[1].length() -1; i >= 0; i--) {
            reverse += word[1].charAt(i);
        }

            System.out.println(word[0]+ " " +reverse+ " " + word[2]);





    }
}
