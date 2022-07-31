package classPractice;

public class Array_FirstUniqueElement {
    /*
    Write a program that can find the first duplicate element in the Array.
     */

    public static int FirstDuplicateElement(int [] array){

         int firstDuplicate= 0;

         for (int each:array) {
             int frequency = 0;
             for(int each2:array){
                 if (each == each2)
                     frequency++;
             }
             if(frequency >1){
                 firstDuplicate= each;
                 break;

             }


         }
         return firstDuplicate;

     }
}
