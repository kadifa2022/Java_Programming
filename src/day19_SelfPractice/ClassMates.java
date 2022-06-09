package day19_SelfPractice;
import java.util.Arrays;
public class ClassMates {
    public static void main(String[] args) {


        String [] classMates = new String[10];
        classMates[0] = "Alexander Bessonov";
        classMates[1] = "Batural Gok";
        classMates[2] = "Diana Sagoyan";
        classMates[3] = "Ertugrul Ustaoglu";
        classMates [4] = "Esmira Mindrescu";
        classMates [5] = "Ahmed Turgul";
        classMates[6] = "Gadir Ibrahimov";
        classMates[7] = "Lucy Gaid";
        classMates [8] = "Igor Pojar";
        classMates [9]= "Mehmet Ozbekler";

        for (int i = 0; i < classMates.length; i++) {

            System.out.println(classMates[i].charAt(0) + ".  "+classMates[i].charAt(classMates[i].indexOf(" ") + 1) +". " );
            
        }

    

    }
}

/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines


 */