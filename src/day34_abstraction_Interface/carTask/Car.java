package day34_abstraction_Interface.carTask;

public abstract class Car{

    private final String make, model;
     private String color;
     private final int year;
    private double price;// setter can't be set for final

    public Car(String make, String model, String color, int year, double price) {
        this.make = getClass().getCanonicalName();//to set the class name to the make of the car
        this.model = model;
        this.color = color;//because they are not final
       setColor(color);
        if (year < 1886) {
            System.err.println("Invalid year:" + year);
            System.exit(1);
        }
        this.year = year;

        this.price = price;
        setPrice(price);
    }

    public String getMake() {//can generate all getters
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {// setters for not final
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;

    }
        protected final void stop(){
            System.out.println("Press the brake to stop" + make + " " + model);
        }

        protected abstract void start();// class must be abstract// meant overridden


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}








/*
1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price// first step-private final key make of the car//init. only one time

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be less than negative or zero

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Presse the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement

	2. Create the following sub classes of Car
			1. Honda
			2. Audi
					extra methods:
						autoPark()
			3. Tesla
					extra methods:
						autoPilot()

 */