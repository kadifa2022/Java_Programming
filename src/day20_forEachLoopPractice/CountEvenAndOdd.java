package day20_forEachLoopPractice;

public class CountEvenAndOdd {//must know

    public static void main(String[] args){

        int [] numbers = { 1,2,3,4,5,6,7,8,9,13,43,23,11};

        int countEven = 0;
        int countOdd = 0;

        for (int each: numbers) {
            if (each % 2 ==0){
                countEven++;
            } else {
                countOdd++;
            }

        }
        System.out.println("countOdd: " + countOdd + "\ncountEven: " + countEven);



    }
}
/*
    Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

*/
