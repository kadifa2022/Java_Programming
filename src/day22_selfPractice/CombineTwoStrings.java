package day22_selfPractice;

import java.util.ArrayList;

public class CombineTwoStrings {
    public static void main(String[] args) {

        ArrayList<String>list=new ArrayList<>();

        String []arr1 = {"A" , "B" , "C"};
        String []arr2 = {"D" , "E" , "F" , "G"};

         //arr1 list
        list.add(arr1[0]);
        list.add(arr1[1]);
        list.add(arr1[2]);
        //arr2 list
        list.add(arr2[0]);
        list.add(arr2[1]);
        list.add(arr2[2]);
        list.add(arr2[3]);

        System.out.println(list);



    }
}
/*
write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};

                output:
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}



 */