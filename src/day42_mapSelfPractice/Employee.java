package day42_mapSelfPractice;



import java.util.*;

public class Employee {
    public static void main(String[] args) {


        Map<String, int[]> students= new HashMap<>();

        students.put("John", new int[]{90,75,90,70,100});
        students.put("Antony", new int[]{80,60,80,80,60});
        students.put("Jimmy", new int[]{70,85,95,90,89});
        students.put("Jalil", new int[]{90,70,87,90,75});
        students.put("James", new int[]{80,70,80,90,95});

        for (Map.Entry<String, int[]> each: students.entrySet()){
            System.out.println(each.getKey()+ ": " + Arrays.toString(each.getValue()));
        }

    }
}
/*
1. Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each
     student has 5 scores and make the student name unique)
		1.1 add at least 5 paris into the map
		1.2 Write a program that can display each student name and scores





 */