package practice;
import java.util.Scanner;
public class computerBuilder1 {
    public static void main(String[] args) {

    Scanner scan= new Scanner(System.in);
//screen size
    double totalPrice=0;
    System.out.println("Select screen size:");
    double screenSize= scan.nextDouble();
    if(screenSize==13.3){
        totalPrice+= 200;//200
    }else if(screenSize==15.0){
        totalPrice+= 300;
    }else{
        totalPrice+= 400;
    }

//cpu type
    System.out.println("Select CPU type:");
    scan.nextLine();
    String type=scan.nextLine();
    switch (type){

        case "i3":
            totalPrice+= 150;
            break;
        case "i5":
            totalPrice+= 250;
            break;
        case "i7":
            totalPrice+= 350;//350
            break;
    }

//ram size
    System.out.println("Select RAM size:");
    int ram_size=scan.nextInt();
    int ram_size_total=ram_size/4;
    int ram_size_totalPrice=ram_size_total*50;//100

    totalPrice+= ram_size_totalPrice;

    //storage type
    System.out.println("Select storage type:");
    scan.nextLine();
    String Storage_type=scan.nextLine();
//storage size
    System.out.println("Select storage size:");
    int Storage_size=scan.nextInt();
    int storage_size_perGB=Storage_size/500;
    if (Storage_type.equalsIgnoreCase("HDD")){

        int total_storage_price=storage_size_perGB*50;

        totalPrice+=total_storage_price;
    }else{
        //}else if (Storage_type.equalsIgnoreCase("SDD")){
        int total_storage_price=storage_size_perGB*100;//200
        totalPrice+=total_storage_price;
    }

//screen resolution
    scan.nextLine();
    System.out.println("Select screen resolution:");
    String sc_reaoulution=scan.nextLine();

    if (sc_reaoulution.equalsIgnoreCase("FULLHD")){
        totalPrice+=100;
    }else{
        totalPrice+=200;
    }

    scan.close();
    System.out.println("Final price is: $"+totalPrice );


}

}
