package day40_collection.selfPractice;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {



        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList
                ("Java", "Payton", "Cydeo", "Car","Level","civic", "Radar","kayak", "reviver", "racecar", "madam"));

        Iterator<String> it = names.iterator();//this is without -> landa expresion

        while(it.hasNext()){
            String each= it.next();

            String reverse = "";

            for (int i = each.length()-1; i>=0 ; i--) { // this is how to reverse string
                reverse += each.charAt(i);
                
            }
            if(each.equalsIgnoreCase(reverse)){//compare each element with reverse version if the are equal  its palindrome
               // names.remove(each);//in loop we can't use collection remove()
                it.remove();// use iterator () in loop
            }

        }
        System.out.println(names);

        System.out.println("------------------------------------------------------");

        List<String> names2= new ArrayList<>();// remove palindrome with lambda ->
        names2.addAll(Arrays.asList
                ("Java", "Payton", "Cydeo", "Car","Level","civic", "Radar","kayak", "reviver", "racecar", "madam"));


        names2.removeIf(p-> StringUtility.reverse(p).equalsIgnoreCase(p));

        //names2.removeIf(p-> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));//second option

        System.out.println(names2);






    }


}
