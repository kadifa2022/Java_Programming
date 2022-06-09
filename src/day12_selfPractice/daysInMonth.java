package day12_selfPractice;

public class daysInMonth {


    public static void main(String[] args) {

        month("jUNe");

    }


    public static void month(String month) {

        String result = "";
        month=month.substring(0,1).toUpperCase() +
                month.substring(1).toLowerCase();
        switch (month) {

            case "January":
            case " March":
            case "May" :
            case "July" :
            case "August" :
            case "December" :
                result = (" has 31 days ");
                break;
            case "April":
            case "June" :
            case "September":
            case "November":
            result = (" has 30 days ");
                break;
            case "February":
                result = (" has 28 days");
                break;

            default:

                System.out.println("Invalid month");

        }
        System.out.println(month  + result);


    }


}









/*Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
*/