package day19_SelfPractice;
import java.util.Arrays;
public class Zeros {

    public static void main(String[] args) {
        int [] array = {10, 0, 5, 0, 1, 0};

        int n = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] !=0){
                array[n]  = array [i];
                n++;
            }
            while(array.length -1 >= n){
                array[n]=0;
                n++;

            }



        }
        System.out.println(Arrays.toString(array));
    }
}


/*

write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */