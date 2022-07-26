package practice.mentorsInterviewQuestions;

public class CamelCasing {

    /*
        Week-12 Break camelCase
        Write a function that will break up camel casing, using a space between words. Examples
        "camelCasing" => "camelCasing"
        "weLoveProgramming" => "we Love Programming"
        "identifier" => "identifier" "" => ""
       */
    public static String camelCase(String input) {
        String output = "";
        for (char ch:input.toCharArray()){
            output = Character.isUpperCase(ch) ? output + " " + ch: output + ch;
        }

            return output.trim();
        }

    public static void main(String[] args) {

        System.out.println(camelCase("camelCasing" ));
    }

    }

