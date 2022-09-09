package day42_maps.selfPractice;

import java.util.ArrayList;
import java.util.Collections;

public class HighestAndLowestNumFromString{


    String  HighAndLow(String str){
        String[] strings= str.split("");
        ArrayList<Integer>list=new ArrayList<>();
        for(String s:strings){
            list.add(Integer.valueOf(s));

        }
        return Collections.max(list)+ "" + Collections.min(list);

    }
}
