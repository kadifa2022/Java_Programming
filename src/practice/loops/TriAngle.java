package practice.loops;

public class TriAngle {

    public static void main(String[] args) {

        for (int i = 1 ; i <= 5; i++) {
            for (int j = 1;  j <= i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");

        for (int i = 1; i <=5; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("@ ");

            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------");

        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=6-i ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println("------------------------------------------------------------------------");
       //repeating  same number
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+ "");

            }
            System.out.println();

        }
        System.out.println("---------------------------------------------------------------------");
                // printing in ascending order
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+"");

            }
            System.out.println();

        }
        System.out.println("-------------------------------------------------------------------");

        for (int i = 1; i <= 6 ; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print(j+"");

            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print("* ");
            }
            for (int k = 6-i; k>=1; k--) {
                System.out.print(k+ "");
                
            }
            System.out.println();
            
        }


    }

}


