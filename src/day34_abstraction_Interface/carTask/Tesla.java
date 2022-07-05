package day34_abstraction_Interface.carTask;

public class Tesla extends Car{
    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    protected void start() {
        System.out.println("Use voice control to start" + getMake() + " " + getModel());

    }
    public void autoPilot(){
        System.out.println(getMake() +" "+getModel()+" has auto pilot feature");
    }
}
