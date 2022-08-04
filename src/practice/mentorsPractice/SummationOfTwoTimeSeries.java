package practice.mentorsPractice;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SummationOfTwoTimeSeries {

    public static void main(String[] args) {

        Map<Integer, Double> ser_1 = new LinkedHashMap<>();
        ser_1.put(1, 1.0);
        ser_1.put(2, 1.5);
        ser_1.put(3, 2.0);
        Map<Integer, Double> ser_2 = new LinkedHashMap<>();
        ser_2.put(2, 1.0);
        ser_2.put(2, 2.5);
        ser_2.put(5, 1.0);
        System.out.println(combined2Series2(ser_1, ser_2));
    }

    public static Map<Integer, Double> combined2Series2(Map<Integer, Double> map1, Map<Integer, Double> map2) {
        map2.forEach((key, value) -> map1.put(key, map1.getOrDefault(key, 0.0) + value));
        return map1;
    }


    //solution 2
    public static Map<Integer, Double> combine2Series(Map<Integer, Double> map1, Map<Integer, Double> map2) {
        //Algorithm
        //add all the entries of map 1 to the sum(the third map)
        //iterate map2 and check if the sum map not contains the key add the entry to the sum
        //if it contains the key add the value to the existing value

        Map<Integer, Double>sum = new LinkedHashMap<>();
        for (Integer eachKey: map2.keySet()) {
            if(!(sum.containsKey(eachKey))) {
                sum.put(eachKey, map2.get(eachKey));
            }else {
                sum.put(eachKey, map2.get(eachKey + sum.get(eachKey)));
            }
            }
        System.out.print(sum);
        return sum;




    }
}
/*
    A time series is represented as a list of time/value pairs.
    Write a function that takes two time series and outputs a new time series of the summation of them.
    Example:
    int
    double
    Input:
    series A: la, 1.0, (2, 1.5), (3, 2.0)
    series B: [(2, 1.0), (3, 2.5), (5, 1.0)]
    Map. Key : int. Value: double
    output:
    ah
    ta
    ollab
    Assuming we have 'O' for a time pair that's missing, this is the result:
    [(1, 1.0), (2, 2.5), (3,4.5), (5, 1.0)]
    same key for two maps
    explanation;
    from input1 => (1,1.0) (2,1.5)
    from input2 =>
    (2, 1.0)
    summation => (1,1.0)
    72. 2.5)
    (3, 2.0)
    (3, 2.5)
    (3, 4.5)
    (5, 1.0)
    (5, 1.0)
    1.5+1=2.5

     */