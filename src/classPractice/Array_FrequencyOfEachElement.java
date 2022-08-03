package classPractice;

import java.lang.reflect.Array;
import java.util.*;

public class Array_FrequencyOfEachElement {

        /*
       Given the array return the output
       testArray = {"Apple","Banana","Apple","Cherry"} Output Example
        Apple = 2
        Banana = 1
        Cherry = 1
        */

    public static void main(String[] args) {
        String[] testArray = {"Apple", "Banana", "Apple", "Cherry"};

        //Solution 1
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String each : testArray) {
            int frequency = 0;
            for (String s : testArray) {
                if (each.equals(s)) {
                    frequency++;
                }

            }
            map.put(each, frequency);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("-----------------------------------------");

        //Solution 2;

        List<String> temp = Arrays.asList(testArray);
        for(String s: new LinkedHashSet<>(temp)){
            System.out.println(s + "=" + Collections.frequency(temp,s));
        }
    }
}