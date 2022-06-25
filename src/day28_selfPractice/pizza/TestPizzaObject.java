package day28_selfPractice.pizza;

public class TestPizzaObject {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Small",3, 2);

       pizza1.getSize();
       pizza1.getNumberOfCheeseTopping();
       pizza1.getNumberOfPepperoniTopping();
       pizza1.calCost();
        System.out.println(pizza1);


    }

}
