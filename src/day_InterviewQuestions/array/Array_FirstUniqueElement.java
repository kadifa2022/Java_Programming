package day_InterviewQuestions.array;

public class Array_FirstUniqueElement {



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
