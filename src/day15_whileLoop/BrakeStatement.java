package day15_whileLoop;

public class BrakeStatement {


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 6) {//if i's value reached 6
                break;//exits the loop
            }

            System.out.println(i);

        }
        System.out.println("---------------------------" );

        for (char i = 'A'; i <='Z'; i++){
            if(i =='J'){
                System.out.println("Loop is terminated");
                break;
            }

                //System.out.println(i); don't use statement after brake
        }
            System.out.println("---------------------");
    }
}