package day_InterviewQuestions.array;

import day21_selfPractice.Arrays;

public class Array_FirstUniqueElement {
    public static void main(String[] args) {
        int[] array = {10, 10, 12, 4, 5,};
        System.out.println(firstDuplicatedElement(array));
    }



    /*
    write a program that can find the first duplicated element from the array
    */
    public static int firstDuplicatedElement(int [] array) {
        int firstDuplicated = 0;

        for (int each:array) { //forEach loop
            int frequency = 0;
            for (int each2:array) {
                if (each ==each2)
                    frequency++;
            }
            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }
        return firstDuplicated;
    }
}
