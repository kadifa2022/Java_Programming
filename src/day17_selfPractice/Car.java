package day17_selfPractice;

public class Car {

    public String make;
    public String color;
    public String model;
    public int year;
    public double price;




    public void setInfo(String make, String color, String model, int year, double price ) {


        this.make = make;
        this.color = color;
        this.model = model;
        this.year = year;
        this.price = price;

    }
    public void start(){
        System.out.println(make + " starts.");
    }
    public String toString() {
        return "Car_methodeOverriding{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
