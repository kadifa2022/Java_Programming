package day27_accessModifiers;

public class StaticInitializationBlock {

    public static int a  ;//declare variable first-first step
    public static double b ;
    public static String c ;

    //  public static ExcelSheet sheet;


    static{//one time only initializations for static block -for static objects-soon class is loaded will be executed
        a = 100;       //static use less memory-one copy
        b = 20.5;
        c = "Java";
    }


    /*
    public StaticInitializationBlock(){
        a = 100;
        b = 20.5;
        c = "Java";
    }
*/



    /*
    public static void main(String[] args) {
        a = 100;
        b = 20.5;
        c = "Java";
    }
*/





}