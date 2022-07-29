package day24_selfpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionUtilityMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,50,10,20,30,40,50,60,70));
        System.out.println(numbers);

        Collections.sort(numbers);//sorting in ascending order

        System.out.println(numbers);

        Integer max =Collections.max(numbers);
        System.out.println("max=" + max);

        System.out.println("------------------------------------------");

        Integer min =Collections.min(numbers);
        System.out.println("min=" + min);
        System.out.println("-------------------------------------------");

        Collections.reverse(numbers);
        System.out.println(numbers);
        System.out.println("--------------------------------------------");

        Collections.swap(numbers,1,2);

        System.out.println(numbers);

        Collections.swap(numbers, 0,numbers.size()-1);//first and last index

        System.out.println(numbers);
        System.out.println("-------------------------------------------------");
        numbers.addAll(Arrays.asList(50,50,50));//addALL()
        System.out.println(numbers);


       int count =Collections.frequency(numbers, 50);//always Integer
        System.out.println(count);

    }

}
