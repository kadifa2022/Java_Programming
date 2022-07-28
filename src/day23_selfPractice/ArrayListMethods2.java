package day23_selfPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Banana");
        groceryList.add("Apple");
        groceryList.add("Cheese");
        groceryList.add("Soy.Sauce");
        groceryList.add("Salt");
        groceryList.add("Sugar");

        //contains()element: checks if arrayList contains that element-returns boolean
        boolean r1 = groceryList.contains("eggs");
        System.out.println(r1);

        //equals(list): checks if the ArrayList is equal to another ArrayList, return type -boolean
      ArrayList<String> list1 = new ArrayList<>();

         list1.add("Banana");
         list1.add("Apple");
         list1.add("Cheese");
         list1.add("Soy.Sauce");
         list1.add("Salt");
         list1.add("Sugar");


       boolean r2 = list1.equals(groceryList);

       System.out.println(r2);

        System.out.println("---------------------------------------------------------");

       //isEmpty()-checks if the ArrayList is empty-return boolean

        boolean r3 = groceryList.isEmpty();
        System.out.println(r3);

        System.out.println("-------------------------------------------------------------");
            //BULK OPERATION -COLLECTION TYPE

        ArrayList<Integer>numbers=new ArrayList<>();
        //containsAll(collection type)/checks if the ArrayList
        // contains all the given collection of Value/return types boolean
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);
            numbers.add(50);
            numbers.add(60);
            //from array utility call Array.asList

        //Arrays.asList(10,20,30,40);bulk operation collection type
       boolean r4 =numbers.containsAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(r4);

        System.out.println("---------------------------------------------");
        //addAll(collection) adds all the given collection of value to the ArrayList

        numbers.addAll(Arrays.asList(70,80,90,95,100));//added all form r4

        System.out.println(numbers);

        System.out.println("-----------------------------------------");
        //removeAll() CollectionType-removes all the matching values from arrayList
        numbers.removeAll(Arrays.asList(10,50,80));
        System.out.println(numbers);

        System.out.println("-----------------------------------");
        //retainAll()collectionType-removes all un_matching values from the ArrayList(keeps the matching values only)

        numbers.retainAll(Arrays.asList(20,30,40,70));
        System.out.println(numbers);



    }
}
