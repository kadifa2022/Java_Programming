package day24_selfpractice;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class SecondMaximumAndMinimumNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,-2,-2,-2,3,4,5, 6,7,8,8,8,8));


        numbers.removeIf(p ->p == Collections.max(numbers) ||p == Collections.min(numbers));
        System.out.println("maximum number is:" + Collections.max(numbers));
        System.out.println("minimum number is:" + Collections.min(numbers));


    }
}
/*Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops


 */