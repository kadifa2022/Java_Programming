package day34_abstraction_Interface.carTask;

public class Honda extends Car {


    public Honda(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    protected void start() {
        System.out.println("Twist the key to ignition to start " + getMake()+" "+getModel());

    }
}
