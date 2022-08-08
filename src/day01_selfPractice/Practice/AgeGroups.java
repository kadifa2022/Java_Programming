package day01_selfPractice.Practice;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String result ="";
        System.out.println("Write your age");
        int age = input.nextInt();

               if(age >=1 && age <=2) {
                   result = "Infant";
               }
               if (age>=3 && age<=5) {
                   result = "Toddler";
               }
                if(age >=6 && age<=9) {
                    result = "kid";
                }
                if(age>=10 && age <= 12){
                    result = "pre-teen";
                }
                if (age>=13 && age <=17){
                    result = "Teenager";
                }
                if(age>=18 && age <=20){
                    result = "young adult";
                }
                if(age >= 21 && age <=39 ){
                    result = "Adult";
                }
                if (age >= 40 && age <= 49){
                    result="Young midde-aged Adult";
                }
                if (age>=50 && age <= 54){
                    result = "Middle aged Adult";
                }
                if (age >= 55 && age <=64){
                    result = "Very young Senior Citizen";
                }
                if (age >= 65 && age<=74){
                    result = "Young senior citizen";
                }
                if (age >= 75 && age <=85){
                    result = "Middle senior citizen";
                }
                if ( age >= 86 && age <= 120){
                    result = "senior";
                }
        System.out.println(result);
                }
            }




