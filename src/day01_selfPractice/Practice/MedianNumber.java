package day01_selfPractice.Practice;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10,
            b = 17,
            c = 20;
        if ((b<a && a<c) || (c<a && a<b)){//bac-cab
            System.out.println(a + " is the middle number");
        }
        if ((a<b && b<c) || (c<b && b<a)){//abc-cba
            System.out.println(b + " is  the middle number");
        }
        if ((a<c && c<b) || (b<b && c<a)){//acb-bca
            System.out.println( c +" is the middle number");
        }



    }
}
