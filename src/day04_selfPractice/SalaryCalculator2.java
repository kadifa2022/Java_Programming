package day04_selfPractice;

public class SalaryCalculator2 {


    public static void main(String[] args){


        double hourlyRate = 55,
                weeklyHours = 45,
                stateTaxRate = 7.5,
                federalTaxRate = 24.5;


        double salaryBeforeTax = hourlyRate * weeklyHours * 52 ;

       double stateTax = salaryBeforeTax * stateTaxRate /100 ;

       double federalTax = salaryBeforeTax * federalTaxRate /100;

       double totalTax = stateTax + federalTax;

       double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is:  $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Net income is: $" + salaryAfterTax);





        }





    }














/*
Create a class named SalaryCalculator, and declare the following variables:
hourlyRate weeklyHours stateTaxRate federalTaxRate
Use the given info above to calculate the followings: salaryBeforeTax

7.2 Display Ex:
stateTax federalTax totalTax salaryAfterTax
each of the above in the following format:

hourlyRate = $50
weeklyHours = 45
stateTax = 6 (given as percentage) federalTax = 26 (given as percentage)
output:
Gross pay is: $117000
Federal tax is: $30420 State tax is:
$7020 Total tax is: $37440
Net income is: $7956

*/