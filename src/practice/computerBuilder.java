package practice;
import java.util.Scanner;
public class computerBuilder {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    int price = 0;
    double ramPrice = 0;

    System.out.println("Select screen size:");
    double screenSize = input.nextDouble();


    if(screenSize==13.3){
        price += 200;
    }else if(screenSize==15.0){
        price += 300;
    }else{
        price += 400;
    }

System.out.println("Select CPU type:");
    String cpu = input.nextLine();

    if(cpu == "i3"){
        price += 150;
    }else if(cpu == "i5"){
        price += 250;
    }else{
        price += 350;
    }
    input.nextLine();
System.out.println("Select RAM size:");
    int ramSize = input.nextInt();

    if(ramSize %4 == 0){
        ramPrice = (ramSize /4) * 50;
        price += ramPrice;
    }
    input.nextLine();

    System.out.println("Select storage type:");

    String storageType = input.next();
     input.nextLine();

    System.out.println("Select storage size:");
    int storageSize = input.nextInt();

    switch (storageType){
        case "HDD":
            price += storageSize/500 * 50;
            break;
        case "SSD":
            price += storageSize/500 * 100;
            break;
    }
    input.nextLine();
System.out.println("Select screen resolution:");
    String screenResolution = input.next();

    switch (screenResolution){
        case "FULLHD":
            price += 100;
            break;
        case "4K":
            price += 200;
            break;
    }


input.close();

  System.out.println("Final price is: " + "$" + price);
}
}



