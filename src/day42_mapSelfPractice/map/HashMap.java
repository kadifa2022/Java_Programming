package day42_mapSelfPractice.map;

import jdk.swing.interop.SwingInterOpUtils;
import labs_.lab12_oppException.restorantTask.Employee;

import java.util.EnumMap;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {


        Map<String, String> employeeMap = new java.util.HashMap<>();      //Random Order(no order),key values can be null,
        // no duplicates, no synchronized

        employeeMap.put("Sara", "F");
        employeeMap.put("Julia", "F");
        employeeMap.put("Mirela", "F");
        employeeMap.put("Samira", "F");
        employeeMap.put("Muhamed", "M");
        employeeMap.put("Suad", "M");
        employeeMap.put("Ivan", "M");
        employeeMap.put("Husein", "M");

        int countMaleEmployee = 0;
        int countFemaleEmployee = 0;

        for (String eachValue : employeeMap.values()) {
            if (eachValue.equals("F")) {
                countFemaleEmployee++;
            } else {
                countMaleEmployee++;
            }


        }
        System.out.println("Male Employees " + countMaleEmployee);
        System.out.println("Female Employee " + countFemaleEmployee);


        System.out.println("--------------------------------------------------------");

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("F")) ;
            System.out.println(eachEntry.getKey());
        }

        System.out.println("---------------------------------------------------------");


        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("M")) {
                eachEntry.setValue("Male");
            } else {
                eachEntry.setValue("Female");
            }
        }
        System.out.println(employeeMap);
    }
}