package practice;

import jdk.swing.interop.SwingInterOpUtils;

public class day38_MorningPractice {

    public static void main(String[] args) {
        String practice1="push-ups";
        String practice2="pull-ups";


        for (int i = 0; i < 30; i++) {
            System.out.println(practice1);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            for (int i = 0; i < 20; i++) {
                System.out.println(practice2);
                try{
                    Thread.sleep(2500);
                }catch (InterruptedException e){
                    throw  new RuntimeException(e);

                
            }


        }
    }



}


/*
2. MorningWorkOut:
            1. Do 30 push-ups and try pausing 1.5 seconds in each

            2. Do 20 Pull-ups and try pausing 2.5 seconds in each

 */

