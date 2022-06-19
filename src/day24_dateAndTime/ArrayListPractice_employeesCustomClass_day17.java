package day24_dateAndTime;
import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListPractice_employeesCustomClass_day17 {

    public static void main(String[] args) {//1.employee class from day 17 -import class

        ArrayList<Employee> employees = new ArrayList<>();//array list itself is from differet package java.util pakage solution-iport class
        employees.addAll(Arrays.asList(//allows us to add multiple elements objects-accept only collection type-in order to pass as collection type form Array.util.class-import from java.util.package
                                        // then add elements to addAllMethode -import LIST-to get employee objects = set.info methode//instance methode//set information separately

                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");
                    //variable is employee each
        for (Employee each: employees){//use for each loop in access to all name -for the variable is employee
            System.out.println(each.name +" :" +each.jobTitle );//requirement is each object + job title-if select only name they will print everything

        }
        System.out.println("-------------------------------------------------------");

        for (Employee each : employees) {//display only(java developer)
                                                     //another loop if condition use equals methode to compare
            if(each.jobTitle.equals("Java Developer")){ // if the job title of the employee is Java Developer
                System.out.println(each.name);  // prints the name of the employee
            }
        }


        System.out.println("-------------------------------------------------------");

        double max = employees.get(0).salary;//assign use get methode-call salary -double-loop
        double min =  employees.get(0).salary;

        for (Employee each : employees) {//for each loop

            if(each.salary > max){//to get maximum salary
                max = each.salary;
            }

            if(each.salary < min){//to get minimum salary
                min = each.salary;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-------------------------------------------------------");

        ArrayList<Employee> femaleEmployees = new ArrayList<>();//for female
        ArrayList<Employee> maleEmployees = new ArrayList<>();//for male employee

        for (Employee employee : employees) {//equal operator for compare genders
            if(employee.gender == 'M'){  // if the employee is male
                maleEmployees.add(employee);
            }else{
                femaleEmployees.add(employee);
            }

        }

        System.out.println("Total number of female employees: " + femaleEmployees.size());
        System.out.println("Total number of male employees: " + maleEmployees.size());



    }


}


/*
1. Given the following arraylist of Employees:
            ArrayList<Employee> employees = new ArrayList<>();
            employees.addAll(Arrays.asList(
                   new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
            ));

            employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
            employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
            employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
            employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
            employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

            Note: Employee class is imported from day17 package

        1.1 Write a program that can display the name and job title of each employee

        1.2 Write a program that can display the names of "Java Developers"

        1.3 Write a progam that can display the maximum and minimum salary

        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists
 */