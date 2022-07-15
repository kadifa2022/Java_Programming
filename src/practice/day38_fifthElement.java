package practice;

import day03_variables.VariableNamingRules;

import java.lang.reflect.Array;


public class day38_fifthElement {


    public static void main(String[] args) {


        String [] arr = new String[4];

        try{
            System.out.println(Array.get(arr,4));
        }catch (IllegalArgumentException e){
            throw new RuntimeException(e);
        }catch (ArrayIndexOutOfBoundsException e){
            throw new RuntimeException(e);
        }

    }
}
/*
 Write a program that can return the fifth element from an array

        note: avoid getting any exceptions


 */