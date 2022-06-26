package day23_ArrayListMethods;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");


        for (String each : names) { //to get each name element
            if(names.indexOf(each) == names.lastIndexOf(each)){//first and last condition for name unique elements
                System.out.println(each);
                // break;//statement for if you want to exit after first element
            }
        }



    }

}