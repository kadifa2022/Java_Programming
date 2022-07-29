package day23_selfPractice;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();//arraylist


        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        int sum =0;  //to access every single element in list// all have index numbers


        for (Integer each: list) {
            sum += each;
        }
        //for average number decimal (double)/return int
        double average = sum /(double)list.size();// cast-ed( to double)(to return exact number0




        System.out.println("average=" +average);


    }


}
