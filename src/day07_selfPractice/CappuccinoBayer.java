package day07_selfPractice;

public class CappuccinoBayer {


    public static void main(String[] args) {

        String size = "grande";
        double price = 0.0;
        int calories = 0;

        if (size == "tall" || size == "grande" || size == "venti") {

            if (size == "tall") {
                price = 3.69;
                calories = 90;
            } else if (size == "grande") {
                price = 3.99;
                calories = 120;
            } else {
                price = 4.29;
                calories = 150;

            }

            System.out.println("price is: $" + price + "\n" + calories + " calories");


        } else {

            System.err.println("Invalid Size: " + size);

        }

    }


}


   /* Create a class called CappuccinoBuyer. A variable named Size is given, write a program that can display
   the price and calories
        Valid sizes are tall, grande, venti and tall:
        grande:
        venti:
        their price & calories are:
        price is $3.69 90 calories
        price is $3.99; 120 calories
        price is $4.29 150 calories
     */