package lab1;

import org.w3c.dom.ls.LSOutput;




public class UserRegister {

    public static void main(String[] args) {


        String firstName = " Mike"; //for string always ""
        String lastName = "Smith";
        String monthOfBirth = "May";
        int dateOfBirth = 10;
        int yearOfBirth = 1980;

        boolean isHealthPlanId = true;
        boolean isSSNumber = false;

        int memberId = 123445;
        long policyNumber = 1236478299999l;

        int last6DigitOfSsn = 100000;
        String zipCode = "222222";

        //Mike who born in May wants health insurance from United with policy number 12343567766L

        System.out.println(firstName + " who born in " + monthOfBirth  + "  wants health insurance from United with policy number "  + policyNumber);


    }



}


