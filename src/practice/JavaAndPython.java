package practice;

import java.util.Scanner;

public class JavaAndPython {



    public static void main(String[] args) {

        String sentence = "We study java not python";
        sentence= sentence.toLowerCase();

        int java = 0;
        int python = 0;

        while (sentence.contains("java") || sentence.contains("python")) {

            while (sentence.contains("java")) {
                sentence = sentence.replaceFirst("java", " ");
                java += 1;
                continue;
            }

            while (sentence.contains("python")) {
                sentence = sentence.replaceFirst("python", " ");
                python += 1;
                continue;
            }

        }

        boolean equal = java == python;

        System.out.println(equal);

    }
}