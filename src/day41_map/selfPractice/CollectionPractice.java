package day41_map.selfPractice;

import day21_selfPractice.EachElement;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4));


        List<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(5,6,7,8,9));




        List<List<Integer>> list = new ArrayList<>();// nested list first we get()for Array index and get()and index  for element

        list.add(list1);
        list.add(list2);
        System.out.println(list);

        System.out.println(list.get(1).get(3));//get() and pass index


        System.out.println("-----------------------------------------" );

        // iterator we use to remove elements from collection when we use loop 

        for (List<Integer> eachList:list) {
            for (Integer eachElement: eachList) {
                System.out.println(eachElement);
            }
        }

        System.out.println("--------------------------------------------------");
        // only sets can be added because we specified for set objects
        List<Set<Integer>> listOfSets= new ArrayList<>();

        listOfSets.add(new LinkedHashSet<>());//if orders matter LinkedHashSet

        listOfSets.add(new LinkedHashSet<>());//0  //duplicates not alowed
        listOfSets.add(new LinkedHashSet<>());//1
        listOfSets.add(new LinkedHashSet<>());//2
        listOfSets.add(new LinkedHashSet<>());//3

        System.out.println(listOfSets);

        listOfSets.get(0).addAll(Arrays.asList(10,15,10,30,40));
        listOfSets.get(1).addAll(Arrays.asList(2,3,5,6,7,8));
        listOfSets.get(2).addAll(Arrays.asList(6,7,8,9,1,2));
        listOfSets.get(3).addAll(Arrays.asList(12,13,24,445));
        listOfSets.get(4).addAll(Arrays.asList(22,33,44,45));


        System.out.println(listOfSets);


        System.out.println("------------------------------------");

        int[] arr1={1,2,3,4,5,6};
        int[] arr2={7,8,9,10,11};

        List<int[]> listOfArrays = new ArrayList<>();

        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        listOfArrays.get(0)[2]= 35; //replace with 35 under index 2

        System.out.println(Arrays.toString(listOfArrays.get(0)));

















    }
}
