package lab1;

public class coinChange {
    public static void main(String[] args) {


        int priceInCents = 65;
        int change = 100 - priceInCents; //

        int quarter = change/25;
        int dimes = 10;
        int nickles = 5;

        System.out.println("quarter:"+ quarter + "dimes:" + "nickles:" + nickles);
    }



}
