package day20_forEachLoopPractice;

public class UniqueElements {

    public static void main(String[] args) {
        String result = " ";
        int [] arr = {1, 2, 3, 1, 2, 4, 5, 5};

        for (int each : arr){
            int count = 0;
            for ( int each2: arr){
                if (each == each2){
                    count++;
                }
            }
            if (count == 1) {
                result += each + " ";
            }
        }

        System.out.println(result);

    }
}
/*
    Write a program that can display the unique elements of an array

    MUST use for each loops
*/