package practice;

import java.util.Scanner;

public class ComputerBuilderSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select screen size:");
        String screenSize = input.nextLine();
        System.out.println("Select CPU type:");
        String cpuType = input.nextLine();
        System.out.println("Select RAM size:");
        int ramSize = input.nextInt();
        input.nextLine();
        System.out.println("Select storage type:");
        String storageType = input.nextLine();
        System.out.println("Select storage size:");
        int storageSize = input.nextInt();
        input.nextLine();
        System.out.println("Select Screen resolution:");
        String screenType = input.nextLine();
        double finalPrice = (ramSize / 4 * 50);

        switch (screenSize) {
            case "13.3":
                finalPrice += 200;
                break;
            case "15.0":
                finalPrice += 300;
                break;
            case "17.3":
                finalPrice += 400;
        }
        switch (cpuType){
            case "i3":
                finalPrice += 150;
                break;
            case "i5":
                finalPrice += 250;
                break;
            case "i7":
                finalPrice += 350;
                break;

        }

        switch (storageType){
            case "HDD":
                finalPrice += storageSize / 500*50;
                break;
            case "SSD":
                finalPrice += storageSize/ 500*100;
                break;
        }
        switch (screenType){
            case "FULLHD":
                finalPrice+=100;
                break;
            case"4K":
                finalPrice+=200;
                break;
        }
        System.out.println("Final price is: $" + finalPrice);
    }
}

