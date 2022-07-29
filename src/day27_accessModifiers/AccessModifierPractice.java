package day27_accessModifiers;

public class AccessModifierPractice {

    private static int n1=100;//variable and methode can't be use outside class//not visible outside the class
    static int n2=200;//if is not specified is -default
    public static int n3=100;



    private static void method1(){
        System.out.println("Methode with Private access modifier");}
        static void methode2(){
        System.out.println("Method with default access modifier");}
        public static void methode3(){
            System.out.println("methode with public access modifier");

    }
}
