package day34_interfacePracticeTask.Car;

 class Audi extends Car implements AutoPark{
    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    void start() {
        System.out.println("to start the" +getModel()+ "press the brake and push the start button");


    }

    @Override
    void drive() {
        System.out.println("You are driving " + getModel());

    }

    @Override
    public void autoPark() {
        System.out.println("The auto park engaged");

    }

     @Override
     public String toString() {
         return super.toString().replace("{" , "") + ", hasAutoPark=" + hasAutoPark + "}";
     }
 }
