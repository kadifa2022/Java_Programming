package day23_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("-------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

        // groceriesList[2] = "Oranges";
        groceriesList.set(2, "Oranges");//to change Apple with Orange

        System.out.println(groceriesList);

        groceriesList.add(2, "Chicken");//

        System.out.println(groceriesList);

        groceriesList.remove(0);//index removed

        System.out.println(groceriesList);

        groceriesList.remove("paper Towels");//object removed

        System.out.println(groceriesList);


        System.out.println("-------------------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4


        boolean r1 = numbers.remove( Integer.valueOf(10) );//methode to remove Integer

        System.out.println(numbers);

        System.out.println(r1);//boolean return T or F

        numbers.clear();

        System.out.println(numbers);
        System.out.println(numbers.size());


        System.out.println("-------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(  names.indexOf("Vasyl") );//INDEX
        System.out.println( names.lastIndexOf("Vasyl") );// OBJECT 1

        System.out.println( names.lastIndexOf("Sumeye") );//RETURN 5


        boolean hasMuhtar = names.contains("Muhtar"); // false----check for the name in array list
        boolean hasAli = names.contains("Ali"); // true----check for name in arraylist

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);

        System.out.println("-------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);


        ArrayList<Integer> l1 = new ArrayList<>();//they are 2 different  objects
        ArrayList<Integer> l2 = new ArrayList<>();//

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1 == l2);//==not for comparing

        System.out.println(l1.equals(l2));//equals methode for comparing by indexes


        System.out.println("-------------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();//contains same elements
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();//elements must be in same order to return true
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));//in same order elements must be to return true


        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();// methode  for clean ArrayList

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());










    }

}