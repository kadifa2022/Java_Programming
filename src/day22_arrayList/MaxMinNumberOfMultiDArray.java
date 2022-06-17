package day22_arrayList;

public class MaxMinNumberOfMultiDArray {

    public static void main(String[] args) {
        // index of elements: 0     1    2    0    1    2      0     1   2
          int [][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };//indexes of array 0 ~ 2
        //index of 1D array

        int max = array[0][0];// for each loop
        int min = array[0][0];

        for(int[]each1D:array) {
            for (int eachElement : each1D) { //Element and arr
                if (eachElement > max) {
                    max = eachElement;
                }
                if (eachElement< min){//for minimum
                    min += eachElement;
                }
            }
            System.out.println("Maximum number is: " + max);
            System.out.println("Minimum number is: " + min);


        }


    }
}


/*
2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
        Ex:
            array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

            output:
                Minimum number is: -200
                Maximum number is: 1000

 */

