package day40_collection.selfPractice;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;
import java.util.*;

public class IterablePractice1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10));

        Iterator<Integer> iterator = list.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());


        System.out.println("---------------------------------------------");
        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Ahmed", "ahmed", "AhMEd", "jOHN", "Mustafa", "Yulia", "Chris", "Ahmed", "Muhamed", "Yousuf"));

        //we have to use iterator

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {// hasNex() is just for checking if it true

            String each = it.next();//get the element

            if (each.equalsIgnoreCase("Ahmed")) {
                it.remove();
            }


        }
        System.out.println(names);
        System.out.println("-----------------------------------------------------");

        List<String>names1= new ArrayList<>();

        names1.addAll(Arrays.asList("AHMED", "aHMED", "jOHN", "mUSTAFA", "Youlia" ,"Chris", "Ahmed", "Muhamed", "Yousuf"));


        names1.removeIf(p->p.equalsIgnoreCase("Ahmed"));

        System.out.println(names1);
        System.out.println("----------------------------------------------------");

        List<Integer> numbers= new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));

        //find the nth largest number
        int n = 5;


        for (int i = 0; i < n-1; i++) {// removeIf() we can use in loop
            numbers.removeIf(p-> Collections.max(numbers)==p);
        }

        int max = Collections.max(numbers);

        System.out.println(max);
    }
}