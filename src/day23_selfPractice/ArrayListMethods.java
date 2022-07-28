package day23_selfPractice;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
public class ArrayListMethods {

    public static void main(String[] args) {
        //add()methode=adds the element into the arrayList-size will be increasing by 1

        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Banana");
        groceryList.add("Apple");
        groceryList.add("Cheese");
        groceryList.add("Soy.Sauce");
        groceryList.add("Salt");
        groceryList.add("Sugar");

        System.out.println(groceryList);
        System.out.println("---------------------------------------------");
        //size()-return the element at the given index from the arrayList

        int a =groceryList.size();//int 5
        System.out.println(a);
        // get() retrieving specific element/index form arrayList
        System.out.println(groceryList.get(1));
        System.out.println("---------------------------------------------");

        //set(Index, newElement)REPLACE THE ELEMENT
      groceryList.set(2, "eggs");
        System.out.println(groceryList);
      //remove(int Index)removing element form arrayList /by index and objects
        groceryList.remove(3);//by index
        System.out.println(groceryList);
        System.out.println("-----------------------");
        //remove()object
        boolean r1=groceryList.remove("Apple");//by object//return boolean/true
        System.out.println(groceryList);

        //clear()removes all objects from arrayList-delete
        groceryList.clear();
        System.out.println(groceryList);
        //indexOf(element):returns index number of the first matching element

        ArrayList<Integer>numbers= new ArrayList<>();
        numbers.add(10);//0
        numbers.add(20);//1
        numbers.add(30);//2
        numbers.add(40);//3
        numbers.add(10);//4

       int b = numbers.indexOf(20);//returns int and return index
        System.out.println(b);
        //lastIndexOf()//returns last matching element from the list
        int c = numbers.lastIndexOf(20);
        System.out.println(c);
        int d=numbers.lastIndexOf(10);// assign back to int variable







    }

}
