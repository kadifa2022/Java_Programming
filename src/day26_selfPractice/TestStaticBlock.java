package day26_selfPractice;

import java.sql.SQLOutput;

public class TestStaticBlock {//static block is colling through class

    public static void main(String[] args) {
        System.out.println(StaticBlock.a);//only one copy
        System.out.println(StaticBlock.str);
        System.out.println(StaticBlock.ch);
    }
}
