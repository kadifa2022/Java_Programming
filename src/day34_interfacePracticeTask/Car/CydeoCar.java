package day34_interfacePracticeTask.Car;

import day34_abstraction_Interface.animalTask.Flyable;

class CydeoCar extends Car implements AutoPilot, Flyable {
    public CydeoCar(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void fly() {
        System.out.println("is Flying");

    }

    @Override
    public void autoPark() {
        System.out.println("the auto park engaged");

    }

    @Override
    public void selfDrive() {
        System.out.println("the auto drive engaged");

    }

    @Override
    void start() {
        System.out.println("to start the car you should say 'start'");

    }

    @Override
    void drive() {
        System.out.println("You are driving a "+ getModel());

    }

    @Override
    public String toString() {
        return super.toString().replace("{","") +
    ", hasAutoPark=" + hasAutoPark +
    ", hasAutoPilot=" + hasAutoPilot +
    ", canFly=" + canFly+ "}";

    }
}
