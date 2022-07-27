package practice.numberTask;

public class Number_SwapTwoNumbers {
    //solution 1
    public static void swap1(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a= " + a);
        System.out.println("b= " + b);

    }
    //solution 2

    public static void swap2( int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b =" + b);
    }


}


