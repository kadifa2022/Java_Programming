package day20_forEach;

public class ForEachLoop {


    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};//can't change its fixed

        for (int i = 0; i < numbers.length; i++) {//for Loop you can change
            System.out.println(numbers[i]);

        }
        System.out.println("------------------------------");

        for (int each : numbers) {
                                     //benefits of the for each loop they give you every single element-SHORTEST AND FASTEST
            System.out.println(each);//disadvantage order is fixed, if you have 5 elements they will run just 5 times - NO INDEX NUMBERS


        }
    }

}
/*

 */