package day21_selfPractice;

public class MinimumAndMaximumNumbers {

    public static void main(String[] args) {

        int [][] array ={{100,20,300},{10,1000,50},{-200, 400,0}};//for three bracket or array -two square brackets

        int max = array[0][0];
        int min = array[0][0];

        for (int [] oneD : array){//starting with[] oneD if we have two Arrays
            for (int element : oneD){
                if(element > max){
                    max = element;
                }
                if (element < min ){
                    min += element;
                }
            }
            System.out.println("max = " + max);
            System.out.println("min = " + min);
        }

    }
}
/*
2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
        Ex:
            array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

            output:
                Minimum number is: -200
                Maximum number is: 1000

 */