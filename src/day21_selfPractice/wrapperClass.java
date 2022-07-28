package day21_selfPractice;

public class wrapperClass {

    public static void main(String[] args) {
        byte a =10;
        short b =20;
        int c = 30;

        //wrapper clas accept just own primitive
        Byte x = a;
        Short y = b;
        Integer z =c;

        byte q = x;

        //import
        //parse() methods -from wrapper clas
        // convert string to Integer(returns primitive)
        String str = "123";
       int num1 =Integer.parseInt(str);

       //ValueOf() Methods-converting string to wrapper class objects,(returns primitive)
        String str2 ="1,5";


        Double e = Double.valueOf(str2);


    }
}
