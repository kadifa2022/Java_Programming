package day21_selfPractice;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        int [] arr1 = {10,20,30};
        int [] arr2 = {40,50};
        int [] arr3 = {60,70,80,90};
        //3 dimensional arrays
   /*     int [][] arr2D =new int[3][];
        //3 single dimensional array
        arr2D[0]=arr1;
        arr2D[1]=arr2;
        arr2D[2]=arr3;

    */
        //index          0 ,1, 2
        int[][] arr2D ={{10,20,30},{40,50},{60,70,80,90}};
        //multi dimen.arrays
        System.out.println(Arrays.deepToString(arr2D));

        //retrieve one array{40,50}
        System.out.println(Arrays.toString(arr2D[1]));

        // for one element -80
        System.out.println(arr2D[2]);




    }


}
