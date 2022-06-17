package day22_selfPractice;

import java.util.ArrayList;

public class MinimumAndMaximum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("list = " + list);

        int max = -2147483648;
        int min = 2137483647;

        for (Integer eachElement : list) {

            if (eachElement > max) {
                max = eachElement;
            }
            if (eachElement < min) {
                min = eachElement;
            }
        }
        System.out.println("min =" + min);
        System.out.println("max =" + max);
    }


}


/* Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1


 */