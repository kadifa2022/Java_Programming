package day17_selfPractice;

public class Salary {

    public int hourlyRate;
    public int weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;
    public double salary = hourlyRate * weeklyHours * 52;


    public double stateTax = (salary / 100) * stateTaxRate;
    public double federalTax = (salary / 100) * federalTaxRate;
    public double salaryAfterTax = salary - stateTax - federalTax;

    public void setInfo(int hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {

        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;


    }

    public String toString() {
        return "Salary{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary=" + salary +
                ", stateTax=" + stateTax +
                ", federalTax=" + federalTax +
                ", salaryAfterTax=" + salaryAfterTax +
                '}';
    }
 /*public String toString(){
        return "Salary{" + "salary =" + (hourlyRate * weeklyHours * 52) +
                ", stateTax = " + (((hourlyRate * weeklyHours * 52)/100) * stateTaxRate) +
    ", federalTax = " + (((hourlyRate * weeklyHours * 52)/100)* federalTax) +
            " , salaryAfterTax = " + ((hourlyRate * weeklyHours *52)-(((hourlyRate * weeklyHours
             * 52)/100)* stateTaxRate)- ((( hourlyRate * weeklyHours * 52)/100)*federalTaxRate)) +  '}';

     */
    }

