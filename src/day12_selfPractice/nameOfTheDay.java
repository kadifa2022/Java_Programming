package day12_selfPractice;

public class nameOfTheDay {


    public static void main(String[] args) {

        nameOfTheDay(5);

    }

    public static void nameOfTheDay(int num){
        String result = "";
        switch (num){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednsday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = " Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7: result = "Sunday";
            break;
            default:
                result = "Invalid day";

        }

        System.out.println(result);

    }



}
