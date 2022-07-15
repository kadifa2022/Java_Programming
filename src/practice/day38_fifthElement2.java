package practice;

import java.lang.reflect.Array;

public class day38_fifthElement2 {


    public static void main(String[] args) {

        String [] array = new String[3];

        try{
            System.out.println(array[4]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(array[array.length -1 ] +":object in the last index" + (array.length-1));
            e.printStackTrace();

        }


    }
}
/*
 Write a program that can return the fifth element from an array

        note: avoid getting any exceptions



 */