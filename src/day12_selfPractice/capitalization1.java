package day12_selfPractice;

public class capitalization1 {

    public static void main(String[] args) {

        capitaization ("cydeo", "sChool" );

    }
    public static void capitaization(String firstName , String lastName){
        firstName= firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + "," + lastName);

    }

}
