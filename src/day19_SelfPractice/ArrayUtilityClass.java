package day19_SelfPractice;
import java.lang.reflect.Array;
import java.util.Arrays;
public class ArrayUtilityClass {

    public static void main(String[] args) {


        //Arrays Class : presented in "java.util.package
        //methods: toString()
        //


        //toString()-converts array object to string -return String
        String [] names ={"John", "Smidt", "Shay", "Breanna","Josh"};
        System.out.println(Arrays.toString(names));
        System.out.println("----------------------------------------");
        //sort(): sorts the array in ascending order.from smallest to largest

        int [] numbers ={5,1,3,4,2,0};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("------------------------------------------");

        //equal() compares two arrayobjects -return boolean

        char [] arr1 = {'a','b','c'};
        char [] arr2 = {'a','b','c'};



        System.out.println(arr1 == arr2);//false compare from memory location
        System.out.println(Arrays.equals(arr1,arr2));//true compare each index

        Arrays.sort(arr1);//sort elements
        Arrays.sort(arr2);

        System.out.println("----------------------------------------------");

        //copyOf(array, newLength):copy the specific elements and sets the new length
        int[] scores = {45,55,65,75,85};
        int [] scores2 = Arrays.copyOf(scores, 8);//new Array with 8 elements
        System.out.println(Arrays.toString(scores2));

        System.out.println("--------------------------------------------------------");

        //copyOfRange(array, begIndex,endIndex);//copies specific index elements of array

        char [] elements={'A', 'B','C','D','E','F'};
               //index     0    1   2   3   4   5
        char [ ] someElements=Arrays.copyOfRange(elements, 1,4+1);

        System.out.println(Arrays.toString(someElements));


    }
}