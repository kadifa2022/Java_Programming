package day21_selfPractice;

import java.util.Arrays;

public class multiDimensionalArrayString {

    public static void main(String[] args) {

        String[] group1 = {"lana", "Mejra", "Sara", "Ivona"};
        String[] group2 = {"Lina", "Subha", "Invana", "Pasa"};
        String[] group3 = {"Nijaz", "Tarik", "Nedin", "Ilfo"};

        String[][] groups = {{"lana", "Mejra", "Sara", "Ivona"}, {"Lina", "Subha", "Invana", "Pasa"}, {"Nijaz", "Tarik", "Nedin", "Ilfo"}};
        System.out.println(Arrays.toString(groups[1]));
        System.out.println(groups[2][0]);

        System.out.println(Arrays.deepToString(groups));
    }
}