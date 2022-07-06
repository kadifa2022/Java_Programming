package day34_interfacePracticeTask.Car;

 class Tesla extends Car implements AutoPilot{


  public Tesla(String model, String color, int year, double price) {
   super(model, color, year, price);
  }

  @Override
  public void autoPark() {
   System.out.println("The auto park engaged");

  }

  @Override
  public void selfDrive() {
   System.out.println("The auto drive engaged");

  }

  @Override
  void start() {
   System.out.println("to start the car say 'start' ");

  }

  @Override
  void drive() {
   System.out.println("You are driving " +getModel());

  }

  @Override
  public String toString() {
   return super.toString().replace("{", "") +
           ", hasAutoPark=" + hasAutoPark +
           ", hasAutoPilot=" + hasAutoPilot +
           "}";
  }
 }
