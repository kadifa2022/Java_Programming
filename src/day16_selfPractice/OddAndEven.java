package day16_selfPractice;

public class OddAndEven {
    public static void main(String[] args) {
        String oddResult = "";
        String evenResult = "";
        for (int i = 1; i <=20 ; i++) {
            if (i % 2 ==0){
                evenResult += (i + " ");
            } else if (i % 2 != 0) {
                oddResult += (i + " ");
            }else{

            }
        }
        System.out.println(evenResult.substring(0,evenResult.length() - 1 ));
        System.out.println(oddResult.substring(0,oddResult.length() -1 ));
    }
}
