package day01_selfPractice.Practice;

public class SwapTwoVariable {

    public static void main(String[] args) {
        double x = 10;
        double y = 15;

        x = (x/y);
        // x = 0.6 we are using variable x as temporary variable, which contains 0.6

        y = (y * x);
        //15 * 0.6 = 10.0
        x = (y / x);
        //10/0.6 = 15.0
        System.out.println( "y = " + y);
        System.out.println("x = " + x);
    }
}
