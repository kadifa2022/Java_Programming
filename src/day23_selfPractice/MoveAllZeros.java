package day23_selfPractice;
import java.util.ArrayList;
import java.util.Arrays;


public class MoveAllZeros {
    public static void main(String[] args) {


        ArrayList<Integer>list1 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        ArrayList<Integer>list2 = new ArrayList<>(list1);
        list1.removeAll(Arrays.asList(0));
        list2.retainAll(Arrays.asList(0));
        list1.addAll(list2);
        System.out.println(list1);

    }
}
/*
 Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]

 */