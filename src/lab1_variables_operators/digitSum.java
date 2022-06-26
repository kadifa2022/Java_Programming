package lab1_variables_operators;

public class digitSum {

    public static void main(String[] args) {

        int number = 29814;//2 + 9 + 8 + 1 + 4 =24

        int result = 24;

        int n1 = (number%100000)/10000;

        int n2 = (number%10000)/1000;

        int n3 = (number%1000)/100;

        int n4 = (number%100)/10;

        int n5 = number%10;

        int sum = n1 + n2 + n3 + n4 + n5;


        System.out.println(result);

        
    }
}
