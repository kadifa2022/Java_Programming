package day06_selfPractice;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 3;
        String ageGroup = "";
        if (age <= 2) {
            (ageGroup) = " infant";
        }
        if (age >= 3 && age <= 5) {
            (ageGroup) = "Toddler";
        }
        if (age >= 6 && age <= 9) {
            (ageGroup) = "Kid";
        }
        if (age >= 10 && age <= 12) {
            (ageGroup) = "Pre-Teen";
        }
        if (age >= 13 && age <= 17) {
            (ageGroup) = "Teenager";
        }
        if (age>=18 && age <= 20) {
            (ageGroup) = "Young Adult";
        }
        if (age>=21 && age <= 39){
            (ageGroup) = "Adult";
        }
        if (age>=40 && age <= 49) {
            (ageGroup) = "Young Middle-Aged Adult";
        }
        if (age>=50 && age <= 54) {
            (ageGroup) = "Middle Aged Adult";
        }
        if (age>=55 && age <= 64){
            (ageGroup) = "Very Young Senior Citizen";
        }
        if (age>=65 && age <= 74) {
            (ageGroup) = "Young Senior Citizen";
        }
        if (age>=75 && age <= 84) {
            (ageGroup) = "Senior Citizen";
        }
            if (age>=85 ){
                (ageGroup) = "Old Senior Citizen";
        }

        System.out.println(ageGroup);

    }

}
