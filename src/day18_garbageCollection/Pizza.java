package day18_garbageCollection;

public class Pizza { //class is just TAMPLET-OBJECTS ARE
    public char size; // instance variable
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    // calculates the total price of the pizza, returns it as double
    public double calcCost(){
        double totalPrice = 0;

        switch (size){
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            default:
                System.err.println("Invalid size: "+size);

        }

        return totalPrice;
    }


    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }



    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }







/* Attributes:
                1. size                  1.-declare as instant variable - pizza size-char
                2. numberOfCheeseTopping  2.declare  int for number of cheese and pepperoni topping
                3. numberOfPepperoniTopping 3. action: public double calculate cost(intend methode-pizza object)(){
                                             4. calculate total price of the pizza-double totalPrice =0;
            Actions:
                                               5. we can use switch-ternary -for size small, medium large-for case'S's' total price and
                                               break-IF USER PROVIDE INVALID SIZE OF PIZZA -Default AND ERR PRINT return TotalPrice().
                calcCost(): returns the total cost of the pizza
                toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping



 */
}