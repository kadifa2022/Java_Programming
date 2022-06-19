package day24_selfpractice;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {


        ArrayList<Character>  ch = new ArrayList<>(Arrays.asList('$','A','B','1', '2','C','D', '!', '3', '4'));
        ch.removeIf(p-> !Character.isLetterOrDigit(p));
        System.out.println(ch);

    }



}
/*
Write a program that can remove all the special characters from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			[A', 'B', '1', '2', 'C', 'D', '3', '4']

	Note: DO NOT use any loops

 */