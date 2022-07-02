package day07_ifStatements;

public class MultiBranchIf {
    public static void main(String[] args) {

        int num = 100;

        String result = "";//with if statement every single condition will be checked

        if (num > 0) { // true
            result = "Positive";
        }

        if (num < 0) {
            result = "Negative";
        }

        if (num == 0) {
            result = "Zero";
        }

        System.out.println(result);

        System.out.println("------------------------------------------------");

        String result2 = "";//variable string

        if (num > 0) {//multibranch statement
            result2 = "Positive";//execute first true statement
        } else if (num < 0) {
            result2 = "Negative";
        } else {
            result2 = "Zero";
        }

        System.out.println(result2);





    }

}










