package day40_collection.selfPractice;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) { //3 class from queue INTERFACE

        Queue<Integer>queue1 = new PriorityQueue<>(); //Random order -no null value
        queue1.addAll(Arrays.asList(10, 200,300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200,300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200,300, 40, 90));
        //queue1.addAll(Arrays.asList(null, null, null)); //no null at all

        int num1=queue1.poll();  //FIFO-

        queue1.poll();
        queue1.poll();
        queue1.poll();


        System.out.println(queue1);

        Queue<Integer>queue2 = new ArrayDeque<>();// insertion order -no null values

        queue2.addAll(Arrays.asList(10, 200,300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200,300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200,300, 40, 90));

        System.out.println(queue2);

        queue2.poll();//
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        System.out.println(queue2);

        Queue<Integer>queue3 = new LinkedList<>();//has index number - accept null values

        queue3.addAll(Arrays.asList(10, 200, 300,40,90));
        queue3.addAll(Arrays.asList(10, 200, 300,40,90));
        queue3.addAll(Arrays.asList(null, null, null));


        System.out.println(queue3);
        queue3.poll();

        System.out.println(queue3);
                              //castes to linked list to get the index
        System.out.println( ( (LinkedList)queue3).get(4) );


        System.out.println("------------------------------------------------------");


        List<Integer>list= new LinkedList<>();
        list.addAll(Arrays.asList(10, 200,300,40,90));

        System.out.println(list.get(1));

        System.out.println(list);

        //casted to ues poll()//returns and  remove
        ( (LinkedList)list).poll();

        System.out.println(list);






    }
}
