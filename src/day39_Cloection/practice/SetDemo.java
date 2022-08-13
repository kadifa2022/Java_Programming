package day39_Cloection.practice;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List<Integer>list= new ArrayList<>();

        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(null, null, null, null));

        System.out.println(list);


        Set<Integer> set1 = new HashSet<>();//order is random  // does not allow duplicate

        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set1);
        System.out.println("------------------------------------------------");

        Set<Integer> set2= new LinkedHashSet<>();

        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set2);

        System.out.println("----------------------------------------------------------");

        Set<Integer> set3= new TreeSet<>();

        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));


        System.out.println(set3);

        String [] words={"Java", "Java", "Phayton", "Phyton", "C#", "C#", "Ruby"};


        Set<String> results= new LinkedHashSet<>();

        results.addAll(Arrays.asList(words));


        System.out.println(results);

       // System.out.println(results.get(1)); no index
                            //called construction to convert -get all elements -call get() to get index
        System.out.println(new ArrayList<>(results).get(1));

        words=results.toArray(new String[0]);//toArray()--Array is the fastest collection type
        System.out.println("Words Array: " + Arrays.toString(words));//converted to array using toArray()

        System.out.println("----------------------------------------------------------");

        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(10, 10,10,20,20,20,30,30,30,40,40,40,50,50,50,5,5,5,5,5,1,1,1,1));

        Set<Integer> n = new TreeSet<>(numbers);//ascending order 1,2,3..  no duplicates
        System.out.println(n);









    }
}
