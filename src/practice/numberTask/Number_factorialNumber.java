package practice.numberTask;

public class Number_factorialNumber {

    /*
    Write a return method that returns the factorial number of any given number
    Ex:
    Input: 5
    outPut: 120
    because 5 * 4 * 3 * 2 * 1 = 120
    */
    public static int factorialNumber(int n){
        int result = 1;

        for (int i = 1; i <= n ; i++) {
            result = result*5;

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorialNumber(5));
    }
}



