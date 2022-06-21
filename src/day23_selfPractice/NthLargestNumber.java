package day23_selfPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> largest = new ArrayList<>();
        largest.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n = 5;
        int largestN=0;
        Collections.sort(largest);
        ArrayList<Integer>nonDupe=new ArrayList<>();
        for(Integer each: largest){
            if(nonDupe.contains(each)){
                continue;
            }
            nonDupe.add(each);

        }
        largest =nonDupe;
        largestN =nonDupe.get(nonDupe.size()-n);
        System.out.println(largestN);


    }
}
/*
write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */