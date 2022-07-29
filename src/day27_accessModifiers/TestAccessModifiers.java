package day27_accessModifiers;

public class TestAccessModifiers {

    public static void main(String[] args) {
       // System.out.println(AccessModifierPractice.n1);private is not valid to print outside the class
        System.out.println(AccessModifierPractice.n2);
        System.out.println(AccessModifierPractice.n3);

        //AccessModifiers()://Private is not valid outside the class
        AccessModifierPractice.methode2();
        AccessModifierPractice.methode3();//always visible even in other package



    }

}
