package day39_Cloection.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();//Array based cass==> get() retriving elements is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);


        arrayList.get(0);//implicitly use array
        System.out.println(arrayList);


       LinkedList<Integer> linkedList = new LinkedList<>();// NODE Based class (double linked list) ==> add(), addAll(),remove(),removeAll()
       //deleting and inserting elements is faster

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

         linkedList.get(0);

        linkedList.get(0);
        System.out.println(linkedList);

        System.out.println("-----------------------------------------------------------------------------");

        Vector<Integer> vector= new Vector<>();//Synchronized--one thread at the time

        vector.add(100);
        vector.add(200);
        vector.add(300);

        System.out.println(vector);

        System.out.println("--------------------------------------------------------------------------");


        Stack<Integer> stack= new Stack<>();



        stack.add(100);
        stack.add(200);
        stack.add(300);

        stack.pop(); // LIFO pop ()

        int lastElement = stack.pop();
        System.out.println(stack);





    }

}
