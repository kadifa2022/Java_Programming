package day04_selfPractice;

public class SalaryCalculator {

    public static void main(String[] args) {

        String  name = "Joshua";
        int hourlyRate = 40, weeklyHours = 45;

        int salary =  (weeklyHours * hourlyRate) * 52;


        System.out.println("Hello " + name + ". your salary is $" + salary);


    }
}
