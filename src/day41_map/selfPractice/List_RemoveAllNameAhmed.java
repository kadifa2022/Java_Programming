package day41_map.selfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemoveAllNameAhmed {

    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("Ahmed");
        names.add("Tony");
        names.add("Olga");
        System.out.println(remove3(names ));


    }
    /*
    //Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    //Write a java operation to remove all the names named Ahmed
    */

    //solution 1

    public static List<String>remove1(List<String>names){
        Iterator<String>it=names.iterator();
        while (it.hasNext()){
            if(it.next().equals("Ahmed"))
                it.remove();;
        }
        return names;
    }

    //solution 2

    public static List<String>remove2(List<String>names){
        names.removeAll(Arrays.asList("Ahmed"));
        return  names;
    }

    //solution 3
    public static List<String>remove3(List<String>names){
        names.removeIf(name->name.equals("Ahmed"));
        return names;
    }







}
