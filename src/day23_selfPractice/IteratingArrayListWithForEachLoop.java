package day23_selfPractice;

import java.util.ArrayList;

public class IteratingArrayListWithForEachLoop {

    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        //for each loop-no index number
        //Integer /int
        for (Integer each:numbers) {
            System.out.println(each);

        }
        System.out.println("-------------------------------");
            //can not be used for reverse order
         //can be only used to iterate  elements from beginning to the end
        for (Integer each : numbers) {
            System.out.println(each);
            
        }
    }

}
