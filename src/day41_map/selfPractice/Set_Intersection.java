package day41_map.selfPractice;

import java.util.Set;

public class Set_Intersection {

    /*
    return a Set equal to the intersection of the parameter Sets
    */

    public static Set<Object> getIntersection(Set<Object>a, Set<Object>b){
            /*
    Please implement this method to
    return a Set equal to the intersection of the parameter Sets
    The method should not change the content of the parameters.
    */
        if(a.size()>b.size()){
            a.retainAll(b);
            return a;
        }else{
            b.retainAll(a);
            return b;
        }

    }

}
