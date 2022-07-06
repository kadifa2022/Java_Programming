package day34_interfacePracticeTask.Car;

public class Toyota extends Car{
    public Toyota(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    void start() {
        System.out.println("to start the" +getModel()+ "press the brake and turn the ignition key");

    }

    @Override
    void drive() {
        System.out.println("You are driving a" + getModel());

    }
}
