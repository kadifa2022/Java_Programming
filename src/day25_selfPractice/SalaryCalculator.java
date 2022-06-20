package day25_selfPractice;

public class SalaryCalculator {


    public int hourlyRate, weeklyHours;
    public double stateTaxRate, federalTaxRate;

    public SalaryCalculator(int hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }
    public double salary(){
        double salary = hourlyRate * weeklyHours * 52;
        return salary;
    }




    public double totalStateTax(){
        stateTaxRate = salary() * stateTaxRate/100;
        return  stateTaxRate;
    }
    public double totalFederalTax(){
        federalTaxRate = salary() * federalTaxRate/100;
        return federalTaxRate;
    }
     public double salaryAfterTax(){
         double netSalary = salary() - (totalStateTax() + totalFederalTax());
            return salaryAfterTax();
         }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary=" + salary() +
                ", stateTax=" + totalStateTax() +
                ", federalTax=" + totalFederalTax() +
                '}';//salary after tax  need to add
    }
}






/*
Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): claculates the totalstateTax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */