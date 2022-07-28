package day23_selfPractice;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {
        //RemoveIf()Predicate removes all Elements from ArrayList that are matching with the given predicate condition
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8));
        //remove elements less than 5
/*
        for (int i = 0; i < list.size(); i++) {

           //create conditions    //remove()Can't remove elements less than 5
            //in order to remove elements we have to use iterable removeIf()-implicitly uses the iterable to remove objects from collection type
          if (list.get(i)<5){
                list.remove(i);


            }

        }
        System.out.println(list);

          */
        // Predicate
        list.removeIf(each -> each < 5);

        System.out.println(list);

        System.out.println("--------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Python", "c#", "JavaScrip", "Junit", "JQuery", "C#", "Ruby"));
        //        p -present object from ArrayList and then lambda expression  and then objects that starts with J
        names.removeIf(p -> p.startsWith("J"));
        System.out.println(names);
    }
}