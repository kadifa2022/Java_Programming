package day23_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {//those are collections methods//addAll, removeAll, retainAll, containsAll--for bulk Collections
                             //  add all than(Array.as and pass arguments --list methode to
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();//array list of Integer elements

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list1 = new ArrayList<>();//Array list
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1, numbers);//this how we add list--must be collection type


        System.out.println(list1);

        System.out.println("-----------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();//another approach  to add list

        scores.addAll( Arrays.asList(75, 85, 95, 70, 80) );//add all methode(multiple elements to arraylist) and asList methode -list- collection type we have to provide Must be list is collection,

        System.out.println(scores);

        System.out.println("-----------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(  Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal" )   );//element -addALL TAKE ONLY ONE ARGUMENT-
                                   //asList methode we can pass  as many we want--add list --collection
        System.out.println(students);

        students.addAll(2,  Arrays.asList("Shukur", "Sumeye", "Tatiana") );//two options index---two arguments--to which index you want to add elements

        System.out.println(students);

        System.out.println("-----------------------------------------");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};//array can be converted to arrayList//must be non-primitive type--intend of int [] Array -Integer

        ArrayList<Integer> l1 = new ArrayList<>( Arrays.asList(nums) );//converted calling asList methode-

        //    l1.addAll(  Arrays.asList(nums) );//we can use this-add all methode

        System.out.println(l1);

        System.out.println("-----------------------------------------");

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll( Arrays.asList(  "Alena", "Muhtar", "Gadir", "Ali" )  );//added to Array list-

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");//contain for one elem.

        boolean hasAlenaGadir = employeesList.containsAll( Arrays.asList("Alena", "Gadir") );//contain all method -For 2 elements we have to pass asList

        boolean hasMuhtarAliKuzzat = employeesList.containsAll( Arrays.asList("Muhtar", "Ali", "Kuzzat") );//FOR ALL TO PASS-false no kuzzat

        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);


        System.out.println("-----------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20) );//remove all methode//only accept collection type - BULK

        list.removeAll( Arrays.asList(10, 20) );//remove all 10,20 asList


        System.out.println(list);

        System.out.println("-----------------------------------------");

        ArrayList<String> developers = new ArrayList<>();//collection type
        developers.addAll( Arrays.asList(  "Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madiyar", "Muhtar", "Muhtar" , "Alena")  );

        developers.retainAll(  Arrays.asList("Alena", "Khashayar", "Muhtar") );//retain all-keep what you need-remove what you don't need

        System.out.println(developers);

        System.out.println("-----------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(
                Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels")
        );

        //   groceriesList.retainAll( Arrays.asList("Eggs", "Potato",  "Milk", "Tomato") );
        groceriesList.removeAll( Arrays.asList("Rice", "Orange", "Strawberry", "Blueberry", "Paper towels") );//remove all

        System.out.println(groceriesList);







    }

}