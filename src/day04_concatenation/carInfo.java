package day04_concatenation;

public class carInfo {
    public static void main(String[] args) {

        int year = 2018;
        String make = "Toyota:" ;
        String model = "Camry";
        int miles = 50000;
        String color = "Red";
        int price = 19000;
        System.out.println("\tCar Information is:\n\t\t" + year
                + (" ") + make + (" ") + model + (",") + miles +
                (" ") + color + (" $") + price );

    }
}
