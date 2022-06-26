package day23_ArrayListMethods;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        // [Vasyl, Vasyl, Sumeye, Sumeye, Ali, Sumeye] unreferenced and ready for garbage collection

        System.out.println(names);

        ArrayList<String> nonDup = new ArrayList<>();//adding new Arraylist contains methode

        for (String each : names) {//each elements

            if(nonDup.contains(each)){//condition to skip same name - continue
                continue;
            }

            nonDup.add(each);//

        }

        // [Vasyl, Sumeye, Ali]

        names = nonDup;//referenced to new objects

        System.out.println(names);
        System.out.println(nonDup);



    }

}