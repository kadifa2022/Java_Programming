package day24_selfpractice;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class RemoveAllLetters {
    public static void main(String[] args) {
        ArrayList<Character> ch =new ArrayList<>(Arrays.asList('$','A','B', '1', '2','C', 'D', '@', '!', '3','4'));
        ch.removeIf(p->Character.isLetter(p));
        System.out.println(ch);
    }
}
/*Write a program that can remove all the letters from an arrayList of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$',  '1', '2', '@', '!', '3', '4']




 */