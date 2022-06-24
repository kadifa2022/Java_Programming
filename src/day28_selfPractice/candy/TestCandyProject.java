package day28_selfPractice.candy;
import java.util.ArrayList;
import java.util.Arrays;


public class TestCandyProject {
    public static void main(String[] args) {

     ArrayList<Candy> candyList = new ArrayList<>();
     Candy[] arr = {new Candy("Milka", 5,3.2,true),
             new Candy(" Kras ",3, 2, false),
             new Candy("Zvijezda", 3,5,true),
             new Candy("Kinder bueno", 4, 3, true),
             new Candy("Snyder's", 2, 4,false)};
                candyList.addAll(Arrays.asList(arr));

                for(Candy candy: candyList){
                    System.out.println("Brand " + candy.getBrand() + "price " + candy.getPrice());
                }
        System.out.println(candyList);


    }



}
/*
Create a custom class named Candy
        private variables:
            brand (String), quantity (int), price (double), hasPeanuts (boolean)

        Encapsulate All the private fields
                (price of candy can not be set to negative)
                (quantity of candy can not be set to zero or negative)

        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Extra methods:
            toString():
                if the price is zero, print "free" instead of 0

        5.1 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy


 */