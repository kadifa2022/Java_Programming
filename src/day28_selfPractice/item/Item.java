package day28_selfPractice.item;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.isBlank() ||(name.isEmpty()|| (name.charAt(0)==' '))){
            System.out.println("Invalid name input");
            System.exit(1);
        }
        for (int i = 0; i < name.length(); i++) {
            if(!Character.isLetter(name.charAt(i)) && !Character.isWhitespace(name.charAt(i))){
                System.out.println("Invalid name input: " + name);
                System.exit(1);
            }
        }
        System.exit(1);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            System.out.println("");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<0){
            System.out.println("Invalid quantity:" + quantity);
            System.exit(1);
        }
        if (getName().equals("toilet paper") && quantity>1)
            System.err.println("You have exceeded the available quantity of : " +getName());
        System.exit(1);
        this.quantity = quantity;
    }

    public Item(String name, double price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);

    }
    public  double calcCost(){
        return getPrice()*getQuantity();
    }

    public String toString() {
        return "TestItemObject{" +
                "name='" + getName()+ '\'' +
                ", price=" +getPrice() +
                ", quantity=" + getQuantity() +
                ", totalPrice=" +calcCost() +
                '}';
    }
}
/*
create a class called Item
        private variables:
            name, unitPrice, quantity

        Encapsulate all the fields:
            Conditions:
                name can not be empty or blank
                name can not contain any special characters other than space
                name must start with letters
                unit price can not be negative
                quantity can not be negative
                if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcCost(): returns the total cost
            toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()



 */
