package day34_abstraction_Interface.carTask;

import jdk.swing.interop.SwingInterOpUtils;

public class Audi extends Car{
    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    protected void start() {
        System.out.println("Pres the start button to start" + getMake()+ " " + getModel());

    }
    public void autoPark(){
        System.out.println(getMake() +" "+getModel() +" has auto park feature");
    }


}
