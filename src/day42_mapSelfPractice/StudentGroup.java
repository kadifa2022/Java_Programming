package day42_mapSelfPractice;

import java.util.*;

import java.util.LinkedHashMap;

public class StudentGroup {

    public static void main(String[] args) {

        String [] group1 = { "Jasmina", "Said", "Mustafa", "Mohammed", "Ahmed", "Semir", "Redzep", "Chris"};
        String [] group2 = { "Tina", "Maya", "Rabija", "Mohammed", "Sara", "Aylin", "Ali", "Arifa"};
        String [] group3 = { "Tatiana", "Victoria", "Ivana", "Yumna", "Fadila", "Asim" , "Vahida"};
        String [] group4 = { "Husein", "Bajro", "Bajrama", "Asima", "Nijaz", "Rasema", "Amar", "Arman"};
        String [] group5 = { "Zifa", "Munevera", "Ilfan", "Mesa", "Sabit", "Smail", "Hazim", "Ibrahim"};


        Map<Integer, String []> groups = new LinkedHashMap<>();
       groups.put(1, group1);
       groups.put(2, group2);
       groups.put(3, group3);
       groups.put(4, group4);
       groups.put(5, group5);


        System.out.println(Arrays.toString(groups.get(1)));

       for(Map.Entry<Integer, String[]>  entry: groups.entrySet()){
           System.out.println(entry.getKey() + ":" + Arrays.toString(entry.getValue()));
           }

           }
       }








/*
Given the following arrays that contains the names of the students from each group:
	        String[] group1 = {};
	        String[] group2 = {};
	        String[] group3 = {};
	        String[] group4 = {};
	        String[] group5 = {};

	    4.1 Create a map that contains group id and names of group members

	            Map<Integer, String[]> groups = new LinkedHashMap();

	        add all the group 1d and group members into the map named groups

	    4.2 Display the names of each student with group id of 1

	    4.3 Display the names of each student from each groups



 */