package day40_collection.selfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,3,4,5,5,6,1,2,3,4,5,6,7));

       /* for (Integer each: list) { // can't use remove ()methode for collection with the loop to remove elements we have to use iterator()
            if(each<5){
                list.remove(each);//we have to call remove() from Iterator
            }
            
        }
        System.out.println(list);

        */

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<5);
            list.remove(i);
            
        }
        System.out.println(list);

        System.out.println("-----------------------------------------------------------");

        List<Integer>list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,6,7,8,9));//only right way to remove elements from collection is with iterator and
        // while loop is more preferred  than other loops
             //assign back to Iterator to get every single element
        Iterator<Integer> it = list2.iterator();

        while (it.hasNext()){  //call hasNext()
            Integer each =it.next(); //how to get each element
            if(each<5){
                it.remove();
            }

        }
        System.out.println(list2);


        
            
        }



    }



