package day40_collection.selfPractice;

import java.util.*;

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
            list.remove(i);//remove method from collection is not preferred
            
        }
        System.out.println(list);

        System.out.println("-----------------------------------------------------------");

        List<Integer>list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,6,7,8,9));//only right way to remove elements from collection is with iterator and
        // while loop is more preferred  than other loops
             //assign back to Iterator to get every single element
        Iterator<Integer> it = list2.iterator();

        while (it.hasNext()){  //call hasNext() - if the condition true
            Integer each =it.next(); //how to get each element
            if(each<5){
                it.remove();// remove() method iterable we have to use for remove elements from collection
            }

        }
        System.out.println(list2);

        System.out.println("-----------------------------------------");

            //iterator with For loop
        List<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(1,1,2,3,4,5,5,6,7,8,9,1,2,2,3,3,3));

        for(Iterator<Integer> i = list3.iterator(); i.hasNext();){

           Integer each =i.next();

           if(each < 5){
               i.remove();
           }
        }

        System.out.println(list3);

        System.out.println("---------------------------------------------------");

        List<Integer>list4= new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,9,9,1,2,2,3,4,4,5));

        list4.removeIf(each->each<5);//removeIf() --to remove objects from collection any class

        System.out.println(list4);

        System.out.println("------------------------------------------------------");

        List<Integer>list5= new LinkedList<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,3,3,5,5,6,7,8,8,9));
        //for landa expression is preferred to use only one letter-p
        list5.removeIf(p -> p < 5);

        System.out.println(list5);
        }



    }



