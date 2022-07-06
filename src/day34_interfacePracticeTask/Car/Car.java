package day34_interfacePracticeTask.Car;

import java.time.LocalDate;

abstract class Car {
    private final String make,model;
    private String color;
    private final int year;
     private double price;

     public Car( String model, String color, int year, double price) {
         make = getClass().getCanonicalName();
         if (model.isBlank())
             throw new RuntimeException("model can not be blank");
         this.model = model;
         setColor(color);
         if (year < 1886 ) {
             throw new RuntimeException("year can not be less than 1886 ");
         }
         this.year = year;

         setPrice(price);
     }


     public String getMake() {
         return make;
     }

     public String getModel() {
         return model;
     }

     public String getColor() {
         return color;
     }
     public void setColor(String color) {
         if(color.isBlank()){
             throw new RuntimeException("Color can not be empty");
         } else this.color = color;
     }

     public int getYear() {
         return year;
     }

     public double getPrice() {
         return price;
     }
     public void setPrice(double price) {
         if(price<1){
             throw new RuntimeException("price can not be less than 1");
         }
        else this.price=price;
     }
     final void stop(){
         System.out.println("to stop press the brake");
     }
       abstract void start();
       abstract void drive();

    @Override
    public String toString() {
        return getClass().getSimpleName()+ " {" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
Car Task:
	1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

					If invalid arguments are given for setting the instances, then manually throw an exception

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()


	2. Create an interface named AutoPark
				Variables:
					hasAutoPark

				Abstract method:
					autoPark();

	3. Create a child interface of AutoPark named AutoPilot
						hint: interface can inherit from another interface by using exend keyword
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();

	4. Create an interface named Flyable
				Variables:
						canFly

				Abstract Method
					fly();


	5. Create a subclass of Car named Toyota

	6. Create a sub class of Car named Honda

	7. Create a subclass of Car named BMW

	8. Create two sub class of Car named Audi &  Mercedes that implements AutoPark interface

	9. Create Two sub classes of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces

	10 Create a sub class of Car named CydeoCar that implements AutoPark, AutoPilot and Flyable interfaces

	11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes



 */