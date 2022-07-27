package day_InterviewQuestions.mentorsInterviewQuestions;

import java.util.List;
import java.util.Map;

public class HashMap {

    static Map<String, Integer> getPairs(List<String> animals){
        
        Map<String, Integer> pairs = new java.util.HashMap<>();
        for (String animal: animals) {
            int num = pairs.getOrDefault(animal,0);
            if(num<2){
                pairs.put(animal, ++num);
            }
            
        }
        pairs.entrySet().removeIf(e->e.getValue()==1);
        return pairs;
    }
}
