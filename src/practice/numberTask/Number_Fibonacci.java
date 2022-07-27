package practice.numberTask;

public class Number_Fibonacci {

    public static int fibonacci(int num){

        int result = 0;
        int j = 0;
        int z = 1;

        for (int i = 0; i < num; i++) {
            result =  j + z;
            j = z;
            z = result;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(6 + 6 * 11/3);
    }
}
