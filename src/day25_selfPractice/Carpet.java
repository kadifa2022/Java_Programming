package day25_selfPractice;

public class Carpet {

    public double  width, length, initPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {

        this.width = width;
        this.length = length;
        this.initPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double totalCost(){
        double unitPrice = 0;
        double totalCarpetCost = (width * length) * unitPrice;
        if (isPersian){
            totalCarpetCost += 200;
        }
        return totalCarpetCost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", initPrice=" + initPrice +
                ", isPersian=" + isPersian +
                ", totalCost=" + totalCost()+
                '}';
    }
}
/*
ask03:
    1. Create a custom class named Carpet:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                Add a constructor that can set all the fields

                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)* unit price

            if the carpet is persian  carpet, add 200$ to the totalPrice


 */
