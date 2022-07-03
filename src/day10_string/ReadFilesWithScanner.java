package day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {

    public static void main(String[] args) throws IOException {
                                     //path is location  right click 0n text file abd select path and paste to
        Scanner scan = new Scanner(Path.of(" src/day10_string/Test. txt"));//read the files

      /*
        System.out.println( scan.nextLine() );
        System.out.println( scan.nextLine() );
        System.out.println( scan.nextLine() );



        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
*/

        // System.out.println(  scan.hasNext());

        scan.close();



    }

}