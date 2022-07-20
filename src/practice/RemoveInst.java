package practice;
import java.util.*;

public class RemoveInst {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) {
        for (int i = 0; i < r.size(); i++) {
            if(r.get(i).equals(n)){
                r.remove(r.get(i));
                i--;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(removeInst(list, n));

    }
}


/*
This method gets an Arraylist of Integers and a number(Integer). It returns an Arraylist.

It removes any instance of the given number from the Arraylist.

Example:
romoveInst([1,1,2,3,1,4],1)

returns: [2,3,4]

romoveInst([3,4,3,3],4)

returns: [3,3,3]

 */