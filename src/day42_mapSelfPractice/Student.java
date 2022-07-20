package day42_mapSelfPractice;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        Integer max= Integer.MAX_VALUE;
        Integer min=Integer.MIN_VALUE;
        int num=0;

       for(Map.Entry<String, Integer>each: map.entrySet()){
           if(each.getValue()>max){
               max= each.getValue();
           }
           if (each.getValue()<min){
               min= each.getValue();
           }
           if (each.getValue()>=12000 && each.getValue()<=15000){
               num++;
           }
       }
       for(Map.Entry<String, Integer>each: map.entrySet()){
           if(each.getValue().equals(max)) {
               System.out.println(each.getKey() + "has the highest salary");
               }
           if(each.getValue().equals(min)) {
               System.out.println(each.getKey()+ "has the lowest salary");
               }
          }
        System.out.println(num+ "employee make between120k-150k");
       for(Map.Entry<String, Integer>each: map.entrySet()){
           if(each.getValue()< 118000){
               System.out.println(each.getKey()+ ", ");
           }
       }
        System.out.println("makes less than $118k");

       for(Map.Entry<String, Integer> each: map.entrySet()){
           if (each.getValue()< 120000){
              each.setValue(each.getValue() +1000);

               }
           }
        System.out.println(map);
       }

       }

/*
2. Given following map that contains employee name and employee salary:
	 Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

    2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K



 */