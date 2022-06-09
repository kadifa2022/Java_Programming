package day20_forEachLoopPractice;

public class CountingPalindrome {//not sure
    public static void main(String[] args) {

        String[] words = {"anna","Java","level","anna"};
        String[] reverseArr = new String[words.length];
        int countPalindrome = 0;

        for (int i = 0; i < words.length; i++) {
            String revWord = " ";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                revWord += words[i].charAt(j);
            }
            reverseArr[i] = revWord;
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < reverseArr.length; j++) {
                if (reverseArr[j].equals(words[i])) {
                    countPalindrome++;
                }

            }
        }

            System.out.println(countPalindrome);


    }
}
/*

write a program that can count how many palindromes in an array of string
        Ex:
                {"anna", "level", "Java"};

                output:
                2

 */