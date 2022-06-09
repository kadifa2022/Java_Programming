package lab5_string_loop;

public class TestStringObjects {


    public static void main(String[] args) {
        String str1 = new String("Java"); //one way with new key word with empty string "". located  in heap
                                                     // outside the pool


        String str2 = "Java";// second way string literal - in string pool - only one object can be created and will be shared multiple Variables

        String str3 = new String("Java"); // creating new object in the heap

        String str4 = "Java";// str2 and str4 is same object


        System.out.println(str1 == str2); // false not the same

        System.out.println(str2 == str4); // true same objects

        System.out.println(str1 == str3); // false not the same objects


        System.out.println(str1.equals(str2)); //compare-EQUALS method ( CHECKING ONE OBJECTS IS EQUALS TO ANOTHER OBJECT //do not use operator ==



    }

}



