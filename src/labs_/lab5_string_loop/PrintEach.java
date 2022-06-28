package labs_.lab5_string_loop;

public class PrintEach {
    //import java.util.Scanner;


    public static void main(String[] args) {

        String word = "Wooden Spoon";



       // System.out.println((0));
       // System.out.println((2));we will use  loop instead of sout printing many times TO FIND INDEX #



        /*
        System.out.println( word.charAt(0) );
        System.out.println( word.charAt(1) );
        System.out.println( word.charAt(2) );
        System.out.println( word.charAt(3) );
        // ....
        */
       // String word = new Scanner(System.in).nextLine(); SCANNER OBJECT can be called// CALL STRING

        for(int i = 0; i <= word.length()-1; i++ ){ //formula can FIND LAST print each character or index# LOOP IF WE KNOW THE NUMBER
            char each =  word.charAt(i);//CALL CHAR METHODE  FOR EACH CHARACTER
            System.out.println(each);
        }



    }

}




