package day37_exceptions;

import day35_polymorphism.transpotationTask.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {


        Car car = null;

        try {
            car.drive();
        } catch (RuntimeException e) {
            System.out.println("First catch block");
            e.printStackTrace();
        }
    }
}