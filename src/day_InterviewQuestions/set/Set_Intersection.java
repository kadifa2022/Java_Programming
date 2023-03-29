package day_InterviewQuestions.set;

import java.util.Set;

public class Set_Intersection {

    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {

        if (a.size()>b.size()){
            a.retainAll(b);
            return a;
        }else{
            b.retainAll(a);
            return b;
        }
    }

}

        /*
    Please implement this method to
    return a Set equal to the intersection of the parameter Sets The method should not chage the content of the parameters.
    */
