package day41_map.selfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZeroToTheEnd {

    //write a program that can move all the zero to the end of the List.




    public static List<Integer> moveZeroToTheEnd(List<Integer>list){
        int originalSize= list.size();
        list.removeAll(Arrays.asList(0));
        int newSize=list.size();
        int totalNumberOfZeros=originalSize-newSize;
        for (int i = 0;  i< totalNumberOfZeros; i++) {
            list.add(0);
        }
        return list;
    }
}
