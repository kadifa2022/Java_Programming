package labs_.lab5_string_loop;

public class StringMethodsPractice {

    public static void main(String[] args) {
        //String name2 = "Cydeo School";

        String name = "Josh Daniel Aaron"; //length 16 -1
        //             0123456789...

        char ch = name.charAt(7);//charAt method

        System.out.println(ch);

        System.out.println(name.length());

        char lastChar = name.charAt(name.length() - 1);//to find last index number//to find all index Characteristic we will use loop

        System.out.println(lastChar);


        System.out.println("---------------------------------");

        String school = "Cydeo School";

        int index1 = school.indexOf('e');//IndexOfMethode = int or char

        System.out.println(index1);

        int index2 = school.indexOf('j');

        System.out.println(index2);


        String str1 = "Java Programming Language";

        int index3 = str1.indexOf("a ");//INDEX OF -CAN

        System.out.println(index3);

        System.out.println("-----------------------------------------------------------");


        String s1 = "WOODEN SPOON";//GARBAGE
        //REASSIGN
        s1 = s1.toLowerCase(); //"wooden spoon"//toLowerCase methode

        System.out.println(s1);
        //REASSIGN
        s1 = s1.toUpperCase();  //"WOODEN SPOON"-- TO UPPER CASE

        System.out.println(s1);

        System.out.println("-----------------------------------------------------------");

        String sentence = "Today is Thursday, and Thursday is a lab day";

        sentence = sentence.replace("Thursday", "Friday"); //replace

        System.out.println(sentence);

        System.out.println("-----------------------------------------------------------");

        String s = "Today is Thursday, and tomorrow is Thursday";

        s = s.replaceFirst("Thursday", "Wednesday");//replaceFirst

        System.out.println(s);

        System.out.println("-----------------------------------------------------------");


        String email = "cydeo_school@gmail.com";

        int beginningIndex = email.indexOf('@') + 1; //TWO FORMS- BEGINNING  AND ENDING INDEX
        int endingIndex = email.lastIndexOf('.');

        String domain = email.substring(beginningIndex, endingIndex);//--SUBSTRING METHODS -REASSIGN (string domain=)

        System.out.println(domain);

        System.out.println("-----------------------------------------------------------");

        String s2 = "I study at CYDEO school";//another method  substring methode to the end Cydeo school

        String schoolName = s2.substring(s2.indexOf('C'));

        System.out.println(schoolName);


        System.out.println("-----------------------------------------------------------");


        String a1 = "DOG";

        String a2 = "dog";


        System.out.println(a1.equals(a2));
        System.out.println(a1.equalsIgnoreCase(a2));

        System.out.println("-----------------------------------------------------------");

        String s3 = "Java is my favorite programming language";

        System.out.println( s3.equals("Java") );
        System.out.println(s3.contains("Java"));

        System.out.println("-----------------------------------------------------------");


        String w = "Cydeo School";

        System.out.println( w.startsWith("Cydeo"));

        System.out.println( w.endsWith("ool") );





    }


    //chaAt
    }