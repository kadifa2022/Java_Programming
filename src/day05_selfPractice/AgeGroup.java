package day05_selfPractice;

public class AgeGroup {
    public static void main(String[] args) {


        int age = 87;
        String result = "";


        if (age >= 1 && age <= 2) {
            result = "Infant";
        }
        if (age >= 3 && age <= 5) {
            result = "Toddler";
        }
        if (age >= 6 && age <= 9) {
            result = "Kid";
        }
        if (age >= 10 && age <= 12) {
            result = "Pre-Teen";
        }
        if (age >= 13 && age <= 17) {
            result = " Teenager";
        }
        if (age >= 18 && age <= 20) {
            result = " Young Adult";
        }
        if (age >= 21 && age <= 39) {
            result = " Adult";
        }
        if (age >= 40 && age <= 49) {
            result = "Young Middle-Aged Adult";
        }
        if (age >= 50 && age <= 54) {
            result = " Middle-Aged Adult";
        }
        if (age >= 55 && age <= 64) {
            result = "Very Young Senior Citizen";
        }
        if (age >= 65 && age <= 74) {
            result = "Young Senior Citizen";
        }
        if (age >= 75 && age <= 84) {
            result = "Senior Citizen";
        }
        if (age >= 85) {
            result = "Old Senior Citizen";

        }


        System.out.println(result);
    }}







/*


69 Create a class named
70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85
        86 Note: Do
        87
        AgeGroups, an integer variable named age is declared and given. write a program that can define the age gr
        age groups are: infant (1 - 2)
        Toddler (3 - 5),
        Kid (6 - 9),
        Pre-Teen (10 - 12),
        Teenager (13 - 17),
        Young Adult (18 - 20),
        Adult (21 - 39),
        Young Middle-Aged Adult (40 - 49), Middle-Aged Adult (50 - 54),
        Very Young Senior Citizen (55 - 64), Young Senior Citizen (65 - 74), Senior Citizen (75 - 84),
        Old Senior Citizen (85+)
        not use more than one print statement

 */