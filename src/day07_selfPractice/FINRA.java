package day07_selfPractice;

public class FINRA {


    public static void main(String[] args) {

        int number = 15;
        String result = "";

        if(number%3==0 && number%5==0){
            result ="FINRA";
        }else if (number%5==5){
            result = "RA";
        }else if(number%3==0){
            result= "FIN";
        }else{
            result = ""+number;
        }
        System.out.println("result = " + result);









    }
}/*
    Create a class called FINRA, Write a function which prints out the number,
     but for number which is a multiple of 3, print "FIN"
        ex:
        number = 3
        output: FIN
        number = 10
        output: RA
        number = 15
        output: FINRA
        */