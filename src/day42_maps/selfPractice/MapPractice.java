package day42_maps.selfPractice;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        // how many female & male employees in the map?

        int countMaleEmployee = 0;
        int countFemaleEmployee = 0;
        /*
        for(String name : employeeMap.keySet()){
            String gender = employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployee ++;
            }else {
                countFemaleEmployee++;
            }
        }

         */ //not best solution

        for(String eachValue:employeeMap.values()){//better solution
            if(eachValue.equals("F")){
                countFemaleEmployee++;
            }else{
                countMaleEmployee++;
            }
        }
        System.out.println("Male Employees: " + countMaleEmployee);
        System.out.println("Female Employees: " + countFemaleEmployee);

        System.out.println("--------------------------------------");
        //display the names of all the female employees
/*
        for(String name: employeeMap.keySet()){ //not good solution
            String gender= employeeMap.get(name);
            if(gender.equals("F")){
                System.out.println(name);
            }
        }

 */
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }
        }
        System.out.println("-------------------------------------");

        //update all the "M" values with



    }


}
