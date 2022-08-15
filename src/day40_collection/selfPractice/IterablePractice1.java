package day40_collection.selfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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

    }
}