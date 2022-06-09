package day12_selfPractice;


public class emailDomain {


    public static void main(String[] args) {

        emailDomain("Cydeo@gmail.com");



    }


    public static void emailDomain(String email){

        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("domain: " +domain);










    }












}
/*
Create a method named emailDomain that can display the domain of the email

    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
*/