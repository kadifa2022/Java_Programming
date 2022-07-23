package day_InterviewQuestions.list;

import java.util.Iterator;
import java.util.List;

public class List_RemoveNumbers {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    */
            //Solution1
    public static List<Integer> remove1(List<Integer> list){
        Iterator<Integer>it = list.iterator();
        while (it.hasNext()){
            if(it.next()>100){
                it.remove();
            }
        }
        return list;
    }

    // Solution 2

    public List<Integer> remove2(List<Integer>list){
        list.removeIf(number->number>100);
        return list;
    }
}
