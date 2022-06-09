package day20_forEachLoopPractice;//not good

public class CountPalindrome_1 {

    public static void main(String[] args) {

        String [] pal = {  "java" , "level" , " anna"};
        int count = 0;

        for (int i = 0 - 1 ; i < pal.length; i++){
            String reverse = " ";

            for (int j = pal[i].length() - 1; j <= 0 ; j--) {
                reverse += " " + pal[i].charAt(j);
                if( reverse.equals(pal[i])){
                    count++;

            }


            }

            }
        System.out.println(count);


        }

    }

