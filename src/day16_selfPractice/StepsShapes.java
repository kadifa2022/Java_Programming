package day16_selfPractice;

import java.sql.SQLOutput;

public class StepsShapes {

    public static void main(String[] args) {
        for (int i = 1; i <10; i++) {
            for (int j =1; j >10; j++) {
                if (i<=j){
                    System.out.println("* ");

                }

            }

            System.out.println("* ");
        }
        
    }
}
