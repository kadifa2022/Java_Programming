package day01_selfPractice.Practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in);

        int hourlyRate = 50,
                weeklyHours = 45,
                stateTaxRate = 6,
                federalTaxRate = 26,
                salaryBeforeTax = (weeklyHours * hourlyRate) * 52;

        double federalTax = (salaryBeforeTax * federalTaxRate)/100,
                stateTax = (salaryBeforeTax * stateTaxRate)/100,
                totalTax = stateTax + federalTax,
                salaryAfterTax= salaryBeforeTax - totalTax;

        System.out.println("Gross pay is :  $" + salaryBeforeTax + "\nFederal tax is: $" + federalTax +
                "\nState tax is : $" + stateTax + "\nTotal tax is: $" + totalTax + "\nNet income is : $" +salaryAfterTax);






    }
}
