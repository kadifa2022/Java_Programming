package day19_SelfPractice;

import java.util.Arrays;

public class ReverseName {
    public static void main(String[] args) {
        String [] classMates = new String[10];//put in rows

        classMates[0] = "Alexander Bessonov ";
        classMates[1] = "Batural Gok ";
        classMates[2] = "Diana Sagoyan ";
        classMates[3] = "Ertugrul Ustaoglu ";
        classMates[4] = "Esmira Mindrescu ";
        classMates[5] = "Ahmed Turgul ";
        classMates[6] = "Gadir Ibrahimov ";
        classMates[7] = "Lucy Gaid ";
        classMates[8] = "Igor Pojar ";
        classMates[9] = "Mehmet Ozbekler ";
        String reverse = " " ;

        for (int i = 0; i < classMates.length; i++) {

            for (int j = classMates[i].length() -1 ; j >= 0 ; j--)  {

                reverse += classMates[i].charAt (j) ;


            }

        }

        System.out.println(reverse);

    }


}
/*

 create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
	*/